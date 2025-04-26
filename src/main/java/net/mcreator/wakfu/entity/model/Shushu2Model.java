package net.mcreator.wakfu.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.wakfu.entity.Shushu2Entity;

public class Shushu2Model extends GeoModel<Shushu2Entity> {
	@Override
	public ResourceLocation getAnimationResource(Shushu2Entity entity) {
		return new ResourceLocation("wakfu", "animations/shushu_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Shushu2Entity entity) {
		return new ResourceLocation("wakfu", "geo/shushu_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Shushu2Entity entity) {
		return new ResourceLocation("wakfu", "textures/entities/" + entity.getTexture() + ".png");
	}

}
