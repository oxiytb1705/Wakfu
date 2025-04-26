
package net.mcreator.wakfu.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.wakfu.procedures.DofusturquoiseBaubleIsUnequippedProcedure;
import net.mcreator.wakfu.procedures.DofusturquoiseBaubleIsEquippedProcedure;

public class DofusturquoiseItem extends Item implements ICurioItem {
	public DofusturquoiseItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
		return true;
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		DofusturquoiseBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		DofusturquoiseBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
