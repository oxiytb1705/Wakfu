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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelHavreSacDos<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("wakfu", "model_havre_sac_dos"), "main");
	public final ModelPart group;

	public ModelHavreSacDos(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(-8.0F, 16.0F, 8.0F));
		PartDefinition cube_r1 = group.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -19.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(3.0F, -19.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -24.0F, -9.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 19).addBox(-5.0F, -23.0F, -9.0F, 10.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 7)
						.addBox(-5.0F, -24.0F, -3.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-6.0F, -22.0F, -4.0F, 12.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(-5.0F, -12.0F, -7.0F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 30).addBox(5.0F, -22.0F, -8.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-5.0F, -22.0F, -8.0F, 10.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 30).addBox(-6.0F, -22.0F, -8.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -8.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
