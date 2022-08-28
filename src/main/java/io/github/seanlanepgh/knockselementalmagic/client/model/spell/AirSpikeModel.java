package io.github.seanlanepgh.knockselementalmagic.client.model.spell;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.TornadoStrike;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.AirSpike;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AirSpikeModel extends AnimatedGeoModel<AirSpike> {

    @Override
    public ResourceLocation getModelResource(AirSpike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_crystal_attack.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AirSpike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/spells/fire_crystal_attack.png");

    }
    @Override
    public ResourceLocation getAnimationResource(AirSpike animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_crystal_attack.animation.json");
    }
}
