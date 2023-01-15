package io.github.seanlanepgh.knockselementalmagic.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.KnocksBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class KnocksConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, KnocksElementalMagic.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_FIRE_CRYSTAL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,KnocksBlocks.FIRE_CRYSTAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, KnocksBlocks.DEEPSLATE_FIRE_CRYSTAL_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ICE_CRYSTAL_ORES= Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, KnocksBlocks.ICE_CRYSTAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, KnocksBlocks.ICE_CRYSTAL_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_EARTH_CRYSTAL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, KnocksBlocks.EARTH_CRYSTAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, KnocksBlocks.DEEPSLATE_EARTH_CRYSTAL_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_AIR_CRYSTAL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, KnocksBlocks.AIR_CRYSTAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, KnocksBlocks.DEEPSLATE_AIR_CRYSTAL_ORE.get().defaultBlockState())));


    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_FIRE_CRYSTAL_ORE = CONFIGURED_FEATURES.register("fire_crystal_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_FIRE_CRYSTAL_ORES.get(),9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ICE_CRYSTAL_ORE = CONFIGURED_FEATURES.register("ice_crystal_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ICE_CRYSTAL_ORES.get(),12)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_EARTH_CRYSTAL_ORE = CONFIGURED_FEATURES.register("earth_crystal_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_EARTH_CRYSTAL_ORES.get(),12)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_AIR_CRYSTAL_ORE = CONFIGURED_FEATURES.register("air_crystal_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_AIR_CRYSTAL_ORES.get(),12)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> FIRE_CRYSTAL_GEODE = CONFIGURED_FEATURES.register("fire_crystal_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE,
                    new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(KnocksBlocks.FIRE_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(KnocksBlocks.FIRE_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(Blocks.NETHERRACK),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            List.of(KnocksBlocks.FIRE_CRYSTAL_BLOCK.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D,
                            true, UniformInt.of(4, 6),
                            UniformInt.of(3, 4), UniformInt.of(1, 2),
                            -16, 16, 0.05D, 1)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ICE_CRYSTAL_GEODE = CONFIGURED_FEATURES.register("ice_crystal_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE,
                    new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(KnocksBlocks.ICE_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(KnocksBlocks.ICE_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(Blocks.PACKED_ICE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            List.of(KnocksBlocks.ICE_CRYSTAL_BLOCK.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D,
                            true, UniformInt.of(4, 6),
                            UniformInt.of(3, 4), UniformInt.of(1, 2),
                            -16, 16, 0.05D, 1)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> EARTH_CRYSTAL_GEODE = CONFIGURED_FEATURES.register("earth_crystal_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE,
                    new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(KnocksBlocks.EARTH_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(KnocksBlocks.EARTH_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(Blocks.CALCITE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            List.of(KnocksBlocks.EARTH_CRYSTAL_BLOCK.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D,
                            true, UniformInt.of(4, 6),
                            UniformInt.of(3, 4), UniformInt.of(1, 2),
                            -16, 16, 0.05D, 1)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> AIR_CRYSTAL_GEODE = CONFIGURED_FEATURES.register("air_crystal_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE,
                    new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(KnocksBlocks.AIR_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(KnocksBlocks.AIR_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(Blocks.CALCITE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            List.of(KnocksBlocks.AIR_CRYSTAL_BLOCK.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D,
                            true, UniformInt.of(4, 6),
                            UniformInt.of(3, 4), UniformInt.of(1, 2),
                            -16, 16, 0.05D, 1)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
