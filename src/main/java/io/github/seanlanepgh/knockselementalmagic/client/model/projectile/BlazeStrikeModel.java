package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.BlazeStrike;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlazeStrikeModel extends AnimatedGeoModel<BlazeStrike> {

    @Override
    public ResourceLocation getModelResource(BlazeStrike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_strike.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlazeStrike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/blaze_strike.png");

    }
    @Override
    public ResourceLocation getAnimationResource(BlazeStrike animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_strike.animation.json");
    }
}