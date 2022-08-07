package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib3.model.*;


public class IcicleModel  extends AnimatedGeoModel<Icicle> {

    @Override
    public ResourceLocation getModelResource(Icicle object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/icicle.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Icicle object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectile.icicle.png");

    }
    @Override
    public ResourceLocation getAnimationResource(Icicle animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/icicle.animation.json");
    }
}