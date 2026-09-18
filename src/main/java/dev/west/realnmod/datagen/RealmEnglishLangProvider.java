package dev.west.realnmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;



public class RealmEnglishLangProvider extends FabricLanguageProvider {
    public RealmEnglishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider holderLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.realm_mod.mithril_ingot", "mithril_ingot");
        translationBuilder.add("item.realm_mod.blackiron", "blackiron");
        translationBuilder.add("item.realm_mod.silver_ingot", "silver_ingot");
        translationBuilder.add("item.realm_mod.sun_ingot", "sun_ingot");
        translationBuilder.add("item.realm_mod.magic_ingot", "magic_ingot");
        translationBuilder.add("item.realm_mod.dark_ingot", "dark_ingot");
        translationBuilder.add("item.realm_mod.marine_ingot", "marne_ingot");
        translationBuilder.add("item.realm_mod.tin_ingot", "tin_ingot");
        translationBuilder.add("item.realm_mod.crupt_ingot", "crupt_ingot");
        translationBuilder.add("item.realm_mod.mithril_rune_1", "mithril_rune_1");
        translationBuilder.add("item.realm_mod.fire_rune", "fire_rune");
        translationBuilder.add("item.realm_mod.black_rune_evil", "black_rune_evil");
        translationBuilder.add("item.realm_mod.silver_rune_1", "silver_rune_1");
        translationBuilder.add("item.realm_mod.black_steel", "black_steel");
        translationBuilder.add("item.realm_mod.aurora_ingot", "aurora_ingot");

        translationBuilder.add("item.realm_mod.dark_apple", "dark_apple");
        translationBuilder.add("item.realm_mod.silver_apple", "silver_apple");
        translationBuilder.add("item.realm_mod.gold_seeds", "gold_seeds");
        translationBuilder.add("item.realm_mod.goat_feed", "goat_feed");
        translationBuilder.add("item.realm_mod.bright_silver_seed", "bright_silver_seeds");
        translationBuilder.add("item.realm_mod.dark_soul_seed", "dark_soul_seeds");
        translationBuilder.add("item.realm_mod.dark_water_bucket", "dark_water_bucket");
        translationBuilder.add("item.realm_mod.mushroom", "mushroom");



        //wool
        translationBuilder.add("block.realm_mod.evil_wool", "evil_wool");
        translationBuilder.add("block.realm_mod.moss_wool", "moss_wool");
        translationBuilder.add("block.realm_mod.mithril_wool", "mithril_wool");
        translationBuilder.add("block.realm_mod.med_green_wool", "med_green_wool");
        translationBuilder.add("block.realm_mod.med_green_stairs", "med_green_stairs");
        translationBuilder.add("block.realm_mod.med_green_slab", "med_green_slab");
        translationBuilder.add("block.realm_mod.mithril_wool_slab", "mithril_wool_slab");
        translationBuilder.add("block.realm_mod.dark_star_wool", "dark_star_wool");
        translationBuilder.add("block.realm_mod.dark_under_wool", "dark_under_wool");
        translationBuilder.add("block.realm_mod.dark_under_wool_stairs", "dark_under_wool_stairs");
        translationBuilder.add("block.realm_mod.dark_under_wool_slab", "dark_under_wool_slab");
        translationBuilder.add("block.realm_mod.mithril_wool_stairs", "mithril_wool_stairs");
        translationBuilder.add("block.realm_mod.mithril_wool_wall", "mithril_wool_wall");
        translationBuilder.add("block.realm_mod.epic_wool", "epic_wool");
        translationBuilder.add("block.realm_mod.elder_wool", "elder_wool");
        translationBuilder.add("block.realm_mod.woolforge_wool", "woolforge_wool");

