package io.github.seanlanepgh.knockselementalmagic.core.event;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.KnocksItems;
import io.github.seanlanepgh.knockselementalmagic.core.KnocksVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = KnocksElementalMagic.MODID)
public class KnocksEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {


        if(event.getType() == KnocksVillagers.AIR_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.AIR_RUNE.get(), 6);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.FIRE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.FIRE_RUNE.get(), 6);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.EARTH_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.EARTH_RUNE.get(), 6);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.ICE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.ICE_RUNE.get(), 6);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.AIR_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.NOVICE_AIR_STAFF.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.FIRE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.NOVICE_FIRE_STAFF.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.EARTH_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.NOVICE_EARTH_STAFF.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.ICE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.NOVICE_ICE_STAFF.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.AIR_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.AIR_RUNE.get(), 12);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.AIR_CRYSTAL.get(), 6),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.FIRE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.FIRE_RUNE.get(), 12);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.FIRE_CRYSTAL.get(), 6),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.EARTH_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.EARTH_RUNE.get(), 12);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.EARTH_CRYSTAL.get(), 6),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.ICE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.ICE_RUNE.get(), 12);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.ICE_CRYSTAL.get(), 6),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.AIR_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 4);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.AIR_CRYSTAL.get(), 16),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.FIRE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 4);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.FIRE_CRYSTAL.get(), 16),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.EARTH_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 4);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.EARTH_CRYSTAL.get(), 16),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.ICE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 4);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.ICE_CRYSTAL.get(), 16),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.AIR_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.AIR_RUNE.get(), 16);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.FIRE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.FIRE_RUNE.get(), 16);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.EARTH_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.EARTH_RUNE.get(), 16);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.ICE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.ICE_RUNE.get(), 16);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.AIR_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.APPRENTICE_AIR_STAFF.get(), 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.FIRE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.APPRENTICE_FIRE_STAFF.get(), 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.EARTH_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.APPRENTICE_EARTH_STAFF.get(), 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.ICE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.APPRENTICE_ICE_STAFF.get(), 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.AIR_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.AIR_RUNE.get(), 24);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.AIR_CRYSTAL.get(), 12),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.FIRE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.FIRE_RUNE.get(), 24);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.FIRE_CRYSTAL.get(), 12),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.EARTH_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.EARTH_RUNE.get(), 24);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.EARTH_CRYSTAL.get(), 12),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.ICE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(KnocksItems.ICE_RUNE.get(), 24);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.ICE_CRYSTAL.get(), 12),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.AIR_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 8);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.AIR_CRYSTAL.get(), 32),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.FIRE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 8);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.FIRE_CRYSTAL.get(), 32),
                    stack,10,8,0.02F));
        }

        if(event.getType() == KnocksVillagers.EARTH_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 8);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.EARTH_CRYSTAL.get(), 32),
                    stack,10,8,0.02F));
        }
        if(event.getType() == KnocksVillagers.ICE_WIZARD.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 8);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(KnocksItems.ICE_CRYSTAL.get(), 32),
                    stack,10,8,0.02F));
        }

    }
}
