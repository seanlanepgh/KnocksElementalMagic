package io.github.seanlanepgh.knockselementalmagic.client.renderer.projectile;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.client.model.projectile.QuakeBlastModel;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib3.renderers.geo.GeoProjectilesRenderer;


public class QuakeBlastRenderer extends GeoProjectilesRenderer<QuakeBlast> {
    public QuakeBlastRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new QuakeBlastModel());
        // this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(QuakeBlast instance) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/quake_blast.png");
    }

    @Override
    public RenderType getRenderType(QuakeBlast animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }


}