package dev.west.realnmod;

import dev.west.realnmod.datagen.*;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;


public class Realm_ModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();



		pack.addProvider(RealmTagProvider::new);
		pack.addProvider(RealmLootTableProvider::new);
		pack.addProvider(RealmModelProvider::new);
		pack.addProvider(RealmItemTagProvider::new);
		pack.addProvider(RealmEnglishLangProvider::new);





	}
}
