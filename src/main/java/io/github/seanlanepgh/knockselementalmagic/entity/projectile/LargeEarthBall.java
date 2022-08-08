package io.github.seanlanepgh.knockselementalmagic.entity.projectile;


import io.github.seanlanepgh.knockselementalmagic.core.*;
import io.github.seanlanepgh.knockselementalmagic.damageSource.*;
import net.minecraft.Util;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.*;
import net.minecraft.world.damagesource.*;
import net.minecraft.world.effect.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.phys.*;

public class LargeEarthBall extends AbstractHurtingProjectile implements ItemSupplier {
	private static final EntityDataAccessor<ItemStack> DATA_ITEM_STACK = SynchedEntityData.defineId(SmallIceBall.class,
			EntityDataSerializers.ITEM_STACK);

	public LargeEarthBall(EntityType<?> p_37364_, Level p_37365_) {
		super((EntityType<? extends AbstractHurtingProjectile>) p_37364_, p_37365_);
	}

	public LargeEarthBall(EntityType<SmallEarthBall> p_36990_, double p_36991_, double p_36992_, double p_36993_,
			double p_36994_, double p_36995_, double p_36996_, Level p_36997_) {
		super(p_36990_, p_36997_);
	}

	public LargeEarthBall(EntityType<SmallEarthBall> p_36999_, LivingEntity p_37000_, double p_37001_, double p_37002_,
			double p_37003_, Level p_37004_) {
		super(p_36999_, p_37004_);
	}

	public LargeEarthBall(Level p_37367_, double p_37368_, double p_37369_, double p_37370_, double p_37371_,
			double p_37372_, double p_37373_) {
		super(KnocksEntityTypes.LARGE_EARTHBALL.get(), p_37368_, p_37369_, p_37370_, p_37371_, p_37372_, p_37373_, p_37367_);
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void tick() {
		Entity entity = this.getOwner();
		if (this.level.isClientSide
				|| (entity == null || !entity.isRemoved()) && this.level.hasChunkAt(this.blockPosition())) {
			super.tick();
//	         if (this.shouldBurn()) {
//	            this.setSecondsOnFire(1);
//	         }

			HitResult hitresult = ProjectileUtil.getHitResult(this, this::canHitEntity);
			if (hitresult.getType() != HitResult.Type.MISS
					&& !net.minecraftforge.event.ForgeEventFactory.onProjectileImpact(this, hitresult)) {
				this.onHit(hitresult);
			}

			this.checkInsideBlocks();
			Vec3 vec3 = this.getDeltaMovement();
			double d0 = this.getX() + vec3.x;
			double d1 = this.getY() + vec3.y;
			double d2 = this.getZ() + vec3.z;
			ProjectileUtil.rotateTowardsMovement(this, 0.2F);
			float f = this.getInertia();
			if (this.isInWater()) {
				for (int i = 0; i < 4; ++i) {
					float f1 = 0.25F;
					this.level.addParticle(ParticleTypes.BUBBLE, d0 - vec3.x * 0.25D, d1 - vec3.y * 0.25D,
							d2 - vec3.z * 0.25D, vec3.x, vec3.y, vec3.z);
				}

				f = 0.8F;
			}

			this.setDeltaMovement(vec3.add(this.xPower, this.yPower, this.zPower).scale((double) f));
			if (!this.isInWater()) {
				this.level.addParticle(this.getTrailParticle(), d0, d1 + 0.5D, d2, 0.0D, 0.0D, 0.0D);
			}
			this.setPos(d0, d1, d2);
		} else {
			this.discard();
		}
	}

	@Override
	protected void onHitEntity(EntityHitResult p_37386_) {
		super.onHitEntity(p_37386_);
		if (!this.level.isClientSide) {
			Entity entity = p_37386_.getEntity();
			//if (!entity.()) {
				Entity entity1 = this.getOwner();
//				int i = entity.getRemainingFireTicks();
//				entity.setTicksFrozen(5);

				boolean flag = entity.hurt(KWDamageSource.largeEarthBall(this, entity1), 3.0F);
				if (!flag) {
					if (entity instanceof LivingEntity) {
						int i = 0;
						if (this.level.getDifficulty() == Difficulty.NORMAL) {
							i = 4;
						} else if (this.level.getDifficulty() == Difficulty.HARD) {
							i = 8;
						}

						if (i > 0) {
							((LivingEntity) entity)
									.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, i * 20, 0), this);
						}
					}
				}

		}
    }

	@Override
	protected void onHitBlock(BlockHitResult p_37384_) {
		super.onHitBlock(p_37384_);
		if (!this.level.isClientSide) {
			Entity entity = this.getOwner();
//			if (!(entity instanceof Mob)
//					|| net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.level, this)) {
//				BlockPos blockpos = p_37384_.getBlockPos().relative(p_37384_.getDirection());
//				if (this.level.isEmptyBlock(blockpos)) {
//					this.level.setBlockAndUpdate(blockpos, BaseFireBlock.getState(this.level, blockpos));
//				}
//			}

		}
	}

	protected void onHit(HitResult p_37388_) {
		super.onHit(p_37388_);
		if (!this.level.isClientSide) {
			this.discard();
		}

	}

	/**
	 * Gets how bright this entity is.
	 */

	public float getBrightness() {
		return 0.0F;
	}

	@Override
	protected boolean shouldBurn() {
		return false;
	}

	@Override
	   protected ParticleOptions getTrailParticle() {
	      return ParticleTypes.CLOUD;
	   }

	@Override
	public boolean isPickable() {
		return true;
	}

	@Override
	public boolean hurt(DamageSource p_37381_, float p_37382_) {
		return false;
	}

	public void setItem(ItemStack p_37011_) {
		if (!p_37011_.is(KnocksItems.EARTH_CHARGE.get()) || p_37011_.hasTag()) {
			this.getEntityData().set(DATA_ITEM_STACK, Util.make(p_37011_.copy(), (p_37015_) -> {
				p_37015_.setCount(1);
			}));
		}

	}

	protected ItemStack getItemRaw() {
		return this.getEntityData().get(DATA_ITEM_STACK);
	}

	public ItemStack getItem() {
		ItemStack itemstack = this.getItemRaw();
		return itemstack.isEmpty() ? new ItemStack(KnocksItems.EARTH_CHARGE.get()) : itemstack;
	}

	@Override
	protected void defineSynchedData() {
		this.getEntityData().define(DATA_ITEM_STACK, ItemStack.EMPTY);
	}

	@Override
	public void addAdditionalSaveData(CompoundTag p_37013_) {
		super.addAdditionalSaveData(p_37013_);
		ItemStack itemstack = this.getItemRaw();
		if (!itemstack.isEmpty()) {
			p_37013_.put("Item", itemstack.save(new CompoundTag()));
		}

	}

	@Override
	public void readAdditionalSaveData(CompoundTag p_37009_) {
		super.readAdditionalSaveData(p_37009_);
		ItemStack itemstack = ItemStack.of(p_37009_.getCompound("Item"));
		this.setItem(itemstack);
	}
}
