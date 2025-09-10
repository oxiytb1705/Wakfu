package net.mcreator.wakfu.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wakfu.network.WakfuModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChoisiriopProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(WakfuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WakfuModVariables.PlayerVariables())).Race).equals("Iop")) {
			if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity0.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(5);
		}
	}
}
