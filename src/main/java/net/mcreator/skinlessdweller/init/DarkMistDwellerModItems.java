
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skinlessdweller.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.skinlessdweller.DarkMistDwellerMod;

public class DarkMistDwellerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DarkMistDwellerMod.MODID);
	public static final RegistryObject<Item> OBSCURED_SPAWN_EGG = REGISTRY.register("obscured_spawn_egg", () -> new ForgeSpawnEggItem(DarkMistDwellerModEntities.OBSCURED, -13421773, -10066330, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
