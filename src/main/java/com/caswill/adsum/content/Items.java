package com.caswill.adsum.content;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Items {

	public static final Item DIRT_COOKIE = new Item(new QuiltItemSettings().food(
		new FoodComponent.Builder()
		.hunger(1)
		.alwaysEdible()
		.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 5 * 20), 1)
		.statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 15 * 20), 1)
		.build())
	);

}
