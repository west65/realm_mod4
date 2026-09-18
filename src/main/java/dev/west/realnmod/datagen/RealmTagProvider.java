package dev.west.realnmod.datagen;

import dev.west.realnmod.block.*;
import dev.west.realnmod.tag.RealmTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;


import java.util.concurrent.CompletableFuture;

public class RealmTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public RealmTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(RealmBlocks.getRK(RealmBlocks.BLACKIRON_SHARDS_BLOCK))
                .add(RealmBlocks.getRK(RealmBlocks.EVIL_SHARDS))
                .add(RealmBlocks.getRK(RealmBlocks.MITHRIL_SHARDS))
                .add(RealmBlocks.getRK(RealmBlocks.LARGE_MITHRIL_SHARDS))
                .add(RealmBlocks.getRK(RealmBlocks.VORYN_SHARDS))
                .add(RealmBlocks.getRK(RealmBlocks.SYLVARITE))
                .add(RealmBlocks.getRK(RealmBlocks.BERYLUV))
                .add(RealmBlocks.getRK(RealmBlocks.QUARTZON))
                .add(RealmBlocks.getRK(RealmBlocks.SYLVARITE_BLOCK))
                .add(RealmBlocks.getRK(RealmBlocks.glizz_BLOCK))
                .add(RealmBlocks.getRK(RealmBlocks.RAMMER_BLOCK))
                .add(RealmBlocks.getRK(RealmBlocks.BEIGE_BLOCK))
                .add(RealmBlocks.getRK(RealmBlocks.DAZZLING_CRYSTAL))
                .add(RealmBlocks.getRK(RealmBlocks.ANORITE_BLOCK))
                .add(RealmBlocks.getRK(RealmBlocks.ANORITE))
                .add(RealmBlocks.getRK(RealmBlocks.AURORA_BLOCK))
                .add(RealmBlocks.getRK(RealmBlocks.AURORA_crystal))
                .add(RealmBlocks.getRK(RealmBlocks.CRYSTAlTA_BLOCK))
                .add(RealmBlocks.getRK(RealmBlocks.crystalta_crystal))
                .add(RealmBlocks.getRK(RealmBlocks.KHROT_BLOCK))








                .add(RealmBlocks.getRK(RealmBlocks.MITHRIL_GLOW))
                .add(RealmBlocks.getRK(RealmBlocks.DARK_SOUL_GLOW))
                .add(RealmBlocks.getRK(RealmBlocks.GOLD_LIGHT_GLOW));







        tag(BlockTags.IRON_ORES)
                .add(RealmBlocks.getRK(RealmBlocks.BLACK_steel_ORE))
                .add(RealmBlocks.getRK(RealmBlocks.UBLESE_ORE))
                .add(RealmBlocks.getRK(RealmBlocks.GRIZZ_ORE))
                .add(RealmBlocks.getRK(RealmBlocks.BLACKIRON_ORE))
                .add(RealmBlocks.getRK(RealmBlocks.SUN_ORE))
                .add(RealmBlocks.getRK(RealmBlocks.SILVER_ORE))
                .add(RealmBlocks.getRK(RealmBlocks.TIN_ORE))
                .add(RealmBlocks.getRK(RealmBlocks.MITHRIL_ORE));












        tag(RealmTags.BLOCK.LIMESTONE)
                .add(RealmLimestone.getRK(RealmLimestone.light_limestone1))
                .add(RealmLimestone.getRK(RealmLimestone.light_limestone))
                .add(RealmLimestone.getRK(RealmLimestone.limestone))
                .add(RealmLimestone.getRK(RealmLimestone.limestone3))
                .add(RealmLimestone.getRK(RealmLimestone.limestone2))
                .add(RealmLimestone.getRK(RealmLimestone.limestone1))
                .add(RealmLimestone.getRK(RealmLimestone.limestone4))
                .add(RealmLimestone.getRK(RealmLimestone.limestone5))
                .add(RealmLimestone.getRK(RealmLimestone.limestone6))
                .add(RealmLimestone.getRK(RealmLimestone.limestone7))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone1))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone2))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone3))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone4))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone5))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone_brick1))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone_brick2))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone_brick3))
                .add(RealmLimestone.getRK(RealmLimestone.aged_limestone_brick))

                .add(RealmLimestone.getRK(RealmLimestone.red_limestone));




        tag(RealmTags.BLOCK.CHALK)
                .add(RealmChalk.getRK(RealmChalk.chalk1_3))
                .add(RealmChalk.getRK(RealmChalk.chalk_3))
                .add(RealmChalk.getRK(RealmChalk.chalk4))
                .add(RealmChalk.getRK(RealmChalk.chalk2))
                .add(RealmChalk.getRK(RealmChalk.chalk1))
                .add(RealmChalk.getRK(RealmChalk.chalk));


