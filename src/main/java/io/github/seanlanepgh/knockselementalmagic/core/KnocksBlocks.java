package io.github.seanlanepgh.knockselementalmagic.core;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.AirAltarBlock;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.EarthAltarBlock;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.FireAltarBlock;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.IceAltarBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

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
