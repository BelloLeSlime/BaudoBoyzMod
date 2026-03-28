package net.mcreator.baudoboyzmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.baudoboyzmod.procedures.LarryPlaybackConditionProcedure;
import net.mcreator.baudoboyzmod.entity.LarryEntity;
import net.mcreator.baudoboyzmod.client.model.animations.larryAnimation;
import net.mcreator.baudoboyzmod.client.model.Modellarry;

public class LarryRenderer extends MobRenderer<LarryEntity, LivingEntityRenderState, Modellarry> {
	private LarryEntity entity = null;

	public LarryRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modellarry.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LarryEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("baudo_boyz_mod:textures/entities/larry.png");
	}

	private static final class AnimatedModel extends Modellarry {
		private LarryEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = larryAnimation.idle.bake(root);
			this.keyframeAnimation1 = larryAnimation.walk.bake(root);
		}

		public void setEntity(LarryEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			if (LarryPlaybackConditionProcedure.execute(entity))
				this.keyframeAnimation1.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			super.setupAnim(state);
		}
	}
}