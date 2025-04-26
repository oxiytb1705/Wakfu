
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wakfu.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.wakfu.client.model.ModelTofu;
import net.mcreator.wakfu.client.model.ModelHavreSacDos;
import net.mcreator.wakfu.client.model.ModelEliacubeDos;
import net.mcreator.wakfu.client.model.ModelCustomModel;
import net.mcreator.wakfu.client.model.ModelCasqueNox;
import net.mcreator.wakfu.client.model.ModelArmureShushu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WakfuModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelArmureShushu.LAYER_LOCATION, ModelArmureShushu::createBodyLayer);
		event.registerLayerDefinition(ModelEliacubeDos.LAYER_LOCATION, ModelEliacubeDos::createBodyLayer);
		event.registerLayerDefinition(ModelTofu.LAYER_LOCATION, ModelTofu::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(ModelHavreSacDos.LAYER_LOCATION, ModelHavreSacDos::createBodyLayer);
		event.registerLayerDefinition(ModelCasqueNox.LAYER_LOCATION, ModelCasqueNox::createBodyLayer);
	}
}