        //stones
        translationBuilder.add("block.realm_mod.lava_stone_1", "lava_stone_1");
        translationBuilder.add("block.realm_mod.lava_stone_fence", "lava_stone_fence");
        translationBuilder.add("block.realm_mod.lava_stone", "lava_stone");
        translationBuilder.add("block.realm_mod.lava_stone_slab", "lava_stone_slab");
        translationBuilder.add("block.realm_mod.aged_stone_brick2", "aged_stone_brick2");
        translationBuilder.add("block.realm_mod.aged_stone_brick1", "aged_stone_brick1");
        translationBuilder.add("block.realm_mod.aged_stone_brick", "aged_stone_brick");
        translationBuilder.add("block.realm_mod.aged_stone_1", "aged_stone_1");
        translationBuilder.add("block.realm_mod.aged_stone_slab", "aged_stone_slab");
        translationBuilder.add("block.realm_mod.aged_stone", "aged_stone");
        translationBuilder.add("block.realm_mod.stone_brick5", "stone_brick5");
        translationBuilder.add("block.realm_mod.stone_brick4", "stone_brick4");
        translationBuilder.add("block.realm_mod.stone_brick_m1", "stone_brick_m1");
        translationBuilder.add("block.realm_mod.stone_brick_m", "stone_brick_m");
        translationBuilder.add("block.realm_mod.stone_age", "stone_age");
        translationBuilder.add("block.realm_mod.stone", "stone");
        translationBuilder.add("block.realm_mod.stone1", "stone1");
        translationBuilder.add("block.realm_mod.stone2", "stone2");
        translationBuilder.add("block.realm_mod.stone3", "stone3");
        translationBuilder.add("block.realm_mod.stone_1", "stone_1");
        translationBuilder.add("block.realm_mod.stone_2", "stone_2");
        translationBuilder.add("block.realm_mod.stone_3", "stone_3");
        translationBuilder.add("block.realm_mod.stone_4", "stone_4");
        translationBuilder.add("block.realm_mod.dark_stone", "dark_stone");
        translationBuilder.add("block.realm_mod.dark_stonebrick", "dark_stonebrick");
        translationBuilder.add("block.realm_mod.dark_stone1", "dark_stone1");
        translationBuilder.add("block.realm_mod.dark_stone2", "dark_stone2");
        translationBuilder.add("block.realm_mod.dark_brick", "dark_brick");
        translationBuilder.add("block.realm_mod.dark_stone_slab", "dark_stone_slab");
        translationBuilder.add("block.realm_mod.red_stone", "red_stone");
        translationBuilder.add("block.realm_mod.red_stone1", "red_stone1");

        translationBuilder.add("block.realm_mod.chalk1_2", "chalk1_2");
        translationBuilder.add("block.realm_mod.chalk", "chalk");
        translationBuilder.add("block.realm_mod.chalk1", "chalk1");
        translationBuilder.add("block.realm_mod.chalk2", "chalk2");
        translationBuilder.add("block.realm_mod.chalk3", "chalk3");
        translationBuilder.add("block.realm_mod.chalk4", "chalk4");
        translationBuilder.add("block.realm_mod.chalk4_s", "chalk4_s");
        translationBuilder.add("block.realm_mod.chalk4_s1", "chalk4_s1");
        translationBuilder.add("block.realm_mod.chalk_3", "chalk_3");
        translationBuilder.add("block.realm_mod.chalk1_3", "chalk1_3");
        translationBuilder.add("block.realm_mod.chalk0_3", "chalk0_3");

        translationBuilder.add("block.realm_mod.granite_rock", "granite_rock");
        translationBuilder.add("block.realm_mod.granite_rock1", "granite_rock1");
        translationBuilder.add("block.realm_mod.granite_rock2", "granite_rock2");
        translationBuilder.add("block.realm_mod.granite", "granite");
        translationBuilder.add("block.realm_mod.granite1", "granite1");
        translationBuilder.add("block.realm_mod.granite2", "granite2");
        translationBuilder.add("block.realm_mod.granite2_1", "granite2_1");
        translationBuilder.add("block.realm_mod.granite2_2", "granite2_2");
        translationBuilder.add("block.realm_mod.granite3", "granite3");
        translationBuilder.add("block.realm_mod.granite4", "granite4");
        translationBuilder.add("block.realm_mod.granite5", "granite5");
        translationBuilder.add("block.realm_mod.granite5_fence", "granite5_fence ");
        translationBuilder.add("block.realm_mod.granite6", "granite6");
        translationBuilder.add("block.realm_mod.granite5_slab", "granite5_slab");
        translationBuilder.add("block.realm_mod.gloomcaver", "gloomcaver");
        translationBuilder.add("block.realm_mod.kragmor", "kragmor");
        translationBuilder.add("block.realm_mod.kragmor_slab", "kragmor_slab");




