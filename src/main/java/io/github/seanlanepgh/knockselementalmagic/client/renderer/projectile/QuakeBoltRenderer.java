package io.github.seanlanepgh.knockselementalmagic.client.renderer.projectile;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib3.renderers.geo.GeoProjectilesRenderer;
import io.github.seanlanepgh.knockselementalmagic.*;
import io.github.seanlanepgh.knockselementalmagic.client.model.projectile.*;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;

public class QuakeBoltRenderer extends GeoProjectilesRenderer<QuakeBolt> {
    public QuakeBoltRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new QuakeBoltModel());
        // this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(QuakeBolt instance) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/quake_bolt.png");
    }

    @Override
    public RenderType getRenderType(QuakeBolt animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}