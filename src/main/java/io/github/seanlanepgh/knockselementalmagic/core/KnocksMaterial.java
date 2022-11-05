package io.github.seanlanepgh.knockselementalmagic.core;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;

public class KnocksMaterial {

    public static final Material FIRE_BOOK_LOCATION = new Material(InventoryMenu.BLOCK_ATLAS,
            new ResourceLocation(KnocksElementalMagic.MODID, "entity/fire_altar_book"));
}
