package net.mcreator.wakfu.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.wakfu.entity.JorisEntity;

public class JorisModel extends GeoModel<JorisEntity> {
	@Override
	public ResourceLocation getAnimationResource(JorisEntity entity) {
		return new ResourceLocation("wakfu", "animations/joris.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JorisEntity entity) {
		return new ResourceLocation("wakfu", "geo/joris.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JorisEntity entity) {
		return new ResourceLocation("wakfu", "textures/entities/" + entity.getTexture() + ".png");
	}

}
