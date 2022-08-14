package io.github.seanlanepgh.knockselementalmagic.entity.projectile;

import io.github.seanlanepgh.knockselementalmagic.core.*;
import io.github.seanlanepgh.knockselementalmagic.entity.*;
import net.minecraft.core.particles.*;
import net.minecraft.nbt.*;
import net.minecraft.network.protocol.*;
import net.minecraft.world.damagesource.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.level.*;
import net.minecraft.world.phys.*;
import net.minecraftforge.network.*;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class BlizzBolt extends AbstractHurtingProjectile implements IAnimatable {

	protected int timeInAir;
	protected boolean inAir;
	private int ticksInAir;
	private float directHitDamage = 2;

	public BlizzBolt(EntityType<BlizzBolt> entity, Level world) {
		super(entity, world);
	}

	private AnimationFactory factory = new AnimationFactory(this);

	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.elemental_bolt.idle", true));
		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController<BlizzBolt>(this, "controller", 0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}

	public BlizzBolt(Level worldIn, LivingEntity shooter, double accelX, double accelY, double accelZ,
						   float directHitDamage) {
		super(KnocksEntityTypes.BLIZZ_BOLT.get(), shooter, accelX, accelY, accelZ, worldIn);
		this.directHitDamage = directHitDamage;
	}

	public BlizzBolt(Level worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
		super(KnocksEntityTypes.BLIZZ_BOLT.get(), x, y, z, accelX, accelY, accelZ, worldIn);
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

	public void setDirectHitDamage(float directHitDamage) {
		this.directHitDamage = directHitDamage;
	}

	@Override
	protected ParticleOptions getTrailParticle() {
		return KnocksParticles.SNOWFLAKE.get();
	}

	@Override
	public void tick() {
		super.tick();
		this.level.addParticle(this.getTrailParticle(), this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
	}

	@Override
	public boolean isOnFire() {
		return false;
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

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	@Override
	public boolean isPickable() {
		return false;
	}

	@Override
	protected void onHitEntity(EntityHitResult p_213868_1_) {
		super.onHitEntity(p_213868_1_);
		if (!this.level.isClientSide) {
			Entity entity = p_213868_1_.getEntity();
			Entity entity1 = this.getOwner();
			if (!(entity instanceof KnocksEntity))
				entity.hurt(DamageSource.mobAttack((LivingEntity) entity1), directHitDamage);
			this.remove(RemovalReason.KILLED);
			if (entity1 instanceof LivingEntity) {
				if (!(entity instanceof KnocksEntity))
					this.doEnchantDamageEffects((LivingEntity) entity1, entity);
			}
		}
	}

}