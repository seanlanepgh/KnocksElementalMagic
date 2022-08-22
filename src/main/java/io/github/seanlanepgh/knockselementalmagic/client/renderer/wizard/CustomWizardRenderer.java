package io.github.seanlanepgh.knockselementalmagic.client.renderer.wizard;

import com.mojang.blaze3d.vertex.PoseStack;

import io.github.seanlanepgh.knockselementalmagic.entity.wizard.AirWizardEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.EarthWizardEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.FireWizardEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.IceWizardEntity;
import net.minecraft.client.model.IllagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IllagerRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.SpellcasterIllager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CustomWizardRenderer<T extends SpellcasterIllager> extends IllagerRenderer<T> {
	public CustomWizardRenderer(EntityRendererProvider.Context p_174108_) {
		super(p_174108_, new IllagerModel<>(p_174108_.bakeLayer(ModelLayers.EVOKER)), 0.5F);
		this.addLayer(new ItemInHandLayer<T, IllagerModel<T>>(this, p_174108_.getItemInHandRenderer()) {
			public void render(PoseStack p_114569_, MultiBufferSource p_114570_, int p_114571_, T p_114572_, float p_114573_, float p_114574_, float p_114575_, float p_114576_, float p_114577_, float p_114578_) {
				if (p_114572_.isCastingSpell()) {
					super.render(p_114569_, p_114570_, p_114571_, p_114572_, p_114573_, p_114574_, p_114575_, p_114576_, p_114577_, p_114578_);
				}

			}
		});
	}

	private static final ResourceLocation FIRE_WIZARD_TEXTURE = new ResourceLocation("knockselementalmagic",
			"textures/entity/wizards/fire_wizard.png");
	private static final ResourceLocation ICE_WIZARD_TEXTURE = new ResourceLocation("knockselementalmagic",
			"textures/entity/wizards/ice_wizard.png");
	private static final ResourceLocation EARTH_WIZARD_TEXTURE = new ResourceLocation("knockselementalmagic",
			"textures/entity/wizards/earth_wizard.png");
	private static final ResourceLocation VOID_WIZARD_TEXTURE = new ResourceLocation("knockselementalmagic",
			"textures/entity/wizards/void_wizard.png");
	private static final ResourceLocation AIR_WIZARD_TEXTURE = new ResourceLocation("knockselementalmagic",
			"textures/entity/wizards/air_wizard.png");
	private static final ResourceLocation NATURE_WIZARD_TEXTURE = new ResourceLocation("knockselementalmagic",
			"textures/entity/wizards/nature_wizard.png");
	

	@Override
	public ResourceLocation getTextureLocation(T abstractWizardEntity) {
		// TODO Auto-generated method stub
		
		 if ( abstractWizardEntity instanceof FireWizardEntity) {
			 return FIRE_WIZARD_TEXTURE;
         } else if (abstractWizardEntity instanceof IceWizardEntity) {
        	 return ICE_WIZARD_TEXTURE;
         } else if (abstractWizardEntity instanceof EarthWizardEntity) {
             return EARTH_WIZARD_TEXTURE;
//         } else if (abstractWizardEntity instanceof VoidWizardEntity) {
//             return VOID_WIZARD_TEXTURE;
//         } else if (abstractWizardEntity instanceof NatureWizardEntity) {
             //return NATURE_WIZARD_TEXTURE;
         } else if (abstractWizardEntity instanceof AirWizardEntity) {
             return AIR_WIZARD_TEXTURE;
         }
		return null;
   	
		
	}
}
