/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baudoboyzmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.baudoboyzmod.client.model.Modellarry;
import net.mcreator.baudoboyzmod.client.model.Modelblobby;

@EventBusSubscriber(Dist.CLIENT)
public class BaudoBoyzModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBelloBot.LAYER_LOCATION, ModelBelloBot::createBodyLayer);
		event.registerLayerDefinition(Modellarry.LAYER_LOCATION, Modellarry::createBodyLayer);
		event.registerLayerDefinition(Modelblobby.LAYER_LOCATION, Modelblobby::createBodyLayer);
	}
}