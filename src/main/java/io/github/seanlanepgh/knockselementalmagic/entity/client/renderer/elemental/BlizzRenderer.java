package io.github.seanlanepgh.knockselementalmagic.entity.client.renderer.elemental;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.client.model.elemental.BlizzModel;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlizzRenderer extends GeoEntityRenderer<BlizzEntity> {
    public BlizzRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BlizzModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(BlizzEntity instance) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/elementals/blizz.png");
    }

    @Override
    public RenderType getRenderType(BlizzEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F,1.0F);

       return super.getRenderType(animatable,partialTicks,stack,renderTypeBuffer,vertexBuilder,packedLightIn,textureLocation);
    }

}
