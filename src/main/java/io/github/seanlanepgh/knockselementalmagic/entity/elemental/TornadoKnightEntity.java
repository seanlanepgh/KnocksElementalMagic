package io.github.seanlanepgh.knockselementalmagic.entity.elemental;
package io.github.seanlanepgh.knockselementalmagic.entity.elemental;


import net.minecraft.core.particles.*;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimationTickable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import io.github.seanlanepgh.knockselementalmagic.entity.*;
import io.github.seanlanepgh.knockselementalmagic.entity.ai.goal.RangedAttackGoal;
import io.github.seanlanepgh.knockselementalmagic.entity.attack.*;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.projectile.*;

public class TornadoKnightEntity extends KnocksEntity implements IAnimatable, IAnimationTickable, Enemy {
    private float allowedHeightOffset = 0.5F;
    private int nextHeightOffsetChangeTick;
    private AnimationFactory factory = new AnimationFactory(this);

    public TornadoKnightEntity(EntityType<? extends KnocksEntity> entityType, Level level) {
        super(entityType, level);
    }
    public static AttributeSupplier setAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.ATTACK_DAMAGE, 6.0D).add(Attributes.MOVEMENT_SPEED, (double)0.23F).add(Attributes.FOLLOW_RANGE, 48.0D).build();
    }

    public boolean causeFallDamage(float p_149683_, float p_149684_, DamageSource p_149685_) {
        return false;
    }

    protected void customServerAiStep() {
        --this.nextHeightOffsetChangeTick;
        if (this.nextHeightOffsetChangeTick <= 0) {
            this.nextHeightOffsetChangeTick = 100;
            this.allowedHeightOffset = (float) this.random.triangle(0.5D, 6.891D);
        }

        LivingEntity livingentity = this.getTarget();
        if (livingentity != null && livingentity.getEyeY() > this.getEyeY() + (double) this.allowedHeightOffset && this.canAttack(livingentity)) {
            Vec3 vec3 = this.getDeltaMovement();
            this.setDeltaMovement(this.getDeltaMovement().add(0.0D, ((double) 0.3F - vec3.y) * (double) 0.3F, 0.0D));
            this.hasImpulse = true;
        }

        super.customServerAiStep();
    }

    public boolean isSensitiveToWater() {
        return true;
    }

    public void aiStep() {
        if (!this.onGround && this.getDeltaMovement().y < 0.0D) {
            this.setDeltaMovement(this.getDeltaMovement().multiply(1.0D, 0.6D, 1.0D));
        }

        if (this.level.isClientSide) {
            if (this.random.nextInt(24) == 0 && !this.isSilent()) {
                this.level.playLocalSound(this.getX() + 0.5D, this.getY() + 0.5D, this.getZ() + 0.5D, SoundEvents.BLAZE_BURN, this.getSoundSource(), 1.0F + this.random.nextFloat(), this.random.nextFloat() * 0.7F + 0.3F, false);
            }

            for (int i = 0; i < 2; ++i) {
                this.level.addParticle(ParticleTypes.CLOUD, this.getRandomX(0.5D), this.getRandomY(), this.getRandomZ(0.5D), 0.0D, 0.0D, 0.0D);
            }
        }

        super.aiStep();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(4, new RangedAttackGoal(this,
                new TornadoKnightEntity.TornadoBoltAttack(this).setProjectileOriginOffset(0.8, 0.5, 0.8)
                        .setDamage(3.0F),1.0F));

        this.goalSelector.addGoal(5, new MoveTowardsRestrictionGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D, 0.0F));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers());
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.BLAZE_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource p_32235_) {
        return SoundEvents.BLAZE_HURT;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.BLAZE_AMBIENT;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.ATTACK_DAMAGE, 6.0D).add(Attributes.MOVEMENT_SPEED, (double) 0.23F).add(Attributes.FOLLOW_RANGE, 48.0D);
    }

    @Override
    public int tickTimer() {
        return tickCount;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<TornadoKnightEntity>(this, "controller", 0, this::predicate));
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.tornado_knight.walk", true));
            return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.tornado_knight.idle", true));
        return PlayState.CONTINUE;

    }
    private static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(TornadoKnightEntity.class, EntityDataSerializers.BYTE);

    public class TornadoBoltAttack extends AbstractRangedAttack {

        public TornadoBoltAttack(TornadoKnightEntity parentEntity, double xOffSetModifier, double entityHeightFraction,
                               double zOffSetModifier, float damage) {
            super(parentEntity, xOffSetModifier, entityHeightFraction, zOffSetModifier, damage);
        }

        public TornadoBoltAttack(TornadoKnightEntity parentEntity) {
            super(parentEntity);
        }

        @Override
        public AttackSound getDefaultAttackSound() {
            return new AttackSound(SoundEvents.BLAZE_SHOOT, 0.7F, 1);
        }

        @Override
        public Projectile getProjectile(Level world, double d2, double d3, double d4) {
            return new TornadoBolt(world, this.parentEntity, d2, d3, d4, damage);
        }
    }
}
