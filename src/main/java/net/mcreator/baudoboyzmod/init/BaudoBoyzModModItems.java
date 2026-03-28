/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baudoboyzmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import net.mcreator.baudoboyzmod.item.BlobbyniteItem;
import net.mcreator.baudoboyzmod.BaudoBoyzModMod;

import java.util.function.Function;

public class BaudoBoyzModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BaudoBoyzModMod.MODID);
	public static final DeferredItem<Item> BLOBBY_SPAWN_EGG;
	public static final DeferredItem<Item> BLOBBYNITE;
	public static final DeferredItem<Item> LARRY_SPAWN_EGG;
	public static final DeferredItem<Item> BELLO_BOT_SPAWN_EGG;
	static {
		BLOBBY_SPAWN_EGG = register("blobby_spawn_egg", properties -> new SpawnEggItem(BaudoBoyzModModEntities.BLOBBY.get(), properties));
		BLOBBYNITE = register("blobbynite", BlobbyniteItem::new);
		LARRY_SPAWN_EGG = register("larry_spawn_egg", properties -> new SpawnEggItem(BaudoBoyzModModEntities.LARRY.get(), properties));
		BELLO_BOT_SPAWN_EGG = register("bello_bot_spawn_egg", properties -> new SpawnEggItem(BaudoBoyzModModEntities.BELLO_BOT.get(), properties));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}