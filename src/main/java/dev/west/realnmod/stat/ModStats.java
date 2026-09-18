package dev.west.realnmod.stat;

import dev.west.realnmod.Realm_Mod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.stats.Stat;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;

public class ModStats {

    public static Stat<?> MANA_USED_TOTAL_STAT = makeCustomStatWithFormat("mana_used_total", (value -> value + " Mana"));


    private static Stat<?> makeCustomStat(String key) {
        Identifier identifier = Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, key);
        Identifier newStat = Registry.register(BuiltInRegistries.CUSTOM_STAT, key, identifier);

        return Stats.CUSTOM.get(newStat, StatFormatter.DEFAULT);
    }

    private static Stat<?> makeCustomStatWithFormat(String key, StatFormatter formatter) {
        Identifier identifier = Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, key);
        Identifier newStat = Registry.register(BuiltInRegistries.CUSTOM_STAT, key, identifier);

        return Stats.CUSTOM.get(newStat, formatter);
    }

    public static void registerStats() {
        Realm_Mod.LOGGER.info("Registering Stats for " + Realm_Mod.MOD_ID);
    }
}
