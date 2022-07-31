package io.github.seanlanepgh.knockselementalmagic.core;



import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import net.minecraft.sounds.SoundEvents;

import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public final class KnocksArmorMaterial {
    public static final ArmorMaterial FIRE_SILK = new BaseArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 35, 50, 27 }, 3.2f, 1.85f, KnocksElementalMagic.MODID + ":fire_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial ICE_SILK = new BaseArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 35, 50, 27 }, 3.2f, 1.85f, KnocksElementalMagic.MODID + ":ice_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial EARTH_SILK = new BaseArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 35, 50, 27 }, 3.2f, 1.85f, KnocksElementalMagic.MODID + ":earth_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial AIR_SILK = new BaseArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 35, 50, 27 }, 3.2f, 1.85f,KnocksElementalMagic.MODID + ":air_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial VOID_SILK = new BaseArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 35, 50, 27 }, 3.2f, 1.85f, KnocksElementalMagic.MODID + ":void_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial NATURE_SILK = new BaseArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 35, 50, 27 }, 3.2f, 1.85f, KnocksElementalMagic.MODID + ":nature_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial SOUL_SILK = new BaseArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 35, 50, 27 }, 3.2f, 1.85f, KnocksElementalMagic.MODID + ":soul_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));

    private KnocksArmorMaterial() {
    }
}