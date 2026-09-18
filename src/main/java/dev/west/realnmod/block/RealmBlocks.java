package dev.west.realnmod.block;

import dev.west.realnmod.Realm_Mod;
import dev.west.realnmod.block.custom.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class RealmBlocks {

    public static final Block GOATFEED_CROP = registerBlockWithoutBlockItem("goatfeed_crop",
            properties -> new GoatFeedCropBlock(properties.randomTicks().instabreak()
                    .sound(SoundType.CROP).noCollision().pushReaction(PushReaction.DESTROY)));
    public static final Block Gold_WHEAT = registerBlockWithoutBlockItem("gold_wheat",
            properties -> new GoldCropBlock(properties.randomTicks().instabreak()
                    .sound(SoundType.CROP).noCollision().pushReaction(PushReaction.DESTROY)));
    public static final Block DARK_SOUL_WHEAT = registerBlockWithoutBlockItem("dark_soul_wheat",
            properties -> new DarkSoulWheatCropBlock(properties.randomTicks().instabreak()
                    .sound(SoundType.CROP).noCollision().pushReaction(PushReaction.DESTROY)));
    public static final Block BRIGHT_SILVER = registerBlockWithoutBlockItem("bright_silver",
            properties -> new BrightCropBlock(properties.randomTicks().instabreak()
                    .sound(SoundType.CROP).noCollision().pushReaction(PushReaction.DESTROY)));

    //fantasy ore
    public static final Block MITHRIL_GLOW = registerBlock("mithril_glow",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).lightLevel(statex-> 12)));
    public static final Block DARK_SOUL_GLOW = registerBlock("dark_soul_glow",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).lightLevel(statex-> 9)));
    public static final Block GOLD_LIGHT_GLOW = registerBlock("gold_light_glow",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).lightLevel(statex-> 14)));

    //ore
    public static final Block BLACKIRON_ORE = registerBlock("blackiron_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block BLACK_steel_ORE = registerBlock("black_steel_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SUN_ORE = registerBlock("sun_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block GRIZZ_ORE = registerBlock("grizz_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block UBLESE_ORE = registerBlock("ublese_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block TIN_ORE = registerBlock("tin_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRUPT_ORE = registerBlock("crupt_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));



    public static final Block DEEP_SILVER_STONE = registerBlock("deep_silver_stone",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DEEP_SILVER_STONE1 = registerBlock("deep_silver_stone1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));


    //crystals
    public static final Block ANORITE = registerBlock("anorite",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block ANORITE_BLOCK = registerBlock("anorite_block",
            properties -> new Block( properties.noOcclusion().lightLevel(statex-> 15).forceSolidOn()));
    public static final Block BLACKIRON_SHARDS_BLOCK = registerBlock("blackiron_shards_block",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block EVIL_SHARDS = registerBlock("evil_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block MITHRIL_SHARDS = registerBlock("mithril_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block LARGE_MITHRIL_SHARDS = registerBlock("large_mithril_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block MED_MITHRIL_SHARDS = registerBlock("med_mithril_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block BLACK_POSS_SHARDS = registerBlock("black_poss_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block VORYN_SHARDS = registerBlock("voryn_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block RUDY_CRYSTAL = registerBlock("ruby_crystal",
            properties -> new RealmCrystal( properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block SMALL_CRYSTAL = registerBlock("small_crystal",
            properties -> new RealmCrystal( properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block MED1_CRYSTAL = registerBlock("med1_crystal",
            properties -> new RealmCrystal( properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block SYLVARITE = registerBlock("sylvarite",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 17).forceSolidOn()));
    public static final Block SYLVARITE_BLOCK = registerBlock("sylvarite_block",
            properties -> new Block( properties.noOcclusion().lightLevel(statex-> 15).forceSolidOn()));
    public static final Block BERYLUV = registerBlock("beryluv",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 17).forceSolidOn()));
    public static final Block QUARTZON = registerBlock("quartzon",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 17).forceSolidOn()));
    public static final Block DAZZLING_CRYSTAL = registerBlock("dazzling_crystal",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 17).forceSolidOn()));
    public static final Block STARLACE = registerBlock("starlace",
            properties -> new RealmCrystal(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block AZURITE_crystal = registerBlock("azurite_crystal",
            properties -> new RealmCrystal(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block AURORA_crystal = registerBlock("aurora_crystal",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block crystalta_crystal = registerBlock("crystalta_crystal",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block khrot_crystal = registerBlock("khrot_crystal",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));

    //crystal blocks
    public static final Block glizz_BLOCK = registerBlock("glizz_block",
            properties -> new Block( properties.noOcclusion().lightLevel(statex-> 15).forceSolidOn()));
    public static final Block RAMMER_BLOCK = registerBlock("rammer_block",
            properties -> new Block( properties.noOcclusion().lightLevel(statex-> 15).forceSolidOn()));
    public static final Block BEIGE_BLOCK = registerBlock("beige_block",
            properties -> new Block( properties.noOcclusion().lightLevel(statex-> 15).forceSolidOn()));
    public static final Block AURORA_BLOCK = registerBlock("aurora_block",
            properties -> new Block( properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block CRYSTAlTA_BLOCK = registerBlock("crystalta_block",
            properties -> new Block( properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block KHROT_BLOCK = registerBlock("khrot_block",
            properties -> new Block( properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));


      //pillars
    public static final Block LIGHT_MITHRIL_PILLAR_LOG = registerBlock("light_mithril_pillar_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block CRYSTAL_PILLAR_LOG = registerBlock("crystal_pillar_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DARK_PILLAR_LOG = registerBlock("dark_pillar_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block PILLAR_LOG = registerBlock("pillar_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block PILLAR1_LOG = registerBlock("pillar1_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DESERT_PILLAR_LOG = registerBlock("desert_pillar_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));


    //crate
    public static final Block CRATE_LOG = registerBlock("crate_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final Block CRATE1_LOG = registerBlock("crate1_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));



    //rune
    public static final Block PILLAR1_rune_LOG = registerBlock("pillar1_rune_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block PILLAR2_rune_LOG = registerBlock("pillar2_rune_log",
            properties -> new RotatedPillarBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));





    //grass
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            properties -> new GrassBlock(properties.strength(1.0F).mapColor(MapColor.PLANT).lightLevel(statex-> 13).requiresCorrectToolForDrops()));
    public static final Block silver_BLOCK = registerBlock("silver_block",
            properties -> new GrassBlock(properties.strength(1.0F).mapColor(MapColor.PLANT).lightLevel(statex-> 13).requiresCorrectToolForDrops()));
    public static final Block ASH_BLOCK = registerBlock("ash_block",
            properties -> new GrassBlock(properties.strength(1.0F).mapColor(MapColor.PLANT).lightLevel(statex-> 6).requiresCorrectToolForDrops()));
    public static final Block LIGHT_YELLOW_BLOCK = registerBlock("light_yellow_block",
            properties -> new GrassBlock(properties.strength(1.0F).mapColor(MapColor.PLANT).lightLevel(statex-> 13).requiresCorrectToolForDrops()));
    public static final Block DARK_GREEN_BLOCK = registerBlock("dark_green_block",
            properties -> new GrassBlock(properties.strength(1.0F).mapColor(MapColor.PLANT).lightLevel(statex-> 6).requiresCorrectToolForDrops()));
    public static final Block DARK_GLOW_BLOCK = registerBlock("dark_glow_block",
            properties -> new GrassBlock(properties.strength(1.0F).mapColor(MapColor.COLOR_LIGHT_GREEN).lightLevel(statex-> 6).requiresCorrectToolForDrops()));
    public static final Block DARK_GLOM_BLOCK = registerBlock("dark_glom_block",
            properties -> new GrassBlock(properties.strength(1.0F).mapColor(MapColor.COLOR_GREEN).lightLevel(statex-> 8).requiresCorrectToolForDrops()));
    public static final Block LIGHT_GRAY_BLOCK = registerBlock("light_gray_block",
            properties -> new GrassBlock(properties.strength(1.0F).mapColor(MapColor.COLOR_GRAY).lightLevel(statex-> 8).requiresCorrectToolForDrops()));
    public static final Block LIGHT_ORG_BLOCK = registerBlock("light_org_block",
            properties -> new GrassBlock(properties.strength(1.0F).mapColor(MapColor.COLOR_GRAY).lightLevel(statex-> 10).requiresCorrectToolForDrops()));


    //wool
    public static final Block evil_wool = registerBlock("evil_wool",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block moss_wool = registerBlock("moss_wool",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block mithril_wool = registerBlock("mithril_wool",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block mithril_wool_slab = registerBlock("mithril_wool_slab",
            properties -> new SlabBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block med_green_wool = registerBlock("med_green_wool",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block med_green_wool_slab = registerBlock("med_green_wool_slab",
            properties -> new SlabBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block med_green_stairs = registerBlock("med_green_stairs",
            properties -> new StairBlock(RealmBlocks.med_green_wool.defaultBlockState(),
                    properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block dark_star_wool = registerBlock("dark_star_wool",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block dark_under_wool = registerBlock("dark_under_wool",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block dark_under_wool_stairs = registerBlock("dark_under_wool_stairs",
            properties -> new StairBlock(RealmBlocks.dark_under_wool.defaultBlockState(),
                    properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block dark_under_wool_slab = registerBlock("dark_under_wool_slab",
            properties -> new SlabBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block mithril_wool_stairs = registerBlock("mithril_wool_stairs",
            properties -> new StairBlock(RealmBlocks.mithril_wool.defaultBlockState(),
                    properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block mithril_wool_wall = registerBlock("mithril_wool_wall",
            properties -> new WallBlock((properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final Block epic_wool = registerBlock("epic_wool",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block elder_wool = registerBlock("elder_wool",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block woolforge_wool = registerBlock("woolforge_wool",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));



    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }



    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name), function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name)))));
    }



    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Realm_Mod.LOGGER.info("Registering Mod Blocks for " + Realm_Mod.MOD_ID);
    }
}


