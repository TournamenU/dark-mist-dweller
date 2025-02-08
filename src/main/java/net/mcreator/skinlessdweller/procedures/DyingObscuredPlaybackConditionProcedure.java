package net.mcreator.skinlessdweller.procedures;

import net.minecraft.world.entity.Entity;

public class DyingObscuredPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isUnderWater() || entity.isInLava() || entity.isInWall();
	}
}
