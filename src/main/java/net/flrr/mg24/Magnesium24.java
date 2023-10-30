package net.flrr.mg24;

import net.fabricmc.api.ModInitializer;

import net.flrr.mg24.item.ModItemGroups;
import net.flrr.mg24.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Magnesium24 implements ModInitializer {
	public static final String MOD_ID = "magnesium24";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroup();


		ModItems.registerModItems();
	}
}