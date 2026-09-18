package dev.west.realnmod.block;

import dev.west.realnmod.RealmLayers;
import dev.west.realnmod.Realm_Mod;
import dev.west.realnmod.block.custom.RealmRune;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class RealmLimestone {

    public static final Block red_limestone = registerBlock("red_limestone",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone = registerBlock("limestone",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone1 = registerBlock("limestone1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone2 = registerBlock("limestone2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone3 = registerBlock("limestone3",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone4 = registerBlock("limestone4",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone5 = registerBlock("limestone5",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone6 = registerBlock("limestone6",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone7 = registerBlock("limestone7",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone = registerBlock("aged_limestone",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone1 = registerBlock("aged_limestone1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone2 = registerBlock("aged_limestone2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone3 = registerBlock("aged_limestone3",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone4 = registerBlock("aged_limestone4",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone = registerBlock("light_limestone",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone1 = registerBlock("light_limestone1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone2 = registerBlock("light_limestone2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone2_1 = registerBlock("light_limestone2_1",
            properties -> new SlabBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone2_2 = registerBlock("light_limestone2_2",
            properties -> new FenceBlock(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone_1 = registerBlock("light_limestone_1",
            properties -> new RealmLayers(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone8 = registerBlock("limestone8",
            properties -> new RealmLayers(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone5 = registerBlock("aged_limestone5",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone_3 = registerBlock("aged_limestone_3",
            properties -> new RealmLayers(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone_block = registerBlock("aged_limestone_block",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    public static final Block aged_limestone_spike = registerBlock("aged_limestone_spike",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    public static final Block aged_limestone_small = registerBlock("aged_limestone_small",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    public static final Block aged_limestone_brick = registerBlock("aged_limestone_brick",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone_brick1 = registerBlock("aged_limestone_brick1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone_brick2 = registerBlock("aged_limestone_brick2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone_brick3 = registerBlock("aged_limestone_brick3",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_lime_PIKE = registerBlock("light_lime_pike",
            properties -> new RealmRune(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));




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

