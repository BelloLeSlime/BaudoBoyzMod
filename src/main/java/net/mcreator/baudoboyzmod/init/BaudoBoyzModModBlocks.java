/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baudoboyzmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.baudoboyzmod.block.BlobbyniteoreBlock;
import net.mcreator.baudoboyzmod.BaudoBoyzModMod;

import java.util.function.Function;

public class BaudoBoyzModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BaudoBoyzModMod.MODID);
	public static final DeferredBlock<Block> BLOBBYNITEORE;
	static {
		BLOBBYNITEORE = register("blobbyniteore", BlobbyniteoreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}