package io.github.seanlanepgh.knockselementalmagic.client.event;


//import com.knockout697.KnocksEntityTypes.client.renderer.entity.mob.creeper.IcyCreeperRenderer;
//import com.knockout697.KnocksEntityTypes.client.renderer.entity.mob.creeper.CustomCreeperRenderer;
//import com.knockout697.KnocksEntityTypes.client.renderer.entity.projectile.AirballRenderer;
//import com.knockout697.KnocksEntityTypes.client.renderer.entity.projectile.SmallEarthBallRenderer;


import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.elemental.*;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.projectile.*;
import io.github.seanlanepgh.knockselementalmagic.core.KnocksParticles;
import io.github.seanlanepgh.knockselementalmagic.client.particles.SnowflakeParticle;
import io.github.seanlanepgh.knockselementalmagic.core.KnocksEntityTypes;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.BlizzEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.projectile.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = KnocksElementalMagic.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {
	private ClientModEvents() {
		
	}
	@SubscribeEvent 
	public static void clientSetup(RegisterLayerDefinitions event) {
	}

	@SubscribeEvent
	public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
		event.put(KnocksEntityTypes.BLIZZ.get(), BlizzEntity.setAttributes());
		event.put(KnocksEntityTypes.QUAKE.get(), BlizzEntity.setAttributes());
		//event.put(io.github.seanlanepgh.knockselementalmagic.core.KnocksEntityTypes.RACCOON.get(), RaccoonEntity.setAttributes());
	}
	
	@SubscribeEvent 
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(KnocksEntityTypes.BLIZZ.get(), BlizzRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.QUAKE.get(), QuakeRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.ICICLE.get(), IcicleRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.BLIZZ_BOLT.get(), BlizzBoltRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.BLAZE_BOLT.get(), BlazeBoltRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.TORNADO_BOLT.get(), TornadoBoltRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.QUAKE_BOLT.get(), QuakeBoltRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.TORNADO.get(), ElementalRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.SMALL_EARTHBALL.get(), SmallEarthBallRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.SMALL_AIRBALL.get(), SmallAirBallRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.SMALL_ICEBALL.get(), SmallIceBallRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.SMALL_FIREBALL.get(), SmallCustomFireBallRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.LARGE_FIREBALL.get(), LargeCustomFireBallRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.LARGE_EARTHBALL.get(), LargeEarthBallRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.LARGE_AIRBALL.get(), LargeAirBallRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.LARGE_ICEBALL.get(), LargeIceBallRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.ICE_GOLEM.get(), FireGolemRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.AIR_GOLEM.get(), FireGolemRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.EARTH_GOLEM.get(), FireGolemRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.FIRE_WIZARD.get(), CustomWizardRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.ICE_WIZARD.get(), CustomWizardRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.AIR_WIZARD.get(), CustomWizardRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.EARTH_WIZARD.get(), CustomWizardRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.NATURE_WIZARD.get(), CustomWizardRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.VOID_WIZARD.get(), CustomWizardRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.GOLEM_SPIKE_ENTITY.get(),GolemSpikeRenderer::new );
//
		
	}
	
	@SuppressWarnings("resource")
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void registerParticleFactories(ParticleFactoryRegisterEvent event) {
        ParticleEngine particleManager = Minecraft.getInstance().particleEngine;
        
        particleManager.register(KnocksParticles.SNOWFLAKE.get(), SnowflakeParticle.Factory::new);
    
        //KnocksEntityTypes.LOGGER.info("KnocksEntityTypes Elemental Wizardry: Particles Registered!");
    }
	@SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {

       // event.registerLayerDefinition( FireGolemModel.LAYER_LOCATION, FireGolemModel::createBodyLayer);
        //event.registerLayerDefinition( GolemSpikeModel.LAYER_LOCATION ,GolemSpikeModel::createBodyLayer);

    }
}