        translationBuilder.add("block.realm_mod.stone_block", "stone_block");
        translationBuilder.add("block.realm_mod.stonebrick", "stonebrick");
        translationBuilder.add("block.realm_mod.stone_rock_n1", "stone_rock_n1");
        translationBuilder.add("block.realm_mod.stone_rock_n", "stone_rock_n");
        translationBuilder.add("block.realm_mod.stone_rock2", "stone_rock2");
        translationBuilder.add("block.realm_mod.stone_rock2_1", "stone_rock2_1");
        translationBuilder.add("block.realm_mod.stone_rock2_slab", "stone_rock2_slab");
        translationBuilder.add("block.realm_mod.stone_rock2_wall", "stone_rock2_wall");
        translationBuilder.add("block.realm_mod.stone_rock1", "stone_rock1");
        translationBuilder.add("block.realm_mod.stone_rock", "stone_rock");
        translationBuilder.add("block.realm_mod.stone_deep_rock1", "stone_deep_rock1");
        translationBuilder.add("block.realm_mod.stone_deep_rock", "stone_deep_rock");
        translationBuilder.add("block.realm_mod.stone_brick", "stone_brick");
        translationBuilder.add("block.realm_mod.stone_brick1", "stone_brick1");
        translationBuilder.add("block.realm_mod.stone_brick2", "stone_brick2");
        translationBuilder.add("block.realm_mod.stone_brick2_1", "stone_brick2_1");
        translationBuilder.add("block.realm_mod.stone_brick2_2", "stone_brick2_2");
        translationBuilder.add("block.realm_mod.stone_brick_1", "stone_brick_1");
        translationBuilder.add("block.realm_mod.stone_brick_2", "stone_brick_2");
        translationBuilder.add("block.realm_mod.stone_brick_2_slab", "stone_brick_2_slab");
        translationBuilder.add("block.realm_mod.stone_brick_3", "stone_brick_3");
        translationBuilder.add("block.realm_mod.stone_brick_4", "stone_brick_4");
        translationBuilder.add("block.realm_mod.stone_brick_5", "stone_brick_5");
        translationBuilder.add("block.realm_mod.stone_brick_6", "stone_brick_6");
        translationBuilder.add("block.realm_mod.stone_brick_7", "stone_brick_7");
        translationBuilder.add("block.realm_mod.stone_brick_8", "stone_brick_8");
        translationBuilder.add("block.realm_mod.stone_brick_9", "stone_brick_9");
        translationBuilder.add("block.realm_mod.stone_brick_9_slab", "stone_brick_9_slab");
        translationBuilder.add("block.realm_mod.stone_brick_10", "stone_brick_10");
        translationBuilder.add("block.realm_mod.stone_brick_11", "stone_brick_11");
        translationBuilder.add("block.realm_mod.stone_brick_11_slab", "stone_brick_11_slab");
        translationBuilder.add("block.realm_mod.white_stone", "white_stone");
        translationBuilder.add("block.realm_mod.white_stone_1", "white_stone_1");
        translationBuilder.add("block.realm_mod.white_stone_half", "white_stone_half");
        translationBuilder.add("block.realm_mod.white_stone2", "white_stone2");



        translationBuilder.add("block.realm_mod.tuff_brick", "tuff_brick");
        translationBuilder.add("block.realm_mod.tuff_brick1", "tuff_brick1");
        translationBuilder.add("block.realm_mod.tuff_brick2", "tuff_brick2");
        translationBuilder.add("block.realm_mod.tuff_brick3", "tuff_brick3");






        translationBuilder.add("block.realm_mod.tuff1", "tuff1");
        translationBuilder.add("block.realm_mod.tuff2", "tuff2");
        translationBuilder.add("block.realm_mod.tuff3", "tuff3");

