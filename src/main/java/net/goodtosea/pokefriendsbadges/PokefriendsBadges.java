package net.goodtosea.pokefriendsbadges;

import com.mojang.logging.LogUtils;
import net.goodtosea.pokefriendsbadges.item.ModCreativeModTabs;
import net.goodtosea.pokefriendsbadges.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PokefriendsBadges.MOD_ID)
public class PokefriendsBadges {
    public static final String MOD_ID = "pokefriendsbadges";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PokefriendsBadges() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.SEARCH) {
            event.accept(ModItems.AEGIS_BADGE);
            event.accept(ModItems.APHID_BADGE);
            event.accept(ModItems.BLIGHT_BADGE);
            event.accept(ModItems.CREST_BADGE);
            event.accept(ModItems.DEWDROP_BADGE);
            event.accept(ModItems.DUSK_BADGE);
            event.accept(ModItems.ESPER_BADGE);
            event.accept(ModItems.FABLE_BADGE);
            event.accept(ModItems.GARDEN_BADGE);
            event.accept(ModItems.GLACIER_BADGE);
            event.accept(ModItems.HARMONY_BADGE);
            event.accept(ModItems.INFERNO_BADGE);
            event.accept(ModItems.MASTER_BADGE);
            event.accept(ModItems.MELEE_BADGE);
            event.accept(ModItems.MYTHOS_BADGE);
            event.accept(ModItems.PHANTOM_BADGE);
            event.accept(ModItems.QUARRY_BADGE);
            event.accept(ModItems.SAND_BADGE);
            event.accept(ModItems.TESLA_BADGE);
            event.accept(ModItems.EEVEE_BADGE);
            event.accept(ModItems.LITTLE_CUP_BADGE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
