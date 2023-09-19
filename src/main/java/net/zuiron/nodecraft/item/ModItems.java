package net.zuiron.nodecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zuiron.nodecraft.NodeCraft;

public class ModItems {

    public static final Item COPPER_COIN = registerItem("copper_coin",
            new Item(new FabricItemSettings()));
    public static final Item SILVER_COIN = registerItem("silver_coin",
            new Item(new FabricItemSettings()));
    public static final Item GOLD_COIN = registerItem("gold_coin",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NodeCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NodeCraft.LOGGER.info("Registering Mod Items for: " + NodeCraft.MOD_ID);
    }
}
