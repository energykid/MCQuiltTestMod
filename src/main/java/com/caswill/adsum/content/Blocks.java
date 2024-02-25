package com.caswill.adsum.content;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class Blocks {

	public static final Block OLD_SAND_BLOCK = new Block(QuiltBlockSettings.create()
	.sounds(BlockSoundGroup.SAND)
	.spawnsDustParticles(true)
	.hardness(0.5f));

	public static final Block AMETHYST_ORE_BLOCK = new Block(QuiltBlockSettings.create()
	.sounds(BlockSoundGroup.STONE)
	.hardness(3)
	.requiresTool(true));
}
