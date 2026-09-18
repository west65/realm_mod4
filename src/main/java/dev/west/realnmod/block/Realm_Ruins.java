package dev.west.realnmod.block;

import dev.west.realnmod.Realm_Mod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class Realm_Ruins {



    //RUNES
    public static final Block MITHRIL_RUNE = registerBlock("mithril_rune",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block MITHRIL_RUNE1 = registerBlock("mithril_rune1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SILVER_RUNE = registerBlock("silver_rune",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DARK_RUNE = registerBlock("dark_rune",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DARK_RUNE1 = registerBlock("dark_rune1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block EVIL_RUNE = registerBlock("evil_rune",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block EVIL_RUNE1 = registerBlock("evil_rune1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DARK_EVIL_RUNE = registerBlock("dark_evil_rune",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block STONE_RUNE = registerBlock("stone_rune",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DEEP_STONE_RUNE = registerBlock("deep_stone_rune",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block LIGHT_BIRCH_LOG_RUNE = registerBlock("light_birch_log_rune",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BIRCH_LOG_RUNE = registerBlock("birch_log_rune",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block DEEPSLATE_RUNE = registerBlock("deepslate_rune",
            properties -> new Block(properties.mapColor(MapColor.STONE).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block DEEPSLATE_RUNE1 = registerBlock("deepslate_rune1",
            properties -> new Block(properties.mapColor(MapColor.STONE).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block DEEPSLATE_RUNE2 = registerBlock("deepslate_rune2",
            properties -> new Block(properties.mapColor(MapColor.STONE).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));



    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
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
