package net.mcreator.wakfu.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.wakfu.init.WakfuModBlocks;

public class EliacubeequipementLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), WakfuModBlocks.ELIACUBE.get().defaultBlockState(), 3);
	}
}
