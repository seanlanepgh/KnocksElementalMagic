package io.github.seanlanepgh.knockselementalmagic.client.model.spell;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.TornadoStrike;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.IceSpike;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceSpikeModel extends AnimatedGeoModel<IceSpike> {

    @Override
    public ResourceLocation getModelResource(IceSpike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_crystal_attack.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceSpike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/spells/ice_crystal_attack.png");

    }
    @Override
    public ResourceLocation getAnimationResource(IceSpike animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_crystal_attack.animation.json");
    }
}