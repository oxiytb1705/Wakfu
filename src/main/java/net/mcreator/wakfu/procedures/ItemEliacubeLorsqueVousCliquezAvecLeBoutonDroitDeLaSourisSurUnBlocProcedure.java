package net.mcreator.wakfu.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.wakfu.init.WakfuModItems;
import net.mcreator.wakfu.init.WakfuModBlocks;

public class ItemEliacubeLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.UP) == true) {
			world.setBlock(BlockPos.containing(x, y + 1, z), WakfuModBlocks.ELIACUBE.get().defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(WakfuModItems.ITEM_ELIACUBE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
