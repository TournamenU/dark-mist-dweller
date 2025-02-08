package net.mcreator.skinlessdweller.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelRemasr<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dark_mist_dweller", "model_remasr"), "main");
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart left_ear;
	public final ModelPart right_ear;
	public final ModelPart head0;
	public final ModelPart Heaad;
	public final ModelPart DetailedFront;
	public final ModelPart LowerJaw;
	public final ModelPart Teeth2;
	public final ModelPart UpperHead;
	public final ModelPart UpperJaw;
	public final ModelPart Teeth;
	public final ModelPart Face;
	public final ModelPart ribs_left;
	public final ModelPart ribs_left_sub_0;
	public final ModelPart ribs_right;
	public final ModelPart torso;
	public final ModelPart right_arm;
	public final ModelPart RightShoulder;
	public final ModelPart RightHand2;
	public final ModelPart RightHand;
	public final ModelPart left_arm;
	public final ModelPart LeftShoulder;
	public final ModelPart LeftHand2;
	public final ModelPart LeftHand;
	public final ModelPart cloud;

	public ModelRemasr(ModelPart root) {
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.left_ear = this.head.getChild("left_ear");
		this.right_ear = this.head.getChild("right_ear");
		this.head0 = this.head.getChild("head0");
		this.Heaad = this.head0.getChild("Heaad");
		this.DetailedFront = this.head0.getChild("DetailedFront");
		this.LowerJaw = this.DetailedFront.getChild("LowerJaw");
		this.Teeth2 = this.LowerJaw.getChild("Teeth2");
		this.UpperHead = this.DetailedFront.getChild("UpperHead");
		this.UpperJaw = this.UpperHead.getChild("UpperJaw");
		this.Teeth = this.UpperJaw.getChild("Teeth");
		this.Face = this.UpperHead.getChild("Face");
		this.ribs_left = this.body.getChild("ribs_left");
		this.ribs_left_sub_0 = this.ribs_left.getChild("ribs_left_sub_0");
		this.ribs_right = this.body.getChild("ribs_right");
		this.torso = this.body.getChild("torso");
		this.right_arm = this.body.getChild("right_arm");
		this.RightShoulder = this.right_arm.getChild("RightShoulder");
		this.RightHand2 = this.RightShoulder.getChild("RightHand2");
		this.RightHand = this.RightHand2.getChild("RightHand");
		this.left_arm = this.body.getChild("left_arm");
		this.LeftShoulder = this.left_arm.getChild("LeftShoulder");
		this.LeftHand2 = this.LeftShoulder.getChild("LeftHand2");
		this.LeftHand = this.LeftHand2.getChild("LeftHand");
		this.cloud = root.getChild("cloud");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(90, 110).addBox(0.5F, -3.0F, -2.0F, 2.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(71, 119).addBox(-1.5F, 13.0F, -6.0F, 5.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(118, 112)
						.addBox(-1.5F, -3.0F, 0.0F, 5.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(100, 103).addBox(1.5F, -3.0F, -6.0F, 0.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 11.0F, 0.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition field_78173_f_r1 = right_leg.addOrReplaceChild("field_78173_f_r1", CubeListBuilder.create().texOffs(100, 103).addBox(0.5F, 0.0F, -6.0F, 0.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, 0.0F, 0.0F, 0.3054F, 0.0F));
		PartDefinition field_78173_f_r2 = right_leg.addOrReplaceChild("field_78173_f_r2", CubeListBuilder.create().texOffs(100, 103).addBox(0.5F, 0.0F, -6.0F, 0.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition field_78173_f_r3 = right_leg.addOrReplaceChild("field_78173_f_r3", CubeListBuilder.create().texOffs(118, 112).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, -0.6981F, 0.0F));
		PartDefinition field_78173_f_r4 = right_leg.addOrReplaceChild("field_78173_f_r4", CubeListBuilder.create().texOffs(118, 112).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.7418F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(90, 110).mirror().addBox(-2.5F, -3.0F, -2.0F, 2.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 119).mirror()
						.addBox(-3.5F, 13.0F, -6.0F, 5.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(118, 112).mirror().addBox(-3.5F, -3.0F, 0.0F, 5.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 103)
						.mirror().addBox(-1.5F, -3.0F, -6.0F, 0.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 11.0F, 0.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition field_78173_f_r5 = left_leg.addOrReplaceChild("field_78173_f_r5", CubeListBuilder.create().texOffs(100, 103).mirror().addBox(-0.5F, 0.0F, -6.0F, 0.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -3.0F, 0.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition field_78173_f_r6 = left_leg.addOrReplaceChild("field_78173_f_r6", CubeListBuilder.create().texOffs(100, 103).mirror().addBox(-0.5F, 0.0F, -6.0F, 0.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -3.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition field_78173_f_r7 = left_leg.addOrReplaceChild("field_78173_f_r7", CubeListBuilder.create().texOffs(118, 112).mirror().addBox(-2.5F, -1.0F, 0.0F, 5.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.6981F, 0.0F));
		PartDefinition field_78173_f_r8 = left_leg.addOrReplaceChild("field_78173_f_r8", CubeListBuilder.create().texOffs(118, 112).mirror().addBox(-2.5F, -1.0F, 0.0F, 5.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, -0.7418F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.0F, -3.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(57, 97).addBox(0.0F, -12.5F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -12.5F, 1.0F));
		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(57, 97).addBox(-16.0F, -12.5F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -12.5F, 1.0F));
		PartDefinition head0 = head.addOrReplaceChild("head0", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition Heaad = head0.addOrReplaceChild("Heaad", CubeListBuilder.create().texOffs(94, 80).addBox(-4.0F, -12.0F, -2.5F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(108, 13)
				.addBox(-5.0F, -15.0F, -2.5F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(96, -16).addBox(0.0F, -15.0F, -8.5F, 0.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 1.0F));
		PartDefinition field_78178_a_r1 = Heaad.addOrReplaceChild("field_78178_a_r1", CubeListBuilder.create().texOffs(100, -12).addBox(0.0F, -13.0F, -7.5F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition field_78178_a_r2 = Heaad.addOrReplaceChild("field_78178_a_r2", CubeListBuilder.create().texOffs(100, -12).addBox(0.0F, -13.0F, -7.5F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition field_78178_a_r3 = Heaad.addOrReplaceChild("field_78178_a_r3", CubeListBuilder.create().texOffs(108, 13).addBox(-5.0F, -13.0F, -0.5F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition DetailedFront = head0.addOrReplaceChild("DetailedFront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r1 = DetailedFront.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 26).addBox(0.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -2.0F, 2.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r2 = DetailedFront.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 26).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -2.0F, 2.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition LowerJaw = DetailedFront.addOrReplaceChild("LowerJaw", CubeListBuilder.create().texOffs(13, 21).mirror().addBox(-2.9849F, -0.6132F, -8.012F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 29).mirror()
				.addBox(-0.9849F, -1.6132F, -9.012F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0151F, -3.0681F, 3.3903F, -0.829F, 0.0F, -3.1416F));
		PartDefinition cube_r3 = LowerJaw.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 27).mirror().addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0151F, 0.3868F, -3.012F, -0.3503F, -0.0785F, -0.0299F));
		PartDefinition cube_r4 = LowerJaw.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 27).mirror().addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.9849F, 0.3868F, -3.012F, -0.3503F, 0.0785F, -0.0299F));
		PartDefinition cube_r5 = LowerJaw.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 30).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0151F, -0.6132F, -5.012F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r6 = LowerJaw.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 30).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.9849F, -0.6132F, -5.012F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r7 = LowerJaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 28).mirror().addBox(0.0F, -2.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0151F, 0.3868F, -5.012F, 0.0F, 0.6545F, 0.0F));
		PartDefinition cube_r8 = LowerJaw.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 29).mirror().addBox(-2.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0151F, 0.3868F, -9.012F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r9 = LowerJaw.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 29).mirror().addBox(-2.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9849F, 0.3868F, -6.012F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r10 = LowerJaw.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 28).mirror().addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9849F, 0.3868F, -5.012F, 0.0F, -0.6545F, 0.0F));
		PartDefinition Teeth2 = LowerJaw.addOrReplaceChild("Teeth2", CubeListBuilder.create(), PartPose.offset(0.0151F, 26.3868F, -7.012F));
		PartDefinition cube_r11 = Teeth2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, -1).mirror().addBox(-2.0F, -2.0F, -2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -25.0F, 2.0F, 0.0F, -0.9599F, 0.0F));
		PartDefinition cube_r12 = Teeth2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(3, -3).mirror().addBox(1.0F, -2.0F, -2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -25.0F, 1.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition cube_r13 = Teeth2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(3, -3).mirror().addBox(1.0F, -2.0F, -2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, -3).mirror()
				.addBox(7.0F, -2.0F, -2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -25.0F, 4.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r14 = Teeth2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(3, -3).mirror().addBox(1.0F, -2.0F, -2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -25.0F, 2.0F, 0.0F, 0.6545F, 0.0F));
		PartDefinition cube_r15 = Teeth2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, -1).mirror().addBox(-2.0F, -2.0F, 1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -25.0F, -3.0F, 0.0F, 0.9599F, 0.0F));
		PartDefinition cube_r16 = Teeth2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(11, -1).mirror().addBox(-2.0F, -2.0F, -2.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -25.0F, 1.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition UpperHead = DetailedFront.addOrReplaceChild("UpperHead", CubeListBuilder.create(), PartPose.offset(0.0F, -6.2638F, 1.5175F));
		PartDefinition UpperJaw = UpperHead.addOrReplaceChild("UpperJaw",
				CubeListBuilder.create().texOffs(13, 21).addBox(-3.0F, -27.0F, -1.0F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 12).addBox(0.0F, -33.0F, -2.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 29.0F, -6.0F));
		PartDefinition cube_r17 = UpperJaw.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(23, 26).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -26.0F, 4.0F, -0.3503F, -0.0785F, -0.0299F));
		PartDefinition cube_r18 = UpperJaw.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(23, 26).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -26.0F, 4.0F, -0.3503F, 0.0785F, -0.0299F));
		PartDefinition cube_r19 = UpperJaw.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(28, 30).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -27.0F, 2.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r20 = UpperJaw.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(28, 30).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -27.0F, 2.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r21 = UpperJaw.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 28).addBox(0.0F, -2.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -26.0F, 2.0F, 0.0F, 0.6545F, 0.0F));
		PartDefinition cube_r22 = UpperJaw.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 29).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -26.0F, -2.0F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r23 = UpperJaw.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(26, 29).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -26.0F, 1.0F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r24 = UpperJaw.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(22, 28).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -26.0F, 2.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition Teeth = UpperJaw.addOrReplaceChild("Teeth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r25 = Teeth.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, -1).addBox(-2.0F, -2.0F, -2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -25.0F, 2.0F, 0.0F, -0.9599F, 0.0F));
		PartDefinition cube_r26 = Teeth.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(3, -3).addBox(1.0F, -2.0F, -2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -25.0F, 1.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition cube_r27 = Teeth.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(3, -3).addBox(1.0F, -2.0F, -2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(3, -3).addBox(7.0F, -2.0F, -2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -25.0F, 4.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r28 = Teeth.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(3, -3).addBox(1.0F, -2.0F, -2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -25.0F, 2.0F, 0.0F, 0.6545F, 0.0F));
		PartDefinition cube_r29 = Teeth.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(9, -1).addBox(-2.0F, -2.0F, 1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -25.0F, -3.0F, 0.0F, 0.9599F, 0.0F));
		PartDefinition cube_r30 = Teeth.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(11, -1).addBox(-2.0F, -2.0F, -2.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -25.0F, 1.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition cube_r31 = Teeth.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(10, -2).addBox(-2.0F, -2.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -25.0F, 0.0F, 0.0F, -2.1817F, 0.0F));
		PartDefinition Face = UpperHead.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(0, 26).addBox(-5.0F, -33.0F, 6.0F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
				.addBox(-5.0F, -33.0F, 8.0F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 29).addBox(-1.0F, -29.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 29.0F, -6.0F));
		PartDefinition cube_r32 = Face.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(26, 25).addBox(0.0F, 5.0F, -2.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -34.0F, 8.0F, -0.5236F, 0.0F, 0.2182F));
		PartDefinition cube_r33 = Face.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(26, 25).addBox(0.0F, 5.0F, -2.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -34.0F, 8.0F, -0.5236F, 0.0F, -0.2182F));
		PartDefinition cube_r34 = Face.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(24, 27).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -28.0F, 6.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r35 = Face.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(24, 28).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -29.0F, 6.0F, -0.5888F, 0.1733F, 0.8636F));
		PartDefinition cube_r36 = Face.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(23, 28).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -31.0F, 6.0F, -0.5888F, -0.1733F, -0.8636F));
		PartDefinition cube_r37 = Face.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(23, 27).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -28.0F, 6.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r38 = Face.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(26, 29).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -28.0F, -2.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r39 = Face.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 28).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.0F, -1.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r40 = Face.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(26, 27).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 1.0F, -1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r41 = Face.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(25, 27).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -33.0F, 3.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r42 = Face.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(18, 27).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 7.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r43 = Face.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(22, 26).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -29.0F, 7.0F, -0.3914F, 0.0334F, 0.3425F));
		PartDefinition cube_r44 = Face.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(21, 26).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -29.0F, 7.0F, -0.3914F, 0.0334F, -0.3425F));
		PartDefinition Reye_r1 = Face.addOrReplaceChild("Reye_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -30.0F, 4.0F, 0.1289F, -0.0227F, 0.1731F));
		PartDefinition Reye_r2 = Face.addOrReplaceChild("Reye_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -30.0F, 4.0F, 0.1289F, 0.0227F, -0.1731F));
		PartDefinition cube_r45 = Face.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(26, 26).addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -29.0F, 0.0F, -0.6378F, -0.4079F, 0.338F));
		PartDefinition cube_r46 = Face.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(26, 26).addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -29.0F, 0.0F, -0.6378F, 0.4079F, -0.338F));
		PartDefinition cube_r47 = Face.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(26, 27).addBox(0.0F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 3.0F, -1.2187F, -0.1776F, 0.4483F));
		PartDefinition cube_r48 = Face.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(26, 27).addBox(0.0F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -31.0F, 3.0F, -1.2187F, 0.1776F, -0.4483F));
		PartDefinition ribs_left = body.addOrReplaceChild("ribs_left", CubeListBuilder.create(), PartPose.offset(0.0F, -14.0F, 7.0F));
		PartDefinition ribs_left_sub_0 = ribs_left.addOrReplaceChild("ribs_left_sub_0", CubeListBuilder.create().texOffs(44, 19).addBox(0.0F, -25.0F, -5.1F, 6.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 34.0F, 0.0F));
		PartDefinition ribs_right = body.addOrReplaceChild("ribs_right", CubeListBuilder.create().texOffs(44, 19).mirror().addBox(-6.0F, 9.0F, -5.1F, 6.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -14.0F, 7.0F));
		PartDefinition torso = body.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(85, 54).addBox(-5.0F, -33.0F, -4.0F, 10.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(66, 27).addBox(-5.0F, -17.0F, -9.0F, 10.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(98, 27)
						.addBox(-9.0F, -30.0F, 0.0F, 18.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(65, 77).addBox(-3.0F, -25.0F, -5.0F, 6.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(66, 27)
						.addBox(-5.0F, -17.0F, -9.0F, 10.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(80, -1).addBox(0.0F, -27.0F, -9.0F, 0.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-12.0F, -36.0F, 0.0F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition cube_r49 = torso.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(48, 0).addBox(-12.0F, -5.0F, 0.0F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r50 = torso.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(48, 0).addBox(-12.0F, -5.0F, 0.0F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 0.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r51 = torso.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(48, 0).addBox(-12.0F, -5.0F, 0.0F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r52 = torso.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(48, 0).addBox(-12.0F, -5.0F, 0.0F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition field_78176_b_r1 = torso.addOrReplaceChild("field_78176_b_r1", CubeListBuilder.create().texOffs(80, -1).addBox(0.0F, -12.0F, -9.0F, 0.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, 1.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition field_78176_b_r2 = torso.addOrReplaceChild("field_78176_b_r2", CubeListBuilder.create().texOffs(80, -1).addBox(0.0F, -12.0F, -9.0F, 0.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, 1.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition field_78176_b_r3 = torso.addOrReplaceChild("field_78176_b_r3", CubeListBuilder.create().texOffs(66, 27).addBox(-5.0F, -2.0F, -9.0F, 10.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, 1.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, -12.0F, -1.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition RightShoulder = right_arm.addOrReplaceChild("RightShoulder", CubeListBuilder.create().texOffs(72, 58).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 60)
				.addBox(-2.0F, -1.5F, 0.0F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 56).addBox(0.0F, -1.5F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition RightHand2 = RightShoulder.addOrReplaceChild("RightHand2", CubeListBuilder.create().texOffs(72, 44).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 46)
				.addBox(-2.0F, -1.5F, 0.0F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 42).addBox(0.0F, -1.5F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0873F, -0.2618F, 0.0F));
		PartDefinition RightHand = RightHand2.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition cube_r53 = RightHand.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(75, 54).addBox(-0.5495F, -0.9348F, -0.9514F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.6092F, -0.7237F, 0.0411F));
		PartDefinition cube_r54 = RightHand.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(74, 53).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, -0.2681F, -0.3027F, 0.0411F));
		PartDefinition cube_r55 = RightHand.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(9, 0).addBox(-1.0F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 7.0F, 0.0F, 0.0532F, 0.0692F, -0.9145F));
		PartDefinition cube_r56 = RightHand.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(9, -2).addBox(-1.0F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r57 = RightHand.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(10, -1).addBox(-0.097F, 0.0306F, -1.0076F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.0F, -3.0F, -2.2147F, 1.2001F, -2.4277F));
		PartDefinition cube_r58 = RightHand.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(9, -2).addBox(-1.0F, -3.0F, -1.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 6.0F, -2.0F, -3.0769F, 0.6516F, 3.0748F));
		PartDefinition cube_r59 = RightHand.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(74, 53).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(9.0F, -12.0F, -1.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition LeftShoulder = left_arm
				.addOrReplaceChild(
						"LeftShoulder", CubeListBuilder.create().texOffs(72, 58).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 60).mirror()
								.addBox(-2.0F, -1.5F, 0.0F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 56).addBox(0.0F, -1.5F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition LeftHand2 = LeftShoulder.addOrReplaceChild("LeftHand2", CubeListBuilder.create().texOffs(72, 44).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 46).mirror()
				.addBox(-2.0F, -1.5F, 0.0F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 42).addBox(0.0F, -1.5F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0873F, 0.2618F, 0.0F));
		PartDefinition LeftHand = LeftHand2.addOrReplaceChild("LeftHand", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition cube_r60 = LeftHand.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(75, 54).mirror().addBox(-0.4505F, -0.9348F, -0.9514F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.6092F, 0.7237F, -0.0411F));
		PartDefinition cube_r61 = LeftHand.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, -0.2681F, 0.3027F, -0.0411F));
		PartDefinition cube_r62 = LeftHand.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(9, 0).mirror().addBox(1.0F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 7.0F, 0.0F, 0.0532F, -0.0692F, 0.9145F));
		PartDefinition cube_r63 = LeftHand.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(9, -2).mirror().addBox(1.0F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r64 = LeftHand.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(10, -1).mirror().addBox(0.097F, 0.0306F, -1.0076F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.0F, -3.0F, -2.2147F, -1.2001F, 2.4277F));
		PartDefinition cube_r65 = LeftHand.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(9, -2).mirror().addBox(1.0F, -3.0F, -1.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 6.0F, -2.0F, -3.0769F, -0.6516F, -3.0748F));
		PartDefinition cube_r66 = LeftHand.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cloud = partdefinition.addOrReplaceChild("cloud",
				CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, -43.0F, 1.9F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 34).mirror().addBox(-24.0F, -43.0F, 1.9F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r67 = cloud.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(28, 128).addBox(-16.0F, -2.0F, -14.0F, 32.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r68 = cloud.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(28, 128).addBox(-16.0F, -2.0F, -14.0F, 32.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r69 = cloud.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(28, 128).addBox(-16.0F, -2.0F, -14.0F, 32.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition ribs_right_r1 = cloud.addOrReplaceChild("ribs_right_r1", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-24.0F, -43.0F, -5.1F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 2.0F, 0.0F, -0.8727F, 0.0F));
		PartDefinition ribs_right_r2 = cloud.addOrReplaceChild("ribs_right_r2", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-24.0F, -43.0F, -5.1F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 5.0F, 0.0F, -0.5672F, 0.0F));
		PartDefinition ribs_right_r3 = cloud.addOrReplaceChild("ribs_right_r3", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-24.0F, -43.0F, -5.1F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 0.0F, 5.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition ribs_right_r4 = cloud.addOrReplaceChild("ribs_right_r4", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-24.0F, -43.0F, -5.1F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, 1.1345F, 0.0F));
		PartDefinition ribs_right_r5 = cloud.addOrReplaceChild("ribs_right_r5", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-24.0F, -43.0F, -5.1F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, 0.6109F, 0.0F));
		PartDefinition ribs_left_sub_3_r1 = cloud.addOrReplaceChild("ribs_left_sub_3_r1", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, -43.0F, -5.1F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 2.0F, 0.0F, 0.8727F, 0.0F));
		PartDefinition ribs_left_sub_2_r1 = cloud.addOrReplaceChild("ribs_left_sub_2_r1", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, -43.0F, -5.1F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 5.0F, 0.0F, 0.5672F, 0.0F));
		PartDefinition ribs_left_sub_3_r2 = cloud.addOrReplaceChild("ribs_left_sub_3_r2", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, -43.0F, -5.1F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -1.1345F, 0.0F));
		PartDefinition ribs_left_sub_2_r2 = cloud.addOrReplaceChild("ribs_left_sub_2_r2", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, -43.0F, -5.1F, 24.0F, 58.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.6109F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cloud.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
