package net.mcreator.wakfu.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.wakfu.entity.RoishushurEntity;

public class RoishushurModel extends GeoModel<RoishushurEntity> {
	@Override
	public ResourceLocation getAnimationResource(RoishushurEntity entity) {
		return new ResourceLocation("wakfu", "animations/roi_des_shushu.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoishushurEntity entity) {
		return new ResourceLocation("wakfu", "geo/roi_des_shushu.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoishushurEntity entity) {
		return new ResourceLocation("wakfu", "textures/entities/" + entity.getTexture() + ".png");
	}

}
