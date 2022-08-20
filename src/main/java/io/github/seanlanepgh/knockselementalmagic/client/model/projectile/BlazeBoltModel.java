package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib3.model.*;

public class BlazeBoltModel extends AnimatedGeoModel<BlazeBolt> {

    @Override
    public ResourceLocation getModelResource(BlazeBolt object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_bolt.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlazeBolt object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/blaze_bolt.png");

    }
    @Override
    public ResourceLocation getAnimationResource(BlazeBolt animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_bolt.animation.json");
    }
}