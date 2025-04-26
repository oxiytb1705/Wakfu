
package net.mcreator.wakfu.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StasisItem extends Item {
	public StasisItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
