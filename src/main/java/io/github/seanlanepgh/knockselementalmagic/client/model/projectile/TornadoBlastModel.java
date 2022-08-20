package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib3.model.*;

public class TornadoBlastModel extends AnimatedGeoModel<TornadoBlast> {

    @Override
    public ResourceLocation getModelResource(TornadoBlast object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_blast.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TornadoBlast object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/tornado_blast.png");

    }
    @Override
    public ResourceLocation getAnimationResource(TornadoBlast animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_blast.animation.json");
    }
}