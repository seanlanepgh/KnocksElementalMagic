package io.github.seanlanepgh.knockselementalmagic.client.model.golem;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlazeKnightEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.AirGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class AirGolemModel extends AnimatedTickingGeoModel<AirGolemEntity> {

    @Override
    public ResourceLocation getModelResource(AirGolemEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AirGolemEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/golem/air_golem.png");

    }
    @Override
    public ResourceLocation getAnimationResource(AirGolemEntity animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_golem.animation.json");
    }

}