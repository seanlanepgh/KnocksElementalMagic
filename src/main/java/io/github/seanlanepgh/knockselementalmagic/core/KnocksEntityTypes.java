package io.github.seanlanepgh.knockselementalmagic.core;


import io.github.seanlanepgh.knockselementalmagic.*;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.*;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.AirGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.EarthGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.FireGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.IceGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.AirSpike;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.EarthSpike;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.FireSpike;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.IceSpike;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.AirWizardEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.EarthWizardEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.FireWizardEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.IceWizardEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KnocksEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KnocksElementalMagic.MODID);

    public static final RegistryObject<EntityType<BlizzEntity>> BLIZZ = ENTITY_TYPES.register("blizz",
            () -> EntityType.Builder.of(BlizzEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "blizz").toString()));
    public static final RegistryObject<EntityType<BlizzBlast>> BLIZZ_BLAST = ENTITY_TYPES.register("blizz_blast",
            () -> EntityType.Builder.<BlizzBlast>of(BlizzBlast::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blizz_blast").toString()));
    public static final RegistryObject<EntityType<BlizzBolt>> BLIZZ_BOLT = ENTITY_TYPES.register("blizz_bolt",
            () -> EntityType.Builder.<BlizzBolt>of(BlizzBolt::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blizz_bolt").toString()));
    public static final RegistryObject<EntityType<BlazeBlast>> BLAZE_BLAST = ENTITY_TYPES.register("blaze_blast",
            () -> EntityType.Builder.<BlazeBlast>of(BlazeBlast::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blaze_blast").toString()));
    public static final RegistryObject<EntityType<BlazeBolt>> BLAZE_BOLT = ENTITY_TYPES.register("blaze_bolt",
            () -> EntityType.Builder.<BlazeBolt>of(BlazeBolt::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blaze_bolt").toString()));
    public static final RegistryObject<EntityType<BlazeKnightEntity>> BLAZE_KNIGHT = ENTITY_TYPES.register("blaze_knight",
            () -> EntityType.Builder.of(BlazeKnightEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "blaze_knight").toString()));
    public static final RegistryObject<EntityType<BlizzKnightEntity>> BLIZZ_KNIGHT = ENTITY_TYPES.register("blizz_knight",
            () -> EntityType.Builder.of(BlizzKnightEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "blizz_knight").toString()));

    public static final RegistryObject<EntityType<BlazeStrike>> BLAZE_STRIKE = ENTITY_TYPES.register("blaze_strike",
            () -> EntityType.Builder.<BlazeStrike>of(BlazeStrike::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blaze_strike").toString()));
    public static final RegistryObject<EntityType<BlizzStrike>> BLIZZ_STRIKE = ENTITY_TYPES.register("blizz_strike",
            () -> EntityType.Builder.<BlizzStrike>of(BlizzStrike::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "blizz_strike").toString()));
    public static final RegistryObject<EntityType<Icicle>> ICICLE = ENTITY_TYPES.register("icicle",
            () -> EntityType.Builder.<Icicle>of(Icicle::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "icicle").toString()));
    public static final RegistryObject<EntityType<QuakeEntity>> QUAKE = ENTITY_TYPES.register("quake",
            () -> EntityType.Builder.of(QuakeEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "quake").toString()));
    public static final RegistryObject<EntityType<QuakeBlast>> QUAKE_BLAST = ENTITY_TYPES.register("quake_blast",
            () -> EntityType.Builder.<QuakeBlast>of(QuakeBlast::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "quake_blast").toString()));
    public static final RegistryObject<EntityType<QuakeBolt>> QUAKE_BOLT = ENTITY_TYPES.register("quake_bolt",
            () -> EntityType.Builder.<QuakeBolt>of(QuakeBolt::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "quake_bolt").toString()));
    public static final RegistryObject<EntityType<QuakeKnightEntity>> QUAKE_KNIGHT = ENTITY_TYPES.register("quake_knight",
            () -> EntityType.Builder.of(QuakeKnightEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "quake_knight").toString()));
    public static final RegistryObject<EntityType<QuakeStrike>> QUAKE_STRIKE = ENTITY_TYPES.register("quake_strike",
            () -> EntityType.Builder.<QuakeStrike>of(QuakeStrike::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "quake_strike").toString()));
    public static final RegistryObject<EntityType<TornadoBlast>> TORNADO_BLAST = ENTITY_TYPES.register("tornado_blast",
            () -> EntityType.Builder.<TornadoBlast>of(TornadoBlast::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "tornado_blast").toString()));
    public static final RegistryObject<EntityType<TornadoBolt>> TORNADO_BOLT = ENTITY_TYPES.register("tornado_bolt",
            () -> EntityType.Builder.<TornadoBolt>of(TornadoBolt::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "tornado_bolt").toString()));

    public static final RegistryObject<EntityType<TornadoStrike>> TORNADO_STRIKE = ENTITY_TYPES.register("tornado_strike",
            () -> EntityType.Builder.<TornadoStrike>of(TornadoStrike::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
                    .clientTrackingRange(4).updateInterval(10).build(new ResourceLocation(KnocksElementalMagic.MODID, "tornado_strike").toString()));

        public static RegistryObject <EntityType <FireGolemEntity>> FIRE_GOLEM = ENTITY_TYPES.register( "fire_golem" ,
            () -> EntityType.Builder.of( FireGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "fire_golem" ).toString() ) );
    public static RegistryObject <EntityType <IceGolemEntity>> ICE_GOLEM = ENTITY_TYPES.register( "ice_golem" ,
            () -> EntityType.Builder.of( IceGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "ice_golem" ).toString() ) );
    public static RegistryObject <EntityType <AirGolemEntity>> AIR_GOLEM = ENTITY_TYPES.register( "air_golem" ,
            () -> EntityType.Builder.of( AirGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "air_golem" ).toString() ) );
    public static RegistryObject <EntityType <EarthGolemEntity>> EARTH_GOLEM = ENTITY_TYPES.register( "earth_golem" ,
            () -> EntityType.Builder.of(EarthGolemEntity::new , MobCategory.MONSTER ).sized(1.4F, 2.7F)
                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "earth_golem" ).toString() ) );
    public static RegistryObject<EntityType<IceSpike>> ICE_SPIKE = ENTITY_TYPES.register("ice_spike",
            () -> EntityType.Builder.<IceSpike>of(IceSpike::new, MobCategory.MISC).sized(0.5F, 0.8F).clientTrackingRange(6).updateInterval(2).build(new ResourceLocation(KnocksElementalMagic.MODID, "ice_spike").toString()));
    public static RegistryObject<EntityType<AirSpike>> AIR_SPIKE = ENTITY_TYPES.register("air_spike",
            () -> EntityType.Builder.<AirSpike>of(AirSpike::new, MobCategory.MISC).sized(0.5F, 0.8F).clientTrackingRange(6).updateInterval(2).build(new ResourceLocation(KnocksElementalMagic.MODID, "air_spike").toString()));
    public static RegistryObject<EntityType<EarthSpike>> EARTH_SPIKE = ENTITY_TYPES.register("earth_spike",
            () -> EntityType.Builder.<EarthSpike>of(EarthSpike::new, MobCategory.MISC).sized(0.5F, 0.8F).clientTrackingRange(6).updateInterval(2).build(new ResourceLocation(KnocksElementalMagic.MODID, "earth_spike").toString()));
    public static RegistryObject<EntityType<FireSpike>> FIRE_SPIKE = ENTITY_TYPES.register("fire_spike",
            () -> EntityType.Builder.<FireSpike>of(FireSpike::new, MobCategory.MISC).sized(0.5F, 0.8F).clientTrackingRange(6).updateInterval(2).build(new ResourceLocation(KnocksElementalMagic.MODID, "fire_spike").toString()));
    public static RegistryObject<EntityType<FireWizardEntity>> FIRE_WIZARD = ENTITY_TYPES.register("fire_wizard",
            () -> EntityType.Builder.of(FireWizardEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8)
                    .build(new ResourceLocation(KnocksElementalMagic.MODID, "fire_wizard").toString()));
    public static RegistryObject<EntityType<IceWizardEntity>> ICE_WIZARD = ENTITY_TYPES.register("ice_wizard",
            () -> EntityType.Builder.of(IceWizardEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8)
                    .build(new ResourceLocation(KnocksElementalMagic.MODID, "ice_wizard").toString()));
    public static RegistryObject<EntityType<EarthWizardEntity>> EARTH_WIZARD = ENTITY_TYPES.register("earth_wizard",
            () -> EntityType.Builder.of(EarthWizardEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8)
                    .build(new ResourceLocation(KnocksElementalMagic.MODID, "earth_wizard").toString()));
    public static RegistryObject<EntityType<AirWizardEntity>> AIR_WIZARD = ENTITY_TYPES.register("air_wizard",
            () -> EntityType.Builder.of(AirWizardEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8)
                    .build(new ResourceLocation(KnocksElementalMagic.MODID, "air_wizard").toString()));
