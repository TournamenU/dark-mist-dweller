package net.mcreator.skinlessdweller.procedures;

import net.minecraft.world.entity.Entity;

public class StandingStillObscuredPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().z() == 0 && entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().y() == 0) {
			return true;
		}
		return false;
	}
}
