package dev.west.realnmod.datagen;

import dev.west.realnmod.block.*;
import dev.west.realnmod.item.RealmItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.core.Direction;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;


public class RealmModelProvider extends FabricModelProvider {
    public RealmModelProvider(FabricPackOutput output) {
        super(output);
    }

    private static final PropertyDispatch<VariantMutator> ROTATION_HORIZONTAL_FACING = PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING)
            .select(Direction.EAST, BlockModelGenerators.Y_ROT_90)
            .select(Direction.SOUTH, BlockModelGenerators.Y_ROT_180)
            .select(Direction.WEST, BlockModelGenerators.Y_ROT_270)
            .select(Direction.NORTH, BlockModelGenerators.NOP);


    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        var realm2 = blockModelGenerators.family(Realm_logs.DARK_SOUL_PLANKS);
        var realm3 = blockModelGenerators.family(RealmStone.BLACKSTONE1);
        var realm1 = blockModelGenerators.family(RealmStone.dark_stone1);
        var realm4 = blockModelGenerators.family(RealmStone.MITHRIL_STONE);
        var realm5 = blockModelGenerators.family(RealmStone.MITHRIL_COBBLE);
        var realm6 =  blockModelGenerators.family(RealmStone.MITHRIL_COBBLE1);
        var realm7= blockModelGenerators.family(RealmStoneBrick.stone_Brick_11);
        var realm8 = blockModelGenerators.family(RealmStoneBrick.stone_Brick_9);
        var realm9 = blockModelGenerators.family(Realm_logs.SUN_OAK_PLANKS);
        var realm10 = blockModelGenerators.family(RealmStoneBrick.stone_Brick_2);
        var realm11 = blockModelGenerators.family(RealmChalk.chalk_3);
        var realm12 = blockModelGenerators.family(RealmChalk.chalk3);
        var realm13 = blockModelGenerators.family(RealmChalk.chalk4);
        var realm14 = blockModelGenerators.family(RealmGranite.granite2);
        var realm15 = blockModelGenerators.family(RealmLimestone.light_limestone2);
        var realm16 = blockModelGenerators.family(RealmGranite.granite5);
        var realm17 = blockModelGenerators.family(Realm_logs.SHADOW_PINE_PLANKS);
        var realm18 = blockModelGenerators.family(Realm_logs.BURN_BIRCH_PLANKS);
        var realm19 = blockModelGenerators.family(RealmStone.STONE_ROCK2);
        var realm20 = blockModelGenerators.family(Realm_logs.WINTER_OAK_PLANKS);
        var realm21 = blockModelGenerators.family(Realm_logs.ESWELL_BIRCH_PLANKS);
        var realm22 = blockModelGenerators.family(RealmStone.AGED_STONE);
        var realm23 = blockModelGenerators.family(RealmStone.LAVA_STONE);
        var realm24 = blockModelGenerators.family(RealmBlocks.mithril_wool);
        var realm25 = blockModelGenerators.family(RealmBlocks.dark_under_wool);
        var realm26 = blockModelGenerators.family(RealmBlocks.med_green_wool);
        var realm27 = blockModelGenerators.family(RealmStone.kragmor);
        var realm28 = blockModelGenerators.family(RealmLimestone.red_limestone2);
        var realm29 = blockModelGenerators.family(RealmLimestone.red_limestone_brick);
        var realm30 = blockModelGenerators.family(RealmLimestone.old_limestone_brick);
        var realm31= blockModelGenerators.family(RealmLimestone.limestone8);



















//ore
        blockModelGenerators.createTrivialCube(RealmBlocks.MITHRIL_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.SILVER_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.SUN_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.BLACKIRON_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.GRIZZ_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.UBLESE_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.TIN_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.CRUPT_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.BLACK_steel_ORE);








        blockModelGenerators.createTrivialCube(RealmBlocks.DEEP_SILVER_STONE);
        blockModelGenerators.createTrivialCube(RealmBlocks.DEEP_SILVER_STONE1);













