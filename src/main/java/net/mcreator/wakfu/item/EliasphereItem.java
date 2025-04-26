
package net.mcreator.wakfu.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EliasphereItem extends Item {
	public EliasphereItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}
}
