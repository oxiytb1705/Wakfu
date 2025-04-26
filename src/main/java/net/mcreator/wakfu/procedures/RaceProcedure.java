package net.mcreator.wakfu.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.wakfu.network.WakfuModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RaceProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double RandomeRace = 0;
		if (!(entity.getCapability(WakfuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WakfuModVariables.PlayerVariables())).JoinedWorld) {
			{
				boolean _setval = true;
				entity.getCapability(WakfuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.JoinedWorld = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			RandomeRace = Mth.nextInt(RandomSource.create(), 1, 4);
			if (RandomeRace == 1) {
				{
					String _setval = "Eliatrope";
					entity.getCapability(WakfuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Race = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(" You are Eliatrope"), false);
			}
			if (RandomeRace == 2) {
				{
					String _setval = "Dragon";
					entity.getCapability(WakfuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Race = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You are Dragon"), false);
			}
			if (RandomeRace == 3) {
				{
					String _setval = "Iop";
					entity.getCapability(WakfuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Race = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You are Iop"), false);
			}
			if (RandomeRace == 4) {
				{
					String _setval = "Xelor";
					entity.getCapability(WakfuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Race = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You are Xelor"), false);
			}
		}
	}
}