//
//    public static RegistryObject <EntityType <NatureWizardEntity>> NATURE_WIZARD = ENTITY_TYPES.register( "nature_wizard" ,
//            () -> EntityType.Builder.of(NatureWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "nature_wizard" ).toString() ) );
//
//    public static RegistryObject <EntityType <VoidWizardEntity>> VOID_WIZARD = ENTITY_TYPES.register( "void_wizard" ,
//            () -> EntityType.Builder.of(VoidWizardEntity::new , MobCategory.MONSTER ).sized(0.6F, 1.95F).clientTrackingRange(8)
//                    .build( new ResourceLocation(KnocksElementalMagic.MODID , "void_wizard" ).toString() ) );

    public static final RegistryObject<EntityType<TornadoEntity>> TORNADO = ENTITY_TYPES.register("tornado",
            () -> EntityType.Builder.of(TornadoEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "tornado").toString()));
    public static final RegistryObject<EntityType<TornadoKnightEntity>> TORNADO_KNIGHT = ENTITY_TYPES.register("tornado_knight",
            () -> EntityType.Builder.of(TornadoKnightEntity::new, MobCategory.MONSTER).sized(1.4F, 0.9F)
                    .clientTrackingRange(8).build(new ResourceLocation(KnocksElementalMagic.MODID, "tornado_knight").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