        translationBuilder.add("block.realm_mod.aged_limestone", "aged_limestone");
        translationBuilder.add("block.realm_mod.aged_limestone_brick", "aged_limestone_brick");
        translationBuilder.add("block.realm_mod.aged_limestone_brick1", "aged_limestone_brick1");
        translationBuilder.add("block.realm_mod.aged_limestone_brick2", "aged_limestone_brick2");
        translationBuilder.add("block.realm_mod.aged_limestone_brick3", "aged_limestone_brick3");
        translationBuilder.add("block.realm_mod.aged_limestone2", "aged_limestone2");
        translationBuilder.add("block.realm_mod.aged_limestone1", "aged_limestone1");
        translationBuilder.add("block.realm_mod.aged_limestone3", "aged_limestone3");
        translationBuilder.add("block.realm_mod.aged_limestone4", "aged_limestone4");
        translationBuilder.add("block.realm_mod.aged_limestone5", "aged_limestone5");
        translationBuilder.add("block.realm_mod.aged_limestone_block", "aged_limestone_block");
        translationBuilder.add("block.realm_mod.aged_limestone_spike", "aged_limestone_spike");
        translationBuilder.add("block.realm_mod.aged_limestone_small", "aged_limestone_small");
        translationBuilder.add("block.realm_mod.aged_limestone_3", "aged_limestone_3");
        translationBuilder.add("block.realm_mod.aged_limestone_c", "aged_limestone_c");
        translationBuilder.add("block.realm_mod.rock_stone_s", "rock_stone_s");
        translationBuilder.add("block.realm_mod.dark_rock", "dark_rock");
        translationBuilder.add("block.realm_mod.dark_rock1", "dark_rock1");
        translationBuilder.add("block.realm_mod.dark_rock2", "dark_rock2");
        translationBuilder.add("block.realm_mod.rock_stone", "rock_stone");
        translationBuilder.add("block.realm_mod.deep_stone", "deep_stone");
        translationBuilder.add("block.realm_mod.deep_stone1", "deep_stone1");
        translationBuilder.add("block.realm_mod.deep_black_stone", "deep_black_stone");
        translationBuilder.add("block.realm_mod.dark_stone_evil", "dark_stone_evil");
        translationBuilder.add("block.realm_mod.deep_stone2", "deep_stone2");
        translationBuilder.add("block.realm_mod.deep_stone_rune", "deep_stone_rune");
        translationBuilder.add("block.realm_mod.dark_stone_deep", "dark_stone_deep");
        translationBuilder.add("block.realm_mod.dark_stone_deep_brick", "dark_stone_deep_brick");
        translationBuilder.add("block.realm_mod.dark_stone_deep_brick1", "dark_stone_deep_brick1");
        translationBuilder.add("block.realm_mod.dark_stone_deep1", "dark_stone_deep1");
        translationBuilder.add("block.realm_mod.gorvask_stone", "gorvask_stone");

        translationBuilder.add("block.realm_mod.mithril_glow", "mithril_glow");
        translationBuilder.add("block.realm_mod.dark_soul_glow", "dark_soul_glow");
        translationBuilder.add("block.realm_mod.gold_light_glow", "gold_light_glow");



        //mushrooms
        translationBuilder.add("block.realm_mod.angel_mushroom", "angel_mushroom");
        translationBuilder.add("block.realm_mod.marshmoon_mushroom", "marshmoon_mushroom");
        translationBuilder.add("block.realm_mod.dark_soul_mushroom", "dark_soul_mushroom");
        translationBuilder.add("block.realm_mod.silver_mushroom", "silver_mushroom");
        translationBuilder.add("block.realm_mod.poss_mushroom", "poss_mushroom");
        translationBuilder.add("block.realm_mod.mithril_mushroom", "mithril_mushroom");
        translationBuilder.add("block.realm_mod.gimmerstalk", "gimmerstalk");
        translationBuilder.add("block.realm_mod.grimcap", "grimcap");


        translationBuilder.add("block.realm_mod.desert_rock", "desert_rock");
        translationBuilder.add("block.realm_mod.desert_rock2_c", "desert_rock2_c");
        translationBuilder.add("block.realm_mod.desert_rock1_c", "desert_rock1_c");
        translationBuilder.add("block.realm_mod.desert_rock1", "desert_rock1");
        translationBuilder.add("block.realm_mod.desert_rock2", "desert_rock2");




