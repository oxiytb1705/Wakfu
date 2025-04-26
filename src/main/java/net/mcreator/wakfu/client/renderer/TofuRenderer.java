
package net.mcreator.wakfu.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wakfu.entity.TofuEntity;
import net.mcreator.wakfu.client.model.ModelTofu;

public class TofuRenderer extends MobRenderer<TofuEntity, ModelTofu<TofuEntity>> {
	public TofuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTofu(context.bakeLayer(ModelTofu.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(TofuEntity entity) {
		return new ResourceLocation("wakfu:textures/entities/texture_fofu.png");
	}
}
