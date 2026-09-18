package dev.west.realnmod.item;

import dev.west.realnmod.Realm_Mod;
import dev.west.realnmod.block.RealmBlocks;
import dev.west.realnmod.food.RealmFood;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;


import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;


import java.util.function.Function;

public class RealmItems {



    //ingots
    public static final Item BLACKIRON = registerItem("blackiron", Item::new);
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", Item::new);
    public static final Item SILVER_INGOT = registerItem("silver_ingot", Item::new);
    public static final Item SUN_INGOT = registerItem("sun_ingot", Item::new);
    public static final Item GRIZZ_INGOT = registerItem("grizz_ingot", Item::new);
    public static final Item BLAZE_INGOT = registerItem("blaze_ingot", Item::new);
    public static final Item MAGIC_INGOT = registerItem("magic_ingot", Item::new);
    public static final Item MARINE_INGOT = registerItem("marine_ingot", Item::new);
    public static final Item DARK_INGOT = registerItem("dark_ingot", Item::new);
    public static final Item UBLESE_INGOT = registerItem("ublese_ingot", Item::new);
    public static final Item TIN_INGOT = registerItem("tin_ingot", Item::new);
    public static final Item CRUPT_INGOT = registerItem("crupt_ingot", Item::new);
    public static final Item BLACK_STEEL = registerItem("black_steel", Item::new);
    public static final Item AURORA_INGOT = registerItem("aurora_ingot", Item::new);


    //wheat
    public static final Item GOAT_FEED = registerItem("goat_feed",
            properties -> new BlockItem(RealmBlocks.GOATFEED_CROP, properties.useItemDescriptionPrefix()));
    public static final Item GOLD_SEEDS = registerItem("gold_seeds",
            properties -> new BlockItem(RealmBlocks.Gold_WHEAT, properties.useItemDescriptionPrefix()));
    public static final Item Dark_Soul_SEED = registerItem("dark_soul_seed",
            properties -> new BlockItem(RealmBlocks.DARK_SOUL_WHEAT, properties.useItemDescriptionPrefix()));
    public static final Item BRIGHT_SILVER_SEED = registerItem("bright_silver_seed",
            properties -> new BlockItem(RealmBlocks.BRIGHT_SILVER, properties.useItemDescriptionPrefix()));


    //food
    public static final Item DARK_APPLE = registerItem("dark_apple", properties -> new Item(properties
            .food(RealmFood.DARK_APPLE, RealmFood.DARK_APPLE_CONSUMABLE)));
    public static final Item SILVER_APPLE = registerItem("silver_apple", properties -> new Item(properties
            .food(RealmFood.SILVER_APPLE, RealmFood.SILVER_APPLE_CONSUMABLE)));
    public static final Item MUSHROOM = registerItem("mushroom", properties -> new Item(properties
            .food(RealmFood.MUSHROOM, RealmFood.MUSHROOM_CONSUMABLE)));




    //runes
    public static final Item MITHRIL_RUNE_1 = registerItem("mithril_rune_1", Item::new);
    public static final Item FIRE_RUNE = registerItem("fire_rune", Item::new);
    public static final Item BLACK_RUNE_EVIL = registerItem("black_rune_evil", Item::new);
    public static final Item SILVER_RUNE_1 = registerItem("silver_rune_1", Item::new);


    //tools
    public static final  Item Silver_hammer = registerItem("silver_hammer", Item::new);

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name)))));
    }


    public static void registerModItems() {
        Realm_Mod.LOGGER.info("Registering Mod Items for " + Realm_Mod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {

        });
    }
}