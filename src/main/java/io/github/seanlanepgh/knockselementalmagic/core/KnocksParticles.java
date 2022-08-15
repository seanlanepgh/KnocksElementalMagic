package io.github.seanlanepgh.knockselementalmagic.core;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@Mod.EventBusSubscriber(modid = KnocksElementalMagic.MODID, bus = Bus.MOD)
public class KnocksParticles {

    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, KnocksElementalMagic.MODID);

    public static final RegistryObject<SimpleParticleType> SNOWFLAKE = PARTICLES.register("snowflake", () -> new SimpleParticleType(false));


}