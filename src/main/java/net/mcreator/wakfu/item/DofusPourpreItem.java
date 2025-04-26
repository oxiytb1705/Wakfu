
package net.mcreator.wakfu.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.monster.EnderMan;

import net.mcreator.wakfu.procedures.DofusPourpreBaubleIsUnequippedProcedure;
import net.mcreator.wakfu.procedures.DofusPourpreBaubleIsEquippedProcedure;

public class DofusPourpreItem extends Item implements ICurioItem {
	public DofusPourpreItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan, ItemStack stack) {
		return true;
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		DofusPourpreBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		DofusPourpreBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
