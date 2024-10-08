package io.github.seanlanepgh.knockselementalmagic.entity.ai.goal;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;

import java.util.EnumSet;

import io.github.seanlanepgh.knockselementalmagic.entity.KnocksEntity;


    public class KnocksMeleeAttackGoal extends Goal {
        private int statecheck;
        private final KnocksEntity entity;
        private double moveSpeedAmp = 1;
        private int attackTime = -1;

        public KnocksMeleeAttackGoal(KnocksEntity mob, double moveSpeedAmpIn, int state) {
            this.entity = mob;
            this.moveSpeedAmp = moveSpeedAmpIn;
            this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
            this.statecheck = state;
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
                double d0 = this.entity.distanceToSqr(livingentity.getX(), livingentity.getY(),
                        livingentity.getZ());
                double d1 = this.getAttackReachSqr(livingentity);
                if (inLineOfSight) {
                    if (this.entity.distanceTo(livingentity) >= 3.0D) {
                        this.entity.getNavigation().moveTo(livingentity, this.moveSpeedAmp);
                        this.attackTime = -1;
                    } else {
                        if (this.attackTime == 0) {
                            this.entity.getNavigation().moveTo(livingentity, this.moveSpeedAmp);
                            if (d0 <= d1) {
                                livingentity.invulnerableTime = 0;
                                this.entity.doHurtTarget(livingentity);
                                this.entity.setAttackingState(statecheck);
                            }

                        }
                        if (this.attackTime == 45) {
                            this.attackTime = -1;
                            this.entity.setAttackingState(0);
                        }
                    }
                }
            }
        }

        protected double getAttackReachSqr(LivingEntity attackTarget) {
            return (double) (this.entity.getBbWidth() * 1.0F * this.entity.getBbWidth() * 1.0F + attackTarget.getBbWidth());
        }
    }
