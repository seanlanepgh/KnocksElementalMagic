package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.EarthWizardRobeArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWizardRobeArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EarthWizardRobeModel  extends AnimatedGeoModel<EarthWizardRobeArmor> {
    @Override
    public ResourceLocation getModelResource(EarthWizardRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/wizard_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EarthWizardRobeArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/earth_wizard_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EarthWizardRobeArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}