package io.github.seanlanepgh.knockselementalmagic.client.model.armor;


import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.FireSageRobeArmor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireSageRobeModel extends AnimatedGeoModel<FireSageRobeArmor> {
    @Override
    public ResourceLocation getModelResource(FireSageRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/sage_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireSageRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/ice_sage_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireSageRobeArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}