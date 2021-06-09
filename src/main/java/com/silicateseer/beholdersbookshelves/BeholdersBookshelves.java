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
	public static final Block SANDSTONE_BOOKSHELF = register("sandstone_bookshelf", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block RED_SANDSTONE_BOOKSHELF = register("red_sandstone_bookshelf", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block OAK_BOOKSHELF = register("oak_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block BIRCH_BOOKSHELF = register("birch_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SPRUCE_BOOKSHELF = register("spruce_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block JUNGLE_BOOKSHELF = register("jungle_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_OAK_BOOKSHELF = register("dark_oak_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block ACACIA_BOOKSHELF = register("acacia_bookshelf", new Block(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CRIMSON_BOOKSHELF = register("crimson_bookshelf", new Block(FabricBlockSettings.of(Material.NETHER_WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block WARPED_BOOKSHELF = register("warped_bookshelf", new Block(FabricBlockSettings.of(Material.NETHER_WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block STONE_BRICK_SWITCH_BOOKSHELF = register("stone_brick_switch_bookshelf", new BBStoneSwitchBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.REDSTONE);
	public static final Block QUARTZ_SWITCH_BOOKSHELF = register("quartz_switch_bookshelf", new BBStoneSwitchBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.REDSTONE);
	public static final Block PURPUR_SWITCH_BOOKSHELF = register("purpur_switch_bookshelf", new BBStoneSwitchBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.REDSTONE);
	public static final Block SANDSTONE_SWITCH_BOOKSHELF = register("sandstone_switch_bookshelf", new BBStoneSwitchBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.REDSTONE);
	public static final Block RED_SANDSTONE_SWITCH_BOOKSHELF = register("red_sandstone_switch_bookshelf", new BBStoneSwitchBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.REDSTONE);
	
	public static final Block SWITCH_BOOKSHELF = register("switch_bookshelf", new BBWoodSwitchBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	
	public static final Block OAK_SWITCH_BOOKSHELF = register("oak_switch_bookshelf", new BBWoodSwitchBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block BIRCH_SWITCH_BOOKSHELF = register("birch_switch_bookshelf", new BBWoodSwitchBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SPRUCE_SWITCH_BOOKSHELF = register("spruce_switch_bookshelf", new BBWoodSwitchBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block JUNGLE_SWITCH_BOOKSHELF = register("jungle_switch_bookshelf", new BBWoodSwitchBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block DARK_OAK_SWITCH_BOOKSHELF = register("dark_oak_switch_bookshelf", new BBWoodSwitchBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block ACACIA_SWITCH_BOOKSHELF = register("acacia_switch_bookshelf", new BBWoodSwitchBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CRIMSON_SWITCH_BOOKSHELF = register("crimson_switch_bookshelf", new BBWoodSwitchBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block WARPED_SWITCH_BOOKSHELF = register("warped_switch_bookshelf", new BBWoodSwitchBlock(FabricBlockSettings.of(Material.NETHER_WOOD).strength(1.5F)), ItemGroup.BUILDING_BLOCKS);
	
	//public static final Block TEST_SWITCH = register("test_switch", new BBStoneSwitchBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	
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
