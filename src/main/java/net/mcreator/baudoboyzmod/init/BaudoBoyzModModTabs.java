/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baudoboyzmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.baudoboyzmod.BaudoBoyzModMod;

@EventBusSubscriber
public class BaudoBoyzModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BaudoBoyzModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(BaudoBoyzModModItems.BLOBBY_SPAWN_EGG.get());
			tabData.accept(BaudoBoyzModModItems.LARRY_SPAWN_EGG.get());
			tabData.accept(BaudoBoyzModModItems.BELLO_BOT_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(BaudoBoyzModModItems.BLOBBYNITE.get());
		}
	}
}