package net.polaryte.mod;

import net.fabricmc.api.ModInitializer;

import net.polaryte.item.ModItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Polaryte implements ModInitializer {
	public static final String MOD_ID = "polaryte";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.RegisterModItems();
	}
}