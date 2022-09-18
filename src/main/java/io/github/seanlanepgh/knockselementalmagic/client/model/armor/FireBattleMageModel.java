package io.github.seanlanepgh.knockselementalmagic.client.model.armor;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;

import io.github.seanlanepgh.knockselementalmagic.core.items.armor.FireBattleMageArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireBattleMageModel extends AnimatedGeoModel <FireBattleMageArmor> {
    @Override
    public ResourceLocation getModelResource (FireBattleMageArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/battle_mage_robes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource (FireBattleMageArmor object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/models/armor/fire_battle_mage_robes.png");
    }

    @Override
    public ResourceLocation getAnimationResource (FireBattleMageArmor animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/wizard_robes.animation.json");
    }
}