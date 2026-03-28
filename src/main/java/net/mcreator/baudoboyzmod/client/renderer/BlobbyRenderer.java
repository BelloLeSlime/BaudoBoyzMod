package net.mcreator.baudoboyzmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baudoboyzmod.entity.BlobbyEntity;
import net.mcreator.baudoboyzmod.client.model.Modelblobby;

public class BlobbyRenderer extends MobRenderer<BlobbyEntity, LivingEntityRenderState, Modelblobby> {
	private BlobbyEntity entity = null;

	public BlobbyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblobby(context.bakeLayer(Modelblobby.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BlobbyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("baudo_boyz_mod:textures/entities/blobby.png");
	}
}