package io.github.seanlanepgh.knockselementalmagic.client.model.elemental;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlazeKnightEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class BlazeKnightModel extends AnimatedTickingGeoModel<BlazeKnightEntity> {

    @Override
    public ResourceLocation getModelResource(BlazeKnightEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/blaze_knight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlazeKnightEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/elementals/blaze_knight.png");

    }
    @Override
    public ResourceLocation getAnimationResource(BlazeKnightEntity animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/blaze_knight.animation.json");
    }

}
