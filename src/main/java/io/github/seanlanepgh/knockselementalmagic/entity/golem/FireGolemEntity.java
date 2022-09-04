package io.github.seanlanepgh.knockselementalmagic.entity.golem;
import io.github.seanlanepgh.knockselementalmagic.entity.KnocksEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.ai.goal.KnocksMeleeAttackGoal;
import io.github.seanlanepgh.knockselementalmagic.entity.ai.goal.SmashAttackGoal;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.FireSpike;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.DefendVillageTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.ResetUniversalAngerTargetGoal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.SpellcasterIllager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.NaturalSpawner;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimationTickable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.shadowed.eliotlash.mclib.utils.MathHelper;

import javax.annotation.Nullable;

public class FireGolemEntity extends KnocksEntity implements IAnimatable, IAnimationTickable {

    public static final EntityDataAccessor<Integer> RAGE_STATE = SynchedEntityData.defineId(FireGolemEntity.class,
            EntityDataSerializers.INT);

    //protected static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(net.minecraft.world.entity.animal.IronGolem.class, EntityDataSerializers.BYTE);
//    private static final int IRON_INGOT_HEAL_AMOUNT = 25;
    private int attackAnimationTick;
    private int offerFlowerTick;
//    private static final UniformInt PERSISTENT_ANGER_TIME = TimeUtil.rangeOfSeconds(20, 39);
//    private int remainingPersistentAngerTime;
//    @Nullable
//    private UUID persistentAngerTarget;

    public FireGolemEntity(EntityType<? extends FireGolemEntity> p_28834_, Level p_28835_) {
        super(p_28834_, p_28835_);
        this.maxUpStep = 1.0F;
    }

    private AnimationFactory factory = new AnimationFactory(this);

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (!this.isOnGround() && this.onGround && !(this.dead || this.getHealth() < 0.01 || this.isDeadOrDying())) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.elemental_golem.walk", true));
            return PlayState.CONTINUE;
        }
        if ((this.dead || this.getHealth() < 0.01 || this.isDeadOrDying())) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.elemental_golem.death", false));
            return PlayState.CONTINUE;
        }
        if (!event.isMoving() && this.isOnGround() && this.onGround
                && !(this.dead || this.getHealth() < 0.01 || this.isDeadOrDying())) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.elemental_golem.idle", true));
            return PlayState.CONTINUE;
        }
        if (event.isMoving() && this.isOnGround() && this.onGround
                && !(this.dead || this.getHealth() < 0.01 ||this.isDeadOrDying())) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.elemental_golem.walk", true));
            event.getController().setAnimationSpeed(1.0D);
            return PlayState.CONTINUE;
        }
        return PlayState.CONTINUE;
    }


    private <E extends IAnimatable> PlayState predicate1(AnimationEvent<E> event) {
        if (this.entityData.get(STATE) == 1 && !(this.dead || this.getHealth() < 0.01 || this.isDeadOrDying())) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.elemental_golem.attack", true));
            return PlayState.CONTINUE;
        }
        if (this.entityData.get(STATE) == 2 && !(event.isMoving()) && !(this.dead || this.getHealth() < 0.01 || this.isDeadOrDying())) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.elemental_golem.smash_attack", true));
            return PlayState.CONTINUE;
        }
        return PlayState.STOP;
    }
