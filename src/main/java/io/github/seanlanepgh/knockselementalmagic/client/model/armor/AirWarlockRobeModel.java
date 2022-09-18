package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.AirWarlockArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWarlockArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AirWarlockRobeModel  extends AnimatedGeoModel<AirWarlockArmor> {
    @Override
    public ResourceLocation getModelResource(AirWarlockArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/warlock_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AirWarlockArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/air_warlock_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AirWarlockArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}