package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.AirBattleMageArmor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AirBattleMageModel extends AnimatedGeoModel <AirBattleMageArmor> {
    @Override
    public ResourceLocation getModelResource(AirBattleMageArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/battle_mage_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AirBattleMageArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/ice_battle_mage_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AirBattleMageArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}