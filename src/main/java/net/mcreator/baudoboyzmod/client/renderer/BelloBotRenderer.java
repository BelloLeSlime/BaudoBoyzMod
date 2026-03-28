package net.mcreator.baudoboyzmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baudoboyzmod.entity.BelloBotEntity;
import net.mcreator.baudoboyzmod.client.model.ModelBelloBot;

public class BelloBotRenderer extends MobRenderer<BelloBotEntity, LivingEntityRenderState, ModelBelloBot> {
	private BelloBotEntity entity = null;

	public BelloBotRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBelloBot(context.bakeLayer(ModelBelloBot.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BelloBotEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("baudo_boyz_mod:textures/entities/bellobot.png");
	}
}