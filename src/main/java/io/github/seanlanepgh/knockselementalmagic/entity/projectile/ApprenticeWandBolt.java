package io.github.seanlanepgh.knockselementalmagic.entity.projectile;

import io.github.seanlanepgh.knockselementalmagic.core.*;
import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.damagesource.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.phys.*;


public class ApprenticeWandBolt extends AbstractHurtingProjectile implements ItemSupplier {

	private static final EntityDataAccessor<ItemStack> DATA_ITEM_STACK = SynchedEntityData.defineId(SmallAirBall.class, EntityDataSerializers.ITEM_STACK);

	   public ApprenticeWandBolt (EntityType<?> p_37364_, Level p_37365_) {
	      super((EntityType<? extends AbstractHurtingProjectile>) p_37364_, p_37365_);
	   }


	   public ApprenticeWandBolt(EntityType<? extends AbstractHurtingProjectile> p_36990_, double p_36991_, double p_36992_, double p_36993_, double p_36994_, double p_36995_, double p_36996_, Level p_36997_) {
	      super(p_36990_, p_36991_, p_36992_, p_36993_, p_36994_, p_36995_, p_36996_, p_36997_);
	   }

	   public ApprenticeWandBolt(EntityType<? extends AbstractHurtingProjectile> p_36999_, LivingEntity p_37000_, double p_37001_, double p_37002_, double p_37003_, Level p_37004_) {
	      super(p_36999_, p_37000_, p_37001_, p_37002_, p_37003_, p_37004_);
	   }

	   protected void onHitEntity(EntityHitResult p_37386_) {
	      super.onHitEntity(p_37386_);
	      if (!this.level.isClientSide) {
	         Entity entity = p_37386_.getEntity();
	         if (!entity.canFreeze()) {
	            Entity entity1 = this.getOwner();
//	            int i = entity.getRemainingFireTicks();
//	            entity.setTicksFrozen(5);;
//	            boolean flag = entity.hurt(KWDamageSource.airBall(this, entity1), 5.0F);
//	            if (!flag) {
//	             //  entity.setTicksFrozen(i);
//	            } else if (entity1 instanceof LivingEntity) {
//	               this.doEnchantDamageEffects((LivingEntity)entity1, entity);
//	            }
	         }

	      }
       }

	   protected void onHitBlock(BlockHitResult p_37384_) {
	      super.onHitBlock(p_37384_);
	      if (!this.level.isClientSide) {
	         Entity entity = this.getOwner();
//	         if (!(entity instanceof Mob) || net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.level, this)) {
//	            BlockPos blockpos = p_37384_.getBlockPos().relative(p_37384_.getDirection());
//	            if (this.level.isEmptyBlock(blockpos)) {
//	               this.level.setBlockAndUpdate(blockpos, BaseFireBlock.getState(this.level, blockpos));
//	            }
//	         }

	      }
	   }

	   protected void onHit(HitResult p_37388_) {
	      super.onHit(p_37388_);
	      if (!this.level.isClientSide) {
	         this.discard();
	      }

	   }

	   public boolean isPickable() {
	      return false;
	   }

	   public boolean hurt(DamageSource p_37381_, float p_37382_) {
	      return false;
	   }
	   public void setItem(ItemStack p_37011_) {
		      if (!p_37011_.is(KnocksItems.AIR_CHARGE.get()) || p_37011_.hasTag()) {
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
		      return itemstack.isEmpty() ? new ItemStack(KnocksItems.AIR_CHARGE.get()) : itemstack;
		   }

		   protected void defineSynchedData() {
		      this.getEntityData().define(DATA_ITEM_STACK, ItemStack.EMPTY);
		   }

		   public void addAdditionalSaveData(CompoundTag p_37013_) {
		      super.addAdditionalSaveData(p_37013_);
		      ItemStack itemstack = this.getItemRaw();
		      if (!itemstack.isEmpty()) {
		         p_37013_.put("Item", itemstack.save(new CompoundTag()));
		      }

		   }

		   public void readAdditionalSaveData(CompoundTag p_37009_) {
		      super.readAdditionalSaveData(p_37009_);
		      ItemStack itemstack = ItemStack.of(p_37009_.getCompound("Item"));
		      this.setItem(itemstack);
		   }
}