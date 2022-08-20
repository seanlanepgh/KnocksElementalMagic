package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib3.model.*;

public class TornadoBoltModel extends AnimatedGeoModel<TornadoBolt> {

    @Override
    public ResourceLocation getModelResource(TornadoBolt object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_bolt.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TornadoBolt object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/tornado_bolt.png");

    }
    @Override
    public ResourceLocation getAnimationResource(TornadoBolt animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_bolt.animation.json");
    }
}