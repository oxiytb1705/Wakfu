
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wakfu.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.wakfu.client.renderer.YugoRenderer;
import net.mcreator.wakfu.client.renderer.TristepinDePercedalRenderer;
import net.mcreator.wakfu.client.renderer.TofuRenderer;
import net.mcreator.wakfu.client.renderer.Shushu2Renderer;
import net.mcreator.wakfu.client.renderer.Shushu1Renderer;
import net.mcreator.wakfu.client.renderer.RuelRenderer;
import net.mcreator.wakfu.client.renderer.RubilaxlibreRenderer;
import net.mcreator.wakfu.client.renderer.RoishushurRenderer;
import net.mcreator.wakfu.client.renderer.QilbyEliacubeRenderer;
import net.mcreator.wakfu.client.renderer.NoxRenderer;
import net.mcreator.wakfu.client.renderer.LokusRenderer;
import net.mcreator.wakfu.client.renderer.JorisRenderer;
import net.mcreator.wakfu.client.renderer.GoultardRenderer;
import net.mcreator.wakfu.client.renderer.EvangelyneRenderer;
import net.mcreator.wakfu.client.renderer.AmaliaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WakfuModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WakfuModEntities.TOFU.get(), TofuRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.NOX.get(), NoxRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.TRISTEPIN_DE_PERCEDAL.get(), TristepinDePercedalRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.QILBY_ELIACUBE.get(), QilbyEliacubeRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.RUEL.get(), RuelRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.EVANGELYNE.get(), EvangelyneRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.EVANGELYNE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.SHUSHU_1.get(), Shushu1Renderer::new);
		event.registerEntityRenderer(WakfuModEntities.RUBILAXLIBRE.get(), RubilaxlibreRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.ROISHUSHUR.get(), RoishushurRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.GOULTARD.get(), GoultardRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.SHUSHU_2.get(), Shushu2Renderer::new);
		event.registerEntityRenderer(WakfuModEntities.YUGO.get(), YugoRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.AMALIA.get(), AmaliaRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.JORIS.get(), JorisRenderer::new);
		event.registerEntityRenderer(WakfuModEntities.LOKUS.get(), LokusRenderer::new);
	}
}
