/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baudoboyzmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.baudoboyzmod.BaudoBoyzModMod;

@EventBusSubscriber
public class BaudoBoyzModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BaudoBoyzModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BAUDOBOYZ = REGISTRY.register("baudoboyz",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.baudo_boyz_mod.baudoboyz")).icon(() -> new ItemStack(BaudoBoyzModModItems.BLOBBY_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_PICKAXE.get());
				tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_AXE.get());
				tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_SWORD.get());
				tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_SHOVEL.get());
				tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_HOE.get());
				tabData.accept(BaudoBoyzModModItems.BLOBBY_ARMOR_HELMET.get());
				tabData.accept(BaudoBoyzModModItems.BLOBBY_ARMOR_CHESTPLATE.get());
				tabData.accept(BaudoBoyzModModItems.BLOBBY_ARMOR_LEGGINGS.get());
				tabData.accept(BaudoBoyzModModItems.BLOBBY_ARMOR_BOOTS.get());
				tabData.accept(BaudoBoyzModModBlocks.BLOBBYNITEORE.get().asItem());
				tabData.accept(BaudoBoyzModModItems.BOOMBONE.get());
				tabData.accept(BaudoBoyzModModItems.STEAKABOOM.get());
				tabData.accept(BaudoBoyzModModItems.CLEM_SPAWN_EGG.get());
				tabData.accept(BaudoBoyzModModItems.CLEMSWORD.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(BaudoBoyzModModItems.BLOBBY_SPAWN_EGG.get());
			tabData.accept(BaudoBoyzModModItems.LARRY_SPAWN_EGG.get());
			tabData.accept(BaudoBoyzModModItems.BELLO_BOT_SPAWN_EGG.get());
			tabData.accept(BaudoBoyzModModItems.CLEM_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(BaudoBoyzModModItems.BLOBBYNITE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_PICKAXE.get());
			tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_AXE.get());
			tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_SHOVEL.get());
			tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_HOE.get());
			tabData.accept(BaudoBoyzModModItems.CLEMSWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BaudoBoyzModModItems.BLOBBY_TOOL_SWORD.get());
			tabData.accept(BaudoBoyzModModItems.BLOBBY_ARMOR_HELMET.get());
			tabData.accept(BaudoBoyzModModItems.BLOBBY_ARMOR_CHESTPLATE.get());
			tabData.accept(BaudoBoyzModModItems.BLOBBY_ARMOR_LEGGINGS.get());
			tabData.accept(BaudoBoyzModModItems.BLOBBY_ARMOR_BOOTS.get());
		}
	}
}