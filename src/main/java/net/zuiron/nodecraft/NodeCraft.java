package net.zuiron.nodecraft;

import net.fabricmc.api.ModInitializer;

import net.zuiron.nodecraft.block.ModBlocks;
import net.zuiron.nodecraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NodeCraft implements ModInitializer {
	public static final String MOD_ID = "nodecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}