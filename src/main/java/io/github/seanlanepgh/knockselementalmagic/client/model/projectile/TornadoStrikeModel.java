package io.github.seanlanepgh.knockselementalmagic.client.model.projectile;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.TornadoStrike;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TornadoStrikeModel extends AnimatedGeoModel<TornadoStrike> {

    @Override
    public ResourceLocation getModelResource(TornadoStrike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_strike.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TornadoStrike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/tornado_strike.png");

    }
    @Override
    public ResourceLocation getAnimationResource(TornadoStrike animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_strike.animation.json");
    }
}
