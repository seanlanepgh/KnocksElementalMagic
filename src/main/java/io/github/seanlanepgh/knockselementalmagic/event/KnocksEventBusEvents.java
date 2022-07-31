package io.github.seanlanepgh.knockselementalmagic.event;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.KnocksEntityTypes;
import io.github.seanlanepgh.knockselementalmagic.entity.RaccoonEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KnocksElementalMagic.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class KnocksEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(KnocksEntityTypes.BLIZZ.get(), BlizzEntity.setAttributes());
        //event.put(KnocksEntityTypes.RACCOON.get(), RaccoonEntity.setAttributes());
    }
}
