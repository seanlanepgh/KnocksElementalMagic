package io.github.seanlanepgh.knockselementalmagic.entity.ai.goal;

import io.github.seanlanepgh.knockselementalmagic.entity.KnocksEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.IceGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.FireSpike;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;

import java.util.EnumSet;
import java.util.Iterator;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;


public class SmashAttackGoal extends Goal {
        private int statecheck;
        private boolean canAttack;
        private final KnocksEntity entity;
        private double moveSpeedAmp = 1;
        private int attackTime = -1;

        public SmashAttackGoal(KnocksEntity mob, double moveSpeedAmpIn, int state) {
            this.entity = mob;
            this.moveSpeedAmp = moveSpeedAmpIn;
            this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
            this.statecheck = state;
            this.canAttack =false;
        }

        public boolean canUse() {
            return this.entity.getTarget() != null;
        }

        public boolean canContinueToUse() {
            return this.canUse();
        }

        public void start() {
            super.start();
            this.entity.setAggressive(true);
            this.entity.setAttackingState(0);
        }

        public void stop() {
            super.stop();
            this.entity.setAggressive(false);
            this.entity.setAttackingState(0);
            this.attackTime = -1;
        }

        public void tick() {
            LivingEntity livingentity = this.entity.getTarget();
            if (livingentity != null) {
                boolean inLineOfSight = this.entity.getSensing().hasLineOfSight(livingentity);
                this.attackTime++;
                this.entity.lookAt(livingentity, 30.0F, 30.0F);
                double d0 = Math.min(livingentity.getY(), this.entity.getY());
                double d1 = Math.max(livingentity.getY(), this.entity.getY()) + 1.0D;
                float f = (float) Mth.atan2(livingentity.getZ() - this.entity.getZ(), livingentity.getX() - this.entity.getX());
                if (inLineOfSight) {
                    if (this.entity.distanceTo(livingentity) >= 3.0D) {
                        this.entity.getNavigation().moveTo(livingentity, this.moveSpeedAmp);
                        this.attackTime = -1;
                        this.entity.setAttackingState(0);
                    } else {

                        if (this.attackTime == 0) {
                            this.entity.getNavigation().moveTo(livingentity, this.moveSpeedAmp);
//
                            if (d0 <= d1 && (this.attackTime == 0) && (this.attackTime <= 30)) {
                                livingentity.invulnerableTime = 0;
                                this.entity.setAttackingState(statecheck);
//                                System.out.println("attack animation");
//                                System.out.println("Attack " + this.attackTime);
                            }
                        }

                        if (d0 <= d1 && this.attackTime == 45) {
//                            System.out.println("spawn spikes");

//                            System.out.println("Attack " + this.attackTime);
                            this.EarthQuake(4.25F, 4);
                            this.EarthQuakeParticle();
                            for (int i = 0; i < 5; ++i) {
                                float f1 = f + (float) i * (float) Math.PI * 0.4F;
                                this.createSpellEntity(this.entity.getX() + (double) Mth.cos(f1) * 1.5D, this.entity.getZ() + (double) Mth.sin(f1) * 1.5D, d0, d1, f1, 5);
                            }

                            for (int k = 0; k < 8; ++k) {
                                float f2 = f + (float) k * (float) Math.PI * 2.0F / 8.0F + 1.2566371F;
                                this.createSpellEntity(this.entity.getX() + (double) Mth.cos(f2) * 2.5D, this.entity.getZ() + (double) Mth.sin(f2) * 2.5D, d0, d1, f2, 15);
                            }

                        }
                        if (d0 <= d1 && this.attackTime == 46) {
                            this.attackTime = -1;
                            this.entity.setAttackingState(0);
                        }

                    }
                }

            }
        }

            private void createSpellEntity(double p_32673_, double p_32674_, double p_32675_, double p_32676_, float p_32677_, int p_32678_) {
                BlockPos blockpos = new BlockPos(p_32673_, p_32676_, p_32674_);
                boolean flag = false;
                double d0 = 0.0D;

                do {
                    BlockPos blockpos1 = blockpos.below();
                    BlockState blockstate = this.entity.level.getBlockState(blockpos1);
                    if (blockstate.isFaceSturdy(this.entity.level, blockpos1, Direction.UP)) {
                        if (this.entity.level.isEmptyBlock(blockpos)) {
                            BlockState blockstate1 = this.entity.level.getBlockState(blockpos);
                            VoxelShape voxelshape = blockstate1.getCollisionShape(this.entity.level, blockpos);
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
                    this.entity.level.addFreshEntity(new FireSpike(this.entity.level, p_32673_, (double) blockpos.getY() + d0, p_32674_, p_32677_, p_32678_, this.entity));
                }

            }

    private void EarthQuakeParticle() {
        if (this.entity.level.isClientSide) {
            BlockState block = this.entity.level.getBlockState(this.entity.blockPosition().below());

            for(int i1 = 0; i1 < 20 + this.entity.getRandom().nextInt(12); ++i1) {
                double motionX = this.entity.getRandom().nextGaussian() * 0.07;
                double motionY = this.entity.getRandom().nextGaussian() * 0.07;
                double motionZ = this.entity.getRandom().nextGaussian() * 0.07;
                float angle = 0.017453292F * this.entity.yBodyRot + (float)i1;
                double extraX = (double)(4.0F * Mth.sin((float)(Math.PI + (double)angle)));
                double extraY = 0.30000001192092896;
                double extraZ = (double)(4.0F * Mth.cos(angle));
                this.entity.level.addParticle(new BlockParticleOption(ParticleTypes.BLOCK, block), this.entity.getX() + extraX, this.entity.getY() + extraY, this.entity.getZ() + extraZ, motionX, motionY, motionZ);
            }
        }

    }

    private void EarthQuake(float grow, int damage) {
        this.entity.playSound(SoundEvents.GENERIC_EXPLODE ,1.5F, 1.0F + this.entity.getRandom().nextFloat() * 0.1F);
        Iterator var3 = this.entity.level.getEntitiesOfClass(LivingEntity.class, this.entity.getBoundingBox().inflate((double)grow)).iterator();

        while(var3.hasNext()) {
            LivingEntity entity = (LivingEntity)var3.next();
            if (!this.entity.isAlliedTo(entity) && !(entity instanceof IceGolemEntity) && entity != this.entity) {
                entity.hurt(DamageSource.mobAttack(this.entity), (float)this.entity.getAttributeValue(Attributes.ATTACK_DAMAGE) + (float)this.entity.getRandom().nextInt(damage));
               this.launch(entity, true);
            }
        }

    }

    private void launch(LivingEntity e, boolean huge) {
        double d0 = e.getX() - this.entity.getX();
        double d1 = e.getZ() - this.entity.getZ();
        double d2 = Math.max(d0 * d0 + d1 * d1, 0.001);
        float f = huge ? 2.0F : 0.5F;
        e.push(d0 / d2 * (double)f, huge ? 0.5 : 0.20000000298023224, d1 / d2 * (double)f);
    }


        protected double getAttackReachSqr(LivingEntity attackTarget) {
            return (double) (this.entity.getBbWidth() * 1.0F * this.entity.getBbWidth() * 1.0F + attackTarget.getBbWidth());
        }
    }

