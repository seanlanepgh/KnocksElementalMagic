package io.github.seanlanepgh.knockselementalmagic.client.model.golem;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlazeKnightEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.EarthGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.EarthGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class EarthGolemModel extends AnimatedTickingGeoModel<EarthGolemEntity> {

    @Override
    public ResourceLocation getModelResource(EarthGolemEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EarthGolemEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/golem/earth_golem.png");

    }
    @Override
    public ResourceLocation getAnimationResource(EarthGolemEntity animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_golem.animation.json");
    }

}
