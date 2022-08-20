package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib3.model.*;

public class BlizzBlastModel extends AnimatedGeoModel<BlizzBlast> {

    @Override
    public ResourceLocation getModelResource(BlizzBlast object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_blast.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlizzBlast object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/blizz_blast.png");

    }
    @Override
    public ResourceLocation getAnimationResource(BlizzBlast animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_blast.animation.json");
    }
}
