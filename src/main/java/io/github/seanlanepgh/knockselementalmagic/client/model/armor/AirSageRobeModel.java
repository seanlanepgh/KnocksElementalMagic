package io.github.seanlanepgh.knockselementalmagic.client.model.armor;


import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.AirSageRobeArmor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AirSageRobeModel extends AnimatedGeoModel<AirSageRobeArmor> {
    @Override
    public ResourceLocation getModelResource(AirSageRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/sage_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AirSageRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/air_sage_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AirSageRobeArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}