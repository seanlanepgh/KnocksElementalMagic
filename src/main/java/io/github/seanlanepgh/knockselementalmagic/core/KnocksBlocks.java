package io.github.seanlanepgh.knockselementalmagic.core;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class KnocksBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            KnocksElementalMagic.MODID);

    public static final RegistryObject<Block> FIRE_ALTAR =  registerBlock("fire_altar",
            () -> new FireAltarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().lightLevel((p_152692_) -> {
                return 7;
            }).strength(5.0F, 1200.0F)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> ICE_ALTAR =  registerBlock("ice_altar",
            () -> new IceAltarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().lightLevel((p_152692_) -> {
                return 7;
            }).strength(5.0F, 1200.0F)), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> EARTH_ALTAR =  registerBlock("earth_altar",
            () -> new EarthAltarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().lightLevel((p_152692_) -> {
                return 7;
            }).strength(5.0F, 1200.0F)), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> AIR_ALTAR =  registerBlock("air_altar",
            () -> new AirAltarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().lightLevel((p_152692_) -> {
                return 7;
            }).strength(5.0F, 1200.0F)), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> FIRE_CRYSTAL_ORE = registerBlock("fire_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(IRON_ORE)),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<DropExperienceBlock> NETHER_FIRE_CRYSTAL_ORE = registerBlock("nether_fire_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(IRON_ORE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_FIRE_CRYSTAL_ORE = registerBlock("deepslate_fire_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(KnocksBlocks.FIRE_CRYSTAL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> ICE_CRYSTAL_ORE = registerBlock("ice_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(IRON_ORE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_ICE_CRYSTAL_ORE = registerBlock("deepslate_ice_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(KnocksBlocks.ICE_CRYSTAL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<DropExperienceBlock> AIR_CRYSTAL_ORE = registerBlock("air_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(IRON_ORE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_AIR_CRYSTAL_ORE = registerBlock("deepslate_air_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(KnocksBlocks.AIR_CRYSTAL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<DropExperienceBlock> EARTH_CRYSTAL_ORE = registerBlock("earth_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(IRON_ORE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_EARTH_CRYSTAL_ORE =registerBlock("deepslate_earth_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(KnocksBlocks.EARTH_CRYSTAL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    //public static final RegistryObject<AmethystBlock> CRYSTAL_BLOCK = registerBlock("crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> FIRE_CRYSTAL_BLOCK = registerBlock("fire_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> ICE_CRYSTAL_BLOCK = registerBlock("ice_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> AIR_CRYSTAL_BLOCK = registerBlock("air_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> EARTH_CRYSTAL_BLOCK = registerBlock("earth_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
   // public static final RegistryObject<AmethystBlock> REFINED_CRYSTAL_BLOCK = registerBlock("refined_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> REFINED_FIRE_CRYSTAL_BLOCK = registerBlock("refined_fire_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> REFINED_ICE_CRYSTAL_BLOCK = registerBlock("refined_ice_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> REFINED_AIR_CRYSTAL_BLOCK = registerBlock("refined_air_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> REFINED_EARTH_CRYSTAL_BLOCK = registerBlock("refined_earth_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    //public static final RegistryObject<Block> RUNESTONE = registerBlock("runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> ICE_RUNESTONE = registerBlock("ice_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> FIRE_RUNESTONE = registerBlock("fire_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> AIR_RUNESTONE = registerBlock("air_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> EARTH_RUNESTONE = registerBlock("earth_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> IMBUED_ICE_RUNESTONE = registerBlock("imbued_ice_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> IMBUED_FIRE_RUNESTONE = registerBlock("imbued_fire_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> IMBUED_AIR_RUNESTONE = registerBlock("imbued_air_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> IMBUED_EARTH_RUNESTONE = registerBlock("imbued_earth_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> ICE_RUNESTONE_BRICKS = registerBlock("ice_runestone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> FIRE_RUNESTONE_BRICKS = registerBlock("fire_runestone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> AIR_RUNESTONE_BRICKS = registerBlock("air_runestone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> EARTH_RUNESTONE_BRICKS = registerBlock("earth_runestone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> CHISELED_ICE_RUNESTONE_BRICKS = registerBlock("chiseled_ice_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> CHISELED_FIRE_RUNESTONE_BRICKS = registerBlock("chiseled_fire_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> CHISELED_AIR_RUNESTONE_BRICKS = registerBlock("chiseled_air_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> CHISELED_EARTH_RUNESTONE_BRICKS = registerBlock("chiseled_earth_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<StairBlock> ICE_RUNESTONE_BRICK_STAIRS = registerBlock("ice_runestone_brick_stairs", () ->  new StairBlock(KnocksBlocks.ICE_RUNESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(KnocksBlocks.ICE_RUNESTONE_BRICKS.get())),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<StairBlock> FIRE_RUNESTONE_BRICK_STAIRS = registerBlock("fire_runestone_brick_stairs", () -> new StairBlock(KnocksBlocks.FIRE_RUNESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(KnocksBlocks.FIRE_RUNESTONE_BRICKS.get())),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<StairBlock> AIR_RUNESTONE_BRICK_STAIRS = registerBlock("air_runestone_brick_stairs", () -> new StairBlock(KnocksBlocks.AIR_RUNESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(KnocksBlocks.AIR_RUNESTONE_BRICKS.get())),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<StairBlock> EARTH_RUNESTONE_BRICK_STAIRS = registerBlock("earth_runestone_brick_stairs", () -> new StairBlock(KnocksBlocks.EARTH_RUNESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(KnocksBlocks.EARTH_RUNESTONE_BRICKS.get())),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<StairBlock> CHISELED_ICE_RUNESTONE_BRICK_STAIRS = registerBlock("chiseled_ice_runestone_brick_stairs", () -> new StairBlock(KnocksBlocks.CHISELED_ICE_RUNESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(KnocksBlocks.CHISELED_ICE_RUNESTONE_BRICKS.get())),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<StairBlock> CHISELED_FIRE_RUNESTONE_BRICK_STAIRS = registerBlock("chiseled_fire_runestone_brick_stairs", () -> new StairBlock(KnocksBlocks.CHISELED_FIRE_RUNESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(KnocksBlocks.CHISELED_FIRE_RUNESTONE_BRICKS.get())),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<StairBlock> CHISELED_AIR_RUNESTONE_BRICK_STAIRS = registerBlock("chiseled_air_runestone_brick_stairs", () -> new StairBlock(KnocksBlocks.CHISELED_AIR_RUNESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(KnocksBlocks.CHISELED_AIR_RUNESTONE_BRICKS.get())),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<StairBlock> CHISELED_EARTH_RUNESTONE_BRICK_STAIRS =  registerBlock("chiseled_earth_runestone_brick_stairs", () -> new StairBlock(KnocksBlocks.CHISELED_EARTH_RUNESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(KnocksBlocks.CHISELED_EARTH_RUNESTONE_BRICKS.get())),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<AmethystClusterBlock> AIR_CRYSTAL_CLUSTER = registerBlock("air_crystal_cluster", () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> ICE_CRYSTAL_CLUSTER = registerBlock("ice_crystal_cluster", () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> EARTH_CRYSTAL_CLUSTER = registerBlock("earth_crystal_cluster", () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> FIRE_CRYSTAL_CLUSTER = registerBlock("fire_crystal_cluster", () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F)),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<BuddingAirCrystalBlock> BUDDING_AIR_CRYSTAL = registerBlock("budding_air_crystal", () -> new BuddingAirCrystalBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<BuddingEarthCrystalBlock> BUDDING_EARTH_CRYSTAL = registerBlock("budding_earth_crystal", () -> new BuddingEarthCrystalBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<BuddingIceCrystalBlock> BUDDING_ICE_CRYSTAL = registerBlock("budding_ice_crystal", () -> new BuddingIceCrystalBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<BuddingFireCrystalBlock> BUDDING_FIRE_CRYSTAL = registerBlock("budding_fire_crystal", () -> new BuddingFireCrystalBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<AmethystClusterBlock> LARGE_AIR_CRYSTAL_BUD = registerBlock("large_air_crystal_bud",() -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> {
        return 4;
    })),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> MEDIUM_AIR_CRYSTAL_BUD = registerBlock("medium_air_crystal_bud",() -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152617_) -> {
        return 2;
    })),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> SMALL_AIR_CRYSTAL_BUD = registerBlock("small_air_crystal_bud",() -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_187409_) -> {
        return 1;
    })),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<AmethystClusterBlock> LARGE_FIRE_CRYSTAL_BUD = registerBlock("large_fire_crystal_bud",() -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> {
        return 4;
    })),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> MEDIUM_FIRE_CRYSTAL_BUD = registerBlock("medium_fire_crystal_bud",() -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152617_) -> {
        return 2;
    })),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> SMALL_FIRE_CRYSTAL_BUD = registerBlock("small_fire_crystal_bud",() -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_187409_) -> {
        return 1;
    })),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<AmethystClusterBlock> LARGE_ICE_CRYSTAL_BUD = registerBlock("large_ice_crystal_bud",() -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> {
        return 4;
    })),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> MEDIUM_ICE_CRYSTAL_BUD = registerBlock("medium_ice_crystal_bud",() -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152617_) -> {
        return 2;
    })),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> SMALL_ICE_CRYSTAL_BUD = registerBlock("small_ice_crystal_bud",() -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_187409_) -> {
        return 1;
    })),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<AmethystClusterBlock> LARGE_EARTH_CRYSTAL_BUD = registerBlock("large_earth_crystal_bud",() -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> {
        return 4;
    })),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> MEDIUM_EARTH_CRYSTAL_BUD = registerBlock("medium_earth_crystal_bud",() -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152617_) -> {
        return 2;
    })),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystClusterBlock> SMALL_EARTH_CRYSTAL_BUD = registerBlock("small_earth_crystal_bud",() -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_187409_) -> {
        return 1;
    })),CreativeModeTab.TAB_MISC);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn,tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,CreativeModeTab tab) {
        return KnocksItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
