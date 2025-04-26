
package net.mcreator.wakfu.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KamasItem extends Item {
	public KamasItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
