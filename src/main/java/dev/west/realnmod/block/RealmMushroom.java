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
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class RealmMushroom {





    public static final Block angel_mushroom = registerBlock("angel_mushroom",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).lightLevel(state -> 10)));
    public static final Block marshmoon_mushroom = registerBlock("marshmoon_mushroom",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).lightLevel(state -> 8)));
    public static final Block dark_soul_mushroom = registerBlock("dark_soul_mushroom",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).lightLevel(state -> 8)));
    public static final Block poss_mushroom = registerBlock("poss_mushroom",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).lightLevel(state -> 8)));
    public static final Block silver_mushroom = registerBlock("silver_mushroom",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).lightLevel(state -> 8)));
    public static final Block mithril_mushroom = registerBlock("mithril_mushroom",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).lightLevel(state -> 8)));
    public static final Block small_MUSHROOM = registerBlock("small_mushroom",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).lightLevel(state -> 8).noOcclusion()));
    public static final Block med_MUSHROOM = registerBlock("med_mushroom",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).lightLevel(state -> 8).noOcclusion()));
    public static final Block DEAD_MUSHROOM = registerBlock("dead_mushroom",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).noOcclusion()));
    public static final Block gimmerstalk = registerBlock("gimmerstalk",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).noOcclusion()));
    public static final Block grimcap = registerBlock("grimcap",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).noOcclusion().lightLevel(state -> 10)));




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
