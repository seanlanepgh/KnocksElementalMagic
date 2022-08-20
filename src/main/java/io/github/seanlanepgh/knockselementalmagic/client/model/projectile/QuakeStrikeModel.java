package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.QuakeStrike;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class QuakeStrikeModel extends AnimatedGeoModel<QuakeStrike> {

    @Override
    public ResourceLocation getModelResource(QuakeStrike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_strike.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(QuakeStrike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/quake_strike.png");

    }
    @Override
    public ResourceLocation getAnimationResource(QuakeStrike animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_strike.animation.json");
    }
}