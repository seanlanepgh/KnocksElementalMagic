package io.github.seanlanepgh.knockselementalmagic.entity;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class KnocksEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, KnocksElementalMagic.MODID);

    public static final RegistryObject<EntityType<BlizzEntity>> BLIZZ = ENTITY_TYPES.register("blizz",
            () -> EntityType.Builder.of(BlizzEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "blizz").toString()));
//    public static final RegistryObject<EntityType<?>> EARTH_SPIDER = ENTITIES.register("earth_spider",
//            () -> EntityType.Builder.of(EarthSpiderEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(Knocks.MODID, "earth_spider").toString()));
//    public static final RegistryObject<EntityType<?>> FLAME_SPIDER = ENTITIES.register("flame_spider",
//            () -> EntityType.Builder.of(FlameSpiderEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(Knocks.MODID, "flame_spider").toString()));
//	public static final RegistryObject<EntityType<IcyCreeperEntity>> ICY_CREEPER = ENTITIES.register("icy_creeper",
//			() -> EntityType.Builder.of(IcyCreeperEntity::new, MobCategory.MONSTER).sized(0.6F, 1.7F)
//					.clientTrackingRange(8).build(new ResourceLocation(Knocks.MODID, "icy_creeper").toString()));

//    public static RegistryObject <EntityType <FireGolemEntity>> FIRE_GOLEM = ENTITIES.register( "fire_golem" ,
//            () -> EntityType.Builder.of( FireGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
//                    .build( new ResourceLocation(Knocks.MODID , "fire_golem" ).toString() ) );
//    public static RegistryObject <EntityType <IceGolemEntity>> ICE_GOLEM = ENTITIES.register( "ice_golem" ,
//            () -> EntityType.Builder.of( IceGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
//                    .build( new ResourceLocation(Knocks.MODID , "ice_golem" ).toString() ) );
//    public static RegistryObject <EntityType <AirGolemEntity>> AIR_GOLEM = ENTITIES.register( "air_golem" ,
//            () -> EntityType.Builder.of( AirGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
//                    .build( new ResourceLocation(Knocks.MODID , "air_golem" ).toString() ) );
//    public static RegistryObject <EntityType <EarthGolemEntity>> EARTH_GOLEM = ENTITIES.register( "earth_golem" ,
//            () -> EntityType.Builder.of(EarthGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
//                    .build( new ResourceLocation(Knocks.MODID , "earth_golem" ).toString() ) );

//    public static RegistryObject <EntityType <FireWizardEntity>> FIRE_WIZARD = ENTITIES.register( "fire_wizard" ,
//            () -> EntityType.Builder.of( FireWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(Knocks.MODID , "fire_wizard" ).toString() ) );
//    public static RegistryObject <EntityType <IceWizardEntity>> ICE_WIZARD = ENTITIES.register( "ice_wizard" ,
//            () -> EntityType.Builder.of( IceWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(Knocks.MODID , "ice_wizard" ).toString() ) );
//    public static RegistryObject <EntityType <EarthWizardEntity>> EARTH_WIZARD = ENTITIES.register( "earth_wizard" ,
//            () -> EntityType.Builder.of( EarthWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(Knocks.MODID , "earth_wizard" ).toString()));
//    public static RegistryObject <EntityType <AirWizardEntity>> AIR_WIZARD = ENTITIES.register( "air_wizard" ,
//            () -> EntityType.Builder.of( AirWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(Knocks.MODID , "air_wizard" ).toString() ) );
//
//    public static RegistryObject <EntityType <NatureWizardEntity>> NATURE_WIZARD = ENTITIES.register( "nature_wizard" ,
//            () -> EntityType.Builder.of(NatureWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(Knocks.MODID , "nature_wizard" ).toString() ) );
//
//    public static RegistryObject <EntityType <VoidWizardEntity>> VOID_WIZARD = ENTITIES.register( "void_wizard" ,
//            () -> EntityType.Builder.of(VoidWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(Knocks.MODID , "void_wizard" ).toString() ) );
//    public static RegistryObject <EntityType <GolemSpikeEntity>> GOLEM_SPIKE_ENTITY = ENTITIES.register( "golem_spike" ,
//            () -> EntityType.Builder.of( GolemSpikeEntity::new, MobCategory.MISC).sized(0.8F, 0.8F)
//                    .build( new ResourceLocation(Knocks.MODID , "golem_spike" ).toString() ));
//    public static final RegistryObject<EntityType<?>> ICY_SPIDER = ENTITIES.register("icy_spider",
//            () -> EntityType.Builder.of(IcySpiderEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(Knocks.MODID, "icy_spider").toString()));

//    public static final RegistryObject<EntityType<?>> JUNGLE_SPIDER = ENTITIES.register("jungle_spider",
//            () -> EntityType.Builder.of(JungleSpiderEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(Knocks.MODID, "jungle_spider").toString()));
//    public static final RegistryObject<EntityType<SmallIceBall>> SMALL_ICEBALL = ENTITIES.register("small_iceball",
//            () ->  EntityType.Builder.<SmallIceBall>of(SmallIceBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(Knocks.MODID, "small_iceball").toString()));
//
//    public static final RegistryObject<EntityType<SmallEarthBall>> SMALL_EARTHBALL = ENTITIES.register("small_earthball",
//            () ->  EntityType.Builder.<SmallEarthBall>of(SmallEarthBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(Knocks.MODID, "small_earthball").toString()));
//    public static final RegistryObject<EntityType<SmallAirBall>> SMALL_AIRBALL = ENTITIES.register("small_airball",
//            () ->  EntityType.Builder.<SmallAirBall>of(SmallAirBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(Knocks.MODID, "small_airball").toString()));
//    public static final RegistryObject<EntityType<SmallCustomFireBall>> SMALL_FIREBALL = ENTITIES.register("small_fireball",
//            () ->  EntityType.Builder.<SmallCustomFireBall>of(SmallCustomFireBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(Knocks.MODID, "small_fireball").toString()));
//
//    public static final RegistryObject<EntityType<LargeIceBall>> LARGE_ICEBALL = ENTITIES.register("large_iceball",
//            () ->  EntityType.Builder.<LargeIceBall>of(LargeIceBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(Knocks.MODID, "large_iceball").toString()));
//
//    public static final RegistryObject<EntityType<LargeEarthBall>> LARGE_EARTHBALL = ENTITIES.register("large_earthball",
//            () ->  EntityType.Builder.<LargeEarthBall>of(LargeEarthBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(Knocks.MODID, "large_earthball").toString()));
//    public static final RegistryObject<EntityType<LargeAirBall>> LARGE_AIRBALL = ENTITIES.register("large_airball",
//            () ->  EntityType.Builder.<LargeAirBall>of(LargeAirBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(Knocks.MODID, "large_airball").toString()));
//    public static final RegistryObject<EntityType<LargeCustomFireBall>> LARGE_FIREBALL = ENTITIES.register("large_fireball",
//            () ->  EntityType.Builder.<LargeCustomFireBall>of(LargeCustomFireBall::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
//                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(Knocks.MODID, "large_fireball").toString()));
//    public static final RegistryObject<EntityType<TornadoEntity>> TORNADO = ENTITIES.register("tornado",
//            () -> EntityType.Builder.of(TornadoEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(Knocks.MODID, "tornado").toString()));
//    public static final RegistryObject<EntityType<QuakeEntity>> QUAKE = ENTITIES.register("quake",
//            () -> EntityType.Builder.of(QuakeEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
//                    .clientTrackingRange(8).build(new ResourceLocation(Knocks.MODID, "quake").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
