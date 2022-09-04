package io.github.seanlanepgh.knockselementalmagic.client.model.golem;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlazeKnightEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.FireGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class FireGolemModel extends AnimatedTickingGeoModel<FireGolemEntity> {

    @Override
    public ResourceLocation getModelResource(FireGolemEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireGolemEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/golem/fire_golem.png");

    }
    @Override
    public ResourceLocation getAnimationResource(FireGolemEntity animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_golem.animation.json");
    }

}