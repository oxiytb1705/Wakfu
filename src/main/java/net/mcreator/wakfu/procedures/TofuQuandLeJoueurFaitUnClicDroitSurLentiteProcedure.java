package net.mcreator.wakfu.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

public class TofuQuandLeJoueurFaitUnClicDroitSurLentiteProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == sourceentity) {
			if (entity.isShiftKeyDown()) {
				entity.setShiftKeyDown(true);
			} else {
				entity.setShiftKeyDown(false);
			}
		}
	}
}
