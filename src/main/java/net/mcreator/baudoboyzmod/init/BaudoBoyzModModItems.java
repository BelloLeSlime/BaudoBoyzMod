/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baudoboyzmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.baudoboyzmod.item.*;
import net.mcreator.baudoboyzmod.BaudoBoyzModMod;

import java.util.function.Function;

public class BaudoBoyzModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BaudoBoyzModMod.MODID);
	public static final DeferredItem<Item> BLOBBY_SPAWN_EGG;
	public static final DeferredItem<Item> BLOBBYNITE;
	public static final DeferredItem<Item> LARRY_SPAWN_EGG;
	public static final DeferredItem<Item> BELLO_BOT_SPAWN_EGG;
	public static final DeferredItem<Item> BLOBBY_TOOL_PICKAXE;
	public static final DeferredItem<Item> BLOBBY_TOOL_AXE;
	public static final DeferredItem<Item> BLOBBY_TOOL_SWORD;
	public static final DeferredItem<Item> BLOBBY_TOOL_SHOVEL;
	public static final DeferredItem<Item> BLOBBY_TOOL_HOE;
	public static final DeferredItem<Item> BLOBBY_ARMOR_HELMET;
	public static final DeferredItem<Item> BLOBBY_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> BLOBBY_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> BLOBBY_ARMOR_BOOTS;
	public static final DeferredItem<Item> BLOBBYNITEORE;
	public static final DeferredItem<Item> BOOMBONE;
	public static final DeferredItem<Item> STEAKABOOM;
	public static final DeferredItem<Item> CLEM_SPAWN_EGG;
	public static final DeferredItem<Item> CLEMSWORD;
	static {
		BLOBBY_SPAWN_EGG = register("blobby_spawn_egg", properties -> new SpawnEggItem(BaudoBoyzModModEntities.BLOBBY.get(), properties));
		BLOBBYNITE = register("blobbynite", BlobbyniteItem::new);
		LARRY_SPAWN_EGG = register("larry_spawn_egg", properties -> new SpawnEggItem(BaudoBoyzModModEntities.LARRY.get(), properties));
		BELLO_BOT_SPAWN_EGG = register("bello_bot_spawn_egg", properties -> new SpawnEggItem(BaudoBoyzModModEntities.BELLO_BOT.get(), properties));
		BLOBBY_TOOL_PICKAXE = register("blobby_tool_pickaxe", Blobby_toolPickaxeItem::new);
		BLOBBY_TOOL_AXE = register("blobby_tool_axe", Blobby_toolAxeItem::new);
		BLOBBY_TOOL_SWORD = register("blobby_tool_sword", Blobby_toolSwordItem::new);
		BLOBBY_TOOL_SHOVEL = register("blobby_tool_shovel", Blobby_toolShovelItem::new);
		BLOBBY_TOOL_HOE = register("blobby_tool_hoe", Blobby_toolHoeItem::new);
		BLOBBY_ARMOR_HELMET = register("blobby_armor_helmet", Blobby_armorArmorItem.Helmet::new);
		BLOBBY_ARMOR_CHESTPLATE = register("blobby_armor_chestplate", Blobby_armorArmorItem.Chestplate::new);
		BLOBBY_ARMOR_LEGGINGS = register("blobby_armor_leggings", Blobby_armorArmorItem.Leggings::new);
		BLOBBY_ARMOR_BOOTS = register("blobby_armor_boots", Blobby_armorArmorItem.Boots::new);
		BLOBBYNITEORE = block(BaudoBoyzModModBlocks.BLOBBYNITEORE);
		BOOMBONE = register("boombone", BoomboneItem::new);
		STEAKABOOM = register("steakaboom", SteakaboomItem::new);
		CLEM_SPAWN_EGG = register("clem_spawn_egg", properties -> new SpawnEggItem(BaudoBoyzModModEntities.CLEM.get(), properties));
		CLEMSWORD = register("clemsword", ClemswordItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}