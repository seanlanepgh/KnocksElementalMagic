package io.github.seanlanepgh.knockselementalmagic.client.renderer.projectile;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.SmallEarthBall;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
@OnlyIn(Dist.CLIENT)
public class SmallEarthBallRenderer extends EntityRenderer<SmallEarthBall> {
	 private static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation(KnocksElementalMagic.MODID , "textures/item/earth_charge.png");
	   private static final RenderType RENDER_TYPE = RenderType.entityCutoutNoCull(TEXTURE_LOCATION);

	   public SmallEarthBallRenderer(EntityRendererProvider.Context p_173962_) {
	      super(p_173962_);
	   }

	   protected int getBlockLightLevel(SmallEarthBall pEntity, BlockPos pPos) {
	      return 0;
	   }

	   public void render(SmallEarthBall pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
	      pMatrixStack.pushPose();
	      pMatrixStack.scale(1.0F, 1.0F, 1.0F);
	      pMatrixStack.mulPose(this.entityRenderDispatcher.cameraOrientation());
	      pMatrixStack.mulPose(Vector3f.YP.rotationDegrees(180.0F));
	      PoseStack.Pose posestack$pose = pMatrixStack.last();
	      Matrix4f matrix4f = posestack$pose.pose();
	      Matrix3f matrix3f = posestack$pose.normal();
	      VertexConsumer vertexconsumer = pBuffer.getBuffer(RENDER_TYPE);
	      vertex(vertexconsumer, matrix4f, matrix3f, pPackedLight, 0.0F, 0, 0, 1);
	      vertex(vertexconsumer, matrix4f, matrix3f, pPackedLight, 1.0F, 0, 1, 1);
	      vertex(vertexconsumer, matrix4f, matrix3f, pPackedLight, 1.0F, 1, 1, 0);
	      vertex(vertexconsumer, matrix4f, matrix3f, pPackedLight, 0.0F, 1, 0, 0);
	      pMatrixStack.popPose();
	      super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
	   }

	   private static void vertex(VertexConsumer p_114090_, Matrix4f p_114091_, Matrix3f p_114092_, int p_114093_, float p_114094_, int p_114095_, int p_114096_, int p_114097_) {
	      p_114090_.vertex(p_114091_, p_114094_ - 0.5F, (float)p_114095_ - 0.25F, 0.0F).color(255, 255, 255, 255).uv((float)p_114096_, (float)p_114097_).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_114093_).normal(p_114092_, 0.0F, 1.0F, 0.0F).endVertex();
	   }

	   /**
	    * Returns the location of an entity's texture.
	    */
	   public ResourceLocation getTextureLocation1(SmallEarthBall pEntity) {
	      return TEXTURE_LOCATION;
	   }

	@Override
	public ResourceLocation getTextureLocation(SmallEarthBall p_114482_) {
		 return TEXTURE_LOCATION;
	}
}