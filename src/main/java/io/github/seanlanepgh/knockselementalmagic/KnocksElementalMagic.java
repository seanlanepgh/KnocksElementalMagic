package io.github.seanlanepgh.knockselementalmagic;

import com.mojang.logging.LogUtils;
import io.github.seanlanepgh.knockselementalmagic.core.*;
import io.github.seanlanepgh.knockselementalmagic.feature.KnocksConfiguredFeatures;
import io.github.seanlanepgh.knockselementalmagic.feature.KnocksPlacedFeatures;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(KnocksElementalMagic.MODID)
public class KnocksElementalMagic
{
    // Define mod id in a common place for everything to reference
    public static KnocksElementalMagic instance;
    public static final String MODID = "knockselementalmagic";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
//    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
//    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
//    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
//    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
//    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
//    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public KnocksElementalMagic()
    {
        instance = this;
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
       // BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        KnocksParticles.PARTICLES.register(modEventBus);
        KnocksBlocks.BLOCKS.register(modEventBus);
        KnocksBlockEntityTypes.BLOCKS_ENTITIES.register(modEventBus);
        KnocksItems.ITEMS.register(modEventBus);
        KnocksEnchantments.ENCHANTMENTS.register(modEventBus);
        KnocksEntityTypes.ENTITY_TYPES.register(modEventBus);
        KnocksVillagers.register(modEventBus);
        KnocksConfiguredFeatures.register(modEventBus);
        KnocksPlacedFeatures.register(modEventBus);
        GeckoLib.initialize();
        // Register ourselves for server and other game events we are interested in

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            KnocksVillagers.registerPOIs();
        });
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());

          // EntityRenderers.register(KnocksEntityTypes.BLIZZ.get(), BlizzRenderer::new);
        }
    }
}
