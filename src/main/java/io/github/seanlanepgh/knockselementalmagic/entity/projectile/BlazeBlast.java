package io.github.seanlanepgh.knockselementalmagic.entity.projectile;

import io.github.seanlanepgh.knockselementalmagic.core.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.*;
import net.minecraft.nbt.*;
import net.minecraft.network.protocol.*;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.*;
import net.minecraftforge.network.*;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

import java.util.List;

public class BlazeBlast extends AbstractArrow implements IAnimatable {

    protected int timeInAir;
    protected boolean inAir;
    private int ticksInAir;
    private LivingEntity shooter;
    private float projectiledamage;
    private BlockPos lightBlockPos = null;
    private int idleTicks = 0;
    private float yRot;
    private float xRot;

    public BlazeBlast(EntityType<? extends AbstractArrow> type, Level world) {
        super(type, world);
    }

    public BlazeBlast(Level world, LivingEntity owner) {
        super(KnocksEntityTypes.BLAZE_BLAST.get(), owner, world);
        this.shooter = owner;
    }
    public BlazeBlast(Level world, LivingEntity owner, double damage) {
        super(KnocksEntityTypes.BLAZE_BLAST.get(), owner, world);
        this.shooter = owner;
        this.projectiledamage = (float) damage;
    }

    public BlazeBlast(Level world, LivingEntity owner, double d2, double d3, double d4, float damage) {
        super(KnocksEntityTypes.BLAZE_BLAST.get(), owner, world);
        this.shooter = owner;
        this.projectiledamage = damage;
    }

    private AnimationFactory factory = new AnimationFactory(this);

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.elemental_blast.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<BlazeBlast>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    protected void tickDespawn() {
        ++this.ticksInAir;
        if (this.tickCount >= 40) {
            this.remove(RemovalReason.KILLED);
        }
    }

    @Override
    protected void doPostHurtEffects(LivingEntity living) {
        super.doPostHurtEffects(living);
        if (!(living instanceof Player)) {
            living.setDeltaMovement(0, 0, 0);
            living.invulnerableTime = 0;
        }
    }

