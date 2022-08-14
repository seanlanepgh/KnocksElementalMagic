package io.github.seanlanepgh.knockselementalmagic.core;


import io.github.seanlanepgh.knockselementalmagic.*;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.*;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KnocksEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, KnocksElementalMagic.MODID);

    public static final RegistryObject<EntityType<BlizzEntity>> BLIZZ = ENTITY_TYPES.register("blizz",
            () -> EntityType.Builder.of(BlizzEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "blizz").toString()));
    public static final RegistryObject<EntityType<Icicle>> ICICLE = ENTITY_TYPES.register("icicle",
            () ->  EntityType.Builder.<Icicle>of(Icicle::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "icicle").toString()));
    public static final RegistryObject<EntityType<BlizzBolt>> BLIZZ_BOLT = ENTITY_TYPES.register("blizz_bolt",
            () ->  EntityType.Builder.<BlizzBolt>of(BlizzBolt::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blizz_bolt").toString()));
    public static final RegistryObject<EntityType<BlizzBlast>> BLIZZ_BLAST = ENTITY_TYPES.register("blizz_blast",
            () ->  EntityType.Builder.<BlizzBlast>of(BlizzBlast::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blizz_blast").toString()));
    public static final RegistryObject<EntityType<QuakeBolt>> QUAKE_BOLT = ENTITY_TYPES.register("quake_bolt",
            () ->  EntityType.Builder.<QuakeBolt>of(QuakeBolt::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "quake_bolt").toString()));

    public static final RegistryObject<EntityType<BlazeBolt>> BLAZE_BOLT = ENTITY_TYPES.register("blaze_bolt",
            () ->  EntityType.Builder.<BlazeBolt>of(BlazeBolt::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blaze_bolt").toString()));
    public static final RegistryObject<EntityType<BlazeBlast>> BLAZE_BLAST = ENTITY_TYPES.register("blaze_blast",
            () ->  EntityType.Builder.<BlazeBlast>of(BlazeBlast::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blaze_blast").toString()));
    public static final RegistryObject<EntityType<TornadoBolt>> TORNADO_BOLT = ENTITY_TYPES.register("tornado_bolt",
            () ->  EntityType.Builder.<TornadoBolt>of(TornadoBolt::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "tornado_bolt").toString()));
    public static final RegistryObject<EntityType<QuakeEntity>> QUAKE = ENTITY_TYPES.register("quake",
            () -> EntityType.Builder.of(QuakeEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "quake").toString()));
//    public static final RegistryObject<EntityType<?>> EARTH_SPIDER = ENTITY_TYPES.register("earth_spider",
//            () -> EntityType.Builder.of(EarthSpiderEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "earth_spider").toString()));
//    public static final RegistryObject<EntityType<?>> FLAME_SPIDER = ENTITY_TYPES.register("flame_spider",
//            () -> EntityType.Builder.of(FlameSpiderEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "flame_spider").toString()));
//	public static final RegistryObject<EntityType<IcyCreeperEntity>> ICY_CREEPER = ENTITY_TYPES.register("icy_creeper",
//			() -> EntityType.Builder.of(IcyCreeperEntity::new, MobCategory.MONSTER).sized(0.6F, 1.7F)
//					.clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "icy_creeper").toString()));

//    public static RegistryObject <EntityType <FireGolemEntity>> FIRE_GOLEM = ENTITY_TYPES.register( "fire_golem" ,
//            () -> EntityType.Builder.of( FireGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "fire_golem" ).toString() ) );
//    public static RegistryObject <EntityType <IceGolemEntity>> ICE_GOLEM = ENTITY_TYPES.register( "ice_golem" ,
//            () -> EntityType.Builder.of( IceGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "ice_golem" ).toString() ) );
//    public static RegistryObject <EntityType <AirGolemEntity>> AIR_GOLEM = ENTITY_TYPES.register( "air_golem" ,
//            () -> EntityType.Builder.of( AirGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "air_golem" ).toString() ) );
//    public static RegistryObject <EntityType <EarthGolemEntity>> EARTH_GOLEM = ENTITY_TYPES.register( "earth_golem" ,
//            () -> EntityType.Builder.of(EarthGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "earth_golem" ).toString() ) );

//    public static RegistryObject <EntityType <FireWizardEntity>> FIRE_WIZARD = ENTITY_TYPES.register( "fire_wizard" ,
//            () -> EntityType.Builder.of( FireWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "fire_wizard" ).toString() ) );
//    public static RegistryObject <EntityType <IceWizardEntity>> ICE_WIZARD = ENTITY_TYPES.register( "ice_wizard" ,
//            () -> EntityType.Builder.of( IceWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "ice_wizard" ).toString() ) );
//    public static RegistryObject <EntityType <EarthWizardEntity>> EARTH_WIZARD = ENTITY_TYPES.register( "earth_wizard" ,
//            () -> EntityType.Builder.of( EarthWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "earth_wizard" ).toString()));
//    public static RegistryObject <EntityType <AirWizardEntity>> AIR_WIZARD = ENTITY_TYPES.register( "air_wizard" ,
//            () -> EntityType.Builder.of( AirWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "air_wizard" ).toString() ) );
//
//    public static RegistryObject <EntityType <NatureWizardEntity>> NATURE_WIZARD = ENTITY_TYPES.register( "nature_wizard" ,
//            () -> EntityType.Builder.of(NatureWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "nature_wizard" ).toString() ) );
//
//    public static RegistryObject <EntityType <VoidWizardEntity>> VOID_WIZARD = ENTITY_TYPES.register( "void_wizard" ,
//            () -> EntityType.Builder.of(VoidWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "void_wizard" ).toString() ) );
//    public static RegistryObject <EntityType <GolemSpikeEntity>> GOLEM_SPIKE_ENTITY = ENTITY_TYPES.register( "golem_spike" ,
//            () -> EntityType.Builder.of( GolemSpikeEntity::new, MobCategory.MISC).sized(0.8F, 0.8F)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "golem_spike" ).toString() ));
//    public static final RegistryObject<EntityType<?>> ICY_SPIDER = ENTITY_TYPES.register("icy_spider",
//            () -> EntityType.Builder.of(IcySpiderEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "icy_spider").toString()));

//    public static final RegistryObject<EntityType<?>> JUNGLE_SPIDER = ENTITY_TYPES.register("jungle_spider",
//            () -> EntityType.Builder.of(JungleSpiderEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "jungle_spider").toString()));
//    public static final RegistryObject<EntityType<SmallIceBall>> SMALL_ICEBALL = ENTITY_TYPES.register("small_iceball",
//            () ->  EntityType.Builder.<SmallIceBall>of(SmallIceBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "small_iceball").toString()));
//
//    public static final RegistryObject<EntityType<SmallEarthBall>> SMALL_EARTHBALL = ENTITY_TYPES.register("small_earthball",
//            () ->  EntityType.Builder.<SmallEarthBall>of(SmallEarthBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "small_earthball").toString()));
//    public static final RegistryObject<EntityType<SmallAirBall>> SMALL_AIRBALL = ENTITY_TYPES.register("small_airball",
//            () ->  EntityType.Builder.<SmallAirBall>of(SmallAirBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "small_airball").toString()));
//    public static final RegistryObject<EntityType<SmallCustomFireBall>> SMALL_FIREBALL = ENTITY_TYPES.register("small_fireball",
//            () ->  EntityType.Builder.<SmallCustomFireBall>of(SmallCustomFireBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "small_fireball").toString()));
//
//    public static final RegistryObject<EntityType<LargeIceBall>> LARGE_ICEBALL = ENTITY_TYPES.register("large_iceball",
//            () ->  EntityType.Builder.<LargeIceBall>of(LargeIceBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "large_iceball").toString()));
//
//    public static final RegistryObject<EntityType<LargeEarthBall>> LARGE_EARTHBALL = ENTITY_TYPES.register("large_earthball",
//            () ->  EntityType.Builder.<LargeEarthBall>of(LargeEarthBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "large_earthball").toString()));
//    public static final RegistryObject<EntityType<LargeAirBall>> LARGE_AIRBALL = ENTITY_TYPES.register("large_airball",
//            () ->  EntityType.Builder.<LargeAirBall>of(LargeAirBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "large_airball").toString()));
//    public static final RegistryObject<EntityType<LargeCustomFireBall>> LARGE_FIREBALL = ENTITY_TYPES.register("large_fireball",
//            () ->  EntityType.Builder.<LargeCustomFireBall>of(LargeCustomFireBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "large_fireball").toString()));
//    public static final RegistryObject<EntityType<TornadoEntity>> TORNADO = ENTITY_TYPES.register("tornado",
//            () -> EntityType.Builder.of(TornadoEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "tornado").toString()));
//    public static final RegistryObject<EntityType<QuakeEntity>> QUAKE = ENTITY_TYPES.register("quake",
//            () -> EntityType.Builder.of(QuakeEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "quake").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
