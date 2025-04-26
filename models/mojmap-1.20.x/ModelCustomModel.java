// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart pied_droit;
	private final ModelPart pied_gauche;
	private final ModelPart tors;
	private final ModelPart bras_droit;
	private final ModelPart bras_gauche;
	private final ModelPart tete;

	public ModelCustomModel(ModelPart root) {
		this.pied_droit = root.getChild("pied_droit");
		this.pied_gauche = root.getChild("pied_gauche");
		this.tors = root.getChild("tors");
		this.bras_droit = root.getChild("bras_droit");
		this.bras_gauche = root.getChild("bras_gauche");
		this.tete = root.getChild("tete");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition pied_droit = partdefinition.addOrReplaceChild("pied_droit",
				CubeListBuilder.create().texOffs(50, 3)
						.addBox(-7.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 54)
						.addBox(-7.0F, -1.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 16)
						.addBox(-5.0F, -6.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-8.0F, -6.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(-7.0F, -6.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-7.0F, -6.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = pied_droit.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(38, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -0.5F, -3.75F, -0.5672F, 0.0F, 0.0F));

		PartDefinition pied_gauche = partdefinition.addOrReplaceChild("pied_gauche",
				CubeListBuilder.create().texOffs(36, 3)
						.addBox(-7.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 13)
						.addBox(-7.0F, -1.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-8.0F, -6.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(-7.0F, -6.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-7.0F, -6.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -6.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 24.0F, 0.0F));

		PartDefinition cube_r2 = pied_gauche.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -0.5F, -3.75F, -0.5672F, 0.0F, 0.0F));

		PartDefinition tors = partdefinition.addOrReplaceChild("tors",
				CubeListBuilder.create().texOffs(0, 30)
						.addBox(-6.0F, -14.0F, -3.0F, 12.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 39)
						.addBox(-5.0F, -9.5F, -4.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 13)
						.addBox(-5.5F, -9.5F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(4.5F, -9.5F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 43)
						.addBox(-6.5F, -14.0F, -4.0F, 1.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(-5.5F, -14.0F, 3.0F, 11.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 22)
						.addBox(5.5F, -14.0F, -4.0F, 1.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bras_droit = partdefinition.addOrReplaceChild("bras_droit",
				CubeListBuilder.create().texOffs(0, 54)
						.addBox(-8.5F, -14.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 51)
						.addBox(-8.5F, -11.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bras_gauche = partdefinition.addOrReplaceChild("bras_gauche",
				CubeListBuilder.create().texOffs(50, 42)
						.addBox(6.5F, -11.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 51)
						.addBox(6.5F, -14.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tete = partdefinition.addOrReplaceChild("tete",
				CubeListBuilder.create().texOffs(0, 13)
						.addBox(-5.0F, -21.0F, -5.0F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -22.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-6.0F, -14.0F, 4.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 20)
						.addBox(-5.0F, -21.0F, 5.0F, 10.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 3)
						.addBox(-6.0F, -21.0F, -4.0F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(5.0F, -21.0F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 34)
						.addBox(5.0F, -21.0F, -4.0F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(30, 30)
						.addBox(-6.0F, -21.0F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-6.0F, -17.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		pied_droit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pied_gauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tors.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bras_droit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bras_gauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tete.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bras_gauche.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.tete.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.tete.xRot = headPitch / (180F / (float) Math.PI);
		this.bras_droit.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.pied_droit.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pied_gauche.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}