//logs
        blockModelGenerators.woodProvider(Realm_logs.WHITE_PINE_LOG).log(Realm_logs.WHITE_PINE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.MOSS_OAK_LOG).log(Realm_logs.MOSS_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.MITHRIL_LOG).log(Realm_logs.MITHRIL_LOG);
        blockModelGenerators.woodProvider(Realm_logs.GOLDEN_PINE_LOG).log(Realm_logs.GOLDEN_PINE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.CRYSTAL_OAK_LOG).log(Realm_logs.CRYSTAL_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.WHITE_OAK_LOG).log(Realm_logs.WHITE_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.DARK_SOUL_LOG).log(Realm_logs.DARK_SOUL_LOG);
        blockModelGenerators.woodProvider(Realm_logs.SUN_OAK_LOG).log(Realm_logs.SUN_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.BLOOD_OAK_LOG).log(Realm_logs.BLOOD_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.WINTER_OAK_LOG).log(Realm_logs.WINTER_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.ASH_OAK_LOG).log(Realm_logs.ASH_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.ANGEL_BIRCH_LOG).log(Realm_logs.ANGEL_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.BURN_BIRCH_LOG).log(Realm_logs.BURN_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.THUNDER_OAK_LOG).log(Realm_logs.THUNDER_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.MOONSHADE_BIRCH_LOG).log(Realm_logs.MOONSHADE_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.LIGHT_BIRCH_LOG).log(Realm_logs.LIGHT_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.ESWELL_BIRCH_LOG).log(Realm_logs.ESWELL_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.GOLD_SHADOW_LOG).log(Realm_logs.GOLD_SHADOW_LOG);
        blockModelGenerators.woodProvider(Realm_logs.VEIL_WOOD_LOG).log(Realm_logs.VEIL_WOOD_LOG);
        blockModelGenerators.woodProvider(Realm_logs.EMBERIAR_LOG).log(Realm_logs.EMBERIAR_LOG);
        blockModelGenerators.woodProvider(Realm_logs.MISTWOOD_LOG).log(Realm_logs.MISTWOOD_LOG);
        blockModelGenerators.woodProvider(Realm_logs.DEEPCORE_LOG).log(Realm_logs.DEEPCORE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.SHADOW_BIRCH_LOG).log(Realm_logs.SHADOW_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.DARK_SOUL_LOG_CHAIN).log(Realm_logs.DARK_SOUL_LOG_CHAIN);
        blockModelGenerators.woodProvider(Realm_logs.ORG_WILLOW_LOG).log(Realm_logs.ORG_WILLOW_LOG);
        blockModelGenerators.woodProvider(Realm_logs.STARBLOOM_LOG).log(Realm_logs.STARBLOOM_LOG);
        blockModelGenerators.woodProvider(Realm_logs.ALDER_LOG).log(Realm_logs.ALDER_LOG);
        blockModelGenerators.woodProvider(Realm_logs.SHADOW_PINE_LOG).log(Realm_logs.SHADOW_PINE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.GRIM_BIRCH_LOG).log(Realm_logs.GRIM_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.SPUS_LOG).log(Realm_logs.SPUS_LOG);
        blockModelGenerators.woodProvider(Realm_logs.URBAN_LOG).log(Realm_logs.URBAN_LOG);
        blockModelGenerators.woodProvider(Realm_logs.SHADOW_EYE_PINE_LOG).log(Realm_logs.SHADOW_EYE_PINE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.WINTER_BIRCH_LOG).log(Realm_logs.WINTER_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.HOLLOW_ELbER_LOG).log(Realm_logs.HOLLOW_ELbER_LOG);
        blockModelGenerators.woodProvider(Realm_logs.ASH_BIRCH_LOG).log(Realm_logs.ASH_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.RED_WOOD_LOG).log(Realm_logs.RED_WOOD_LOG);
        blockModelGenerators.woodProvider(Realm_logs.BLUE_SPRUCE_LOG).log(Realm_logs.BLUE_SPRUCE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.SILVER_OAK_LOG).log(Realm_logs.SILVER_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.sorcerers_OAK_LOG).log(Realm_logs.sorcerers_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.WILLOW_BLOOM_LOG).log(Realm_logs.WILLOW_BLOOM_LOG);
        blockModelGenerators.woodProvider(Realm_logs.MAPLEHAVEN_LOG).log(Realm_logs.MAPLEHAVEN_LOG);
        blockModelGenerators.woodProvider(Realm_logs.CORRUPT_BEECH_LOG).log(Realm_logs.CORRUPT_BEECH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.FOXGLOVE_LOG).log(Realm_logs.FOXGLOVE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.OBANT_LOG).log(Realm_logs.OBANT_LOG);
        blockModelGenerators.woodProvider(Realm_logs.BRAMBLEGROVE_LOG).log(Realm_logs.BRAMBLEGROVE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.cedarbrook_log).log(Realm_logs.cedarbrook_log);
        blockModelGenerators.woodProvider(Realm_logs.elderwell_log).log(Realm_logs.elderwell_log);
        blockModelGenerators.woodProvider(Realm_logs.STARFALL_log).log(Realm_logs.STARFALL_log);
        blockModelGenerators.woodProvider(Realm_logs.ANCIENT_OAK_log).log(Realm_logs.ANCIENT_OAK_log);
















    //crystal
        blockModelGenerators.createAmethystCluster(RealmBlocks.BLACKIRON_SHARDS_BLOCK);
        blockModelGenerators.createAmethystCluster(RealmBlocks.EVIL_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.MITHRIL_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.LARGE_MITHRIL_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.MED_MITHRIL_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.BLACK_POSS_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.VORYN_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.SYLVARITE);
        blockModelGenerators.createAmethystCluster(RealmBlocks.BERYLUV);
        blockModelGenerators.createAmethystCluster(RealmBlocks.QUARTZON);
        blockModelGenerators.createAmethystCluster(RealmBlocks.DAZZLING_CRYSTAL);
        blockModelGenerators.createAmethystCluster(RealmBlocks.ANORITE);
        blockModelGenerators.createAmethystCluster(RealmBlocks.AURORA_crystal);
        blockModelGenerators.createAmethystCluster(RealmBlocks.crystalta_crystal);
        blockModelGenerators.createAmethystCluster(RealmBlocks.khrot_crystal);


