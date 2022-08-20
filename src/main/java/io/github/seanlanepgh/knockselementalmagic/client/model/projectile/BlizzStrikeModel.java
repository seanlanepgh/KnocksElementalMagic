package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.BlizzStrike;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlizzStrikeModel extends AnimatedGeoModel<BlizzStrike> {

    @Override
    public ResourceLocation getModelResource(BlizzStrike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_strike.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlizzStrike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/blizz_strike.png");

    }
    @Override
    public ResourceLocation getAnimationResource(BlizzStrike animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_strike.animation.json");
    }
}