//    @Override
//    public int tickTimer() {
//        return age;
//    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }


    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<FireGolemEntity>(this, "controller", 0, this::predicate));
        data.addAnimationController(new AnimationController<FireGolemEntity>(this, "controller1", 0, this::predicate1));
    }


    protected void registerGoals() {
        //this.goalSelector.addGoal(5, new KnocksMeleeAttackGoal(this, 0.3D, 1));
        this.goalSelector.addGoal(2, new MoveTowardsTargetGoal(this, 0.3D, 32.0F));
        this.goalSelector.addGoal(1, new SmashAttackGoal(this, 0.3D, 2));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Player.class, 10, true, false, this::isAngryAt));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Mob.class, 5, false, false, (p_28879_) -> {
            return p_28879_ instanceof Enemy && !(p_28879_ instanceof Creeper);
        }));
        this.targetSelector.addGoal(4, new ResetUniversalAngerTargetGoal<>(this, false));
    }

    public static AttributeSupplier.Builder setAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 100.0D).add(Attributes.MOVEMENT_SPEED, 0.50D).add(Attributes.KNOCKBACK_RESISTANCE, 1.0D).add(Attributes.ATTACK_DAMAGE, 15.0D);
    }


    protected int decreaseAirSupply(int p_28882_) {
        return p_28882_;
    }

    protected void doPush(Entity p_28839_) {
        if (p_28839_ instanceof Enemy && !(p_28839_ instanceof Creeper) && this.getRandom().nextInt(20) == 0) {
            this.setTarget((LivingEntity)p_28839_);
        }

        super.doPush(p_28839_);
    }

    public void aiStep() {
        super.aiStep();
        if (this.attackAnimationTick > 0) {
            --this.attackAnimationTick;
        }

        if (this.offerFlowerTick > 0) {
            --this.offerFlowerTick;
        }

        if (this.getDeltaMovement().horizontalDistanceSqr() > (double)2.5000003E-7F && this.random.nextInt(5) == 0) {
            int i = Mth.floor(this.getX());
            int j = Mth.floor(this.getY() - (double)0.2F);
            int k = Mth.floor(this.getZ());
            BlockPos pos = new BlockPos(i, j, k);
            BlockState blockstate = this.level.getBlockState(pos);
            if (!blockstate.isAir()) {
                this.level.addParticle(new BlockParticleOption(ParticleTypes.BLOCK, blockstate).setPos(pos), this.getX() + ((double)this.random.nextFloat() - 0.5D) * (double)this.getBbWidth(), this.getY() + 0.1D, this.getZ() + ((double)this.random.nextFloat() - 0.5D) * (double)this.getBbWidth(), 4.0D * ((double)this.random.nextFloat() - 0.5D), 0.5D, ((double)this.random.nextFloat() - 0.5D) * 4.0D);
            }
        }

        if (!this.level.isClientSide) {
            this.updatePersistentAnger((ServerLevel)this.level, true);
        }

    }

//    public boolean canAttackType(EntityType<?> p_28851_) {
////        if (this.isPlayerCreated() && p_28851_ == EntityType.PLAYER) {
////            return false;
////        } else {
//            return p_28851_ == EntityType.CREEPER ? false : super.canAttackType(p_28851_);
////        }
//    }

    public void addAdditionalSaveData(CompoundTag p_28867_) {
        super.addAdditionalSaveData(p_28867_);
        // p_28867_.putBoolean("PlayerCreated", this.isPlayerCreated());
        this.addPersistentAngerSaveData(p_28867_);
    }

    public void readAdditionalSaveData(CompoundTag p_28857_) {
        super.readAdditionalSaveData(p_28857_);
        // this.setPlayerCreated(p_28857_.getBoolean("PlayerCreated"));
        this.readPersistentAngerSaveData(this.level, p_28857_);
    }

    //    public void startPersistentAngerTimer() {
//        this.setRemainingPersistentAngerTime(PERSISTENT_ANGER_TIME.sample(this.random));
//    }
//
//    public void setRemainingPersistentAngerTime(int p_28859_) {
//        this.remainingPersistentAngerTime = p_28859_;
//    }
//
//    public int getRemainingPersistentAngerTime() {
//        return this.remainingPersistentAngerTime;
//    }
//
//    public void setPersistentAngerTarget(@Nullable UUID p_28855_) {
//        this.persistentAngerTarget = p_28855_;
//    }
    @Override
    public int tickTimer() {
        return tickCount;
    }

