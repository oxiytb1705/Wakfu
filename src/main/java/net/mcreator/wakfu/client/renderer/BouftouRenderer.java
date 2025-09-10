
package net.mcreator.wakfu.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wakfu.entity.BouftouEntity;
import net.mcreator.wakfu.client.model.ModelBouftou;

public class BouftouRenderer extends MobRenderer<BouftouEntity, ModelBouftou<BouftouEntity>> {
	public BouftouRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBouftou(context.bakeLayer(ModelBouftou.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BouftouEntity entity) {
		return new ResourceLocation("wakfu:textures/entities/texture_bouftou.png");
	}
}
