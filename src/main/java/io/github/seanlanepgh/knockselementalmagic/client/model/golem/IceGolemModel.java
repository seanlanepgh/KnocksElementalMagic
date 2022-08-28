package io.github.seanlanepgh.knockselementalmagic.client.model.golem;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlazeKnightEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.IceGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class IceGolemModel extends AnimatedTickingGeoModel<IceGolemEntity> {

    @Override
    public ResourceLocation getModelResource(IceGolemEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceGolemEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/golem/ice_golem.png");

    }
    @Override
    public ResourceLocation getAnimationResource(IceGolemEntity animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_golem.animation.json");
    }

}