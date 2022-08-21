package io.github.seanlanepgh.knockselementalmagic.client.model.elemental;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.QuakeKnightEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class QuakeKnightModel extends AnimatedTickingGeoModel<QuakeKnightEntity> {

    @Override
    public ResourceLocation getModelResource(QuakeKnightEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/quake_knight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(QuakeKnightEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/elementals/quake_knight.png");

    }
    @Override
    public ResourceLocation getAnimationResource(QuakeKnightEntity animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/quake_knight.animation.json");
    }

}