package net.mcreator.wakfu.procedures;

import net.minecraft.world.entity.Entity;

public class TofubougepasProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			entity.setShiftKeyDown(false);
		}
		entity.setShiftKeyDown(true);
	}
}
