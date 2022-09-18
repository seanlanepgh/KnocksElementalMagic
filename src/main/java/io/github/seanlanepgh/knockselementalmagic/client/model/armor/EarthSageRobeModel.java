package io.github.seanlanepgh.knockselementalmagic.client.model.armor;


import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.EarthSageRobeArmor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EarthSageRobeModel extends AnimatedGeoModel<EarthSageRobeArmor> {
    @Override
    public ResourceLocation getModelResource(EarthSageRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/sage_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EarthSageRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/earth_sage_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EarthSageRobeArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}