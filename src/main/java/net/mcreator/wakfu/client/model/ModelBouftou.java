package net.mcreator.wakfu.client.model;

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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBouftou<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("wakfu", "model_bouftou"), "main");
	public final ModelPart head;
	public final ModelPart head_rotation;
	public final ModelPart right_ear_cube;
	public final ModelPart right_ear_cube2;
	public final ModelPart left_ear_cube;
	public final ModelPart left_ear_cube2;
	public final ModelPart body;
	public final ModelPart front_left_leg;
	public final ModelPart front_right_leg;
	public final ModelPart back_left_leg;
	public final ModelPart back_right_leg;
	public final ModelPart tail;

	public ModelBouftou(ModelPart root) {
		this.head = root.getChild("head");
		this.head_rotation = this.head.getChild("head_rotation");
		this.right_ear_cube = root.getChild("right_ear_cube");
		this.right_ear_cube2 = this.right_ear_cube.getChild("right_ear_cube2");
		this.left_ear_cube = root.getChild("left_ear_cube");
		this.left_ear_cube2 = this.left_ear_cube.getChild("left_ear_cube2");
		this.body = root.getChild("body");
		this.front_left_leg = root.getChild("front_left_leg");
		this.front_right_leg = root.getChild("front_right_leg");
		this.back_left_leg = root.getChild("back_left_leg");
		this.back_right_leg = root.getChild("back_right_leg");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, -7.0F));
		PartDefinition head_rotation = head.addOrReplaceChild("head_rotation",
				CubeListBuilder.create().texOffs(40, 22).addBox(-4.5F, -3.866F, -1.5F, 9.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 11).addBox(-5.3F, 0.3F, -2.3F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(4.3F, 0.3F, -2.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 53).addBox(4.3F, -2.3F, -2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 47)
						.addBox(4.3F, -4.3F, -2.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-5.3F, -2.3F, -2.3F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 47)
						.addBox(-5.3F, -4.3F, -2.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 33).addBox(-4.7F, 0.3F, -2.3F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 39)
						.addBox(-4.7F, 3.3F, -2.3F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(-4.7F, -3.3F, -2.3F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 44)
						.addBox(-4.7F, -4.3F, -2.3F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition right_ear_cube = partdefinition.addOrReplaceChild("right_ear_cube", CubeListBuilder.create().texOffs(52, 44).addBox(-0.5F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4F, 15.0F, -4.85F, 0.0F, 0.0F, 0.3054F));
		PartDefinition right_ear_cube2 = right_ear_cube.addOrReplaceChild("right_ear_cube2", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -1.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2F, 0.0F, -0.15F, 0.0F, 0.0F, 0.3054F));
		PartDefinition left_ear_cube = partdefinition.addOrReplaceChild("left_ear_cube", CubeListBuilder.create().texOffs(8, 53).addBox(-2.2F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.75F, 15.0F, -5.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition left_ear_cube2 = left_ear_cube.addOrReplaceChild("left_ear_cube2", CubeListBuilder.create().texOffs(16, 53).addBox(-1.5F, -1.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -8.0F, -10.0F, 10.0F, 9.0F, 13.0F, new CubeDeformation(0.3F)).texOffs(0, 22).addBox(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 4.0F));
		PartDefinition front_left_leg = partdefinition.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(24, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 21.0F, -4.0F));
		PartDefinition front_right_leg = partdefinition.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 21.0F, -4.0F));
		PartDefinition back_left_leg = partdefinition.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(40, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 21.0F, 4.0F));
		PartDefinition back_right_leg = partdefinition.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 21.0F, 4.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(46, 4).addBox(-1.5F, -0.5864F, 0.0933F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, 5.0F, 0.5061F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_ear_cube.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_ear_cube.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
