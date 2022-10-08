package io.github.seanlanepgh.knockselementalmagic.core.damageSource;

public class KWDamageSource {

   private boolean isIceSource;
   private boolean isEarthSource;
   private boolean isAirSource;
   public final String msgId;



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

   public static final KWDamageSource AIR_MAGIC = (new KWDamageSource("air_magic")).setIsAir().setProjectile();
   public static final KWDamageSource ICE_MAGIC = (new KWDamageSource("ice_magic")).setIsIce().setProjectile();
   public static final KWDamageSource EARTH_MAGIC = (new KWDamageSource("earth_magic")).setIsEarth().setProjectile();


   public boolean isProjectile() {
      return this.isProjectile;
   }

   public KWDamageSource setProjectile() {
      this.isProjectile = true;
      return this;
   }

   public KWDamageSource setIsAir() {
      this.isAirSource = true;
      return this;
   }
      public boolean isAir() {
         return this.isAirSource;
      }

   public KWDamageSource setIsIce() {
      this.isIceSource = true;
      return this;
   }
   public boolean isIce() {
      return this.isIceSource;
   }
   public KWDamageSource setIsEarth() {
      this.isEarthSource = true;
      return this;
   }
   public boolean isEarth() {
      return this.isEarthSource;
   }

   public boolean isFall() {
      return this.isFall;
   }

   public KWDamageSource setIsFall() {
      this.isFall = true;
      return this;
   }

   public KWDamageSource setIsFire() {
      this.isFireSource = true;
      return this;
   }

   public KWDamageSource bypassInvul() {
      this.bypassInvul = true;
      return this;
   }

   public boolean isBypassInvul() {
      return this.bypassInvul;
   }

   public boolean isFire() {
      return this.isFireSource;
   }

//   public static DamageSource iceBall(SmallIceBall p_19350_, @Nullable Entity p_19351_) {
//      return p_19351_ == null ? (new IndirectEntityDamageSource("freeze", p_19350_, p_19350_)).setProjectile() : (new IndirectEntityDamageSource("iceball", p_19350_, p_19351_)).setProjectile();
//   }
//   public static DamageSource earthBall(SmallEarthBall p_19350_, @Nullable Entity p_19351_) {
//	      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", p_19350_, p_19350_)).setProjectile() : (new IndirectEntityDamageSource("earthball", p_19350_, p_19351_)).setProjectile();
//	   }
//   public static DamageSource airBall(SmallAirBall smallAirBall, @Nullable Entity p_19351_) {
//	      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", smallAirBall, smallAirBall)).setProjectile() : (new IndirectEntityDamageSource("airball", smallAirBall, p_19351_)).setProjectile();
//	   }
//   public static DamageSource fireBall(SmallCustomFireBall smallFireBall, @Nullable Entity p_19351_) {
//	      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", smallFireBall, smallFireBall)).setProjectile() : (new IndirectEntityDamageSource("fireball", smallFireBall, p_19351_)).setProjectile();
//	   }
//
//   public static DamageSource largeIceBall(LargeIceBall p_19350_, @Nullable Entity p_19351_) {
//	      return p_19351_ == null ? (new IndirectEntityDamageSource("freeze", p_19350_, p_19350_)).setProjectile() : (new IndirectEntityDamageSource("iceball", p_19350_, p_19351_)).setProjectile();
//	   }
//	   public static DamageSource largeEarthBall(LargeEarthBall  p_19350_, @Nullable Entity p_19351_) {
//		      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", p_19350_, p_19350_)).setProjectile() : (new IndirectEntityDamageSource("earthball", p_19350_, p_19351_)).setProjectile();
//		   }
//	   public static DamageSource largeAirBall(LargeAirBall  smallAirBall, @Nullable Entity p_19351_) {
//		      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", smallAirBall, smallAirBall)).setProjectile() : (new IndirectEntityDamageSource("airball", smallAirBall, p_19351_)).setProjectile();
//		   }
//	   public static DamageSource largeFireBall(LargeCustomFireBall  smallFireBall, @Nullable Entity p_19351_) {
//		      return p_19351_ == null ? (new IndirectEntityDamageSource("generic", smallFireBall, smallFireBall)).setProjectile() : (new IndirectEntityDamageSource("fireball", smallFireBall, p_19351_)).setProjectile();
//		   }
public KWDamageSource(String p_19333_) {
   this.msgId = p_19333_;
}
}