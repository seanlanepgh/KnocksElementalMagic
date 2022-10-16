package io.github.seanlanepgh.knockselementalmagic.core;

import io.github.seanlanepgh.knockselementalmagic.KnocksElementalMagic;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.entity.AirAltarBlockEntity;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.entity.EarthAltarBlockEntity;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.entity.FireAltarBlockEntity;
import io.github.seanlanepgh.knockselementalmagic.core.blocks.entity.IceAltarBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KnocksBlockEntityTypes {

    public static final DeferredRegister<BlockEntityType<?>> BLOCKS_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
            KnocksElementalMagic.MODID);

    public static final RegistryObject<BlockEntityType<FireAltarBlockEntity>> FIRE_ALTAR = BLOCKS_ENTITIES.register("fire_altar",
            () -> BlockEntityType.Builder.of(FireAltarBlockEntity::new,KnocksBlocks.FIRE_ALTAR.get()).build(null));
    public static final RegistryObject<BlockEntityType<IceAltarBlockEntity>> ICE_ALTAR = BLOCKS_ENTITIES.register("ice_altar",
            () -> BlockEntityType.Builder.of(IceAltarBlockEntity::new,KnocksBlocks.ICE_ALTAR.get()).build(null));
    public static final RegistryObject<BlockEntityType<EarthAltarBlockEntity>> EARTH_ALTAR = BLOCKS_ENTITIES.register("earth_altar",
            () -> BlockEntityType.Builder.of(EarthAltarBlockEntity::new,KnocksBlocks.EARTH_ALTAR.get()).build(null));
    public static final RegistryObject<BlockEntityType<AirAltarBlockEntity>> AIR_ALTAR = BLOCKS_ENTITIES.register("air_altar",
            () -> BlockEntityType.Builder.of(AirAltarBlockEntity::new,KnocksBlocks.AIR_ALTAR.get()).build(null));
    public static void register(IEventBus eventBus){
        BLOCKS_ENTITIES.register(eventBus);
    }
}
