package io.github.seanlanepgh.knockselementalmagic.entity.wizard;

import java.util.List;

import javax.annotation.Nullable;

import io.github.seanlanepgh.knockselementalmagic.entity.attack.AttackSound;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.BlazeBolt;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.FireSpike;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.SpellcasterIllager;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EarthWizardEntity extends SpellcasterIllager {
    public float damage = 1;
    @Nullable
    private Sheep wololoTarget;

    public EarthWizardEntity(EntityType<? extends EarthWizardEntity> p_32627_, Level p_32628_) {
        super(p_32627_, p_32628_);
        this.xpReward = 10;
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new EarthWizardEntity.EarthWizardEntityCastingSpellGoal());
        this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, Player.class, 8.0F, 0.6D, 1.0D));
        this.goalSelector.addGoal(4, new EarthWizardEntity.EarthWizardEntityBoltSpellGoal());
        this.goalSelector.addGoal(5, new EarthWizardEntity.EarthWizardEntityAttackSpellGoal());
        this.goalSelector.addGoal(6, new EarthWizardEntity.EarthWizardEntityWololoSpellGoal());
        this.goalSelector.addGoal(8, new RandomStrollGoal(this, 0.6D));
        this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, Player.class, 3.0F, 1.0F));
        this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Mob.class, 8.0F));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this, Raider.class)).setAlertOthers());
        this.targetSelector.addGoal(2, (new NearestAttackableTargetGoal<>(this, Player.class, true)).setUnseenMemoryTicks(300));
        this.targetSelector.addGoal(3, (new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false)).setUnseenMemoryTicks(300));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, false));
    }

    public static AttributeSupplier setAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.MOVEMENT_SPEED, 0.5D).add(Attributes.FOLLOW_RANGE, 12.0D).add(Attributes.MAX_HEALTH, 100.0D).build();
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readAdditionalSaveData(CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
    }

    public SoundEvent getCelebrateSound() {
        return SoundEvents.EVOKER_CELEBRATE;
    }

    public void addAdditionalSaveData(CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
    }

    protected void customServerAiStep() {
        super.customServerAiStep();
    }

    /**
     * Returns whether this Entity is on the same team as the given Entity.
     */
    public boolean isAlliedTo(Entity pEntity) {
        if (pEntity == null) {
            return false;
        } else if (pEntity == this) {
            return true;
        } else if (super.isAlliedTo(pEntity)) {
            return true;
        } else if (pEntity instanceof Vex) {
            return this.isAlliedTo(((Vex) pEntity).getOwner());
        } else if (pEntity instanceof LivingEntity && ((LivingEntity) pEntity).getMobType() == MobType.ILLAGER) {
            return this.getTeam() == null && pEntity.getTeam() == null;
        } else {
            return false;
        }
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.EVOKER_AMBIENT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.EVOKER_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.EVOKER_HURT;
    }

    void setWololoTarget(@Nullable Sheep pWololoTarget) {
        this.wololoTarget = pWololoTarget;
    }

    @Nullable
    Sheep getWololoTarget() {
        return this.wololoTarget;
    }

    protected SoundEvent getCastingSoundEvent() {
        return SoundEvents.EVOKER_CAST_SPELL;
    }

    public void applyRaidBuffs(int p_32632_, boolean p_32633_) {
    }

    class EarthWizardEntityBoltSpellGoal extends SpellcasterIllager.SpellcasterUseSpellGoal {
        protected int getCastingTime() {
            return 41;
        }

        protected int getCastingInterval() {
            return 121;
        }

        @org.jetbrains.annotations.Nullable

        protected SoundEvent getSpellPrepareSound() {
            return SoundEvents.EVOKER_PREPARE_ATTACK;
        }

        protected SpellcasterIllager.IllagerSpell getSpell() {
            return SpellcasterIllager.IllagerSpell.FANGS;
        }

        protected void performSpellCasting() {

            BlazeBolt abstractarrowentity = createArrow(EarthWizardEntity.this.level, EarthWizardEntity.this);
            abstractarrowentity.shootFromRotation(EarthWizardEntity.this, EarthWizardEntity.this.getXRot(), EarthWizardEntity.this.getYRot(),
                    0.0F, 0.25F * 3.0F, 1.0F);
            abstractarrowentity.isNoGravity();
            EarthWizardEntity.this.level.addFreshEntity(abstractarrowentity);
        }
        public BlazeBolt createArrow(Level level, LivingEntity shooter) {
            //float j = EnchantmentHelper.getTagEnchantmentLevel(Enchantments.POWER_ARROWS, stack);
            BlazeBolt arrowentity = new BlazeBolt(level, shooter,
                    (2.0F));
            return arrowentity;
        }



        public AttackSound getDefaultAttackSound() {
            return new AttackSound(SoundEvents.BLAZE_SHOOT, 0.7F, 1);
        }


        public Projectile getProjectile(Level world, double d2, double d3, double d4) {
            return new BlazeBolt(world, EarthWizardEntity.this, d2);
        }
    }
    class EarthWizardEntityAttackSpellGoal extends SpellcasterIllager.SpellcasterUseSpellGoal {
        protected int getCastingTime() {
            return 40;
        }

        protected int getCastingInterval() {
            return 200;
        }

        protected void performSpellCasting() {
            LivingEntity livingentity = EarthWizardEntity.this.getTarget();
            double d0 = Math.min(livingentity.getY(), EarthWizardEntity.this.getY());
            double d1 = Math.max(livingentity.getY(), EarthWizardEntity.this.getY()) + 1.0D;
            float f = (float) Mth.atan2(livingentity.getZ() - EarthWizardEntity.this.getZ(), livingentity.getX() - EarthWizardEntity.this.getX());
            if (EarthWizardEntity.this.distanceToSqr(livingentity) < 9.0D) {
                for (int i = 0; i < 5; ++i) {
                    float f1 = f + (float) i * (float) Math.PI * 0.4F;
                    this.createSpellEntity(EarthWizardEntity.this.getX() + (double) Mth.cos(f1) * 1.5D, EarthWizardEntity.this.getZ() + (double) Mth.sin(f1) * 1.5D, d0, d1, f1, 0);
                }

                for (int k = 0; k < 8; ++k) {
                    float f2 = f + (float) k * (float) Math.PI * 2.0F / 8.0F + 1.2566371F;
                    this.createSpellEntity(EarthWizardEntity.this.getX() + (double) Mth.cos(f2) * 2.5D, EarthWizardEntity.this.getZ() + (double) Mth.sin(f2) * 2.5D, d0, d1, f2, 3);
                }
            } else {
                for (int l = 0; l < 16; ++l) {
                    double d2 = 1.25D * (double) (l + 1);
                    int j = 1 * l;
                    this.createSpellEntity(EarthWizardEntity.this.getX() + (double) Mth.cos(f) * d2, EarthWizardEntity.this.getZ() + (double) Mth.sin(f) * d2, d0, d1, f, j);
                }
            }

        }

        private void createSpellEntity(double p_32673_, double p_32674_, double p_32675_, double p_32676_, float p_32677_, int p_32678_) {
            BlockPos blockpos = new BlockPos(p_32673_, p_32676_, p_32674_);
            boolean flag = false;
            double d0 = 0.0D;

            do {
                BlockPos blockpos1 = blockpos.below();
                BlockState blockstate = EarthWizardEntity.this.level.getBlockState(blockpos1);
                if (blockstate.isFaceSturdy(EarthWizardEntity.this.level, blockpos1, Direction.UP)) {
                    if (!EarthWizardEntity.this.level.isEmptyBlock(blockpos)) {
                        BlockState blockstate1 = EarthWizardEntity.this.level.getBlockState(blockpos);
                        VoxelShape voxelshape = blockstate1.getCollisionShape(EarthWizardEntity.this.level, blockpos);
                        if (!voxelshape.isEmpty()) {
                            d0 = voxelshape.max(Direction.Axis.Y);
                        }
                    }

                    flag = true;
                    break;
                }

                blockpos = blockpos.below();
            } while (blockpos.getY() >= Mth.floor(p_32675_) - 1);

            if (flag) {
                EarthWizardEntity.this.level.addFreshEntity(new FireSpike(EarthWizardEntity.this.level, p_32673_, (double) blockpos.getY() + d0, p_32674_, p_32677_, p_32678_, EarthWizardEntity.this));
            }

        }

        protected SoundEvent getSpellPrepareSound() {
            return SoundEvents.EVOKER_PREPARE_ATTACK;
        }

        protected SpellcasterIllager.IllagerSpell getSpell() {
            return SpellcasterIllager.IllagerSpell.FANGS;
        }
    }

    class EarthWizardEntityCastingSpellGoal extends SpellcasterIllager.SpellcasterCastingSpellGoal {
        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            if (EarthWizardEntity.this.getTarget() != null) {
                EarthWizardEntity.this.getLookControl().setLookAt(EarthWizardEntity.this.getTarget(), (float) EarthWizardEntity.this.getMaxHeadYRot(), (float) EarthWizardEntity.this.getMaxHeadXRot());
            } else if (EarthWizardEntity.this.getWololoTarget() != null) {
                EarthWizardEntity.this.getLookControl().setLookAt(EarthWizardEntity.this.getWololoTarget(), (float) EarthWizardEntity.this.getMaxHeadYRot(), (float) EarthWizardEntity.this.getMaxHeadXRot());
            }

        }
    }

    public class EarthWizardEntityWololoSpellGoal extends SpellcasterIllager.SpellcasterUseSpellGoal {
        private final TargetingConditions wololoTargeting = TargetingConditions.forNonCombat().range(16.0D).selector((p_32710_) -> {
            return ((Sheep) p_32710_).getColor() == DyeColor.BLUE;
        });

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canUse() {
            if (EarthWizardEntity.this.getTarget() != null) {
                return false;
            } else if (EarthWizardEntity.this.isCastingSpell()) {
                return false;
            } else if (EarthWizardEntity.this.tickCount < this.nextAttackTickCount) {
                return false;
            } else if (!net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(EarthWizardEntity.this.level, EarthWizardEntity.this)) {
                return false;
            } else {
                List<Sheep> list = EarthWizardEntity.this.level.getNearbyEntities(Sheep.class, this.wololoTargeting, EarthWizardEntity.this, EarthWizardEntity.this.getBoundingBox().inflate(16.0D, 4.0D, 16.0D));
                if (list.isEmpty()) {
                    return false;
                } else {
                    EarthWizardEntity.this.setWololoTarget(list.get(EarthWizardEntity.this.random.nextInt(list.size())));
                    return true;
                }
            }
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean canContinueToUse() {
            return EarthWizardEntity.this.getWololoTarget() != null && this.attackWarmupDelay > 0;
        }

        /**
         * Reset the task's internal state. Called when this task is interrupted by another one
         */
        public void stop() {
            super.stop();
            EarthWizardEntity.this.setWololoTarget((Sheep) null);
        }

        protected void performSpellCasting() {
            Sheep sheep = EarthWizardEntity.this.getWololoTarget();
            if (sheep != null && sheep.isAlive()) {
                sheep.setColor(DyeColor.RED);
            }

        }

        protected int getCastWarmupTime() {
            return 40;
        }

        protected int getCastingTime() {
            return 60;
        }

        protected int getCastingInterval() {
            return 140;
        }

        protected SoundEvent getSpellPrepareSound() {
            return SoundEvents.EVOKER_PREPARE_WOLOLO;
        }

        protected SpellcasterIllager.IllagerSpell getSpell() {
            return SpellcasterIllager.IllagerSpell.WOLOLO;
        }
    }
}



