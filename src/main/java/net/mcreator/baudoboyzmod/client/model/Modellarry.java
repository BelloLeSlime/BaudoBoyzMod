package net.mcreator.baudoboyzmod.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modellarry extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("baudo_boyz_mod", "modellarry"), "main");
	public final ModelPart Torso;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Head;
	public final ModelPart RightAnten;
	public final ModelPart LeftAnten;
	public final ModelPart Wings;
	public final ModelPart topleftarm;
	public final ModelPart toprightarm;
	public final ModelPart middleleftarm;
	public final ModelPart middlerightarm;
	public final ModelPart bottmleftarm;
	public final ModelPart bottmrightarm;
	public final ModelPart suitcase;

	public Modellarry(ModelPart root) {
		super(root);
		this.Torso = root.getChild("Torso");
		this.LeftLeg = this.Torso.getChild("LeftLeg");
		this.RightLeg = this.Torso.getChild("RightLeg");
		this.Head = this.Torso.getChild("Head");
		this.RightAnten = this.Head.getChild("RightAnten");
		this.LeftAnten = this.Head.getChild("LeftAnten");
		this.Wings = this.Torso.getChild("Wings");
		this.topleftarm = this.Torso.getChild("topleftarm");
		this.toprightarm = this.Torso.getChild("toprightarm");
		this.middleleftarm = this.Torso.getChild("middleleftarm");
		this.middlerightarm = this.Torso.getChild("middlerightarm");
		this.bottmleftarm = this.Torso.getChild("bottmleftarm");
		this.bottmrightarm = this.Torso.getChild("bottmrightarm");
		this.suitcase = this.Torso.getChild("suitcase");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition LeftLeg = Torso.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(4, 19).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.5F, -0.5F));
		PartDefinition RightLeg = Torso.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.5F, -0.5F));
		PartDefinition Head = Torso.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -1.0F));
		PartDefinition RightAnten = Head.addOrReplaceChild("RightAnten", CubeListBuilder.create(), PartPose.offset(-1.5F, -3.0F, 0.0F));
		PartDefinition rightanten_r1 = RightAnten.addOrReplaceChild("rightanten_r1", CubeListBuilder.create().texOffs(20, 25).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.1F, 1.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition LeftAnten = Head.addOrReplaceChild("LeftAnten", CubeListBuilder.create(), PartPose.offset(1.5F, -2.9F, 0.0F));
		PartDefinition leftanten_r1 = LeftAnten.addOrReplaceChild("leftanten_r1", CubeListBuilder.create().texOffs(22, 25).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.2F, 1.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition Wings = Torso.addOrReplaceChild("Wings",
				CubeListBuilder.create().texOffs(14, 0).addBox(-3.0F, -0.1F, 0.0F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 15).addBox(-2.0F, 9.9F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.9F, 1.0F));
		PartDefinition topleftarm = Torso.addOrReplaceChild("topleftarm", CubeListBuilder.create(), PartPose.offset(2.5F, -8.1F, -0.6F));
		PartDefinition cube_r1 = topleftarm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 19).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, 2.6F, -1.9F, 0.0F, 0.0F, 2.4435F));
		PartDefinition cube_r2 = topleftarm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 19).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition toprightarm = Torso.addOrReplaceChild("toprightarm", CubeListBuilder.create(), PartPose.offset(-2.5F, -8.1F, -0.6F));
		PartDefinition cube_r3 = toprightarm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 24).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 2.6F, -1.9F, 0.0F, 0.0F, -2.4435F));
		PartDefinition cube_r4 = toprightarm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(4, 24).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition middleleftarm = Torso.addOrReplaceChild("middleleftarm", CubeListBuilder.create(), PartPose.offset(2.5F, -5.1F, -0.6F));
		PartDefinition cube_r5 = middleleftarm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 20).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, 2.6F, -1.9F, 0.0F, 0.0F, 2.4435F));
		PartDefinition cube_r6 = middleleftarm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 15).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition middlerightarm = Torso.addOrReplaceChild("middlerightarm", CubeListBuilder.create(), PartPose.offset(-2.5F, -5.1F, -0.6F));
		PartDefinition cube_r7 = middlerightarm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 2.6F, -1.9F, 0.0F, 0.0F, -2.4435F));
		PartDefinition cube_r8 = middlerightarm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 21).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition bottmleftarm = Torso.addOrReplaceChild("bottmleftarm", CubeListBuilder.create().texOffs(16, 15).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -2.1F, -0.6F));
		PartDefinition bottmrightarm = Torso.addOrReplaceChild("bottmrightarm", CubeListBuilder.create(), PartPose.offset(-2.5F, -2.1F, -0.6F));
		PartDefinition cube_r9 = bottmrightarm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 16).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.15F, 2.4F, -1.9F, 0.0F, 0.0F, -1.789F));
		PartDefinition cube_r10 = bottmrightarm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 24).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition suitcase = Torso.addOrReplaceChild("suitcase",
				CubeListBuilder.create().texOffs(16, 13).addBox(-1.0F, -4.8F, -3.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 21).addBox(-1.0F, -3.8F, -3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 23)
						.addBox(2.0F, -3.8F, -3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 10).addBox(-1.0F, -3.3F, -3.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.8F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}