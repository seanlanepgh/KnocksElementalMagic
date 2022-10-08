package io.github.seanlanepgh.knockselementalmagic.client.renderer.elemental;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.client.model.elemental.TornadoModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.elemental.*;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TornadoRenderer extends GeoEntityRenderer<TornadoEntity> {
    public TornadoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TornadoModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(TornadoEntity instance) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/elementals/tornado.png");
    }

    @Override
    public RenderType getRenderType(TornadoEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F,1.0F);

        return super.getRenderType(animatable,partialTicks,stack,renderTypeBuffer,vertexBuilder,packedLightIn,textureLocation);
    }

}