package dev.west.realnmod.block;

import dev.west.realnmod.Realm_Mod;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
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

public class Realm_logs {



    public static final Block MAPLEHAVEN_LOG = registerBlock("maplehaven_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WILLOW_BLOOM_LOG = registerBlock("willow_bloom_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block sorcerers_OAK_LOG = registerBlock("sorcerers_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SILVER_OAK_LOG = registerBlock("silver_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BLUE_SPRUCE_LOG = registerBlock("blue_spruce_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WHITE_PINE_LOG = registerBlock("white_pine_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block MOSS_OAK_LOG = registerBlock("moss_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block MITHRIL_LOG = registerBlock("mithril_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GOLDEN_PINE_LOG = registerBlock("golden_pine_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block CRYSTAL_OAK_LOG = registerBlock("crystal_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WHITE_OAK_LOG = registerBlock("white_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block DARK_SOUL_LOG = registerBlock("dark_soul_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SUN_OAK_LOG = registerBlock("sun_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BLOOD_OAK_LOG = registerBlock("blood_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block DARK_SOUL_PLANKS = registerBlock("dark_soul_planks",
            properties -> new Block(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block DARK_SOUL_STAIRS = registerBlock("dark_soul_stairs",
            properties -> new StairBlock(Realm_logs.DARK_SOUL_PLANKS.defaultBlockState(),
                    properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block SUN_OAK_PLANKS = registerBlock("sun_oak_planks",
            properties -> new Block(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SUN_OAK_FENCE = registerBlock("sun_oak_fence",
            properties -> new FenceBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WINTER_OAK_PLANKS = registerBlock("winter_oak_planks",
            properties -> new Block(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WINTER_OAK_LOG = registerBlock("winter_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ASH_OAK_LOG = registerBlock("ash_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WINTER_OAK_LEAVES = registerBlock("winter_oak_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_LIGHT_BLUE).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block DARK_SOUL_LEAVES = registerBlock("dark_soul_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_LIGHT_BLUE).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block SUN_OAK_LEAVES = registerBlock("sun_oak_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_YELLOW).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block MITHRIL_LEAVES = registerBlock("mithril_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_BLUE).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block WHITE_PINE_LEAVES = registerBlock("white_pine_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_GRAY).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block ANGEL_BIRCH_LOG = registerBlock("angel_birch_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BURN_BIRCH_LOG = registerBlock("burn_birch_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BURN_BIRCH_PLANKS = registerBlock("burn_birch_planks",
            properties -> new Block(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BURN_BIRCH_WALL = registerBlock("burn_birch_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BURN_BIRCH_SLAB = registerBlock("burn_birch_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BURN_BIRCH_fence = registerBlock("burn_birch_fence",
            properties -> new FenceBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block THUNDER_OAK_LOG = registerBlock("thunder_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block MOONSHADE_BIRCH_LOG = registerBlock("moonshade_birch_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block LIGHT_BIRCH_LOG = registerBlock("light_birch_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GRIM_BIRCH_LOG = registerBlock("grim_birch_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SPUS_LOG = registerBlock("spus_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block URBAN_LOG = registerBlock("urban_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ESWELL_BIRCH_LOG = registerBlock("eswell_birch_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GOLD_SHADOW_LOG = registerBlock("gold_shadow_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VEIL_WOOD_LOG = registerBlock("veil_wood_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block EMBERIAR_LOG = registerBlock("emberiar_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block MISTWOOD_LOG = registerBlock("mistwood_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block DEEPCORE_LOG = registerBlock("deepcore_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SHADOW_BIRCH_LOG = registerBlock("shadow_birch_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block DARK_SOUL_LOG_CHAIN = registerBlock("dark_soul_log_chain",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ORG_WILLOW_LOG = registerBlock("org_willow_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block STARBLOOM_LOG = registerBlock("starbloom_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ALDER_LOG = registerBlock("alder_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SHADOW_PINE_LOG = registerBlock("shadow_pine_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block RED_WOOD_LOG = registerBlock("red_wood_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SHADOW_PINE_PLANKS = registerBlock("shadow_pine_planks",
            properties -> new Block(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SHADOW_PINE_FENCE = registerBlock("shadow_pine_fence",
            properties -> new FenceBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SHADOW_EYE_PINE_LOG = registerBlock("shadow_eye_pine_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WINTER_BIRCH_LOG = registerBlock("winter_birch_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block HOLLOW_ELbER_LOG = registerBlock("hollow_elber_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ESWELL_LEAVES = registerBlock("eswell_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_RED).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block SHADOW_birch_LEAVES = registerBlock("shadow_birch_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_RED).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block BLOOD_oak_LEAVES = registerBlock("blood_oak_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_RED).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block ASH_BIRCH_LOG = registerBlock("ash_birch_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WINTER_OAK_FENCE = registerBlock("winter_oak_fence",
            properties -> new FenceBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WINTER_OAK_wall = registerBlock("winter_oak_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ESWELL_BIRCH_PLANKS = registerBlock("eswell_birch_planks",
            properties -> new Block(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ESWELL_BIRCH_WALL = registerBlock("eswell_birch_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ESWELL_BIRCH_FENCE = registerBlock("eswell_birch_fence",
            properties -> new FenceBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block CORRUPT_BEECH_LOG = registerBlock("corrupt_beech_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block CORRUPT_BEECH_LEAVES = registerBlock("corrupt_beech_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_BLUE).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block ESWELL_BIRCH_LEAVES = registerBlock("eswell_birch_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_ORANGE).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block FOXGLOVE_LOG = registerBlock("foxglove_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block OBANT_LOG = registerBlock("obant_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BRAMBLEGROVE_LOG = registerBlock("bramblegrove_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block cedarbrook_log = registerBlock("cedarbrook_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block elderwell_log = registerBlock("elderwell_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block STARFALL_log = registerBlock("starfall_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ANCIENT_OAK_log = registerBlock("ancient_oak_log",
            properties -> new RotatedPillarBlock(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ANCIENT_OAK_LEAVES = registerBlock("ancient_oak_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_LIGHT_BLUE).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block STARFALL_LEAVES = registerBlock("starfall_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_LIGHT_BLUE).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));
    public static final Block WILLOW_BLOOM_LEAVES = registerBlock("willow_bloom_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.PALE_OAK_LEAVES,
                    properties.mapColor(MapColor.COLOR_LIGHT_GRAY).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never)
                            .isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor(Blocks::never)));






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
