package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.FireWarlockArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWarlockArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWizardRobeArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireWarlockRobeModel extends AnimatedGeoModel<FireWarlockArmor> {
    @Override
    public ResourceLocation getModelResource(FireWarlockArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/warlock_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireWarlockArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/fire_warlock_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireWarlockArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}