//    @Nullable
//    public UUID getPersistentAngerTarget() {
//        return this.persistentAngerTarget;
//    }

    private float getAttackDamage() {
        return (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE);
    }

    public boolean doHurtTarget(Entity p_28837_) {
        this.attackAnimationTick = 10;
        this.level.broadcastEntityEvent(this, (byte)4);
        float f = this.getAttackDamage();
        float f1 = (int)f > 0 ? f / 2.0F + (float)this.random.nextInt((int)f) : f;
        boolean flag = p_28837_.hurt(DamageSource.mobAttack(this), f1);
        if (flag) {
            double d2;
            if (p_28837_ instanceof LivingEntity) {
                LivingEntity livingentity = (LivingEntity)p_28837_;
                d2 = livingentity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE);
            } else {
                d2 = 0.0D;
            }

            double d0 = d2;
            double d1 = Math.max(0.0D, 1.0D - d0);
            p_28837_.setDeltaMovement(p_28837_.getDeltaMovement().add(0.0D, (double)0.4F * d1, 0.0D));
            this.doEnchantDamageEffects(this, p_28837_);
        }

        this.playSound(SoundEvents.IRON_GOLEM_ATTACK, 1.0F, 1.0F);
        return flag;
    }

    public boolean hurt(DamageSource p_28848_, float p_28849_) {
        net.minecraft.world.entity.animal.IronGolem.Crackiness irongolem$crackiness = this.getCrackiness();
        boolean flag = super.hurt(p_28848_, p_28849_);
        if (flag && this.getCrackiness() != irongolem$crackiness) {
            this.playSound(SoundEvents.IRON_GOLEM_DAMAGE, 1.0F, 1.0F);
        }

        return flag;
    }

    public net.minecraft.world.entity.animal.IronGolem.Crackiness getCrackiness() {
        return net.minecraft.world.entity.animal.IronGolem.Crackiness.byFraction(this.getHealth() / this.getMaxHealth());
    }

    public void handleEntityEvent(byte p_28844_) {
        if (p_28844_ == 4) {
            this.attackAnimationTick = 10;
            this.playSound(SoundEvents.IRON_GOLEM_ATTACK, 1.0F, 1.0F);
        } else if (p_28844_ == 11) {
            this.offerFlowerTick = 400;
        } else if (p_28844_ == 34) {
            this.offerFlowerTick = 0;
        } else {
            super.handleEntityEvent(p_28844_);
        }

    }

    public int getAttackAnimationTick() {
        return this.attackAnimationTick;
    }

    protected SoundEvent getHurtSound(DamageSource p_28872_) {
        return SoundEvents.IRON_GOLEM_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.IRON_GOLEM_DEATH;
    }

    protected void playStepSound(BlockPos p_28864_, BlockState p_28865_) {
        this.playSound(SoundEvents.IRON_GOLEM_STEP, 1.0F, 1.0F);
    }

    public void die(DamageSource p_28846_) {
        super.die(p_28846_);
    }

    public boolean checkSpawnObstruction(LevelReader p_28853_) {
        BlockPos blockpos = this.blockPosition();
        BlockPos blockpos1 = blockpos.below();
        BlockState blockstate = p_28853_.getBlockState(blockpos1);
        if (!blockstate.entityCanStandOn(p_28853_, blockpos1, this)) {
            return false;
        } else {
            for(int i = 1; i < 3; ++i) {
                BlockPos blockpos2 = blockpos.above(i);
                BlockState blockstate1 = p_28853_.getBlockState(blockpos2);
                if (!NaturalSpawner.isValidEmptySpawnBlock(p_28853_, blockpos2, blockstate1, blockstate1.getFluidState(), EntityType.IRON_GOLEM)) {
                    return false;
                }
            }

            return NaturalSpawner.isValidEmptySpawnBlock(p_28853_, blockpos, p_28853_.getBlockState(blockpos), Fluids.EMPTY.defaultFluidState(), EntityType.IRON_GOLEM) && p_28853_.isUnobstructed(this);
        }
    }

    public Vec3 getLeashOffset() {
        return new Vec3(0.0D, (double)(0.875F * this.getEyeHeight()), (double)(this.getBbWidth() * 0.4F));
    }

}

