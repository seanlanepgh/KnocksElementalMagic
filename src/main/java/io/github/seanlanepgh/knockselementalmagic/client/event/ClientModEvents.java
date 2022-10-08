package io.github.seanlanepgh.knockselementalmagic.client.event;


//import com.knockout697.KnocksEntityTypes.client.renderer.entity.mob.creeper.IcyCreeperRenderer;
//import com.knockout697.KnocksEntityTypes.client.renderer.entity.mob.creeper.CustomCreeperRenderer;
//import com.knockout697.KnocksEntityTypes.client.renderer.entity.projectile.AirballRenderer;
//import com.knockout697.KnocksEntityTypes.client.renderer.entity.projectile.SmallEarthBallRenderer;


import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
//import io.github.seanlanepgh.knockselementalmagic.client.model.projectile.QuakeBlastRenderer;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.armor.*;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.elemental.*;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.golem.AirGolemRenderer;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.golem.EarthGolemRenderer;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.golem.FireGolemRenderer;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.golem.IceGolemRenderer;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.projectile.*;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.spell.AirSpikeRenderer;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.spell.EarthSpikeRenderer;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.spell.FireSpikeRenderer;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.spell.IceSpikeRenderer;
import io.github.seanlanepgh.knockselementalmagic.client.renderer.wizard.CustomWizardRenderer;
import io.github.seanlanepgh.knockselementalmagic.core.KnocksParticles;
import io.github.seanlanepgh.knockselementalmagic.client.particles.SnowflakeParticle;
import io.github.seanlanepgh.knockselementalmagic.core.KnocksEntityTypes;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.*;
import io.github.seanlanepgh.knockselementalmagic.entity.elemental.*;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.AirGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.EarthGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.FireGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.golem.IceGolemEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.AirWizardEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.EarthWizardEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.FireWizardEntity;
import io.github.seanlanepgh.knockselementalmagic.entity.wizard.IceWizardEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
//import net.minecraftforge.client.event.;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

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
		event.put(KnocksEntityTypes.QUAKE.get(), QuakeEntity.setAttributes());
		event.put(KnocksEntityTypes.TORNADO.get(), TornadoEntity.setAttributes());
		event.put(KnocksEntityTypes.BLAZE_KNIGHT.get(), BlazeKnightEntity.setAttributes());
		event.put(KnocksEntityTypes.BLIZZ_KNIGHT.get(), BlizzKnightEntity.setAttributes());
		event.put(KnocksEntityTypes.QUAKE_KNIGHT.get(), QuakeKnightEntity.setAttributes());
		event.put(KnocksEntityTypes.TORNADO_KNIGHT.get(), TornadoKnightEntity.setAttributes());
		event.put(KnocksEntityTypes.FIRE_WIZARD.get(), FireWizardEntity.setAttributes());
		event.put(KnocksEntityTypes.AIR_WIZARD.get(), AirWizardEntity.setAttributes());
		event.put(KnocksEntityTypes.ICE_WIZARD.get(), IceWizardEntity.setAttributes());
		event.put(KnocksEntityTypes.EARTH_WIZARD.get(), EarthWizardEntity.setAttributes());
		event.put(KnocksEntityTypes.ICE_GOLEM.get(), IceGolemEntity.setAttributes());
		event.put(KnocksEntityTypes.FIRE_GOLEM.get(), FireGolemEntity.setAttributes());
		event.put(KnocksEntityTypes.EARTH_GOLEM.get(), EarthGolemEntity.setAttributes());
		event.put(KnocksEntityTypes.AIR_GOLEM.get(), AirGolemEntity.setAttributes());

		//event.put(io.github.seanlanepgh.knockselementalmagic.core.KnocksEntityTypes.RACCOON.get(), RaccoonEntity.setAttributes());
	}
	
	@SubscribeEvent 
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {

		event.registerEntityRenderer(KnocksEntityTypes.BLIZZ_BOLT.get(), BlizzBoltRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.BLAZE_BOLT.get(), BlazeBoltRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.BLIZZ_BLAST.get(), BlizzBlastRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.BLAZE_BLAST.get(), BlazeBlastRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.BLAZE_KNIGHT.get(), BlazeKnightRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.BLIZZ_KNIGHT.get(), BlizzKnightRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.BLAZE_STRIKE.get(), BlazeStrikeRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.BLIZZ_STRIKE.get(), BlizzStrikeRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.ICICLE.get(), IcicleRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.TORNADO_BOLT.get(), TornadoBoltRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.TORNADO_BLAST.get(), TornadoBlastRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.TORNADO_STRIKE.get(), TornadoStrikeRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.QUAKE.get(), QuakeRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.QUAKE_BOLT.get(), QuakeBoltRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.QUAKE_BLAST.get(), QuakeBlastRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.QUAKE_KNIGHT.get(), QuakeKnightRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.QUAKE_STRIKE.get(), QuakeStrikeRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.TORNADO.get(), TornadoRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.TORNADO_KNIGHT.get(), TornadoKnightRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.FIRE_GOLEM.get(), FireGolemRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.ICE_GOLEM.get(), IceGolemRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.AIR_GOLEM.get(), AirGolemRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.EARTH_GOLEM.get(), EarthGolemRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.FIRE_SPIKE.get(), FireSpikeRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.AIR_SPIKE.get(), AirSpikeRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.ICE_SPIKE.get(), IceSpikeRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.EARTH_SPIKE.get(), EarthSpikeRenderer::new);


		event.registerEntityRenderer(KnocksEntityTypes.FIRE_WIZARD.get(), CustomWizardRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.ICE_WIZARD.get(), CustomWizardRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.AIR_WIZARD.get(), CustomWizardRenderer::new);
		event.registerEntityRenderer(KnocksEntityTypes.EARTH_WIZARD.get(), CustomWizardRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.NATURE_WIZARD.get(), CustomWizardRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.VOID_WIZARD.get(), CustomWizardRenderer::new);
//		event.registerEntityRenderer(KnocksEntityTypes.GOLEM_SPIKE_ENTITY.get(),GolemSpikeRenderer::new );
//
		//GeoArmorRenderer.registerArmorRenderer(IceWizardRobeArmor.class, new WizardRobeRenderer());
	}
	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.AddLayers event) {
		GeoArmorRenderer.registerArmorRenderer(IceWizardRobeArmor.class, new IceWizardRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(IceSageRobeArmor.class, new IceSageRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(IceBattleMageArmor.class, new IceBattleMageRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(IceWarlockArmor.class, new IceWarlockRobeRenderer());

		GeoArmorRenderer.registerArmorRenderer(AirWizardRobeArmor.class, new AirWizardRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(AirSageRobeArmor.class, new AirSageRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(AirBattleMageArmor.class, new AirBattleMageRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(AirWarlockArmor.class, new AirWarlockRobeRenderer());

		GeoArmorRenderer.registerArmorRenderer(EarthWizardRobeArmor.class, new EarthWizardRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(EarthSageRobeArmor.class, new EarthSageRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(EarthBattleMageArmor.class, new EarthBattleMageRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(EarthWarlockArmor.class, new EarthWarlockRobeRenderer());



		GeoArmorRenderer.registerArmorRenderer(FireWizardRobeArmor.class, new FireWizardRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(FireSageRobeArmor.class, new FireSageRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(FireBattleMageArmor.class, new FireBattleMageRobeRenderer());
		GeoArmorRenderer.registerArmorRenderer(FireWarlockArmor.class, new FireWarlockRobeRenderer());
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