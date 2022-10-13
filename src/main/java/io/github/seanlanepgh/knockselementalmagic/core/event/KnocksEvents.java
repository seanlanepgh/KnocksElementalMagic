package io.github.seanlanepgh.knockselementalmagic.core.event;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KnocksElementalMagic.MODID)
public class KnocksEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

    }
}
