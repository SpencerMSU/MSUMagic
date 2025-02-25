package net.msucorp.msumagic;

import net.fabricmc.api.ModInitializer;

import net.msucorp.msumagic.item.ModItemGroups;
import net.msucorp.msumagic.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MSUMagic implements ModInitializer {
	public static final String MOD_ID = "msumagic";
	public static final String MOD_NAME = "MSUMagic";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}