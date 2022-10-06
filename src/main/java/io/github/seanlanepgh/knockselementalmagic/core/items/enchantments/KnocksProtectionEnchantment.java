package io.github.seanlanepgh.knockselementalmagic.core.items.enchantments;

import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.*;

public class KnocksProtectionEnchantment extends Enchantment {
        public KnocksProtectionEnchantment(Enchantment.Rarity p_45126_, net.minecraft.world.item.enchantment.ProtectionEnchantment.Type p_45127_, EquipmentSlot... p_45128_) {
            super(p_45126_, p_45127_ == net.minecraft.world.item.enchantment.ProtectionEnchantment.Type.FALL ? EnchantmentCategory.ARMOR_FEET : EnchantmentCategory.ARMOR, p_45128_);
            this.type = p_45127_;
        }

        public int getMinCost(int p_45131_) {
            return this.type.getMinCost() + (p_45131_ - 1) * this.type.getLevelCost();
        }

        public int getMaxCost(int p_45144_) {
            return this.getMinCost(p_45144_) + this.type.getLevelCost();
        }

        public int getMaxLevel() {
            return 4;
        }

        public int getDamageProtection(int p_45133_, KWDamageSource p_45134_) {
            if (p_45134_.isBypassInvul()) {
                return 0;
            } else if (this.type == net.minecraft.world.item.enchantment.ProtectionEnchantment.Type.ALL) {
                return p_45133_;
            }  else if (this.type == net.minecraft.world.item.enchantment.ProtectionEnchantment.Type.FIRE && p_45134_.isFire()) {
                return p_45133_ * 2;
            }  else if (this.type == net.minecraft.world.item.enchantment.ProtectionEnchantment.Type.AIR && p_45134_.isAir()) {
                return p_45133_ * 2;
            }  else if (this.type == net.minecraft.world.item.enchantment.ProtectionEnchantment.Type.EARTH && p_45134_.isEarth()) {
                return p_45133_ * 2;
            } else if (this.type == net.minecraft.world.item.enchantment.ProtectionEnchantment.Type.ICE && p_45134_.isIce()) {
                return p_45133_ * 2;
            }


        }

        public boolean checkCompatibility(Enchantment p_45142_) {
            if (p_45142_ instanceof net.minecraft.world.item.enchantment.ProtectionEnchantment protectionenchantment) {
                if (this.type == protectionenchantment.type) {
                    return false;
                } else {
                    return this.type == net.minecraft.world.item.enchantment.ProtectionEnchantment.Type.FALL || protectionenchantment.type == net.minecraft.world.item.enchantment.ProtectionEnchantment.Type.FALL;
                }
            } else {
                return super.checkCompatibility(p_45142_);
            }
        }

        public static enum Type {

            FIRE(10, 8),
            AIR(10,8),
            ICE(10,8),
            EARTH(10, 8);

            private final int minCost;
            private final int levelCost;

            private Type(int p_151299_, int p_151300_) {
                this.minCost = p_151299_;
                this.levelCost = p_151300_;
            }

            public int getMinCost() {
                return this.minCost;
            }

            public int getLevelCost() {
                return this.levelCost;
            }
        }
    }
