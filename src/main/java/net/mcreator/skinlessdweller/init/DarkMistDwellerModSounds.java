
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skinlessdweller.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.skinlessdweller.DarkMistDwellerMod;

public class DarkMistDwellerModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DarkMistDwellerMod.MODID);
	public static final RegistryObject<SoundEvent> CHASE = REGISTRY.register("chase", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dark_mist_dweller", "chase")));
	public static final RegistryObject<SoundEvent> OBSCUREDCHASINGU = REGISTRY.register("obscuredchasingu", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dark_mist_dweller", "obscuredchasingu")));
	public static final RegistryObject<SoundEvent> ROAR = REGISTRY.register("roar", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dark_mist_dweller", "roar")));
	public static final RegistryObject<SoundEvent> CHASINGCUTVERSION = REGISTRY.register("chasingcutversion", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dark_mist_dweller", "chasingcutversion")));
	public static final RegistryObject<SoundEvent> CUTCHASE = REGISTRY.register("cutchase", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dark_mist_dweller", "cutchase")));
}