        //logs
        translationBuilder.add("block.realm_mod.cedarbrook_log", "cedarbrook_log");
        translationBuilder.add("block.realm_mod.bramblegrove_log", "bramblegrove_log");
        translationBuilder.add("block.realm_mod.obant_log", "obant_log");
        translationBuilder.add("block.realm_mod.foxglove_log", "foxglove_log");
        translationBuilder.add("block.realm_mod.shadow_birch_leaves", "shadow_birch_leaves");
        translationBuilder.add("block.realm_mod.eswell_leaves", "eswell_leaves");
        translationBuilder.add("block.realm_mod.alder_log", "alder_log");
        translationBuilder.add("block.realm_mod.crystal_oak_log", "crystal_oak_log");
        translationBuilder.add("block.realm_mod.white_pine_log", "white_pine_log");
        translationBuilder.add("block.realm_mod.moss_oak_log", "moss_oak_log");
        translationBuilder.add("block.realm_mod.ask_oak_log", "ask_oak_log");
        translationBuilder.add("block.realm_mod.ask_birch_log", "ask_brich_log");
        translationBuilder.add("block.realm_mod.mithril_log", "mithril_log");
        translationBuilder.add("block.realm_mod.sun_oak_log", "sun_oak_log");
        translationBuilder.add("block.realm_mod.sun_oak_planks", "sun_oak_planks");
        translationBuilder.add("block.realm_mod.sun_oak_fence", "sun_oak_fence");
        translationBuilder.add("block.realm_mod.dark_soul_log", "dark_soul_log");
        translationBuilder.add("block.realm_mod.dark_soul_log_chain", "dark_soul_log_chain");
        translationBuilder.add("block.realm_mod.dark_branch", "dark_branch");
        translationBuilder.add("block.realm_mod.dark_soul_planks", "dark_soul_planks");
        translationBuilder.add("block.realm_mod.dark_soul_leaves", "dark_soul_leaves");
        translationBuilder.add("block.realm_mod.dark_soul_stairs", "dark_soul_stairs");
        translationBuilder.add("block.realm_mod.white_oak_log", "white_oak_log");
        translationBuilder.add("block.realm_mod.white_oak_planks", "white_oak_planks");
        translationBuilder.add("block.realm_mod.winter_birch_log", "winter_birch_log");
        translationBuilder.add("block.realm_mod.hollow_elber_log", "hollow_elber_log");
        translationBuilder.add("block.realm_mod.blood_oak_log", "blood_oak_log");
        translationBuilder.add("block.realm_mod.blood_oak_leaves", "blood_oak_leaves");
        translationBuilder.add("block.realm_mod.burn_birch_log", "burn_birch_log");
        translationBuilder.add("block.realm_mod.burn_birch_planks", "burn_birch_planks");
        translationBuilder.add("block.realm_mod.burn_birch_wall", "burn_birch_wall");
        translationBuilder.add("block.realm_mod.burn_birch_mim_wall", "burn_birch_mim_wall");
        translationBuilder.add("block.realm_mod.burn_birch_slab", "burn_birch_slab");
        translationBuilder.add("block.realm_mod.burn_birch_fence", "burn_birch_fence");
        translationBuilder.add("block.realm_mod.angel_birch_log", "angel_birch_log");
        translationBuilder.add("block.realm_mod.thunder_oak_log", "thunder_oak_log");
        translationBuilder.add("block.realm_mod.wniter_oak_log", "winter_oak_log");
        translationBuilder.add("block.realm_mod.winter_oak_planks", "winter_oak_planks");
        translationBuilder.add("block.realm_mod.winter_oak_fence", "winter_oak_fence");
        translationBuilder.add("block.realm_mod.winter_oak_wall", "winter_oak_wall");
        translationBuilder.add("block.realm_mod.winter_oak_leaves", "winter_oak_leaves");
        translationBuilder.add("block.realm_mod.white_pine_leaves", "white_pine_leaves");
        translationBuilder.add("block.realm_mod.sun_oak_leaves", "sun_oak_leaves");
        translationBuilder.add("block.realm_mod.mithril_leaves", "mithril_leaves");
        translationBuilder.add("block.realm_mod.moonshade_birch_log", "moonshade_birch_log");
        translationBuilder.add("block.realm_mod.light_birch_log", "light_birch_log");
        translationBuilder.add("block.realm_mod.eswell_birch_log", "eswell_birch_log");
        translationBuilder.add("block.realm_mod.eswell_birch_planks", "eswell_birch_planks");
        translationBuilder.add("block.realm_mod.eswell_birch_wall", "eswell_birch_wall");
        translationBuilder.add("block.realm_mod.winter_oak_log", "winter_oak_log");
        translationBuilder.add("block.realm_mod.gold_shadow_log", "gold_shadow_log");
        translationBuilder.add("block.realm_mod.veil_wood_log", "veil_wood_log");
        translationBuilder.add("block.realm_mod.emberiar_log", "emberiar_log");
        translationBuilder.add("block.realm_mod.mistwood_log", "mistwood_log");
        translationBuilder.add("block.realm_mod.deepcore_log", "deepcore_log");
        translationBuilder.add("block.realm_mod.shadow_birch_log", "shadow_birch_log");
        translationBuilder.add("block.realm_mod.shadow_pine_log", "shadow_pine_log");
        translationBuilder.add("block.realm_mod.shadow_pine_planks", "shadow_pine_planks");
        translationBuilder.add("block.realm_mod.org_willow_log", "org_willow_log");
        translationBuilder.add("block.realm_mod.starbloom_log", "starbloom_log");
        translationBuilder.add("block.realm_mod.grim_birch_log", "grim_birch_log");
        translationBuilder.add("block.realm_mod.spus_log", "spus_log");
        translationBuilder.add("block.realm_mod.urban_log", "urban_log");
        translationBuilder.add("block.realm_mod.shadow_pine_fence", "shadow_pine_fence");
        translationBuilder.add("block.realm_mod.shadow_eye_pine_log", "shadow_eye_pine_log");
        translationBuilder.add("block.realm_mod.rhyolite1_c", "rhyolite1_c");
        translationBuilder.add("block.realm_mod.rhyolite", "rhyolite");
        translationBuilder.add("block.realm_mod.rhyolite1", "rhyolite1");
        translationBuilder.add("block.realm_mod.corrupt_beech_log", "corrupt_beech_log");
        translationBuilder.add("block.realm_mod.corrupt_beech_leaves", "corrupt_beech_leaves");
        translationBuilder.add("block.realm_mod.eswell_birch_leaves", "eswell_birch_leaves");