//crystal block
        blockModelGenerators.createTrivialCube(RealmBlocks.SYLVARITE_BLOCK);
        blockModelGenerators.createTrivialCube(RealmBlocks.glizz_BLOCK);
        blockModelGenerators.createTrivialCube(RealmBlocks.RAMMER_BLOCK);
        blockModelGenerators.createTrivialCube(RealmBlocks.BEIGE_BLOCK);
        blockModelGenerators.createTrivialCube(RealmBlocks.ANORITE_BLOCK);
        blockModelGenerators.createTrivialCube(RealmBlocks.AURORA_BLOCK);
        blockModelGenerators.createTrivialCube(RealmBlocks.CRYSTAlTA_BLOCK);
        blockModelGenerators.createTrivialCube(RealmBlocks.KHROT_BLOCK);





//limestone
        blockModelGenerators.createTrivialCube(RealmLimestone.old_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.old_limestone1);
        blockModelGenerators.createTrivialCube(RealmLimestone.dark_silver_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.dark_silver_limestone_brick);
        blockModelGenerators.createTrivialCube(RealmLimestone.dark_limestone_brick);
        blockModelGenerators.createTrivialCube(RealmLimestone.dark_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.red_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.red_limestone1);
        blockModelGenerators.createTrivialCube(RealmLimestone.red_limestone_brick1);
        blockModelGenerators.createTrivialCube(RealmLimestone.red_deep_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.red_deep_limestone_brick);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone1);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone2);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone3);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone4);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone5);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone6);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone7);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone9);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone_brick);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone1);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone2);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone3);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone4);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone5);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone_brick);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone_brick1);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone_brick2);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone_brick3);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone_brick4);
        blockModelGenerators.createTrivialCube(RealmLimestone.light_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.light_limestone1);
        blockModelGenerators.createTrivialCube(RealmLimestone.light_limestone3);
        blockModelGenerators.createTrivialCube(RealmLimestone.light_limestone4);
        blockModelGenerators.createTrivialCube(RealmLimestone.light_limestone5);
        blockModelGenerators.createTrivialCube(RealmLimestone.light_limestone_brick);



        realm15.slab(RealmLimestone.light_limestone2_1);

        realm28.slab(RealmLimestone.red_limestone2_slab);
        realm29.slab(RealmLimestone.red_limestone_brick_slab);
        realm30.slab(RealmLimestone.old_limestone_brick_slab);
        realm31.slab(RealmLimestone.limestone_8_slab);


        realm22.slab(RealmStone.AGED_STONE_SLAB);


        realm19.slab(RealmStone.STONE_ROCK2_SLAB);

        realm19.wall(RealmStone.STONE_ROCK2_WALL);


        realm18.wall(Realm_logs.BURN_BIRCH_WALL);
        realm29.wall(RealmLimestone.red_limestone_brick_wall);

        realm27.slab(RealmStone.kragmor_slab);




        realm18.slab(Realm_logs.BURN_BIRCH_SLAB);



        realm24.slab(RealmBlocks.mithril_wool_slab);




        realm21.wall(Realm_logs.ESWELL_BIRCH_WALL);


        realm21.fence(Realm_logs.ESWELL_BIRCH_FENCE);









        blockModelGenerators.createTrivialCube(RealmStone.STONE_ROCK);
        blockModelGenerators.createTrivialCube(RealmStone.STONEBRICK);





        blockModelGenerators.createTrivialCube(RealmChalk.chalk);
        blockModelGenerators.createTrivialCube(RealmChalk.chalk1);
        blockModelGenerators.createTrivialCube(RealmChalk.chalk2);








        realm11.slab(RealmChalk.chalk1_3);
        realm12.slab(RealmChalk.chalk0_3);
        realm13.slab(RealmChalk.chalk4_s);


        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone1);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone2);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone3);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone4);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone_rock);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone_rock1);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_rock);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_rock1);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_rock2);




        blockModelGenerators.createTrivialCube(RealmRhyolite.rhyolite);
        blockModelGenerators.createTrivialCube(RealmRhyolite.rhyolite1);











        blockModelGenerators.createTrivialBlock(Realm_logs.WINTER_OAK_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.DARK_SOUL_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.SUN_OAK_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.MITHRIL_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.WHITE_PINE_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.ESWELL_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.SHADOW_birch_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.BLOOD_oak_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.CORRUPT_BEECH_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.ESWELL_BIRCH_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.ANCIENT_OAK_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.STARFALL_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.WILLOW_BLOOM_LEAVES, TexturedModel.LEAVES);


        blockModelGenerators.createTrivialCube(RealmMushroom.angel_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.marshmoon_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.dark_soul_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.poss_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.silver_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.mithril_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.gimmerstalk);
        blockModelGenerators.createTrivialCube(RealmMushroom.grimcap);









        blockModelGenerators.createCropBlock(RealmBlocks.GOATFEED_CROP, CropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(RealmBlocks.Gold_WHEAT, CropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(RealmBlocks.DARK_SOUL_WHEAT, CropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(RealmBlocks.BRIGHT_SILVER, CropBlock.AGE, 0,1,2,3,4,5,6,7);

        realm2.stairs(Realm_logs.DARK_SOUL_STAIRS);
        realm26.stairs(RealmBlocks.med_green_stairs);



        realm14.fence(RealmGranite.granite2_2);
        realm9.fence(Realm_logs.SUN_OAK_FENCE);
        realm12.fence(RealmChalk.chalk4_s1);
        realm15.fence(RealmLimestone.light_limestone2_2);








        realm1.slab(RealmStone.dark_stone_slab);
        realm7.slab(RealmStoneBrick.stone_Brick_11_slab);
        realm8.slab(RealmStoneBrick.stone_Brick_9_slab);
        realm10.slab(RealmStoneBrick.stone_Brick_2_slab);
        realm25.slab(RealmBlocks.dark_under_wool_slab);
        realm25.stairs(RealmBlocks.dark_under_wool_stairs);
        realm26.slab(RealmBlocks.med_green_wool_slab);




        blockModelGenerators.createTrivialCube(RealmBlocks.MITHRIL_GLOW);
        blockModelGenerators.createTrivialCube(RealmBlocks.DARK_SOUL_GLOW);
        blockModelGenerators.createTrivialCube(RealmBlocks.GOLD_LIGHT_GLOW);













        blockModelGenerators.createTrivialCube(RealmStone.AGED_STONE_BRICK2);
        blockModelGenerators.createTrivialCube(RealmStone.AGED_STONE_BRICK1);
        blockModelGenerators.createTrivialCube(RealmStone.AGED_STONE_BRICK);
        blockModelGenerators.createTrivialCube(RealmStone.stone_brick5);
        blockModelGenerators.createTrivialCube(RealmStone.stone_brick4);
        blockModelGenerators.createTrivialCube(RealmStone.stone_brick_m1);
        blockModelGenerators.createTrivialCube(RealmStone.stone_brick_m);
        blockModelGenerators.createTrivialCube(RealmStone.stone_age);
        blockModelGenerators.createTrivialCube(RealmStone.stone);
        blockModelGenerators.createTrivialCube(RealmStone.stone1);
        blockModelGenerators.createTrivialCube(RealmStone.stone2);
        blockModelGenerators.createTrivialCube(RealmStone.stone3);
        blockModelGenerators.createTrivialCube(RealmStone.stone_1);
        blockModelGenerators.createTrivialCube(RealmStone.stone_2);
        blockModelGenerators.createTrivialCube(RealmStone.stone_3);
        blockModelGenerators.createTrivialCube(RealmStone.stone_4);
        blockModelGenerators.createTrivialCube(RealmStone.red_stone);
        blockModelGenerators.createTrivialCube(RealmStone.red_stone1);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_DEEP_ROCK);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_DEEP_ROCK1);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_DEEP_ROCK_BRICK);
        blockModelGenerators.createTrivialCube(RealmStone.WHITE_STONE);
        blockModelGenerators.createTrivialCube(RealmStone.ROCK_DEEP_STONE);
        blockModelGenerators.createTrivialCube(RealmStone.ROCK_DEEP_STONE_BRICK);
        blockModelGenerators.createTrivialCube(RealmStone.ROCK_DEEP_STONE1);


        blockModelGenerators.createTrivialCube(RealmStone.gloomcaver);





        blockModelGenerators.createTrivialCube(RealmStone.dark_rock);
        blockModelGenerators.createTrivialCube(RealmStone.dark_rock1);
        blockModelGenerators.createTrivialCube(RealmStone.dark_rock2);
        blockModelGenerators.createTrivialCube(RealmStone.rock_stone);
        blockModelGenerators.createTrivialCube(RealmStone.deep_stone);
        blockModelGenerators.createTrivialCube(RealmStone.deep_stone1);
        blockModelGenerators.createTrivialCube(RealmStone.deep_black_stone);
        blockModelGenerators.createTrivialCube(RealmStone.DARK_STONE_evil);
        blockModelGenerators.createTrivialCube(RealmStone.DARK_STONE_DEEP);
        blockModelGenerators.createTrivialCube(RealmStone.DARK_STONE_DEEP_BRICK);
        blockModelGenerators.createTrivialCube(RealmStone.DARK_STONE_DEEP_BRICK1);
        blockModelGenerators.createTrivialCube(RealmStone.dark_stonebrick);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_ROCK1);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_ROCK_n);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_ROCK_n1);
        blockModelGenerators.createTrivialCube(RealmStone.gorvask_stone);





