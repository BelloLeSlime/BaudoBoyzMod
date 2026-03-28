/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baudoboyzmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.baudoboyzmod.client.renderer.LarryRenderer;
import net.mcreator.baudoboyzmod.client.renderer.BlobbyRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class BaudoBoyzModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BaudoBoyzModModEntities.BLOBBY.get(), BlobbyRenderer::new);
		event.registerEntityRenderer(BaudoBoyzModModEntities.LARRY.get(), LarryRenderer::new);
		event.registerEntityRenderer(BaudoBoyzModModEntities.BELLO_BOT.get(), BelloBotRenderer::new);
	}
}