        translationBuilder.add("block.realm_mod.light_mithril_pillar_log", "light_mithril_pillar_log");
        translationBuilder.add("block.realm_mod.crystal_pillar_log", "crystal_pillar_log");
        translationBuilder.add("block.realm_mod.dark_pillar_log", "dark_pillar_log");
        translationBuilder.add("block.realm_mod.desert_pillar_log", "desert_pillar_log");
        translationBuilder.add("block.realm_mod.pillar_log", "pillar_log");
        translationBuilder.add("block.realm_mod.pillar1_log", "pillar1_log");
        translationBuilder.add("block.realm_mod.pillar1_rune_log", "pillar1_rune_log");
        translationBuilder.add("block.realm_mod.pillar2_rune_log", "pillar2_rune_log");
        translationBuilder.add("block.realm_mod.red_wood_log", "red_wood_log");
        translationBuilder.add("block.realm_mod.blue_spruce_log", "blue_spruce_log");
        translationBuilder.add("block.realm_mod.silver_oak_log", "silver_oak_log");
        translationBuilder.add("block.realm_mod.sorcerers_oak_log", "sorcerers_oak_log");
        translationBuilder.add("block.realm_mod.willow_bloom_log", "willow_bloom_log");
        translationBuilder.add("block.realm_mod.maplehaven_log", "maplehaven_log");
        translationBuilder.add("block.realm_mod.elderwell_log", "elderwell_log");

        translationBuilder.add("block.realm_mod.mithril_block", "mithril_block");
        translationBuilder.add("block.realm_mod.silver_block", "silver_block");
        translationBuilder.add("block.realm_mod.ash_block", "ash_block");
        translationBuilder.add("block.realm_mod.light_yellow_block", "light_yellow_block");
        translationBuilder.add("block.realm_mod.dark_green_block", "dark_green_block");
        translationBuilder.add("block.realm_mod.dark_glow_block", "dark_glow_block");
        translationBuilder.add("block.realm_mod.dark_glom_block", "dark_glom_block");
        translationBuilder.add("block.realm_mod.light_gray_block", "light_gray_block");
        translationBuilder.add("block.realm_mod.light_org_block", "light_org_block");

        translationBuilder.add("block.realm_mod.crate_log", "crate_log");
        translationBuilder.add("block.realm_mod.crate1_log", "crate1_log");

