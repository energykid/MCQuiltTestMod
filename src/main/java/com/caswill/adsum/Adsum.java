package com.caswill.adsum;

import com.caswill.adsum.content.*;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Adsum implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("ADSUM");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Cogito, ergo sum", mod.metadata().name());

		//#region item registries
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "dirt_cookie"), Items.DIRT_COOKIE);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
		entries.addItem(Items.DIRT_COOKIE);
		});
		//#endregion

		//#region block registries

		Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "old_sand"), Blocks.OLD_SAND_BLOCK);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "old_sand"), new BlockItem(Blocks.OLD_SAND_BLOCK, new QuiltItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(entries -> {
			entries.addItem(Blocks.OLD_SAND_BLOCK.asItem());
		});

		Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "amethyst_ore"), Blocks.AMETHYST_ORE_BLOCK);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "amethyst_ore"), new BlockItem(Blocks.AMETHYST_ORE_BLOCK, new QuiltItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(entries -> {
			entries.addItem(Blocks.AMETHYST_ORE_BLOCK.asItem());
		});

		//#endregion
	}
}
