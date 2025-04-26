
package net.mcreator.wakfu.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.wakfu.procedures.DofusemeraudeBaubleIsUnequippedProcedure;
import net.mcreator.wakfu.procedures.DofusemeraudeBaubleIsEquippedProcedure;

public class DofusemeraudeItem extends Item implements ICurioItem {
	public DofusemeraudeItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
		return true;
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		DofusemeraudeBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		DofusemeraudeBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
