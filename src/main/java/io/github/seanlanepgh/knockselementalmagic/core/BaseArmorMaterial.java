package io.github.seanlanepgh.knockselementalmagic.core;

import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.effects.ArmorEffect;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class BaseArmorMaterial implements ArmorMaterial {
    private final int enchantability;
    private final int[] durability, damageReduction;
    private final float knockbackResistance, toughness;
    private final String name;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;
    private final List<ArmorEffect> effects = new LinkedList<>();

    public BaseArmorMaterial(int enchantability, int[] durability, int[] damageReduction,
            float knockbackResistance, float toughness, String name, SoundEvent equipSound,
            Supplier<Ingredient> repairMaterial) {
        this.enchantability = enchantability;
        this.durability = durability;
        this.damageReduction = damageReduction;
        this.knockbackResistance = knockbackResistance;
        this.toughness = toughness;
        this.name = name;
        this.equipSound = equipSound;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.damageReduction[slot.getIndex()];
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return this.durability[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
    }