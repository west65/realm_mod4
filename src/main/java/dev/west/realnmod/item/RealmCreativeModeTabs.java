package dev.west.realnmod.item;

import dev.west.realnmod.Realm_Mod;
import dev.west.realnmod.block.*;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RealmCreativeModeTabs {



    public static final CreativeModeTab FOOD = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"food"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmBlocks.GOATFEED_CROP))
                    .title(Component.translatable("item.realm_food"))
                    .displayItems((parameters, output) -> {
                       output.accept(RealmItems.GOAT_FEED);
                       output.accept(RealmItems.GOLD_SEEDS);
                       output.accept(RealmItems.Dark_Soul_SEED);
                       output.accept(RealmItems.BRIGHT_SILVER_SEED);
                       output.accept(RealmItems.DARK_APPLE);
                       output.accept(RealmItems.SILVER_APPLE);
                       output.accept(RealmItems.MUSHROOM);









                    }).build());

    public static final CreativeModeTab FANTASY = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"fantasy"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmBlocks.MITHRIL_GLOW))
                    .title(Component.translatable("item.realm_fantasy"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmBlocks.MITHRIL_GLOW);
                        output.accept(RealmBlocks.DARK_SOUL_GLOW);
                        output.accept(RealmBlocks.GOLD_LIGHT_GLOW);
                        output.accept(RealmBlocks.RUDY_CRYSTAL);
                        output.accept(RealmBlocks.SMALL_CRYSTAL);
                        output.accept(RealmBlocks.MED1_CRYSTAL);
                        output.accept(RealmBlocks.STARLACE);
                        output.accept(RealmBlocks.AZURITE_crystal);
                        output.accept(RealmBlocks.DEEP_SILVER_STONE);
                        output.accept(RealmBlocks.DEEP_SILVER_STONE1);










                    }).build());

    public static final CreativeModeTab pillar = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"pillar"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmBlocks.LIGHT_MITHRIL_PILLAR_LOG))
                    .title(Component.translatable("item.realm.pillar"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmBlocks.LIGHT_MITHRIL_PILLAR_LOG);
                        output.accept(RealmBlocks.CRYSTAL_PILLAR_LOG);
                        output.accept(RealmBlocks.DARK_PILLAR_LOG);
                        output.accept(RealmBlocks.PILLAR_LOG);
                        output.accept(RealmBlocks.PILLAR1_LOG);
                        output.accept(RealmBlocks.DESERT_PILLAR_LOG);











                    }).build());


    public static final CreativeModeTab crate = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"crate"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmBlocks.CRATE_LOG))
                    .title(Component.translatable("item.realm.crate"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmBlocks.CRATE_LOG);
                        output.accept(RealmBlocks.CRATE1_LOG);











                    }).build());


    public static final CreativeModeTab wool = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"wool"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmBlocks.evil_wool))
                    .title(Component.translatable("item.realm.wool"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmBlocks.elder_wool);
                        output.accept(RealmBlocks.epic_wool);
                        output.accept(RealmBlocks.evil_wool);
                        output.accept(RealmBlocks.moss_wool);
                        output.accept(RealmBlocks.mithril_wool);
                        output.accept(RealmBlocks.mithril_wool_stairs);
                        output.accept(RealmBlocks.mithril_wool_slab);
                        output.accept(RealmBlocks.mithril_wool_wall);
                        output.accept(RealmBlocks.med_green_wool);
                        output.accept(RealmBlocks.med_green_wool_slab);
                        output.accept(RealmBlocks.med_green_stairs);
                        output.accept(RealmBlocks.dark_star_wool);
                        output.accept(RealmBlocks.dark_under_wool);
                        output.accept(RealmBlocks.dark_under_wool_stairs);
                        output.accept(RealmBlocks.woolforge_wool);











                    }).build());

    public static final CreativeModeTab grass = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"grass"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmBlocks.MITHRIL_BLOCK))
                    .title(Component.translatable("item.realm.grass"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmBlocks.MITHRIL_BLOCK);
                        output.accept(RealmBlocks.silver_BLOCK);
                        output.accept(RealmBlocks.ASH_BLOCK);
                        output.accept(RealmBlocks.LIGHT_YELLOW_BLOCK);
                        output.accept(RealmBlocks.DARK_GREEN_BLOCK);
                        output.accept(RealmBlocks.DARK_GLOW_BLOCK);
                        output.accept(RealmBlocks.DARK_GLOM_BLOCK);
                        output.accept(RealmBlocks.LIGHT_GRAY_BLOCK);
                        output.accept(RealmBlocks.LIGHT_ORG_BLOCK);












                    }).build());

    public static final CreativeModeTab MUSHROOM = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"mushroom"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmMushroom.angel_mushroom))
                    .title(Component.translatable("item.realm_mushroom"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmMushroom.angel_mushroom);
                        output.accept(RealmMushroom.marshmoon_mushroom);
                        output.accept(RealmMushroom.dark_soul_mushroom);
                        output.accept(RealmMushroom.poss_mushroom);
                        output.accept(RealmMushroom.silver_mushroom);
                        output.accept(RealmMushroom.mithril_mushroom);
                        output.accept(RealmMushroom.small_MUSHROOM);
                        output.accept(RealmMushroom.med_MUSHROOM);
                        output.accept(RealmMushroom.DEAD_MUSHROOM);
                        output.accept(RealmMushroom.gimmerstalk);
                        output.accept(RealmMushroom.grimcap);










                    }).build());

    public static final CreativeModeTab STONE_BRICK = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"stone_brick"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmStoneBrick.stone_Brick))
                    .title(Component.translatable("item.realm_stone_brick"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmStoneBrick.stone_Brick);
                        output.accept(RealmStoneBrick.stone_Brick1);
                        output.accept(RealmStoneBrick.stone_Brick2);
                        output.accept(RealmStoneBrick.stone_Brick_2_slab);
                        output.accept(RealmStoneBrick.stone_Brick2_1);
                        output.accept(RealmStoneBrick.stone_Brick2_2);
                        output.accept(RealmStoneBrick.stone_Brick_1);
                        output.accept(RealmStoneBrick.stone_Brick_2);
                        output.accept(RealmStoneBrick.stone_Brick_3);
                        output.accept(RealmStoneBrick.stone_Brick_4);
                        output.accept(RealmStoneBrick.stone_Brick_5);
                        output.accept(RealmStoneBrick.stone_Brick_6);
                        output.accept(RealmStoneBrick.stone_Brick_7);
                        output.accept(RealmStoneBrick.stone_Brick_8);
                        output.accept(RealmStoneBrick.stone_Brick_9);
                        output.accept(RealmStoneBrick.stone_Brick_10);
                        output.accept(RealmStoneBrick.stone_Brick_11);
                        output.accept(RealmStoneBrick.stone_Brick_11_slab);









                    }).build());


    public static final CreativeModeTab STONE = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"stone"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmStone.stone))
                    .title(Component.translatable("item.realm_stone"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmStone.ROCK_DEEP_STONE_BRICK);
                        output.accept(RealmStone.ROCK_DEEP_STONE);
                        output.accept(RealmStone.ROCK_DEEP_STONE1);
                        output.accept(RealmStone.kragmor);
                        output.accept(RealmStone.kragmor_slab);
                        output.accept(RealmStone.gloomcaver);
                        output.accept(RealmStone.gorvask_stone);
                        output.accept(RealmStone.AGED_STONE);
                        output.accept(RealmStone.AGED_STONE_SLAB);
                        output.accept(RealmStone.AGED_STONE_1);
                        output.accept(RealmStone.AGED_STONE_BRICK);
                        output.accept(RealmStone.AGED_STONE_BRICK1);
                        output.accept(RealmStone.AGED_STONE_BRICK2);
                        output.accept(RealmStone.WHITE_STONE_1);
                        output.accept(RealmStone.WHITE_STONE);
                        output.accept(RealmStone.stone_block);
                        output.accept(RealmStone.aged_limestone_c);
                        output.accept(RealmStone.red_stone);
                        output.accept(RealmStone.red_stone1);
                        output.accept(RealmStone.stone_age);
                        output.accept(RealmStone.stone_brick_m);
                        output.accept(RealmStone.stone_brick_m1);
                        output.accept(RealmStone.stone_brick4);
                        output.accept(RealmStone.stone_brick5);
                        output.accept(RealmStone.stone1);
                        output.accept(RealmStone.stone2);
                        output.accept(RealmStone.stone3);
                        output.accept(RealmStone.MITHRIL_STONE);
                        output.accept(RealmStone.MITHRIL_STONE1);
                        output.accept(RealmStone.MITHRIL_STONE2);
                        output.accept(RealmStone.MITHRIL_STONE_SLAB);
                        output.accept(RealmStone.MITHRIL_COBBLE);
                        output.accept(RealmStone.MITHRIL_COBBLE1);
                        output.accept(RealmStone.MITHRIL_COBBLE2);
                        output.accept(RealmStone.MITHRIL_COBBLE_SLAB);
                        output.accept(RealmStone.MITHRIL_COBBLE1_SLAB);
                        output.accept(RealmStone.MOSS_FORGE);
                        output.accept(RealmStone.GOLD_COBBLE);
                        output.accept(RealmStone.DARK_SOUL_COBBLE);
                        output.accept(RealmStone.DARK_SOUL_STONE_RUNE);
                        output.accept(RealmStone.BLACKSTONE1);
                        output.accept(RealmStone.BLACKSTONE2);
                        output.accept(RealmStone.BLACK_STONE_BLOCK);
                        output.accept(RealmStone.BLACKSTONE1_STAIR);
                        output.accept(RealmStone.stone);
                        output.accept(RealmStone.stone_1);
                        output.accept(RealmStone.stone_2);
                        output.accept(RealmStone.stone_3);
                        output.accept(RealmStone.stone_4);
                        output.accept(RealmStone.dark_stone);
                        output.accept(RealmStone.dark_stone1);
                        output.accept(RealmStone.dark_stone2);
                        output.accept(RealmStone.deep_stone2);
                        output.accept(RealmStone.dark_stone_slab);
                        output.accept(RealmStone.dark_brick);
                        output.accept(RealmStone.dark_rock);
                        output.accept(RealmStone.dark_rock1);
                        output.accept(RealmStone.dark_rock2);
                        output.accept(RealmStone.DARK_STONE_DEEP);
                        output.accept(RealmStone.DARK_STONE_evil);
                        output.accept(RealmStone.DARK_STONE_DEEP_BRICK);
                        output.accept(RealmStone.DARK_STONE_DEEP_BRICK1);
                        output.accept(RealmStone.DARK_STONE_DEEP1);
                        output.accept(RealmStone.rock_stone);
                        output.accept(RealmStone.rock_stone_s);
                        output.accept(RealmStone.deep_stone);
                        output.accept(RealmStone.dark_stonebrick);
                        output.accept(RealmStone.deep_stone1);
                        output.accept(RealmStone.STONE_ROCK);
                        output.accept(RealmStone.STONE_ROCK1);
                        output.accept(RealmStone.STONE_ROCK2);
                        output.accept(RealmStone.STONE_ROCK2_SLAB);
                        output.accept(RealmStone.STONE_ROCK2_WALL);
                        output.accept(RealmStone.STONE_ROCK2_1);
                        output.accept(RealmStone.STONE_ROCK_n);
                        output.accept(RealmStone.STONE_ROCK_n1);
                        output.accept(RealmStone.STONE_DEEP_ROCK);
                        output.accept(RealmStone.STONE_DEEP_ROCK1);
                        output.accept(RealmStone.STONE_DEEP_ROCK_BRICK);
                        output.accept(RealmStone.STONEBRICK);
                        output.accept(RealmStone.deep_black_stone);
                        output.accept(RealmStone.LAVA_STONE);
                        output.accept(RealmStone.LAVA_STONE_SLAB);
                        output.accept(RealmStone.LAVA_STONE_FENCE);
                        output.accept(RealmStone.LAVA_STONE_1);









                    }).build());








    public static final CreativeModeTab ITEM = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"item"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmItems.BLACKIRON))
                    .title(Component.translatable("item.realm_Item"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmItems.AURORA_INGOT);
                        output.accept(RealmItems.BLACKIRON);
                        output.accept(RealmItems.MITHRIL_INGOT);
                        output.accept(RealmItems.SILVER_INGOT);
                        output.accept(RealmItems.SUN_INGOT);
                        output.accept(RealmItems.GRIZZ_INGOT);
                        output.accept(RealmItems.BLAZE_INGOT);
                        output.accept(RealmItems.MAGIC_INGOT);
                        output.accept(RealmItems.MARINE_INGOT);
                        output.accept(RealmItems.DARK_INGOT);
                        output.accept(RealmItems.UBLESE_INGOT);
                        output.accept(RealmItems.TIN_INGOT);
                        output.accept(RealmItems.CRUPT_INGOT);
                        output.accept(RealmItems.MITHRIL_RUNE_1);
                        output.accept(RealmItems.FIRE_RUNE);
                        output.accept(RealmItems.BLACK_RUNE_EVIL);
                        output.accept(RealmItems.SILVER_RUNE_1);
                        output.accept(RealmItems.BLACK_STEEL);
                        output.accept(RealmItems.Silver_hammer);









                    }).build());


    public static final CreativeModeTab limestone = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"limestone"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmLimestone.red_limestone))
                    .title(Component.translatable("item.realm_limestone"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmLimestone.dark_limestone_brick);
                        output.accept(RealmLimestone.dark_limestone);
                        output.accept(RealmLimestone.dark_silver_limestone);
                        output.accept(RealmLimestone.dark_silver_limestone_brick);
                        output.accept(RealmLimestone.old_limestone);
                        output.accept(RealmLimestone.old_limestone1);
                        output.accept(RealmLimestone.old_limestone_brick);
                        output.accept(RealmLimestone.old_limestone_brick_slab);
                        output.accept(RealmLimestone.red_limestone);
                        output.accept(RealmLimestone.red_limestone1);
                        output.accept(RealmLimestone.red_limestone2);
                        output.accept(RealmLimestone.red_limestone2_slab);
                        output.accept(RealmLimestone.red_limestone_brick);
                        output.accept(RealmLimestone.red_limestone_brick1);
                        output.accept(RealmLimestone.red_limestone_brick_slab);
                        output.accept(RealmLimestone.red_limestone_brick_wall);
                        output.accept(RealmLimestone.red_deep_limestone);
                        output.accept(RealmLimestone.red_deep_limestone_brick);
                        output.accept(RealmLimestone.light_limestone);
                        output.accept(RealmLimestone.light_limestone1);
                        output.accept(RealmLimestone.light_limestone2);
                        output.accept(RealmLimestone.light_limestone3);
                        output.accept(RealmLimestone.light_limestone4);
                        output.accept(RealmLimestone.light_limestone5);
                        output.accept(RealmLimestone.light_limestone_brick);
                        output.accept(RealmLimestone.light_limestone2_1);
                        output.accept(RealmLimestone.light_limestone2_2);
                        output.accept(RealmLimestone.light_lime_PIKE);
                        output.accept(RealmLimestone.limestone);
                        output.accept(RealmLimestone.limestone1);
                        output.accept(RealmLimestone.limestone2);
                        output.accept(RealmLimestone.limestone3);
                        output.accept(RealmLimestone.limestone4);
                        output.accept(RealmLimestone.limestone5);
                        output.accept(RealmLimestone.limestone6);
                        output.accept(RealmLimestone.limestone7);
                        output.accept(RealmLimestone.limestone8);
                        output.accept(RealmLimestone.limestone_8_slab);
                        output.accept(RealmLimestone.limestone9);
                        output.accept(RealmLimestone.limestone_brick);
                        output.accept(RealmLimestone.aged_limestone);
                        output.accept(RealmLimestone.aged_limestone1);
                        output.accept(RealmLimestone.aged_limestone2);
                        output.accept(RealmLimestone.aged_limestone3);
                        output.accept(RealmLimestone.aged_limestone4);
                        output.accept(RealmLimestone.aged_limestone5);
                        output.accept(RealmLimestone.aged_limestone_3);
                        output.accept(RealmLimestone.aged_limestone_brick);
                        output.accept(RealmLimestone.aged_limestone_brick1);
                        output.accept(RealmLimestone.aged_limestone_brick2);
                        output.accept(RealmLimestone.aged_limestone_brick3);
                        output.accept(RealmLimestone.aged_limestone_brick4);
                        output.accept(RealmLimestone.aged_limestone_block);
                        output.accept(RealmLimestone.aged_limestone_spike);
                        output.accept(RealmLimestone.aged_limestone_small);
                        output.accept(RealmLimestone.light_limestone_1);









                    }).build());



    public static final CreativeModeTab GRANITE = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"granite"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmGranite.granite_rock))
                    .title(Component.translatable("item.realm_granite"))
                    .displayItems((parameters, output) -> {
                       output.accept(RealmGranite.granite_rock);
                       output.accept(RealmGranite.granite_rock1);
                       output.accept(RealmGranite.granite_rock2);
                       output.accept(RealmGranite.granite2_2);
                       output.accept(RealmGranite.granite2_1);
                       output.accept(RealmGranite.granite);
                       output.accept(RealmGranite.granite1);
                       output.accept(RealmGranite.granite2);
                       output.accept(RealmGranite.granite3);
                       output.accept(RealmGranite.granite4);
                       output.accept(RealmGranite.granite5);
                       output.accept(RealmGranite.granite6);
                       output.accept(RealmGranite.granite5_fence);
                       output.accept(RealmGranite.Granite5_slab);








                    }).build());


    public static final CreativeModeTab chalk = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"chalk"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmChalk.chalk))
                    .title(Component.translatable("item.realm_chalk"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmChalk.chalk);
                        output.accept(RealmChalk.chalk1);
                        output.accept(RealmChalk.chalk2);
                        output.accept(RealmChalk.chalk3);
                        output.accept(RealmChalk.chalk4);
                        output.accept(RealmChalk.chalk4_s);
                        output.accept(RealmChalk.chalk4_s1);
                        output.accept(RealmChalk.chalk1_2);
                        output.accept(RealmChalk.chalk_3);
                        output.accept(RealmChalk.chalk1_3);
                        output.accept(RealmChalk.chalk0_3);









                    }).build());
    public static final CreativeModeTab DESERT = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"desert"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmDesert.desert_stone))
                    .title(Component.translatable("item.realm_desert"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmDesert.desert_stone);
                        output.accept(RealmDesert.desert_stone1);
                        output.accept(RealmDesert.desert_stone2);
                        output.accept(RealmDesert.desert_stone3);
                        output.accept(RealmDesert.desert_stone4);
                        output.accept(RealmDesert.desert_stone_rock);
                        output.accept(RealmDesert.desert_stone_rock1);
                        output.accept(RealmDesert.desert_rock);
                        output.accept(RealmDesert.desert_rock1);
                        output.accept(RealmDesert.desert_rock2);
                        output.accept(RealmDesert.desert_rock1_c);
                        output.accept(RealmDesert.desert_rock2_c);










                    }).build());

    public static final CreativeModeTab rhyolite = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"rhyolite"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmRhyolite.rhyolite))
                    .title(Component.translatable("item.realm_rhyolite"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmRhyolite.rhyolite);
                        output.accept(RealmRhyolite.rhyolite1);
                        output.accept(RealmRhyolite.rhyolite1_c);











                    }).build());


    public static final CreativeModeTab RUNES = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"runes"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(Realm_Ruins.MITHRIL_RUNE))
                    .title(Component.translatable("item.realm_runes"))
                    .displayItems((parameters, output) -> {
                        output.accept(Realm_Ruins.MITHRIL_RUNE);
                        output.accept(Realm_Ruins.MITHRIL_RUNE1);
                        output.accept(Realm_Ruins.SILVER_RUNE);
                        output.accept(Realm_Ruins.DARK_RUNE);
                        output.accept(Realm_Ruins.DARK_RUNE1);
                        output.accept(Realm_Ruins.EVIL_RUNE);
                        output.accept(Realm_Ruins.EVIL_RUNE1);
                        output.accept(Realm_Ruins.DARK_EVIL_RUNE);
                        output.accept(Realm_Ruins.STONE_RUNE);
                        output.accept(Realm_Ruins.DEEP_STONE_RUNE);
                       output.accept(Realm_Ruins.LIGHT_BIRCH_LOG_RUNE);
                       output.accept(Realm_Ruins.BIRCH_LOG_RUNE);
                       output.accept(Realm_Ruins.DEEPSLATE_RUNE);
                       output.accept(Realm_Ruins.DEEPSLATE_RUNE1);
                       output.accept(Realm_Ruins.DEEPSLATE_RUNE2);
                       output.accept(RealmBlocks.PILLAR1_rune_LOG);
                       output.accept(RealmBlocks.PILLAR2_rune_LOG);









                    }).build());


    public static final CreativeModeTab TUFF = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"tuff"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmTuff.tuff_brick))
                    .title(Component.translatable("item.realm_tuff"))
                    .displayItems((parameters, output) -> {
                        output.accept(RealmTuff.tuff_brick);
                        output.accept(RealmTuff.tuff_brick1);
                        output.accept(RealmTuff.tuff_brick2);
                        output.accept(RealmTuff.tuff_brick3);
                        output.accept(RealmTuff.tuff_brick4);
                        output.accept(RealmTuff.tuff1);
                        output.accept(RealmTuff.tuff2);
                        output.accept(RealmTuff.tuff3);









                    }).build());



    public static final CreativeModeTab ORE = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"ore"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(RealmBlocks.MITHRIL_ORE))
                    .title(Component.translatable("item.realm_ore"))
                    .displayItems((parameters, output) -> {
                      output.accept(RealmBlocks.MITHRIL_ORE);
                      output.accept(RealmBlocks.ANORITE_BLOCK);
                      output.accept(RealmBlocks.ANORITE);
                      output.accept(RealmBlocks.BLACKIRON_SHARDS_BLOCK);
                      output.accept(RealmBlocks.EVIL_SHARDS);
                      output.accept(RealmBlocks.SILVER_ORE);
                      output.accept(RealmBlocks.MITHRIL_SHARDS);
                      output.accept(RealmBlocks.LARGE_MITHRIL_SHARDS);
                      output.accept(RealmBlocks.MED_MITHRIL_SHARDS);
                      output.accept(RealmBlocks.BLACK_POSS_SHARDS);
                      output.accept(RealmBlocks.VORYN_SHARDS);
                      output.accept(RealmBlocks.SUN_ORE);
                      output.accept(RealmBlocks.BLACKIRON_ORE);
                      output.accept(RealmBlocks.GRIZZ_ORE);
                      output.accept(RealmBlocks.UBLESE_ORE);
                      output.accept(RealmBlocks.TIN_ORE);
                      output.accept(RealmBlocks.CRUPT_ORE);
                      output.accept(RealmBlocks.BLACK_steel_ORE);
                      output.accept(RealmBlocks.SYLVARITE);
                      output.accept(RealmBlocks.SYLVARITE_BLOCK);
                      output.accept(RealmBlocks.glizz_BLOCK);
                      output.accept(RealmBlocks.RAMMER_BLOCK);
                      output.accept(RealmBlocks.BEIGE_BLOCK);
                      output.accept(RealmBlocks.AURORA_BLOCK);
                      output.accept(RealmBlocks.AURORA_crystal);
                      output.accept(RealmBlocks.CRYSTAlTA_BLOCK);
                      output.accept(RealmBlocks.crystalta_crystal);
                      output.accept(RealmBlocks.BERYLUV);
                      output.accept(RealmBlocks.QUARTZON);
                      output.accept(RealmBlocks.DAZZLING_CRYSTAL);
                      output.accept(RealmBlocks.KHROT_BLOCK);
                      output.accept(RealmBlocks.khrot_crystal);








                    }).build());

    public static final CreativeModeTab LOG = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID,"log"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(Realm_logs.WHITE_PINE_LOG))
                    .title(Component.translatable("item.realm_logs"))
                    .displayItems((parameters, output) -> {
                        output.accept(Realm_logs.ANCIENT_OAK_LEAVES);
                        output.accept(Realm_logs.ANCIENT_OAK_log);
                        output.accept(Realm_logs.STARFALL_LEAVES);
                        output.accept(Realm_logs.STARFALL_log);
                        output.accept(Realm_logs.cedarbrook_log);
                        output.accept(Realm_logs.BRAMBLEGROVE_LOG);
                        output.accept(Realm_logs.OBANT_LOG);
                        output.accept(Realm_logs.FOXGLOVE_LOG);
                        output.accept(Realm_logs.CORRUPT_BEECH_LOG);
                        output.accept(Realm_logs.CORRUPT_BEECH_LEAVES);
                        output.accept(Realm_logs.MAPLEHAVEN_LOG);
                        output.accept(Realm_logs.WILLOW_BLOOM_LOG);
                        output.accept(Realm_logs.WILLOW_BLOOM_LEAVES);
                        output.accept(Realm_logs.sorcerers_OAK_LOG);
                        output.accept(Realm_logs.SILVER_OAK_LOG);
                        output.accept(Realm_logs.URBAN_LOG);
                        output.accept(Realm_logs.SPUS_LOG);
                        output.accept(Realm_logs.GRIM_BIRCH_LOG);
                        output.accept(Realm_logs.BLUE_SPRUCE_LOG);
                        output.accept(Realm_logs.WHITE_PINE_LOG);
                        output.accept(Realm_logs.RED_WOOD_LOG);
                        output.accept(Realm_logs.MOSS_OAK_LOG);
                        output.accept(Realm_logs.MITHRIL_LOG);
                        output.accept(Realm_logs.CRYSTAL_OAK_LOG);
                        output.accept(Realm_logs.WHITE_OAK_LOG);
                        output.accept(Realm_logs.ALDER_LOG);
                        output.accept(Realm_logs.DARK_SOUL_LOG);
                        output.accept(Realm_logs.LIGHT_BIRCH_LOG);
                        output.accept(Realm_logs.ESWELL_BIRCH_LOG);
                        output.accept(Realm_logs.ESWELL_LEAVES);
                        output.accept(Realm_logs.ESWELL_BIRCH_LEAVES);
                        output.accept(Realm_logs.ESWELL_BIRCH_PLANKS);
                        output.accept(Realm_logs.ESWELL_BIRCH_WALL);
                        output.accept(Realm_logs.ESWELL_BIRCH_FENCE);
                        output.accept(Realm_logs.GOLD_SHADOW_LOG);
                        output.accept(Realm_logs.VEIL_WOOD_LOG);
                        output.accept(Realm_logs.DARK_SOUL_PLANKS);
                        output.accept(Realm_logs.DARK_SOUL_STAIRS);
                        output.accept(Realm_logs.SUN_OAK_LOG);
                        output.accept(Realm_logs.SUN_OAK_PLANKS);
                        output.accept(Realm_logs.SUN_OAK_FENCE);
                        output.accept(Realm_logs.BLOOD_OAK_LOG);
                        output.accept(Realm_logs.BLOOD_oak_LEAVES);
                        output.accept(Realm_logs.WINTER_OAK_PLANKS);
                        output.accept(Realm_logs.WINTER_OAK_FENCE);
                        output.accept(Realm_logs.WINTER_OAK_wall);
                        output.accept(Realm_logs.WINTER_OAK_LOG);
                        output.accept(Realm_logs.ASH_OAK_LOG);
                        output.accept(Realm_logs.ASH_BIRCH_LOG);
                        output.accept(Realm_logs.WINTER_OAK_LEAVES);
                        output.accept(Realm_logs.DARK_SOUL_LEAVES);
                        output.accept(Realm_logs.SUN_OAK_LEAVES);
                        output.accept(Realm_logs.MITHRIL_LEAVES);
                        output.accept(Realm_logs.WHITE_PINE_LEAVES);
                        output.accept(Realm_logs.WINTER_BIRCH_LOG);
                        output.accept(Realm_logs.HOLLOW_ELbER_LOG);
                        output.accept(Realm_logs.ANGEL_BIRCH_LOG);
                        output.accept(Realm_logs.BURN_BIRCH_LOG);
                        output.accept(Realm_logs.BURN_BIRCH_PLANKS);
                        output.accept(Realm_logs.BURN_BIRCH_fence);
                        output.accept(Realm_logs.BURN_BIRCH_WALL);
                        output.accept(Realm_logs.BURN_BIRCH_SLAB);
                        output.accept(Realm_logs.THUNDER_OAK_LOG);
                        output.accept(Realm_logs.ORG_WILLOW_LOG);
                        output.accept(Realm_logs.STARBLOOM_LOG);
                        output.accept(Realm_logs.MOONSHADE_BIRCH_LOG);
                        output.accept(Realm_logs.SHADOW_BIRCH_LOG);
                        output.accept(Realm_logs.SHADOW_birch_LEAVES);
                        output.accept(Realm_logs.SHADOW_PINE_LOG);
                        output.accept(Realm_logs.SHADOW_PINE_PLANKS);
                        output.accept(Realm_logs.SHADOW_PINE_FENCE);
                        output.accept(Realm_logs.SHADOW_EYE_PINE_LOG);
                        output.accept(Realm_logs.DARK_SOUL_LOG_CHAIN);
                        output.accept(Realm_logs.EMBERIAR_LOG);
                        output.accept(Realm_logs.MISTWOOD_LOG);
                        output.accept(Realm_logs.DEEPCORE_LOG);
                        output.accept(Realm_logs.elderwell_log);










                    }).build());


    public static void registerCreativeModeTabs() {
        Realm_Mod.LOGGER.info("Registering Creative Mode Tabs for " + Realm_Mod.MOD_ID);
    }
}

