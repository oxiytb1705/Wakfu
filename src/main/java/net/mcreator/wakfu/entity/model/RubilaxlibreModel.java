package net.mcreator.wakfu.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.wakfu.entity.RubilaxlibreEntity;

public class RubilaxlibreModel extends GeoModel<RubilaxlibreEntity> {
	@Override
	public ResourceLocation getAnimationResource(RubilaxlibreEntity entity) {
		return new ResourceLocation("wakfu", "animations/rubila_libre.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RubilaxlibreEntity entity) {
		return new ResourceLocation("wakfu", "geo/rubila_libre.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RubilaxlibreEntity entity) {
		return new ResourceLocation("wakfu", "textures/entities/" + entity.getTexture() + ".png");
	}

}