        translationBuilder.add("block.realm_mod.evil_shards", "evil_shards");
        translationBuilder.add("block.realm_mod.blackiron_shards_block", "blackiron_shards_block");
        translationBuilder.add("block.realm_mod.mithril_shards", "mithril_shards");
        translationBuilder.add("block.realm_mod.large_mithril_shards", "large_mithril_shards");
        translationBuilder.add("block.realm_mod.med_mithril_shards", "med_mithril_shards");
        translationBuilder.add("block.realm_mod.black_poss_shards", "black_poss_shards");
        translationBuilder.add("block.realm_mod.voryn_shards", "voryn_shards");
        translationBuilder.add("block.realm_mod.sylvarite", "sylvarite");
        translationBuilder.add("block.realm_mod.beryluv", "beryluv");
        translationBuilder.add("block.realm_mod.quartzon", "quartzon");
        translationBuilder.add("block.realm_mod.sylvarite_block", "sylvarite_block");
        translationBuilder.add("block.realm_mod.glizz_block", "glizz_block");
        translationBuilder.add("block.realm_mod.rammer_block", "rammer_block");
        translationBuilder.add("block.realm_mod.beige_block", "beige_block");
        translationBuilder.add("block.realm_mod.azurite_crystal", "azurite_crystal");
        translationBuilder.add("block.realm_mod.dazzling_crystal", "dazzling_crystal");
        translationBuilder.add("block.realm_mod.anorite_block", "anorite_block");
        translationBuilder.add("block.realm_mod.aurora_block", "aurora_block");
        translationBuilder.add("block.realm_mod.crystalta_block", "crystalta_block");
        translationBuilder.add("block.realm_mod.crystalta_crystal", "crystalta_crystal");
        translationBuilder.add("block.realm_mod.aurora_crystal", "aurora_crystal");
        translationBuilder.add("block.realm_mod.khrot_crystal", "khrot_crystal");
        translationBuilder.add("block.realm_mod.khrot_block", "khrot_block");
        translationBuilder.add("block.realm_mod.anorite", "anorite");


        translationBuilder.add("block.realm_mod.ruby_crystal", "ruby_crystal");
        translationBuilder.add("block.realm_mod.small_crystal", "small_crystal");
        translationBuilder.add("block.realm_mod.starlace", "starlace");

        translationBuilder.add("block.realm_mod.light_limestone2", "light_limestone2");
        translationBuilder.add("block.realm_mod.light_limestone_1", "light_limestone_1");
        translationBuilder.add("block.realm_mod.light_limestone1", "light_limestone1");
        translationBuilder.add("block.realm_mod.light_limestone", "light_limestone");

        translationBuilder.add("block.realm_mod.limestone", "limestone");
        translationBuilder.add("block.realm_mod.red_limestone", "red_limestone");
        translationBuilder.add("block.realm_mod.limestone1", "limestone1");
        translationBuilder.add("block.realm_mod.limestone2", "limestone2");
        translationBuilder.add("block.realm_mod.light_limestone2_1", "light_limestone2_1");
        translationBuilder.add("block.realm_mod.light_limestone2_2", "light_limestone2_2");
        translationBuilder.add("block.realm_mod.limestone3", "limestone3");
        translationBuilder.add("block.realm_mod.limestone4", "limestone4");
        translationBuilder.add("block.realm_mod.limestone5", "limestone5");
        translationBuilder.add("block.realm_mod.limestone6", "limestone6");
        translationBuilder.add("block.realm_mod.limestone7", "limestone7");
        translationBuilder.add("block.realm_mod.limestone8", "limestone8");
        translationBuilder.add("block.realm_mod.mithril_stone", "mithril_stone");
        translationBuilder.add("block.realm_mod.mithril_stone1", "mithril_stone1");
        translationBuilder.add("block.realm_mod.mithril_stone2", "mithril_stone2");
        translationBuilder.add("block.realm_mod.mithril_stone_slab", "mithril_stone_slab");

        translationBuilder.add("block.realm_mod.mithril_cobble", "mithril_cobble");
        translationBuilder.add("block.realm_mod.mithril_cobble1", "mithril_cobble1");
        translationBuilder.add("block.realm_mod.mithril_cobble2", "mithril_cobble2");
        translationBuilder.add("block.realm_mod.mithril_cobble_slab", "mithril_cobble_slab");
        translationBuilder.add("block.realm_mod.mithril_cobble1_slab", "mithril_cobble1_slab");
        translationBuilder.add("block.realm_mod.moss_forge", "moss_forge");
        translationBuilder.add("block.realm_mod.gold_cobble", "gold_cobble");
        translationBuilder.add("block.realm_mod.dark_soul_cobble", "dark_soul_cobble");
        translationBuilder.add("block.realm_mod.dark_soul_stone_rune", "dark_soul_stone_rune");



        translationBuilder.add("block.realm_mod.blackstone_sprike", "blackstone_spike");
        translationBuilder.add("block.realm_mod.blackstone1", "blackstone1");
        translationBuilder.add("block.realm_mod.blackstone2", "blackstone2");
        translationBuilder.add("block.realm_mod.blackstone1_stair", "blackstone1_stair");


