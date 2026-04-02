package net.mcreator.baudoboyzmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.baudoboyzmod.entity.ClemEntity;
import net.mcreator.baudoboyzmod.client.model.Modelclem;

import com.mojang.blaze3d.vertex.PoseStack;

public class ClemRenderer extends MobRenderer<ClemEntity, LivingEntityRenderState, Modelclem> {
	private ClemEntity entity = null;

	public ClemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelclem(context.bakeLayer(Modelclem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ClemEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("baudo_boyz_mod:textures/entities/clem_texture.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(4f, 4f, 4f);
	}
}