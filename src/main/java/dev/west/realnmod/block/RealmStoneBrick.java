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
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class RealmStoneBrick {




    public static final Block stone_Brick = registerBlock("stone_brick",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick1 = registerBlock("stone_brick1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick2 = registerBlock("stone_brick2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick2_1 = registerBlock("stone_brick2_1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick2_2 = registerBlock("stone_brick2_2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_1 = registerBlock("stone_brick_1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_2 = registerBlock("stone_brick_2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_3 = registerBlock("stone_brick_3",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_4 = registerBlock("stone_brick_4",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_5 = registerBlock("stone_brick_5",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_6 = registerBlock("stone_brick_6",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_7 = registerBlock("stone_brick_7",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_8 = registerBlock("stone_brick_8",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_9 = registerBlock("stone_brick_9",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_9_slab = registerBlock("stone_brick_9_slab",
            properties -> new SlabBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_10 = registerBlock("stone_brick_10",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_11 = registerBlock("stone_brick_11",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_11_slab = registerBlock("stone_brick_11_slab",
            properties -> new SlabBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block stone_Brick_2_slab = registerBlock("stone_brick_2_slab",
            properties -> new SlabBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));






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