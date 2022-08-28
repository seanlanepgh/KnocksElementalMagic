package io.github.seanlanepgh.knockselementalmagic.client.model.spell;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.TornadoStrike;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.FireSpike;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireSpikeModel extends AnimatedGeoModel<FireSpike> {

        @Override
        public ResourceLocation getModelResource(FireSpike object) {
            return new ResourceLocation(KnocksElementalMagic.MODID, "geo/elemental_crystal_attack.geo.json");
        }

        @Override
        public ResourceLocation getTextureResource(FireSpike object) {
            return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/spells/fire_crystal_attack.png");

        }
        @Override
        public ResourceLocation getAnimationResource(FireSpike animatable) {
            return new ResourceLocation(KnocksElementalMagic.MODID, "animations/elemental_crystal_attack.animation.json");
        }
    }