        translationBuilder.add("block.realm_mod.desert_stone2_c", "desert_stone2_c");
        translationBuilder.add("block.realm_mod.desert_stone1_c", "desert_stone1_c");
        translationBuilder.add("block.realm_mod.desert_stone", "desert_stone");
        translationBuilder.add("block.realm_mod.desert_stone1", "desert_stone1");
        translationBuilder.add("block.realm_mod.desert_stone2", "desert_stone2");
        translationBuilder.add("block.realm_mod.desert_stone3", "desert_stone3");
        translationBuilder.add("block.realm_mod.desert_stone4", "desert_stone4");
        translationBuilder.add("block.realm_mod.desert_stone_rock", "desert_stone_rock");
        translationBuilder.add("block.realm_mod.desert_stone_rock1", "desert_stone_rock1");


        translationBuilder.add("block.realm_mod.mithril_rune", "mithril_rune");
        translationBuilder.add("block.realm_mod.mithril_rune1", "mithril_rune1");
        translationBuilder.add("block.realm_mod.silver_rune", "silver_rune");
        translationBuilder.add("block.realm_mod.dark_rune", "dark_rune");
        translationBuilder.add("block.realm_mod.dark_rune1", "dark_rune1");
        translationBuilder.add("block.realm_mod.dark_rune1_slab", "dark_rune1_slab");
        translationBuilder.add("block.realm_mod.evil_rune", "evil_rune");
        translationBuilder.add("block.realm_mod.evil_rune1", "evil_rune1");
        translationBuilder.add("block.realm_mod.dark_evil_rune", "dark_evil_rune");
        translationBuilder.add("block.realm_mod.stone_rune", "stone_rune");
        translationBuilder.add("block.realm_mod.light_birch_rune", "light_birch_rune");
        translationBuilder.add("block.realm_mod.birch_rune", "birch_rune");
        translationBuilder.add("block.realm_mod.deepslate_rune", "deepslate_rune");
        translationBuilder.add("block.realm_mod.deepslate_rune1", "deepslate_rune1");
        translationBuilder.add("block.realm_mod.deepslate_rune2", "deepslate_rune2");

        translationBuilder.add("block.realm_mod.mithril_ore", "mithril_ore");
        translationBuilder.add("block.realm_mod.blackiron_ore", "blackiron_ore");
        translationBuilder.add("block.realm_mod.silver_ore", "silver_ore");
        translationBuilder.add("block.realm_mod.grizz_ore", "grizz_ore");
        translationBuilder.add("block.realm_mod.sun_ore", "sun_ore");
        translationBuilder.add("block.realm_mod.tin_ore", "tin_ore");
        translationBuilder.add("block.realm_mod.crupt_ore", "crupt_ore");
        translationBuilder.add("block.realm_mod.black_steel_ore", "black_steel_ore");

        translationBuilder.add("block.realm_mod.deep_silver_stone", "deep_silver_stone");
        translationBuilder.add("block.realm_mod.deep_silver_stone1", "deep_silver_stone1");

        translationBuilder.add("item.realm_fantasy", "fantasy");
        translationBuilder.add("item.realm_Item", "Item");
        translationBuilder.add("item.realm_food", "food");
        translationBuilder.add("item.realm_stone", "stone");
        translationBuilder.add("item.realm_runes", "runes");
        translationBuilder.add("item.realm_stone_brick", "stone_brick");
        translationBuilder.add("item.realm_tuff", "tuff");
        translationBuilder.add("item.realm_mushroom", "mushroom");
        translationBuilder.add("item.realm_ore", "ore");
        translationBuilder.add("item.realm_logs", "logs");
        translationBuilder.add("item.realm_limestone", "limestone");
        translationBuilder.add("item.realm_light_limestone", "light_limestone");
        translationBuilder.add("item.realm_chalk", "chalk");
        translationBuilder.add("item.realm_rhyolite", "rhyolite");
        translationBuilder.add("item.realm_desert", "desert");
        translationBuilder.add("item.realm_granite", "granite");
        translationBuilder.add("item.realm.pillar", "pillar");
        translationBuilder.add("item.realm.crate", "crate");
        translationBuilder.add("item.realm.grass", "grass");
        translationBuilder.add("item.realm.wool", "wool");




    }


}

