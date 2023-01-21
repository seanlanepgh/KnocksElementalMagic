package io.github.seanlanepgh.knockselementalmagic.client.renderer.golem;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.client.model.golem.FireGolemModel;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.FireGolemEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FireGolemRenderer extends GeoEntityRenderer<FireGolemEntity> {
    public FireGolemRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FireGolemModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(FireGolemEntity instance) {

        if(instance.level.dimension() == Level.NETHER)
        {
            return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/golem/nether_fire_golem.png");
        }
        return new ResourceLocation(KnocksElementalMagic.MODID, "textures/entity/golem/fire_golem.png");
    }


    @Override
    public RenderType getRenderType(FireGolemEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F,1.0F);

        return super.getRenderType(animatable,partialTicks,stack,renderTypeBuffer,vertexBuilder,packedLightIn,textureLocation);
    }
}