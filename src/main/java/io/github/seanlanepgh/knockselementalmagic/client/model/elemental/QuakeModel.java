package io.github.seanlanepgh.knockselementalmagic.client.model.elemental;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class QuakeModel  extends AnimatedTickingGeoModel<QuakeEntity> {

    @Override
    public ResourceLocation getModelResource(QuakeEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/quake.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(QuakeEntity object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/elementals/quake.png");

    }
    @Override
    public ResourceLocation getAnimationResource(QuakeEntity animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/quake.animation.json");
    }



    @SuppressWarnings({ "unchecked", "unused", "rawtypes" })
    @Override
    public void setLivingAnimations(QuakeEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        LivingEntity entityIn = (LivingEntity) entity;
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
        head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
    }
}