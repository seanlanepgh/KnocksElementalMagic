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


public class BlazeBlastRenderer extends GeoProjectilesRenderer<BlazeBlast> {
    public BlazeBlastRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BlazeBlastModel());
        // this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(BlazeBlast instance) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/blizz_bolt.png");
    }

    @Override
    public RenderType getRenderType(BlazeBlast animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }


}