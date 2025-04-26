package net.mcreator.wakfu.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.wakfu.network.WakfuModVariables;
import net.mcreator.wakfu.init.WakfuModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChoisirXelorProcedure {
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
		if (((entity.getCapability(WakfuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WakfuModVariables.PlayerVariables())).Race).equals("Xelor")) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WakfuModItems.CHANGERLETEMPSITEM.get())) : false) == false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(WakfuModItems.CHANGERLETEMPSITEM.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
