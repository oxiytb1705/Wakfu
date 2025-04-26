package net.mcreator.wakfu.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.wakfu.entity.Shushu1Entity;

public class Shushu1Model extends GeoModel<Shushu1Entity> {
	@Override
	public ResourceLocation getAnimationResource(Shushu1Entity entity) {
		return new ResourceLocation("wakfu", "animations/shushu_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Shushu1Entity entity) {
		return new ResourceLocation("wakfu", "geo/shushu_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Shushu1Entity entity) {
		return new ResourceLocation("wakfu", "textures/entities/" + entity.getTexture() + ".png");
	}

}
