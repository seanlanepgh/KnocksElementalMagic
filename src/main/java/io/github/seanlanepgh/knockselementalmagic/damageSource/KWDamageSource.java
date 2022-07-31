package io.github.seanlanepgh.knockselementalmagic.damageSource;

import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.IndirectEntityDamageSource;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

public class KWDamageSource {
//   public static final DamageSource IN_FIRE = (new DamageSource("inFire")).bypassArmor().setIsFire();
//   public static final DamageSource LIGHTNING_BOLT = new DamageSource("lightningBolt");
//   public static final DamageSource ON_FIRE = (new DamageSource("onFire")).bypassArmor().setIsFire();
//   public static final DamageSource LAVA = (new DamageSource("lava")).setIsFire();
//   public static final DamageSource HOT_FLOOR = (new DamageSource("hotFloor")).setIsFire();
//   public static final DamageSource IN_WALL = (new DamageSource("inWall")).bypassArmor();
//   public static final DamageSource CRAMMING = (new DamageSource("cramming")).bypassArmor();
//   public static final DamageSource DROWN = (new DamageSource("drown")).bypassArmor();
//   public static final DamageSource STARVE = (new DamageSource("starve")).bypassArmor().bypassMagic();
//   public static final DamageSource CACTUS = new DamageSource("cactus");
//   public static final DamageSource FALL = (new DamageSource("fall")).bypassArmor().setIsFall();
//   public static final DamageSource FLY_INTO_WALL = (new DamageSource("flyIntoWall")).bypassArmor();
//   public static final DamageSource OUT_OF_Level = (new DamageSource("outOfLevel")).bypassArmor().bypassInvul();
//   public static final DamageSource GENERIC = (new DamageSource("generic")).bypassArmor();
//   public static final DamageSource MAGIC = (new DamageSource("magic")).bypassArmor().setMagic();
//   public static final DamageSource WITHER = (new DamageSource("wither")).bypassArmor();
//   public static final DamageSource ANVIL = (new DamageSource("anvil")).damageHelmet();
//   public static final DamageSource FALLING_BLOCK = (new DamageSource("fallingBlock")).damageHelmet();
//   public static final DamageSource DRAGON_BREATH = (new DamageSource("dragonBreath")).bypassArmor();
//   public static final DamageSource DRY_OUT = new DamageSource("dryout");
//   public static final DamageSource SWEET_BERRY_BUSH = new DamageSource("sweetBerryBush");
//   public static final DamageSource FREEZE = (new DamageSource("freeze")).bypassArmor();
//   public static final DamageSource FALLING_STALACTITE = (new DamageSource("fallingStalactite")).damageHelmet();
//   public static final DamageSource STALAGMITE = (new DamageSource("stalagmite")).bypassArmor().setIsFall();
   private boolean damageHelmet;
   private boolean bypassArmor;
   private boolean bypassInvul;
   private boolean bypassMagic;
   private float exhaustion = 0.1F;
   private boolean isFireSource;
   private boolean isProjectile;
   private boolean scalesWithDifficulty;
   private boolean isMagic;
   private boolean isExplosion;
   private boolean isFall;
   private boolean noAggro;
   

 

   public static DamageSource iceBall(SmallIceBall p_19350_, @Nullable Entity p_19351_) {
      return p_19351_ == null ? (new IndirectEntityDamageSource("freeze", p_19350_, p_19350_)).setProjectile() : (new IndirectEntityDamageSource("iceball", p_19350_, p_19351_)).setProjectile();
   }
   public static DamageSource earthBall(SmallEarthBall p_19350_, @Nullable Entity p_19351_) {
	      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", p_19350_, p_19350_)).setProjectile() : (new IndirectEntityDamageSource("earthball", p_19350_, p_19351_)).setProjectile();
	   }
   public static DamageSource airBall(SmallAirBall smallAirBall, @Nullable Entity p_19351_) {
	      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", smallAirBall, smallAirBall)).setProjectile() : (new IndirectEntityDamageSource("airball", smallAirBall, p_19351_)).setProjectile();
	   }
   public static DamageSource fireBall(SmallCustomFireBall smallFireBall, @Nullable Entity p_19351_) {
	      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", smallFireBall, smallFireBall)).setProjectile() : (new IndirectEntityDamageSource("fireball", smallFireBall, p_19351_)).setProjectile();
	   }
   
   public static DamageSource largeIceBall(LargeIceBall p_19350_, @Nullable Entity p_19351_) {
	      return p_19351_ == null ? (new IndirectEntityDamageSource("freeze", p_19350_, p_19350_)).setProjectile() : (new IndirectEntityDamageSource("iceball", p_19350_, p_19351_)).setProjectile();
	   }
	   public static DamageSource largeEarthBall(LargeEarthBall  p_19350_, @Nullable Entity p_19351_) {
		      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", p_19350_, p_19350_)).setProjectile() : (new IndirectEntityDamageSource("earthball", p_19350_, p_19351_)).setProjectile();
		   }
	   public static DamageSource largeAirBall(LargeAirBall  smallAirBall, @Nullable Entity p_19351_) {
		      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", smallAirBall, smallAirBall)).setProjectile() : (new IndirectEntityDamageSource("airball", smallAirBall, p_19351_)).setProjectile();
		   }
	   public static DamageSource largeFireBall(LargeCustomFireBall  smallFireBall, @Nullable Entity p_19351_) {
		      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", smallFireBall, smallFireBall)).setProjectile() : (new IndirectEntityDamageSource("fireball", smallFireBall, p_19351_)).setProjectile();
		   }

}