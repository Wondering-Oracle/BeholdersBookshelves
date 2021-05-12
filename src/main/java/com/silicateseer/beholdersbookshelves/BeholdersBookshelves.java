package com.silicateseer.beholdersbookshelves;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeholdersBookshelves implements ModInitializer {
		
	public static final String MODID = "beholdersbookshelves";
	
	public static final Block STONE_BRICK_BOOKSHELF = register("stone_brick_bookshelf", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block QUARTZ_BOOKSHELF = register("quartz_bookshelf", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block PURPUR_BOOKSHELF = register("purpur_bookshelf", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	
	@Override
	public void onInitialize() {
		
	}
	
	public static Block register(String name, Block block, ItemGroup tab) {
		Registry.register(Registry.BLOCK, new Identifier(MODID, name), block);
		BlockItem item = new BlockItem(block, new Item.Settings().group(tab));
		register(name, item);
		return block;
	}

	public static Item register(String name, Item item) {
		Registry.register(Registry.ITEM, new Identifier(MODID, name), item);
		return item;
	}
}