//wool
        blockModelGenerators.createTrivialCube(RealmBlocks.elder_wool);
        blockModelGenerators.createTrivialCube(RealmBlocks.evil_wool);
        blockModelGenerators.createTrivialCube(RealmBlocks.moss_wool);
        blockModelGenerators.createTrivialCube(RealmBlocks.dark_star_wool);
        blockModelGenerators.createTrivialCube(RealmBlocks.epic_wool);
        blockModelGenerators.createTrivialCube(RealmBlocks.woolforge_wool);







        blockModelGenerators.createTrivialCube(RealmGranite.granite_rock);
        blockModelGenerators.createTrivialCube(RealmGranite.granite_rock1);
        blockModelGenerators.createTrivialCube(RealmGranite.granite_rock2);

        blockModelGenerators.createTrivialCube(RealmGranite.granite);
        blockModelGenerators.createTrivialCube(RealmGranite.granite3);
        blockModelGenerators.createTrivialCube(RealmGranite.granite4);











        blockModelGenerators.createTrivialCube(RealmStone.MITHRIL_STONE1);
        blockModelGenerators.createTrivialCube(RealmStone.MITHRIL_STONE2);
        blockModelGenerators.createTrivialCube(RealmStone.MITHRIL_COBBLE2);
        blockModelGenerators.createTrivialCube(RealmStone.MOSS_FORGE);
        blockModelGenerators.createTrivialCube(RealmStone.GOLD_COBBLE);
        blockModelGenerators.createTrivialCube(RealmStone.DARK_SOUL_COBBLE);



        blockModelGenerators.createTrivialCube(RealmStone.DARK_SOUL_STONE_RUNE);
        blockModelGenerators.createTrivialCube(Realm_Ruins.STONE_RUNE);
        blockModelGenerators.createTrivialCube(Realm_Ruins.DEEP_STONE_RUNE);
        blockModelGenerators.createTrivialCube(Realm_Ruins.MITHRIL_RUNE1);



        realm6.slab(RealmStone.MITHRIL_COBBLE1_SLAB);


        realm5.slab(RealmStone.MITHRIL_COBBLE_SLAB);

        realm23.slab(RealmStone.LAVA_STONE_SLAB);
        realm23.fence(RealmStone.LAVA_STONE_FENCE);



        realm14.slab(RealmGranite.granite2_1);




        realm4.slab(RealmStone.MITHRIL_STONE_SLAB);


        realm30.fence(Realm_logs.WINTER_OAK_FENCE);


        realm30.wall(Realm_logs.WINTER_OAK_wall);



       realm3.stairs(RealmStone.BLACKSTONE1_STAIR);
       realm24.stairs(RealmBlocks.mithril_wool_stairs);

       realm24.wall(RealmBlocks.mithril_wool_wall);


       realm16.slab(RealmGranite.Granite5_slab);



       realm16.fence(RealmGranite.granite5_fence);
       realm17.fence(Realm_logs.SHADOW_PINE_FENCE);
       realm18.fence(Realm_logs.BURN_BIRCH_fence);

       blockModelGenerators.createTrivialCube(RealmStone.BLACKSTONE2);




        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick1);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick2);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick2_1);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick2_2);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_1);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_3);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_4);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_5);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_6);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_7);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_8);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_10);



        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick1);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick2);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick3);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick4);


        blockModelGenerators.createTrivialCube(RealmTuff.tuff1);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff2);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff3);




        blockModelGenerators.createTrivialCube(RealmStone.dark_stone);
        blockModelGenerators.createTrivialCube(RealmStone.dark_stone2);
        blockModelGenerators.createTrivialCube(RealmStone.deep_stone2);
        blockModelGenerators.createTrivialCube(RealmStone.dark_brick);

















    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(RealmItems.DARK_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(RealmItems.SILVER_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(RealmItems.AURORA_INGOT, ModelTemplates.FLAT_ITEM);









    }


}
