package net.goodtosea.pokefriendsbadges.item;

import net.goodtosea.pokefriendsbadges.PokefriendsBadges;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PokefriendsBadges.MOD_ID);

    public static final RegistryObject<Item> AEGIS_BADGE = ITEMS.register("aegis_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> APHID_BADGE = ITEMS.register("aphid_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLIGHT_BADGE = ITEMS.register("blight_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREST_BADGE = ITEMS.register("crest_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEWDROP_BADGE = ITEMS.register("dewdrop_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUSK_BADGE = ITEMS.register("dusk_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ESPER_BADGE = ITEMS.register("esper_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FABLE_BADGE = ITEMS.register("fable_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARDEN_BADGE = ITEMS.register("garden_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLACIER_BADGE = ITEMS.register("glacier_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARMONY_BADGE = ITEMS.register("harmony_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNO_BADGE = ITEMS.register("inferno_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MASTER_BADGE = ITEMS.register("master_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MELEE_BADGE = ITEMS.register("melee_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MYTHOS_BADGE = ITEMS.register("mythos_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHANTOM_BADGE = ITEMS.register("phantom_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARRY_BADGE = ITEMS.register("quarry_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAND_BADGE = ITEMS.register("sand_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TESLA_BADGE = ITEMS.register("tesla_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EEVEE_BADGE = ITEMS.register("eevee_badge",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
