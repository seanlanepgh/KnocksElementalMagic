package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceSageRobeArmor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceSageRobeModel extends AnimatedGeoModel<IceSageRobeArmor> {
    @Override
    public ResourceLocation getModelResource(IceSageRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/sage_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceSageRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/ice_sage_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IceSageRobeArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}