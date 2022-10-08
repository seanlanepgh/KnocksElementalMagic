package io.github.seanlanepgh.knockselementalmagic.client.renderer.elemental;
package io.github.seanlanepgh.knockselementalmagic.client.renderer.elemental;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.client.model.elemental.TornadoKnightModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.elemental.BlizzModel;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.TornadoKnightEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TornadoKnightRenderer extends GeoEntityRenderer<TornadoKnightEntity> {
    public TornadoKnightRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TornadoKnightModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(TornadoKnightEntity instance) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/elementals/tornado_knight.png");
    }

    @Override
    public RenderType getRenderType(TornadoKnightEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F,1.0F);

        return super.getRenderType(animatable,partialTicks,stack,renderTypeBuffer,vertexBuilder,packedLightIn,textureLocation);
    }
}