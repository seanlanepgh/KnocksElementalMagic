package io.github.seanlanepgh.knockselementalmagic.client.model.spell;


import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.TornadoStrike;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.EarthSpike;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EarthSpikeModel extends AnimatedGeoModel<EarthSpike> {

    @Override
    public ResourceLocation getModelResource(EarthSpike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_crystal_attack.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EarthSpike object) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/spells/fire_crystal_attack.png");

    }
    @Override
    public ResourceLocation getAnimationResource(EarthSpike animatable) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_crystal_attack.animation.json");
    }
}