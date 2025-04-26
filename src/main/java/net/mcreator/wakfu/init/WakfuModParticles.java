
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wakfu.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.wakfu.client.particle.EliacubeparticuleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WakfuModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(WakfuModParticleTypes.ELIACUBEPARTICULE.get(), EliacubeparticuleParticle::provider);
	}
}
