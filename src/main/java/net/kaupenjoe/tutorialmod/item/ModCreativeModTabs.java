package net.kaupenjoe.tutorialmod.item;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BADGE_TAB = CREATIVE_MODE_TABS.register("badge_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MASTER_BADGE.get()))
                    .title(Component.translatable("creativetab.badge_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AEGIS_BADGE.get());
                        pOutput.accept(ModItems.APHID_BADGE.get());
                        pOutput.accept(ModItems.BLIGHT_BADGE.get());
                        pOutput.accept(ModItems.CREST_BADGE.get());
                        pOutput.accept(ModItems.DEWDROP_BADGE.get());
                        pOutput.accept(ModItems.DUSK_BADGE.get());
                        pOutput.accept(ModItems.ESPER_BADGE.get());
                        pOutput.accept(ModItems.FABLE_BADGE.get());
                        pOutput.accept(ModItems.GARDEN_BADGE.get());
                        pOutput.accept(ModItems.GLACIER_BADGE.get());
                        pOutput.accept(ModItems.HARMONY_BADGE.get());
                        pOutput.accept(ModItems.INFERNO_BADGE.get());
                        pOutput.accept(ModItems.MASTER_BADGE.get());
                        pOutput.accept(ModItems.MELEE_BADGE.get());
                        pOutput.accept(ModItems.MYTHOS_BADGE.get());
                        pOutput.accept(ModItems.QUARRY_BADGE.get());
                        pOutput.accept(ModItems.SAND_BADGE.get());
                        pOutput.accept(ModItems.TESLA_BADGE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
