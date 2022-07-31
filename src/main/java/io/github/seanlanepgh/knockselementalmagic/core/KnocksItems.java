package io.github.seanlanepgh.knockselementalmagic.core;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.KnocksArmorMaterial;
import io.github.seanlanepgh.knockselementalmagic.items.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
//import com.knockout697.knocks.Knocks;
//import com.knockout697.knocks.common.items.AirChargeItem;
//import com.knockout697.knocks.common.items.ApprenticeFireStaffItem;
//import com.knockout697.knocks.common.items.ApprenticeIceStaffItem;
//import com.knockout697.knocks.common.items.EarthChargeItem;
//import com.knockout697.knocks.common.items.IceChargeItem;

//import net.minecraft.Level.entity.EquipmentSlot;
//import net.minecraft.Level.item.ArmorItem;
//import net.minecraft.Level.item.CreativeModeTab;
//import net.minecraft.Level.item.Item;
//import net.minecraft.Level.item.Rarity;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
public class KnocksItems {
        private KnocksItems() {
        }

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                KnocksElementalMagic.MODID);

        public static final RegistryObject<Item> MAGIC_CRYSTAL = ITEMS.register("magic_crystal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> FIRE_CRYSTAL = ITEMS.register("fire_crystal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> ICE_CRYSTAL = ITEMS.register("ice_crystal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> EARTH_CRYSTAL = ITEMS.register("earth_crystal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> AIR_CRYSTAL = ITEMS.register("air_crystal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NATURE_CRYSTAL = ITEMS.register("nature_crystal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> SOUL_CRYSTAL = ITEMS.register("soul_crystal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> VOID_CRYSTAL = ITEMS.register("void_crystal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        public static final RegistryObject<Item> MAGIC_SILK = ITEMS.register("magic_silk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> FIRE_SILK = ITEMS.register("fire_silk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> ICE_SILK = ITEMS.register("ice_silk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> EARTH_SILK = ITEMS.register("earth_silk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> AIR_SILK = ITEMS.register("air_silk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NATURE_SILK = ITEMS.register("nature_silk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> SOUL_SILK = ITEMS.register("soul_silk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> VOID_SILK = ITEMS.register("void_silk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        public static final RegistryObject<Item> FIRE_CORE = ITEMS.register("fire_core", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> ICE_CORE = ITEMS.register("ice_core", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> EARTH_CORE = ITEMS.register("earth_core", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> AIR_CORE = ITEMS.register("air_core", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NATURE_CORE = ITEMS.register("nature_core", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> SOUL_CORE = ITEMS.register("soul_core", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> VOID_CORE = ITEMS.register("void_core", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        public static final RegistryObject<Item> ICE_CHARGE = ITEMS.register("ice_charge", () -> new IceChargeItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> EARTH_CHARGE = ITEMS.register("earth_charge", () -> new EarthChargeItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> AIR_CHARGE = ITEMS.register("air_charge", () -> new AirChargeItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        public static final RegistryObject<Item> BLIZZ_POWDER = ITEMS.register("blizz_powder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> QUAKE_POWDER = ITEMS.register("quake_powder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> TORNADO_POWDER = ITEMS.register("tornado_powder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        public static final RegistryObject<Item> BLIZZ_ROD = ITEMS.register("blizz_rod", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> QUAKE_ROD= ITEMS.register("quake_rod", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> TORNADO_ROD = ITEMS.register("tornado_rod", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        public static final RegistryObject<Item> FIRE_ORB = ITEMS.register("fire_orb", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> ICE_ORB = ITEMS.register("ice_orb", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> EARTH_ORB = ITEMS.register("earth_orb", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> AIR_ORB = ITEMS.register("air_orb", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NATURE_ORB = ITEMS.register("nature_orb", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> SOUL_ORB = ITEMS.register("soul_orb", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> VOID_ORB = ITEMS.register("void_orb", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        public static final RegistryObject<Item> BLANK_RUNE = ITEMS.register("blank_rune", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> FIRE_RUNE = ITEMS.register("fire_rune", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> ICE_RUNE = ITEMS.register("ice_rune", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> EARTH_RUNE = ITEMS.register("earth_rune", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> AIR_RUNE = ITEMS.register("air_rune", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NATURE_RUNE = ITEMS.register("nature_rune", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> SOUL_RUNE = ITEMS.register("soul_rune", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> VOID_RUNE = ITEMS.register("void_rune", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        //Magic Stick from tree

        //Mage Armour for each element, hat , robe top and bottom , maybe boots

        // Armor
        public static final RegistryObject<ArmorItem> FIRE_HOOD = ITEMS.register("fire_hood",
                () -> new ArmorItem(KnocksArmorMaterial.FIRE_SILK, EquipmentSlot.HEAD,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> FIRE_ROBE_TOP = ITEMS.register("fire_robe_top",
                () -> new ArmorItem(KnocksArmorMaterial.FIRE_SILK, EquipmentSlot.CHEST,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> FIRE_ROBE_BOTTOMS = ITEMS.register("fire_robe_bottoms",
                () -> new ArmorItem(KnocksArmorMaterial.FIRE_SILK, EquipmentSlot.LEGS,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> FIRE_BOOTS = ITEMS.register("fire_boots",
                () -> new ArmorItem(KnocksArmorMaterial.FIRE_SILK, EquipmentSlot.FEET,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> ICE_HOOD = ITEMS.register("ice_hood",
                () -> new ArmorItem(KnocksArmorMaterial.ICE_SILK, EquipmentSlot.HEAD,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> ICE_ROBE_TOP = ITEMS.register("ice_robe_top",
                () -> new ArmorItem(KnocksArmorMaterial.ICE_SILK, EquipmentSlot.CHEST,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> ICE_ROBE_BOTTOMS = ITEMS.register("ice_robe_bottoms",
                () -> new ArmorItem(KnocksArmorMaterial.ICE_SILK, EquipmentSlot.LEGS,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> ICE_BOOTS = ITEMS.register("ice_boots",
                () -> new ArmorItem(KnocksArmorMaterial.ICE_SILK, EquipmentSlot.FEET,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> EARTH_HOOD = ITEMS.register("earth_hood",
                () -> new ArmorItem(KnocksArmorMaterial.EARTH_SILK, EquipmentSlot.HEAD,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> EARTH_ROBE_TOP = ITEMS.register("earth_robe_top",
                () -> new ArmorItem(KnocksArmorMaterial.EARTH_SILK, EquipmentSlot.CHEST,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> EARTH_ROBE_BOTTOMS = ITEMS.register("earth_robe_bottoms",
                () -> new ArmorItem(KnocksArmorMaterial.EARTH_SILK, EquipmentSlot.LEGS,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> EARTH_BOOTS = ITEMS.register("earth_boots",
                () -> new ArmorItem(KnocksArmorMaterial.EARTH_SILK, EquipmentSlot.FEET,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> AIR_HOOD = ITEMS.register("air_hood",
                () -> new ArmorItem(KnocksArmorMaterial.AIR_SILK, EquipmentSlot.HEAD,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> AIR_ROBE_TOP = ITEMS.register("air_robe_top",
                () -> new ArmorItem(KnocksArmorMaterial.AIR_SILK, EquipmentSlot.CHEST,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem>AIR_ROBE_BOTTOMS = ITEMS.register("air_robe_bottoms",
                () -> new ArmorItem(KnocksArmorMaterial.AIR_SILK, EquipmentSlot.LEGS,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> AIR_BOOTS = ITEMS.register("air_boots",
                () -> new ArmorItem(KnocksArmorMaterial.AIR_SILK, EquipmentSlot.FEET,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> NATURE_HOOD = ITEMS.register("nature_hood",
                () -> new ArmorItem(KnocksArmorMaterial.NATURE_SILK, EquipmentSlot.HEAD,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> NATURE_ROBE_TOP = ITEMS.register("nature_robe_top",
                () -> new ArmorItem(KnocksArmorMaterial.NATURE_SILK, EquipmentSlot.CHEST,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> NATURE_ROBE_BOTTOMS = ITEMS.register("nature_robe_bottoms",
                () -> new ArmorItem(KnocksArmorMaterial.NATURE_SILK, EquipmentSlot.LEGS,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> NATURE_BOOTS = ITEMS.register("nature_boots",
                () -> new ArmorItem(KnocksArmorMaterial.NATURE_SILK, EquipmentSlot.FEET,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> VOID_HOOD = ITEMS.register("void_hood",
                () -> new ArmorItem(KnocksArmorMaterial.VOID_SILK, EquipmentSlot.HEAD,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> VOID_ROBE_TOP = ITEMS.register("void_robe_top",
                () -> new ArmorItem(KnocksArmorMaterial.VOID_SILK, EquipmentSlot.CHEST,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> VOID_ROBE_BOTTOMS = ITEMS.register("void_robe_bottoms",
                () -> new ArmorItem(KnocksArmorMaterial.VOID_SILK, EquipmentSlot.LEGS,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> VOID_BOOTS = ITEMS.register("void_boots",
                () -> new ArmorItem(KnocksArmorMaterial.VOID_SILK, EquipmentSlot.FEET,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> SOUL_HOOD = ITEMS.register("soul_hood",
                () -> new ArmorItem(KnocksArmorMaterial.SOUL_SILK, EquipmentSlot.HEAD,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> SOUL_ROBE_TOP = ITEMS.register("soul_robe_top",
                () -> new ArmorItem(KnocksArmorMaterial.SOUL_SILK, EquipmentSlot.CHEST,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> SOUL_ROBE_BOTTOMS = ITEMS.register("soul_robe_bottoms",
                () -> new ArmorItem(KnocksArmorMaterial.SOUL_SILK, EquipmentSlot.LEGS,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public static final RegistryObject<ArmorItem> SOUL_BOOTS = ITEMS.register("soul_boots",
                () -> new ArmorItem(KnocksArmorMaterial.SOUL_SILK, EquipmentSlot.FEET,
                        new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


        //	    public static final RegistryObject<Item> MAGIC_WAND = ITEMS.register("magic_wand", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
//		 public static final RegistryObject<Item> FIRE_WAND  = ITEMS.register("fire_wand", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
//		 public static final RegistryObject<Item> ICE_WAND  = ITEMS.register("ice_wand", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
//		 public static final RegistryObject<Item> EARTH_WAND  = ITEMS.register("earth_wand", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
//		 public static final RegistryObject<Item> AIR_WAND  = ITEMS.register("air_wand", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
//		 public static final RegistryObject<Item> NATURE_WAND  = ITEMS.register("nature_wand", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
//		 public static final RegistryObject<Item> SOUL_WAND = ITEMS.register("soul_wand", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
//		 public static final RegistryObject<Item> VOID_WAND  = ITEMS.register("void_wand", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
//
        public static final RegistryObject<Item> NOVICE_MAGIC_STAFF = ITEMS.register("novice_magic_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NOVICE_FIRE_STAFF  = ITEMS.register("novice_fire_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NOVICE_ICE_STAFF  = ITEMS.register("novice_ice_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NOVICE_EARTH_STAFF  = ITEMS.register("novice_earth_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NOVICE_AIR_STAFF  = ITEMS.register("novice_air_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NOVICE_NATURE_STAFF  = ITEMS.register("nature_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        // public static final RegistryObject<Item> SOUL_STAFF = ITEMS.register("soul_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> NOVICE_VOID_STAFF  = ITEMS.register("novice_void_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        //Novice

        //Apprentice
//        public static final RegistryObject<Item> APPRENTICE_MAGIC_STAFF = ITEMS.register("apprentice_magic_staff", () -> new ApprenticeFireStaffItem(defaultBuilder().durability(99).rarity(Rarity.UNCOMMON)));
//        public static final RegistryObject<Item> APPRENTICE_FIRE_STAFF  = ITEMS.register("apprentice_fire_staff", () -> new ApprenticeFireStaffItem(defaultBuilder().durability(99).rarity(Rarity.UNCOMMON)));
//        public static final RegistryObject<Item> APPRENTICE_ICE_STAFF  = ITEMS.register("apprentice_ice_staff", () -> new ApprenticeIceStaffItem(defaultBuilder().durability(99).rarity(Rarity.UNCOMMON)));
        public static final RegistryObject<Item> APPRENTICE_EARTH_STAFF  = ITEMS.register("apprentice_earth_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> APPRENTICE_AIR_STAFF  = ITEMS.register("apprentice_air_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> APPRENTICE_NATURE_STAFF  = ITEMS.register("apprentice_nature_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        // public static final RegistryObject<Item> SOUL_STAFF = ITEMS.register("soul_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item> APPRENTICE_VOID_STAFF  = ITEMS.register("apprentice_void_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        //Journeyman

        //Expert
        public static final RegistryObject<Item> EXPERT_MAGIC_STAFF = ITEMS.register("expert_magic_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  EXPERT_FIRE_STAFF  = ITEMS.register("expert_fire_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  EXPERT_ICE_STAFF  = ITEMS.register("expert_ice_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  EXPERT_EARTH_STAFF  = ITEMS.register("expert_earth_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  EXPERT_AIR_STAFF  = ITEMS.register("expert_air_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  EXPERT_NATURE_STAFF  = ITEMS.register("expert_nature_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        // public static final RegistryObject<Item> SOUL_STAFF = ITEMS.register("soul_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  EXPERT_VOID_STAFF  = ITEMS.register("expert_void_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        //Adept

        //Master
        public static final RegistryObject<Item> MASTER_MAGIC_STAFF = ITEMS.register("master_magic_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  MASTER_FIRE_STAFF  = ITEMS.register("master_fire_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  MASTER_ICE_STAFF  = ITEMS.register("master_ice_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  MASTER_EARTH_STAFF  = ITEMS.register("master_earth_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  MASTER_AIR_STAFF  = ITEMS.register("master_air_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  MASTER_NATURE_STAFF  = ITEMS.register("master_nature_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        // public static final RegistryObject<Item> SOUL_STAFF = ITEMS.register("soul_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));
        public static final RegistryObject<Item>  MASTER_VOID_STAFF  = ITEMS.register("master_void_staff", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.COMMON)));

        //Grandmaster

        //Elder

        //Wands

        //Staffs
        public static Item.Properties defaultBuilder() {
            return new Item.Properties().tab(CreativeModeTab.TAB_MISC);
        }

    }

