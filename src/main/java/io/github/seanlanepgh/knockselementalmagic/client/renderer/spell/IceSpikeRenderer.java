package io.github.seanlanepgh.knockselementalmagic.client.renderer.spell;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import io.github.seanlanepgh.knockselementalmagic.client.model.spell.IceSpikeModel;
import io.github.seanlanepgh.knockselementalmagic.entity.spell.IceSpike;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoProjectilesRenderer;
import io.github.seanlanepgh.knockselementalmagic.*;
import io.github.seanlanepgh.knockselementalmagic.client.model.projectile.*;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;


public class IceSpikeRenderer extends GeoProjectilesRenderer<IceSpike> {
    public IceSpikeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new IceSpikeModel());
        // this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(IceSpike instance) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/spells/fire_crystal_attack.png");
    }

    @Override
    public RenderType getRenderType(IceSpike animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }


}