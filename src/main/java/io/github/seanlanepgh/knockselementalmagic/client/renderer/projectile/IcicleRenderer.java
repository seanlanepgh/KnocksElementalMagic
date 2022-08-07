package io.github.seanlanepgh.knockselementalmagic.client.renderer.projectile;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import io.github.seanlanepgh.knockselementalmagic.*;
import io.github.seanlanepgh.knockselementalmagic.client.model.projectile.*;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.particles.*;
import net.minecraft.resources.ResourceLocation;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.Icicle;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.phys.*;
import software.bernie.geckolib3.renderers.geo.*;
import software.bernie.geckolib3.renderers.geo.GeoProjectilesRenderer;

public class IcicleRenderer extends GeoProjectilesRenderer<Icicle> {
    public IcicleRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new IcicleModel());
       // this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(Icicle instance) {
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/projectiles/icicle.png");
    }

    @Override
    public RenderType getRenderType(Icicle animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F,1.0F);

        return super.getRenderType(animatable,partialTicks,stack,renderTypeBuffer,vertexBuilder,packedLightIn,textureLocation);
    }


}
