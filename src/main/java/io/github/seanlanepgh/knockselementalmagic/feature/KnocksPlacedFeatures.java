package io.github.seanlanepgh.knockselementalmagic.feature;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class KnocksPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, KnocksElementalMagic.MODID);


    public static final RegistryObject<PlacedFeature> FIRE_CRYSTAL_ORE_PLACED = PLACED_FEATURES.register("fire_crystal_ore_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.OVERWORLD_FIRE_CRYSTAL_ORE.getHolder().get(),
                    commonOrePlacement(9, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256)))));

    public static final RegistryObject<PlacedFeature> NETHER_FIRE_CRYSTAL_ORE_PLACED = PLACED_FEATURES.register("nether_fire_crystal_ore_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.NETHER_FIRE_CRYSTAL_ORE.getHolder().get(), commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256)))));
    public static final RegistryObject<PlacedFeature> ICE_CRYSTAL_ORE_PLACED = PLACED_FEATURES.register("ice_crystal_ore_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.OVERWORLD_ICE_CRYSTAL_ORE.getHolder().get(),
                    commonOrePlacement(12, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256)))));
    public static final RegistryObject<PlacedFeature> EARTH_CRYSTAL_ORE_PLACED = PLACED_FEATURES.register("earth_crystal_ore_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.OVERWORLD_EARTH_CRYSTAL_ORE.getHolder().get(),
                    commonOrePlacement(12, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256)))));
    public static final RegistryObject<PlacedFeature> AIR_CRYSTAL_ORE_PLACED = PLACED_FEATURES.register("air_crystal_ore_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.OVERWORLD_AIR_CRYSTAL_ORE.getHolder().get(),
                    commonOrePlacement(12, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(256)))));

    public static final RegistryObject<PlacedFeature> NETHER_FIRE_CRYSTAL_GEODE_PLACED = PLACED_FEATURES.register("nether_fire_crystal_geode_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.NETHER_FIRE_CRYSTAL_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                    BiomeFilter.biome())));


    public static final RegistryObject<PlacedFeature> FIRE_CRYSTAL_GEODE_PLACED = PLACED_FEATURES.register("fire_crystal_geode_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.FIRE_CRYSTAL_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                    BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> ICE_CRYSTAL_GEODE_PLACED = PLACED_FEATURES.register("ice_crystal_geode_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.ICE_CRYSTAL_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                    BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> EARTH_CRYSTAL_GEODE_PLACED = PLACED_FEATURES.register("earth_crystal_geode_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.EARTH_CRYSTAL_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                    BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> AIR_CRYSTAL_GEODE_PLACED = PLACED_FEATURES.register("air_crystal_geode_placed",
            () -> new PlacedFeature(KnocksConfiguredFeatures.AIR_CRYSTAL_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                    BiomeFilter.biome())));


    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
