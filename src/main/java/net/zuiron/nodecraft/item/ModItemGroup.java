package net.zuiron.nodecraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zuiron.nodecraft.NodeCraft;
import net.zuiron.nodecraft.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup NODECRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NodeCraft.MOD_ID, "nodecraft_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nodecraft_group"))
                    .icon(() -> new ItemStack(ModItems.GOLD_COIN)).entries((displayContext, entries) -> {
                        //items
                        entries.add(ModItems.COPPER_COIN);
                        entries.add(ModItems.SILVER_COIN);
                        entries.add(ModItems.GOLD_COIN);

                        //blocks
                        entries.add(ModBlocks.NODE_BLOCK);

                    }).build());

    public static void registerItemGroups() {

    }
}
