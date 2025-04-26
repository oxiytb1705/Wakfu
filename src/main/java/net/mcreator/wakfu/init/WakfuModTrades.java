
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.wakfu.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class WakfuModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == WakfuModVillagerProfessions.VILLAGEOISDOFUS.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.NETHERITE_INGOT, 2),

					new ItemStack(WakfuModItems.DOFUS_POURPRE.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.FEATHER),

					new ItemStack(WakfuModItems.PLUMEDETOFU.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(WakfuModItems.ITEM_ELIACUBE.get(), 5), new ItemStack(Items.NETHERITE_INGOT, 3), new ItemStack(WakfuModItems.DOFUSEMERAUDE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.GOLD_BLOCK, 64), new ItemStack(Items.GOLDEN_SHOVEL), new ItemStack(WakfuModItems.PELLERUEL.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(WakfuModItems.ITEM_ELIACUBE.get()), new ItemStack(WakfuModItems.BACK_PACK.get(), 2), new ItemStack(WakfuModItems.DOFUSOCRE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.OAK_PLANKS, 4),

					new ItemStack(Items.FEATHER, 2), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.ENDER_EYE, 3), new ItemStack(Items.NETHERITE_SCRAP, 2), new ItemStack(WakfuModItems.DOFUSTURQUOISE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.DIAMOND, 6), new ItemStack(Blocks.PITCHER_PLANT), new ItemStack(WakfuModBlocks.CASQUE_NOX.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(WakfuModBlocks.CASQUE_NOX.get(), 2), new ItemStack(WakfuModItems.BACK_PACK.get()), new ItemStack(WakfuModItems.DOFUS_IVOIRE.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(WakfuModItems.PELLERUEL.get()), new ItemStack(Blocks.SNIFFER_EGG, 5), new ItemStack(WakfuModItems.DOFUS_EBENE.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 3),

					new ItemStack(WakfuModItems.WAKFU_MINERAI_INGOT.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(WakfuModItems.KAMAS.get(), 64), new ItemStack(WakfuModItems.KAMAS.get(), 64), new ItemStack(Items.NETHERITE_SCRAP), 10, 5, 0.05f));
		}
	}
}
