package io.github.seanlanepgh.knockselementalmagic.core;



import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import net.minecraft.sounds.SoundEvents;

import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public final class KnocksArmorMaterial {
    public static final ArmorMaterial FIRE_SILK = new BaseArmorMaterial(15, new int[] { 55, 80, 75, 65 },
            new int[] { 1, 3, 4, 2 }, 0.0f, 0.02f, KnocksElementalMagic.MODID + ":fire_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial ICE_SILK = new BaseArmorMaterial(15, new int[] { 55, 80, 75, 65 },
            new int[] { 1, 3, 4, 2  }, 0.0f, 0.02f, KnocksElementalMagic.MODID + ":ice_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial EARTH_SILK = new BaseArmorMaterial(15, new int[] { 55, 80, 75, 65 },
            new int[] { 1, 3, 4, 2  }, 0.0f, 0.02f, KnocksElementalMagic.MODID + ":earth_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial AIR_SILK = new BaseArmorMaterial(15, new int[] { 55, 80, 75, 65 },
            new int[] { 1, 3, 4, 2 }, 0.0f, 0.02f,KnocksElementalMagic.MODID + ":air_silk",
            SoundEvents.WOOL_PLACE, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));


    public static final ArmorMaterial FIRE_LEATHER = new BaseArmorMaterial(12, new int[] { 165, 240, 225, 195 },
            new int[] { 1, 4, 5, 2 }, 0.25f, 0.05f, KnocksElementalMagic.MODID + ":fire_leather",
            SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial ICE_LEATHER = new BaseArmorMaterial(12, new int[] {165, 240, 225, 195 },
            new int[] { 1, 4, 5, 2 }, 0.25f, 0.05f, KnocksElementalMagic.MODID + ":ice_leather",
            SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial EARTH_LEATHER = new BaseArmorMaterial(12, new int[] { 165, 240, 225, 195 },
            new int[] { 1, 4, 5, 2 }, 0.25f, 0.05f, KnocksElementalMagic.MODID + ":earth_leather",
            SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial AIR_LEATHER= new BaseArmorMaterial(12, new int[] { 165, 240, 225, 195},
            new int[] { 1, 4, 5, 2 }, 0.25f, 0.05f,KnocksElementalMagic.MODID + ":air_leather",
            SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));


    public static final ArmorMaterial FIRE_PLATE = new BaseArmorMaterial(10, new int[] {363,528,495,429},
            new int[] { 2, 6, 7, 2 }, 2.0f, 0.1f, KnocksElementalMagic.MODID + ":fire_plate",
            SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial ICE_PLATE = new BaseArmorMaterial(10, new int[] {363,528,495,429},
            new int[] { 2, 6, 7, 2 }, 2.0f, 0.1f, KnocksElementalMagic.MODID + ":ice_plate",
            SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial EARTH_PLATE = new BaseArmorMaterial(10, new int[] {363,528,495,429},
            new int[] { 2, 6, 7, 2 }, 2.0f, 0.1f, KnocksElementalMagic.MODID + ":earth_plate",
            SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));
    public static final ArmorMaterial AIR_PLATE = new BaseArmorMaterial(10, new int[] {363,528,495,429},
            new int[] { 2, 6, 7, 2 }, 2.0f, 0.1f,KnocksElementalMagic.MODID + ":air_plate",
            SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(KnocksItems.FIRE_SILK.get()));


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