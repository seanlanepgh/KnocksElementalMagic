package io.github.seanlanepgh.knockselementalmagic.client.model.elemental;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzKnightEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class BlizzKnightModel extends AnimatedTickingGeoModel<BlizzKnightEntity> {

    @Override
    public ResourceLocation getModelResource(BlizzKnightEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/blizz_knight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlizzKnightEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/elementals/blizz_knight.png");

    }
    @Override
    public ResourceLocation getAnimationResource(BlizzKnightEntity animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/blizz_knight.animation.json");
    }

}