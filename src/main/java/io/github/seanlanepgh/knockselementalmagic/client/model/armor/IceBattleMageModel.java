package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.EarthBattleMageArmor;

import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceBattleMageArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceBattleMageModel extends AnimatedGeoModel <IceBattleMageArmor> {
    @Override
    public ResourceLocation getModelResource (IceBattleMageArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/battle_mage_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource (IceBattleMageArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/ice_battle_mage_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource (IceBattleMageArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}