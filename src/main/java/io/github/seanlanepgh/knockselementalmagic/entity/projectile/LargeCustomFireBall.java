package io.github.seanlanepgh.knockselementalmagic.entity.projectile;

import io.github.seanlanepgh.knockselementalmagic.core.*;
import io.github.seanlanepgh.knockselementalmagic.damageSource.KWDamageSource;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class LargeCustomFireBall extends AbstractHurtingProjectile implements ItemSupplier {
	private static final EntityDataAccessor<ItemStack> DATA_ITEM_STACK = SynchedEntityData.defineId(LargeCustomFireBall.class,
			EntityDataSerializers.ITEM_STACK);
	 private int explosionPower = 1;

	 public LargeCustomFireBall(EntityType<?> p_37364_, Level p_37365_) {
			super((EntityType<? extends AbstractHurtingProjectile>) p_37364_, p_37365_);
		}

		public LargeCustomFireBall(EntityType<SmallEarthBall> p_36990_, double p_36991_, double p_36992_, double p_36993_,
				double p_36994_, double p_36995_, double p_36996_, Level p_36997_) {
			super(p_36990_, p_36997_);
		}

		public LargeCustomFireBall(EntityType<SmallEarthBall> p_36999_, LivingEntity p_37000_, double p_37001_, double p_37002_,
				double p_37003_, Level p_37004_) {
			super(p_36999_, p_37004_);
		}

		public LargeCustomFireBall(Level p_37367_, double p_37368_, double p_37369_, double p_37370_, double p_37371_,
				double p_37372_, double p_37373_) {
			super(KnocksEntityTypes.LARGE_FIREBALL.get(), p_37368_, p_37369_, p_37370_, p_37371_, p_37372_, p_37373_, p_37367_);
		}
		/**
		 * Gets how bright this entity is.
		 */

		public float getBrightness() {
			return 1.0F;
		}

		@Override
		protected boolean shouldBurn() {
			return true;
		}

		@Override
		protected ParticleOptions getTrailParticle() {
			return ParticleTypes.FLAME;
		}

	   /**
	    * Called when this EntityFireball hits a block or entity.
	    */
	   protected void onHit(HitResult pResult) {
	      super.onHit(pResult);
	      if (!this.level.isClientSide) {
	         boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.level, this.getOwner());
	         this.level.explode((Entity)null, this.getX(), this.getY(), this.getZ(), (float)this.explosionPower, flag, flag ? Explosion.BlockInteraction.DESTROY : Explosion.BlockInteraction.NONE);
	         this.discard();
	      }

	   }

	   /**
	    * Called when the arrow hits an entity
	    */
	   protected void onHitEntity(EntityHitResult pResult) {
	      super.onHitEntity(pResult);
	      if (!this.level.isClientSide) {
	         Entity entity = pResult.getEntity();
	         Entity entity1 = this.getOwner();
	         entity.hurt(KWDamageSource.largeFireBall(this, entity1), 6.0F);
	         if (entity1 instanceof LivingEntity) {
	            this.doEnchantDamageEffects((LivingEntity)entity1, entity);
	         }

	      }
	   }

	   public void addAdditionalSaveData(CompoundTag pCompound) {
	      super.addAdditionalSaveData(pCompound);
	      pCompound.putByte("ExplosionPower", (byte)this.explosionPower);
	   }

	   /**
	    * (abstract) Protected helper method to read subclass entity data from NBT.
	    */
	   public void readAdditionalSaveData(CompoundTag pCompound) {
	      super.readAdditionalSaveData(pCompound);
	      if (pCompound.contains("ExplosionPower", 99)) {
	         this.explosionPower = pCompound.getByte("ExplosionPower");
	      }

	   }
		protected ItemStack getItemRaw() {
			return this.getEntityData().get(DATA_ITEM_STACK);
		}


	@Override
	public ItemStack getItem() {
		ItemStack itemstack = this.getItemRaw();
		return itemstack.isEmpty() ? new ItemStack(Items.FIRE_CHARGE) : itemstack;
	}
}
