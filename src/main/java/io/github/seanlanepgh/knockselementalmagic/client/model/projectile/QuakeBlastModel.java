package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib3.model.*;

public class QuakeBlastModel extends AnimatedGeoModel<QuakeBlast> {

    @Override
    public ResourceLocation getModelResource(QuakeBlast object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_bolt.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(QuakeBlast object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/blizz_bolt.png");

    }
    @Override
    public ResourceLocation getAnimationResource(QuakeBlast animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_bolt.animation.json");
    }
}