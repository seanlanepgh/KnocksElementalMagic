package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.FireWizardRobeArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWizardRobeArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireWizardRobeModel extends AnimatedGeoModel<FireWizardRobeArmor> {
    @Override
    public ResourceLocation getModelResource(FireWizardRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/ice_wizard_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireWizardRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/ice_wizard_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireWizardRobeArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}