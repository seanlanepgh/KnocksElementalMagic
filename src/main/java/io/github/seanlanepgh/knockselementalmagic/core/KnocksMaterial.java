package io.github.seanlanepgh.knockselementalmagic.core;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;

public class KnocksMaterial {

    public static final Material FIRE_BOOK_LOCATION = new Material(InventoryMenu.BLOCK_ATLAS,
            new ResourceLocation(KnocksElementalMagic.MODID, "entity/fire_altar_book"));
    public static final Material ICE_BOOK_LOCATION = new Material(InventoryMenu.BLOCK_ATLAS,
            new ResourceLocation(KnocksElementalMagic.MODID, "entity/ice_altar_book"));
    public static final Material AIR_BOOK_LOCATION = new Material(InventoryMenu.BLOCK_ATLAS,
            new ResourceLocation(KnocksElementalMagic.MODID, "entity/air_altar_book"));
    public static final Material EARTH_BOOK_LOCATION = new Material(InventoryMenu.BLOCK_ATLAS,
            new ResourceLocation(KnocksElementalMagic.MODID, "entity/earth_altar_book"));
}
