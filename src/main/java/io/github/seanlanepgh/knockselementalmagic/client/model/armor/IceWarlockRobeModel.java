package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;


import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWarlockArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceWarlockRobeModel extends AnimatedGeoModel<IceWarlockArmor> {
    @Override
    public ResourceLocation getModelResource(IceWarlockArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/warlock_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceWarlockArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/ice_warlock_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IceWarlockArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}