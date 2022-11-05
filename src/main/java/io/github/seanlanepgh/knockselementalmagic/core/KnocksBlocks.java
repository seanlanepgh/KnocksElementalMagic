package io.github.seanlanepgh.knockselementalmagic.core;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.AirAltarBlock;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.EarthAltarBlock;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.FireAltarBlock;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.IceAltarBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.IRON_ORE;

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
    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_FIRE_CRYSTAL_ORE =registerBlock("deepslate_fire_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(KnocksBlocks.FIRE_CRYSTAL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> ICE_CRYSTAL_ORE = registerBlock("ice_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(IRON_ORE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_ICE_CRYSTAL_ORE =registerBlock("deepslate_ice_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(KnocksBlocks.ICE_CRYSTAL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<DropExperienceBlock> AIR_CRYSTAL_ORE = registerBlock("air_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(IRON_ORE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_AIR_CRYSTAL_ORE =registerBlock("deepslate_air_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(KnocksBlocks.AIR_CRYSTAL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<DropExperienceBlock> EARTH_CRYSTAL_ORE = registerBlock("earth_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(IRON_ORE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_EARTH_CRYSTAL_ORE =registerBlock("deepslate_earth_crystal_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(KnocksBlocks.EARTH_CRYSTAL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> CRYSTAL_BLOCK = registerBlock("crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> FIRE_CRYSTAL_BLOCK = registerBlock("fire_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> ICE_CRYSTAL_BLOCK = registerBlock("ice_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> AIR_CRYSTAL_BLOCK = registerBlock("air_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> EARTH_CRYSTAL_BLOCK = registerBlock("earth_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> REFINED_CRYSTAL_BLOCK = registerBlock("refined_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> REFINED_FIRE_CRYSTAL_BLOCK = registerBlock("refined_fire_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> REFINED_ICE_CRYSTAL_BLOCK = registerBlock("refined_ice_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> REFINED_AIR_CRYSTAL_BLOCK = registerBlock("refined_air_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<AmethystBlock> REFINED_EARTH_CRYSTAL_BLOCK = registerBlock("refined_earth_crystal_block", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> RUNESTONE = registerBlock("runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> ICE_RUNESTONE = registerBlock("ice_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> FIRE_RUNESTONE = registerBlock("fire_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> AIR_RUNESTONE = registerBlock("air_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> EARTH_RUNESTONE = registerBlock("earth_runestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)),CreativeModeTab.TAB_MISC);
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
