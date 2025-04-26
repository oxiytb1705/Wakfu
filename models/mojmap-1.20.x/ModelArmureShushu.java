// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelArmureShushu<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "armureshushu"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart bone;
	private final ModelPart bone2;

	public ModelArmureShushu(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(11, 13)
						.addBox(-5.0F, -8.0F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-4.0F, -8.0F, 4.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 29)
						.addBox(-5.0F, -6.0F, -2.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(4.0F, -8.0F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
						.addBox(4.0F, -6.0F, -2.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(2.0F, -9.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -9.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-2.0F, -9.25F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 20)
						.addBox(-2.0F, -9.25F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 21)
						.addBox(-2.0F, -7.0F, 4.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 13)
						.addBox(1.0F, -7.0F, 4.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 11)
						.addBox(-1.0F, -8.0F, 4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 8)
						.addBox(-1.0F, -5.0F, 4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(18, 24)
						.addBox(-4.0F, 1.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-4.0F, 0.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 13)
						.addBox(1.0F, 0.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(1.0F, 0.0F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-4.0F, 1.0F, 2.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-4.0F, 0.0F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 15)
						.addBox(2.0F, 4.0F, -3.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 15)
						.addBox(-3.0F, 4.0F, -3.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-2.0F, 3.0F, -3.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 11)
						.addBox(-2.0F, 8.0F, -3.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-3.0F, 3.0F, 2.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(0.0F, 3.0F, 2.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 15)
						.addBox(-2.0F, 5.0F, 2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 13)
						.addBox(-2.0F, 2.0F, 2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(0.0F, 7.0F, 2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, 8.0F, 2.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 11)
						.addBox(0.0F, 10.0F, 2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-1.0F, 8.0F, 2.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}