tag(RealmTags.BLOCK.desert)
        .add(RealmDesert.getRK(RealmDesert.desert_stone_rock1))
        .add(RealmDesert.getRK(RealmDesert.desert_stone_rock))
        .add(RealmDesert.getRK(RealmDesert.desert_stone4))
        .add(RealmDesert.getRK(RealmDesert.desert_stone3))
        .add(RealmDesert.getRK(RealmDesert.desert_stone2))
        .add(RealmDesert.getRK(RealmDesert.desert_stone1))
        .add(RealmDesert.getRK(RealmDesert.desert_rock))
        .add(RealmDesert.getRK(RealmDesert.desert_rock1))
        .add(RealmDesert.getRK(RealmDesert.desert_rock2))
        .add(RealmDesert.getRK(RealmDesert.desert_stone));






    tag(RealmTags.BLOCK.rhyoite)
            .add(RealmRhyolite.getRK(RealmRhyolite.rhyolite1))
            .add(RealmRhyolite.getRK(RealmRhyolite.rhyolite));



    tag(RealmTags.BLOCK.granite)
            .add(RealmGranite.getRK(RealmGranite.Granite5_slab))
            .add(RealmGranite.getRK(RealmGranite.granite5))
            .add(RealmGranite.getRK(RealmGranite.granite4))
            .add(RealmGranite.getRK(RealmGranite.granite3))
            .add(RealmGranite.getRK(RealmGranite.granite))
            .add(RealmGranite.getRK(RealmGranite.granite2))
            .add(RealmGranite.getRK(RealmGranite.granite_rock1))
            .add(RealmGranite.getRK(RealmGranite.granite_rock));




    tag(BlockTags.SLABS)
            .add(RealmStone.getRK(RealmStone.kragmor_slab))
            .add(RealmStone.getRK(RealmStone.LAVA_STONE_SLAB))
            .add(RealmStone.getRK(RealmStone.AGED_STONE_SLAB))
            .add(Realm_logs.getRK(Realm_logs.BURN_BIRCH_SLAB))
            .add(RealmStone.getRK(RealmStone.STONE_ROCK2_SLAB))
            .add(RealmLimestone.getRK(RealmLimestone.light_limestone2_1))
            .add(RealmGranite.getRK(RealmGranite.granite2_1))
            .add(RealmChalk.getRK(RealmChalk.chalk0_3))
            .add(RealmChalk.getRK(RealmChalk.chalk1_3));




    tag(BlockTags.WALLS)
            .add(RealmBlocks.getRK(RealmBlocks.mithril_wool_wall))
            .add(Realm_logs.getRK(Realm_logs.ESWELL_BIRCH_WALL))
            .add(Realm_logs.getRK(Realm_logs.WINTER_OAK_wall))
            .add(Realm_logs.getRK(Realm_logs.BURN_BIRCH_WALL))
            .add(RealmStone.getRK(RealmStone.STONE_ROCK2_WALL));







        tag(RealmTags.BLOCK.STONE)
                .add(RealmStone.getRK(RealmStone.kragmor_slab))
                .add(RealmStone.getRK(RealmStone.kragmor))
                .add(RealmStone.getRK(RealmStone.gorvask_stone))
                .add(RealmStone.getRK(RealmStone.LAVA_STONE_FENCE))
                .add(RealmStone.getRK(RealmStone.LAVA_STONE_SLAB))
                .add(RealmStone.getRK(RealmStone.AGED_STONE))
                .add(RealmStone.getRK(RealmStone.AGED_STONE_BRICK))
                .add(RealmStone.getRK(RealmStone.AGED_STONE_BRICK1))
                .add(RealmStone.getRK(RealmStone.AGED_STONE_BRICK2))
                .add(RealmStone.getRK(RealmStone.STONE_ROCK2_SLAB))
                .add(RealmStone.getRK(RealmStone.STONE_ROCK_n1))
                .add(RealmStone.getRK(RealmStone.STONE_ROCK_n))
                .add(RealmStone.getRK(RealmStone.STONE_ROCK))
                .add(RealmStone.getRK(RealmStone.STONE_ROCK2))
                .add(RealmStone.getRK(RealmStone.STONE_ROCK1))
                .add(RealmStone.getRK(RealmStone.STONE_ROCK))
                .add(Realm_Ruins.getRK(Realm_Ruins.DEEP_STONE_RUNE))
                .add(RealmStone.getRK(RealmStone.red_stone))
                .add(Realm_Ruins.getRK(Realm_Ruins.STONE_RUNE))
                .add(RealmTuff.getRK(RealmTuff.tuff_brick))
                .add(RealmTuff.getRK(RealmTuff.tuff_brick1))
                .add(RealmTuff.getRK(RealmTuff.tuff_brick2))
                .add(RealmTuff.getRK(RealmTuff.tuff_brick3))
                .add(RealmTuff.getRK(RealmTuff.tuff_brick4))
                .add(RealmTuff.getRK(RealmTuff.tuff1))
                .add(RealmTuff.getRK(RealmTuff.tuff2))
                .add(RealmTuff.getRK(RealmTuff.tuff3))
                .add(RealmStone.getRK(RealmStone.dark_brick))
                .add(RealmStone.getRK(RealmStone.dark_stone1))
                .add(RealmStone.getRK(RealmStone.dark_stone_slab))
                .add(RealmStone.getRK(RealmStone.dark_stone))
                .add(RealmStone.getRK(RealmStone.dark_stone2))
                .add(RealmStone.getRK(RealmStone.dark_rock))
                .add(RealmStone.getRK(RealmStone.dark_rock1))
                .add(RealmStone.getRK(RealmStone.dark_rock2))
                .add(RealmStone.getRK(RealmStone.deep_stone))
                .add(RealmStone.getRK(RealmStone.deep_stone1))
                .add(RealmStone.getRK(RealmStone.deep_stone2))
                .add(RealmStone.getRK(RealmStone.deep_black_stone))
                .add(RealmStone.getRK(RealmStone.DARK_STONE_evil))
                .add(RealmStone.getRK(RealmStone.rock_stone))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick1))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick2))
                .add(RealmStone.getRK(RealmStone.stone_brick4))
                .add(RealmStone.getRK(RealmStone.stone_brick5))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick2_1))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick2_2))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_1))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_2))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_3))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_4))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_5))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_6))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_7))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_8))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_9))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_10))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_11))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_11_slab))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_9_slab))
                .add(RealmStone.getRK(RealmStone.MITHRIL_STONE))
                .add(RealmStone.getRK(RealmStone.MITHRIL_STONE1))
                .add(RealmStone.getRK(RealmStone.MITHRIL_STONE2))
                .add(RealmStone.getRK(RealmStone.MITHRIL_COBBLE))
                .add(RealmStone.getRK(RealmStone.MITHRIL_COBBLE1))
                .add(RealmStone.getRK(RealmStone.MITHRIL_COBBLE2))
                .add(RealmStone.getRK(RealmStone.MITHRIL_COBBLE_SLAB))
                .add(RealmStoneBrick.getRK(RealmStoneBrick.stone_Brick_2_slab))
                .add(RealmStone.getRK(RealmStone.GOLD_COBBLE))
                .add(RealmStone.getRK(RealmStone.DARK_SOUL_COBBLE))
                .add(RealmStone.getRK(RealmStone.MOSS_FORGE))
                .add(RealmStone.getRK(RealmStone.BLACKSTONE1))
                .add(RealmStone.getRK(RealmStone.stone1))
                .add(RealmStone.getRK(RealmStone.stone3))
                .add(RealmStone.getRK(RealmStone.stone2))
                .add(RealmStone.getRK(RealmStone.stone_1))
                .add(RealmStone.getRK(RealmStone.stone_2))
                .add(RealmStone.getRK(RealmStone.stone_3))
                .add(RealmStone.getRK(RealmStone.stone_4))
                .add(RealmStone.getRK(RealmStone.stone_age))
                .add(RealmStone.getRK(RealmStone.DARK_STONE_DEEP))
                .add(RealmStone.getRK(RealmStone.DARK_STONE_DEEP_BRICK))
                .add(RealmStone.getRK(RealmStone.DARK_STONE_DEEP_BRICK1))
                .add(RealmStone.getRK(RealmStone.DARK_STONE_DEEP1))
                .add(RealmStone.getRK(RealmStone.stone_brick_m))
                .add(RealmStone.getRK(RealmStone.stone_brick_m1))
                .add(RealmBlocks.getRK(RealmBlocks.DEEP_SILVER_STONE))
                .add(RealmBlocks.getRK(RealmBlocks.DEEP_SILVER_STONE1))
                .add(RealmStone.getRK(RealmStone.LAVA_STONE))
                .add(RealmStone.getRK(RealmStone.stone));





       tag(BlockTags.MINEABLE_WITH_AXE)
               .add(Realm_logs.getRK(Realm_logs.BRAMBLEGROVE_LOG))
               .add(Realm_logs.getRK(Realm_logs.OBANT_LOG))
               .add(Realm_logs.getRK(Realm_logs.FOXGLOVE_LOG))
               .add(Realm_logs.getRK(Realm_logs.ESWELL_BIRCH_LEAVES))
               .add(Realm_logs.getRK(Realm_logs.CORRUPT_BEECH_LEAVES))
               .add(Realm_logs.getRK(Realm_logs.BLUE_SPRUCE_LOG))
               .add(Realm_logs.getRK(Realm_logs.RED_WOOD_LOG))
               .add(Realm_logs.getRK(Realm_logs.ESWELL_BIRCH_FENCE))
               .add(Realm_logs.getRK(Realm_logs.ESWELL_BIRCH_WALL))
               .add(Realm_logs.getRK(Realm_logs.WINTER_OAK_wall))
               .add(Realm_logs.getRK(Realm_logs.WINTER_OAK_FENCE))
               .add(Realm_logs.getRK(Realm_logs.BURN_BIRCH_SLAB))
               .add(Realm_logs.getRK(Realm_logs.ALDER_LOG))
               .add(Realm_logs.getRK(Realm_logs.SPUS_LOG))
               .add(Realm_logs.getRK(Realm_logs.URBAN_LOG))
               .add(Realm_logs.getRK(Realm_logs.VEIL_WOOD_LOG))
               .add(Realm_logs.getRK(Realm_logs.ESWELL_BIRCH_LOG))
               .add(Realm_logs.getRK(Realm_logs.LIGHT_BIRCH_LOG))
               .add(Realm_logs.getRK(Realm_logs.DARK_SOUL_LOG))
               .add(Realm_logs.getRK(Realm_logs.MITHRIL_LOG))
               .add(Realm_logs.getRK(Realm_logs.MITHRIL_LEAVES))
               .add(Realm_logs.getRK(Realm_logs.ESWELL_LEAVES))
               .add(Realm_logs.getRK(Realm_logs.GOLDEN_PINE_LOG))
               .add(Realm_logs.getRK(Realm_logs.DARK_SOUL_LEAVES))
               .add(Realm_logs.getRK(Realm_logs.BLOOD_OAK_LOG))
               .add(Realm_logs.getRK(Realm_logs.CRYSTAL_OAK_LOG))
               .add(Realm_logs.getRK(Realm_logs.BURN_BIRCH_LOG))
               .add(Realm_logs.getRK(Realm_logs.ASH_OAK_LOG))
               .add(Realm_logs.getRK(Realm_logs.GOLD_SHADOW_LOG))
               .add(Realm_logs.getRK(Realm_logs.EMBERIAR_LOG))
               .add(Realm_logs.getRK(Realm_logs.MISTWOOD_LOG))
               .add(Realm_logs.getRK(Realm_logs.DEEPCORE_LOG))
               .add(Realm_logs.getRK(Realm_logs.SHADOW_BIRCH_LOG))
               .add(Realm_logs.getRK(Realm_logs.SHADOW_birch_LEAVES))
               .add(Realm_logs.getRK(Realm_logs.GRIM_BIRCH_LOG))
               .add(Realm_logs.getRK(Realm_logs.ANGEL_BIRCH_LOG));




       tag(BlockTags.FENCES)
               .add(RealmStone.getRK(RealmStone.LAVA_STONE_FENCE))
               .add(Realm_logs.getRK(Realm_logs.ESWELL_BIRCH_FENCE))
               .add(Realm_logs.getRK(Realm_logs.WINTER_OAK_FENCE))
               .add(Realm_logs.getRK(Realm_logs.BURN_BIRCH_fence))
               .add(Realm_logs.getRK(Realm_logs.SHADOW_PINE_FENCE))
               .add(RealmGranite.getRK(RealmGranite.granite5_fence))
               .add(RealmLimestone.getRK(RealmLimestone.light_limestone2_2))
               .add(RealmGranite.getRK(RealmGranite.granite2_2))
               .add(RealmChalk.getRK(RealmChalk.chalk4_s1))
               .add(Realm_logs.getRK(Realm_logs.SUN_OAK_FENCE));













       tag(BlockTags.MOOSHROOMS_SPAWNABLE_ON)
               .add(RealmMushroom.getRK(RealmMushroom.grimcap))
               .add(RealmMushroom.getRK(RealmMushroom.gimmerstalk))
               .add(RealmMushroom.getRK(RealmMushroom.dark_soul_mushroom))
               .add(RealmMushroom.getRK(RealmMushroom.marshmoon_mushroom))
               .add(RealmMushroom.getRK(RealmMushroom.poss_mushroom))
               .add(RealmMushroom.getRK(RealmMushroom.silver_mushroom))
               .add(RealmMushroom.getRK(RealmMushroom.mithril_mushroom))
               .add(RealmMushroom.getRK(RealmMushroom.angel_mushroom));












                  tag(BlockTags.LOGS)
                          .add(Realm_logs.getRK(Realm_logs.elderwell_log))
                          .add(Realm_logs.getRK(Realm_logs.cedarbrook_log))
                          .add(Realm_logs.getRK(Realm_logs.CORRUPT_BEECH_LOG))
                          .add(Realm_logs.getRK(Realm_logs.MAPLEHAVEN_LOG))
                          .add(Realm_logs.getRK(Realm_logs.WILLOW_BLOOM_LOG))
                          .add(Realm_logs.getRK(Realm_logs.sorcerers_OAK_LOG))
                          .add(Realm_logs.getRK(Realm_logs.SILVER_OAK_LOG))
                          .add(Realm_logs.getRK(Realm_logs.BURN_BIRCH_SLAB))
                          .add(Realm_logs.getRK(Realm_logs.ASH_BIRCH_LOG))
                          .add(Realm_logs.getRK(Realm_logs.HOLLOW_ELbER_LOG))
                          .add(Realm_logs.getRK(Realm_logs.WINTER_BIRCH_LOG))
                          .add(Realm_logs.getRK(Realm_logs.SHADOW_EYE_PINE_LOG))
              .add(Realm_logs.getRK(Realm_logs.SHADOW_PINE_LOG))
              .add(Realm_logs.getRK(Realm_logs.ALDER_LOG))
              .add(Realm_logs.getRK(Realm_logs.ESWELL_BIRCH_LOG))
              .add(Realm_logs.getRK(Realm_logs.LIGHT_BIRCH_LOG))
              .add(Realm_logs.getRK(Realm_logs.MOONSHADE_BIRCH_LOG))
              .add(Realm_logs.getRK(Realm_logs.THUNDER_OAK_LOG))
              .add(Realm_logs.getRK(Realm_logs.VEIL_WOOD_LOG))
              .add(Realm_logs.getRK(Realm_logs.BLOOD_OAK_LOG))
              .add(Realm_logs.getRK(Realm_logs.SUN_OAK_LOG))
              .add(Realm_logs.getRK(Realm_logs.GOLDEN_PINE_LOG))
              .add(Realm_logs.getRK(Realm_logs.MITHRIL_LOG))
              .add(Realm_logs.getRK(Realm_logs.MOSS_OAK_LOG))
              .add(Realm_logs.getRK(Realm_logs.CRYSTAL_OAK_LOG))
              .add(Realm_logs.getRK(Realm_logs.WHITE_OAK_LOG))
              .add(Realm_logs.getRK(Realm_logs.DARK_SOUL_LOG))
              .add(Realm_logs.getRK(Realm_logs.WINTER_OAK_LOG))
              .add(Realm_logs.getRK(Realm_logs.ASH_OAK_LOG))
              .add(Realm_logs.getRK(Realm_logs.ANGEL_BIRCH_LOG))
              .add(Realm_logs.getRK(Realm_logs.BURN_BIRCH_LOG))
              .add(Realm_logs.getRK(Realm_logs.DARK_SOUL_LOG_CHAIN))
              .add(Realm_logs.getRK(Realm_logs.ORG_WILLOW_LOG))
              .add(Realm_logs.getRK(Realm_logs.STARBLOOM_LOG))
              .add(Realm_logs.getRK(Realm_logs.WHITE_PINE_LOG));




      tag(BlockTags.GRASS_BLOCKS)
              .add(RealmBlocks.getRK(RealmBlocks.LIGHT_ORG_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.LIGHT_GRAY_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.DARK_GLOM_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.DARK_GLOW_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.DARK_GREEN_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.LIGHT_YELLOW_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.ASH_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.silver_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.MITHRIL_BLOCK));



      tag(RealmTags.BLOCK.fantasy_grass)
              .add(RealmBlocks.getRK(RealmBlocks.LIGHT_ORG_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.LIGHT_GRAY_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.DARK_GLOM_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.DARK_GLOW_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.DARK_GREEN_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.LIGHT_YELLOW_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.MITHRIL_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.ASH_BLOCK))
              .add(RealmBlocks.getRK(RealmBlocks.silver_BLOCK));




      tag(RealmTags.BLOCK.evil)
              .add(RealmBlocks.getRK(RealmBlocks.evil_wool))
              .add(RealmStone.getRK(RealmStone.gorvask_stone));





      tag(RealmTags.BLOCK.fantasy_wool)
              .add(RealmBlocks.getRK(RealmBlocks.woolforge_wool))
              .add(RealmBlocks.getRK(RealmBlocks.elder_wool))
              .add(RealmBlocks.getRK(RealmBlocks.epic_wool))
              .add(RealmBlocks.getRK(RealmBlocks.mithril_wool_wall))
              .add(RealmBlocks.getRK(RealmBlocks.med_green_stairs))
              .add(RealmBlocks.getRK(RealmBlocks.med_green_wool_slab))
              .add(RealmBlocks.getRK(RealmBlocks.dark_under_wool_stairs))
              .add(RealmBlocks.getRK(RealmBlocks.mithril_wool_stairs))
              .add(RealmBlocks.getRK(RealmBlocks.dark_under_wool_slab))
              .add(RealmBlocks.getRK(RealmBlocks.dark_under_wool))
              .add(RealmBlocks.getRK(RealmBlocks.dark_star_wool))
              .add(RealmBlocks.getRK(RealmBlocks.med_green_wool))
              .add(RealmBlocks.getRK(RealmBlocks.mithril_wool_slab))
              .add(RealmBlocks.getRK(RealmBlocks.mithril_wool))
              .add(RealmBlocks.getRK(RealmBlocks.moss_wool));





      tag(BlockTags.STAIRS)
              .add(RealmBlocks.getRK(RealmBlocks.med_green_stairs))
              .add(RealmBlocks.getRK(RealmBlocks.dark_under_wool_stairs))
              .add(RealmBlocks.getRK(RealmBlocks.mithril_wool_stairs))
              .add(Realm_logs.getRK(Realm_logs.DARK_SOUL_STAIRS));









                  tag(BlockTags.PLANKS)
                          .add(Realm_logs.getRK(Realm_logs.BURN_BIRCH_PLANKS))
                          .add(Realm_logs.getRK(Realm_logs.SHADOW_PINE_PLANKS))
              .add(Realm_logs.getRK(Realm_logs.WINTER_OAK_PLANKS))
              .add(Realm_logs.getRK(Realm_logs.SUN_OAK_PLANKS))
              .add(Realm_logs.getRK(Realm_logs.DARK_SOUL_PLANKS));























                    tag(BlockTags.CROPS)
                .add(RealmBlocks.getRK(RealmBlocks.BRIGHT_SILVER))
                .add(RealmBlocks.getRK(RealmBlocks.DARK_SOUL_WHEAT))
                .add(RealmBlocks.getRK(RealmBlocks.Gold_WHEAT))
                .add(RealmBlocks.getRK(RealmBlocks.GOATFEED_CROP));






















    }
}
