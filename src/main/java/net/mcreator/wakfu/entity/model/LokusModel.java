package net.mcreator.wakfu.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.wakfu.entity.LokusEntity;

public class LokusModel extends GeoModel<LokusEntity> {
	@Override
	public ResourceLocation getAnimationResource(LokusEntity entity) {
		return new ResourceLocation("wakfu", "animations/lokus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LokusEntity entity) {
		return new ResourceLocation("wakfu", "geo/lokus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LokusEntity entity) {
		return new ResourceLocation("wakfu", "textures/entities/" + entity.getTexture() + ".png");
	}

}
