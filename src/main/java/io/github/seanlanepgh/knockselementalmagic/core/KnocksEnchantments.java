package io.github.seanlanepgh.knockselementalmagic.core;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.enchantments.KnocksProtectionEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.ProtectionEnchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KnocksEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, KnocksElementalMagic.MODID);
    private static final EquipmentSlot[] ARMOR_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
    public static RegistryObject<Enchantment> ICE_RESISTANCE = ENCHANTMENTS.register("ice_resistance", () -> new KnocksProtectionEnchantment(Enchantment.Rarity.UNCOMMON, KnocksProtectionEnchantment.Type.ICE, ARMOR_SLOTS));
    public static RegistryObject<Enchantment> AIR_RESISTANCE = ENCHANTMENTS.register("air_resistance", () -> new KnocksProtectionEnchantment(Enchantment.Rarity.UNCOMMON, KnocksProtectionEnchantment.Type.AIR, ARMOR_SLOTS));
    public static RegistryObject<Enchantment> EARTH_RESISTANCE = ENCHANTMENTS.register("earth_resistance", () -> new KnocksProtectionEnchantment(Enchantment.Rarity.UNCOMMON, KnocksProtectionEnchantment.Type.EARTH, ARMOR_SLOTS));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
