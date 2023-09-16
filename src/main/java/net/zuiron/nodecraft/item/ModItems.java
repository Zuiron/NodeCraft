package net.zuiron.nodecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zuiron.nodecraft.NodeCraft;
import net.zuiron.nodecraft.block.ModBlocks;

public class ModItems {

    public static final Item COPPER_COIN = registerItem("copper_coin",
            new Item(new FabricItemSettings()));
    public static final Item IRON_COIN = registerItem("iron_coin",
            new Item(new FabricItemSettings()));
    public static final Item GOLD_COIN = registerItem("gold_coin",
            new Item(new FabricItemSettings()));
    public static final Item DIAMOND_COIN = registerItem("diamond_coin",
            new Item(new FabricItemSettings()));
    public static final Item EMERALD_COIN = registerItem("emerald_coin",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NodeCraft.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        //entries.add(COPPER_COIN);
        //entries.add(ModBlocks.NODE_BLOCK);
    }

    public static void registerModItems() {
        NodeCraft.LOGGER.info("Registering Mod Items for: " + NodeCraft.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
