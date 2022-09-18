package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWizardRobeArmor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceWizardRobeModel extends AnimatedGeoModel<IceWizardRobeArmor> {
    @Override
    public ResourceLocation getModelResource(IceWizardRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/ice_wizard_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceWizardRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/ice_wizard_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IceWizardRobeArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}