package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.EarthBattleMageArmor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EarthBattleMageModel extends AnimatedGeoModel <EarthBattleMageArmor> {
    @Override
    public ResourceLocation getModelResource (EarthBattleMageArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/battle_mage_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource (EarthBattleMageArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/ice_battle_mage_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource (EarthBattleMageArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}