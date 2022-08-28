package io.github.seanlanepgh.knockselementalmagic.client.renderer.golem;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.client.model.golem.IceGolemModel;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.IceGolemEntity;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class IceGolemRenderer extends GeoEntityRenderer<IceGolemEntity> {
    public IceGolemRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new IceGolemModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(IceGolemEntity instance) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/golem/ice_golem.png");
    }

    @Override
    public RenderType getRenderType(IceGolemEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F,1.0F);

        return super.getRenderType(animatable,partialTicks,stack,renderTypeBuffer,vertexBuilder,packedLightIn,textureLocation);
    }
}