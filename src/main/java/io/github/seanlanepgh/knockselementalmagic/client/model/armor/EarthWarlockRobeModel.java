package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.EarthWarlockArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWarlockArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EarthWarlockRobeModel extends AnimatedGeoModel<EarthWarlockArmor> {
    @Override
    public ResourceLocation getModelResource(EarthWarlockArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/warlock_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EarthWarlockArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/earth_warlock_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EarthWarlockArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}