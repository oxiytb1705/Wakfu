package net.mcreator.wakfu.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wakfu.init.WakfuModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ProcedureEliasphereProcedure {
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
		if (((entity instanceof LivingEntity lv
				? CuriosApi.getCuriosHelper().findEquippedCurio(WakfuModItems.DOFUSTURQUOISE.get(), lv).isPresent()
				: false && entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(WakfuModItems.DOFUSOCRE.get(), lv).isPresent() : false) == true
				&& (entity instanceof LivingEntity lv
						? CuriosApi.getCuriosHelper().findEquippedCurio(WakfuModItems.DOFUSEMERAUDE.get(), lv).isPresent()
						: false && entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(WakfuModItems.DOFUS_POURPRE.get(), lv).isPresent() : false) == true
				&& (entity instanceof LivingEntity lv
						? CuriosApi.getCuriosHelper().findEquippedCurio(WakfuModItems.DOFUS_IVOIRE.get(), lv).isPresent()
						: false && entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(WakfuModItems.DOFUS_EBENE.get(), lv).isPresent() : false) == true
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WakfuModItems.ELIASPHERE.get())) : false) == true) == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 1, 5, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 20, 35, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 1, 50, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1, 10, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 10, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1, 10, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 50, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 1, 5, true, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 10, true, false));
		}
	}
}
