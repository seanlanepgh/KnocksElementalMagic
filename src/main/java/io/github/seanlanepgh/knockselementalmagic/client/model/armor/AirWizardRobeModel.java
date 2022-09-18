package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.AirWizardRobeArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWizardRobeArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AirWizardRobeModel extends AnimatedGeoModel<AirWizardRobeArmor> {
    @Override
    public ResourceLocation getModelResource(AirWizardRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/ice_wizard_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AirWizardRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/ice_wizard_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AirWizardRobeArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}