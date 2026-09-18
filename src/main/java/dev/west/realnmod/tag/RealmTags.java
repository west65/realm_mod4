package dev.west.realnmod.tag;

import dev.west.realnmod.Realm_Mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;



public class RealmTags {
    public static class BLOCK {



        public static final TagKey<Block> fantasy_wool = createTag("fantasy_wool");
        public static final TagKey<Block> evil = createTag("evil");
        public static final TagKey <Block> fantasy_grass = createTag("fantasy_grass");
        public static final TagKey <Block> granite = createTag("granite");
        public static final  TagKey<Block> desert = createTag("desert");
        public static final TagKey<Block> rhyoite = createTag("rhyoite");
        public static final TagKey<Block> CHALK = createTag("chalk");
        public static final TagKey<Block> LIGHT_lime = createTag("light_lime");
        public static final TagKey<Block> LIMESTONE = createTag("limestone");
        public static final TagKey<Block> STONE = createTag("stone");
        private static TagKey<Block> createTag(String id) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, id));
        }
    }
    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");







        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name));
        }
    }




    }