    @Override
    public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
        super.shoot(x, y, z, velocity, inaccuracy);
        this.ticksInAir = 0;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putShort("life", (short) this.ticksInAir);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.ticksInAir = compound.getShort("life");
    }

    @Override
    public void tick() {
        int idleOpt = 100;
        if (getDeltaMovement().lengthSqr() < 0.01)
            idleTicks++;
        else
            idleTicks = 0;
        if (idleOpt <= 0 || idleTicks < idleOpt)
            super.tick();
        boolean isInsideWaterBlock = level.isWaterAt(blockPosition());
        // spawnLightSource(isInsideWaterBlock);
        boolean flag = this.isNoPhysics();
        Vec3 vector3d = this.getDeltaMovement();
        if (this.xRotO == 0.0F && this.yRotO == 0.0F) {
            double f = vector3d.horizontalDistance();
            this.yRot = (float) (Mth.atan2(vector3d.x, vector3d.z) * (double) (180F / (float) Math.PI));
            this.xRot = (float) (Mth.atan2(vector3d.y, (double) f) * (double) (180F / (float) Math.PI));
            this.yRotO = this.getYRot();
            this.xRotO = this.getXRot();
        }

        if (this.tickCount >= 100) {
            this.remove(RemovalReason.KILLED);
        }

        if (this.inAir && !flag) {
            this.tickDespawn();

            ++this.timeInAir;
        } else {
            this.timeInAir = 0;
            Vec3 vector3d2 = this.position();
            Vec3 vector3d3 = vector3d2.add(vector3d);
            HitResult raytraceresult = this.level.clip(
                    new ClipContext(vector3d2, vector3d3, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, this));
            if (raytraceresult.getType() != HitResult.Type.MISS) {
                vector3d3 = raytraceresult.getLocation();
            }
            while (this.isAlive()) {
                EntityHitResult entityraytraceresult = this.findHitEntity(vector3d2, vector3d3);
                if (entityraytraceresult != null) {
                    raytraceresult = entityraytraceresult;
                }
                if (raytraceresult != null && raytraceresult.getType() == HitResult.Type.ENTITY) {
                    Entity entity = ((EntityHitResult) raytraceresult).getEntity();
                    Entity entity1 = this.getOwner();
                    if (entity instanceof Player && entity1 instanceof Player
                            && !((Player) entity1).canHarmPlayer((Player) entity)) {
                        raytraceresult = null;
                        entityraytraceresult = null;
                    }
                }
                if (raytraceresult != null && raytraceresult.getType() != HitResult.Type.MISS && !flag
                        && !net.minecraftforge.event.ForgeEventFactory.onProjectileImpact(this, raytraceresult)) {
                    this.onHit(raytraceresult);
                    this.hasImpulse = true;
                }
                if (entityraytraceresult == null || this.getPierceLevel() <= 0) {
                    break;
                }
                raytraceresult = null;
            }
            vector3d = this.getDeltaMovement();
            double d3 = vector3d.x;
            double d4 = vector3d.y;
            double d0 = vector3d.z;
            double d5 = this.getX() + d3;
            double d1 = this.getY() + d4;
            double d2 = this.getZ() + d0;
            double f1 = vector3d.horizontalDistance();
            if (flag) {
                this.yRot = (float) (Mth.atan2(-d3, -d0) * (double) (180F / (float) Math.PI));
            } else {
                this.yRot = (float) (Mth.atan2(d3, d0) * (double) (180F / (float) Math.PI));
            }
            this.xRot = (float) (Mth.atan2(d4, (double) f1) * (double) (180F / (float) Math.PI));
            this.xRot = lerpRotation(this.xRotO, this.getXRot());
            this.yRot = lerpRotation(this.yRotO, this.getYRot());
            float f2 = 0.99F;
            this.setDeltaMovement(vector3d.scale((double) f2));
            if (!this.isNoGravity() && !flag) {
                Vec3 vector3d4 = this.getDeltaMovement();
                this.setDeltaMovement(vector3d4.x, vector3d4.y - (double) 0.05F, vector3d4.z);
            }
            this.setPos(d5, d1, d2);
            this.checkInsideBlocks();
            if (this.level.isClientSide()) {
                double x = this.getX() + (this.random.nextDouble()) * (double) this.getBbWidth() * 0.5D;
                double z = this.getZ() + (this.random.nextDouble()) * (double) this.getBbWidth() * 0.5D;
                this.level.addParticle(ParticleTypes.FLAME, true, x, this.getY(), z, 0, 0, 0);
            }
        }
    }

    private boolean checkDistance(BlockPos blockPosA, BlockPos blockPosB, int distance) {
        return Math.abs(blockPosA.getX() - blockPosB.getX()) <= distance
                && Math.abs(blockPosA.getY() - blockPosB.getY()) <= distance
                && Math.abs(blockPosA.getZ() - blockPosB.getZ()) <= distance;
    }

    private BlockPos findFreeSpace(Level world, BlockPos blockPos, int maxDistance) {
        if (blockPos == null)
            return null;

        int[] offsets = new int[maxDistance * 2 + 1];
        offsets[0] = 0;
        for (int i = 2; i <= maxDistance * 2; i += 2) {
            offsets[i - 1] = i / 2;
            offsets[i] = -i / 2;
        }
        for (int x : offsets)
            for (int y : offsets)
                for (int z : offsets) {
                    BlockPos offsetPos = blockPos.offset(x, y, z);
                    BlockState state = world.getBlockState(offsetPos);
//                    if (state.isAir() || state.getBlock().equals(DoomBlocks.TICKING_LIGHT_BLOCK.get()))
//                        return offsetPos;
                }

        return null;
    }

    @Override
    public ItemStack getPickupItem() {
        return new ItemStack(KnocksItems.AIR_RUNE.get());
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public boolean isNoGravity() {
        if (this.isInWater()) {
            return false;
        } else {
            return true;
        }
    }

    public SoundEvent hitSound = this.getDefaultHitGroundSoundEvent();

    @Override
    protected void onHitBlock(BlockHitResult p_230299_1_) {
        super.onHitBlock(p_230299_1_);
        //this.setSoundEvent(DoomSounds.ROCKET_HIT.get());
    }

    @Override
    public void setSoundEvent(SoundEvent soundIn) {
        this.hitSound = soundIn;
    }

    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.GENERIC_EXPLODE;
    }

    @Override
    public boolean isPushedByFluid() {
        return false;
    }

    @Override
    protected void onHitEntity(EntityHitResult p_213868_1_) {
        Entity entity = this.getOwner();
        if (p_213868_1_.getType() != HitResult.Type.ENTITY || !((EntityHitResult) p_213868_1_).getEntity().is(entity)) {
            if (!this.level.isClientSide) {
                this.doDamage();
                this.remove(RemovalReason.KILLED);
            }
        }
    }

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        Entity entity = this.getOwner();
        if (result.getType() != HitResult.Type.ENTITY || !((EntityHitResult) result).getEntity().is(entity)) {
            if (!this.level.isClientSide) {
                this.doDamage();
                this.remove(RemovalReason.KILLED);
            }
        }
    }

    @Override
    public void remove(RemovalReason reason) {
        AreaEffectCloud areaeffectcloudentity = new AreaEffectCloud(this.level, this.getX(), this.getY(), this.getZ());
        areaeffectcloudentity.setParticle(ParticleTypes.LAVA);
        areaeffectcloudentity.setRadius(6);
        areaeffectcloudentity.setDuration(1);
        areaeffectcloudentity.setPos(this.getX(), this.getY(), this.getZ());
        this.level.addFreshEntity(areaeffectcloudentity);
        level.playSound((Player) null, this.getX(), this.getY(), this.getZ(), SoundEvents.GENERIC_EXPLODE,
                SoundSource.PLAYERS, 1.0F, 1.5F);
        super.remove(reason);
    }

    public void doDamage() {
        float f2 = 4.0F;
        int k1 = Mth.floor(this.getX() - (double) f2 - 1.0D);
        int l1 = Mth.floor(this.getX() + (double) f2 + 1.0D);
        int i2 = Mth.floor(this.getY() - (double) f2 - 1.0D);
        int i1 = Mth.floor(this.getY() + (double) f2 + 1.0D);
        int j2 = Mth.floor(this.getZ() - (double) f2 - 1.0D);
        int j1 = Mth.floor(this.getZ() + (double) f2 + 1.0D);
        List<Entity> list = this.level.getEntities(this,
                new AABB((double) k1, (double) i2, (double) j2, (double) l1, (double) i1, (double) j1));
        Vec3 vector3d = new Vec3(this.getX(), this.getY(), this.getZ());
        for (int k2 = 0; k2 < list.size(); ++k2) {
            Entity entity = list.get(k2);
            double d12 = (double) (Mth.sqrt((float) entity.distanceToSqr(vector3d)) / f2);
            if (d12 <= 1.0D) {
                if (entity instanceof LivingEntity) {
                    entity.hurt(DamageSource.playerAttack((Player) this.shooter), projectiledamage);
                }
            }
        }
    }
}