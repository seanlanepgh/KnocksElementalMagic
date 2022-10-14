package io.github.seanlanepgh.knockselementalmagic.core;

import com.google.common.collect.ImmutableSet;
import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class KnocksVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, KnocksElementalMagic.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS,KnocksElementalMagic.MODID);

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
    public static final RegistryObject<PoiType> FIRE_ALTAR_POI = POI_TYPES.register("fire_altar_poi",
            () -> new PoiType(ImmutableSet.copyOf(KnocksBlocks.FIRE_ALTAR.get().getStateDefinition().getPossibleStates()),
        1,1));
    public static final RegistryObject<PoiType> ICE_ALTAR_POI = POI_TYPES.register("ice_altar_poi",
            () -> new PoiType(ImmutableSet.copyOf(KnocksBlocks.ICE_ALTAR.get().getStateDefinition().getPossibleStates()),
                    1,1));
    public static final RegistryObject<PoiType> AIR_ALTAR_POI = POI_TYPES.register("air_altar_poi",
            () -> new PoiType(ImmutableSet.copyOf(KnocksBlocks.AIR_ALTAR.get().getStateDefinition().getPossibleStates()),
                    1,1));
    public static final RegistryObject<PoiType> EARTH_ALTAR_POI = POI_TYPES.register("earth_altar_poi",
            () -> new PoiType(ImmutableSet.copyOf(KnocksBlocks.EARTH_ALTAR.get().getStateDefinition().getPossibleStates()),
                    1,1));
    public static void registerPOIs(){
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, FIRE_ALTAR_POI.get());
            ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, ICE_ALTAR_POI.get());
            ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, EARTH_ALTAR_POI.get());
            ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, AIR_ALTAR_POI.get());
        } catch (InvocationTargetException |IllegalAccessException exception) {
            exception.printStackTrace();
        }

    }



    public static final RegistryObject<VillagerProfession> FIRE_WIZARD = VILLAGER_PROFESSIONS.register("fire_wizard",
            () -> new VillagerProfession("fire_wizard", x -> x.get() == KnocksVillagers.FIRE_ALTAR_POI.get(),  x -> x.get() == KnocksVillagers.FIRE_ALTAR_POI.get(), ImmutableSet.of(), ImmutableSet.of(),SoundEvents.VILLAGER_WORK_CLERIC));
    public static final RegistryObject<VillagerProfession> ICE_WIZARD = VILLAGER_PROFESSIONS.register("ice_wizard",
            () -> new VillagerProfession("ice_wizard", x -> x.get() == KnocksVillagers.ICE_ALTAR_POI.get(),  x -> x.get() == KnocksVillagers.ICE_ALTAR_POI.get(), ImmutableSet.of(), ImmutableSet.of(),SoundEvents.VILLAGER_WORK_CLERIC));
    public static final RegistryObject<VillagerProfession> EARTH_WIZARD = VILLAGER_PROFESSIONS.register("earth_wizard",
            () -> new VillagerProfession("earth_wizard", x -> x.get() == KnocksVillagers.EARTH_ALTAR_POI.get(),  x -> x.get() == KnocksVillagers.EARTH_ALTAR_POI.get(), ImmutableSet.of(), ImmutableSet.of(),SoundEvents.VILLAGER_WORK_CLERIC));
    public static final RegistryObject<VillagerProfession> AIR_WIZARD = VILLAGER_PROFESSIONS.register("air_wizard",
            () -> new VillagerProfession("air_wizard", x -> x.get() == KnocksVillagers.AIR_ALTAR_POI.get(),  x -> x.get() == KnocksVillagers.AIR_ALTAR_POI.get(), ImmutableSet.of(), ImmutableSet.of(),SoundEvents.VILLAGER_WORK_CLERIC));
    }
