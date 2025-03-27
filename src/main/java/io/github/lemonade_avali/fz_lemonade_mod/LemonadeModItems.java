package io.github.lemonade_avali.fz_lemonade_mod;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;



public class LemonadeModItems {
	public static final Item LEMON = new Item(new QuiltItemSettings().food(
		new FoodComponent.Builder()
			.hunger(2)
			.saturationModifier(20)
			.snack()
			.alwaysEdible()
			.statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 1), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 1), 1f)
			.build()
	));

	public static void register(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "lemon"), LEMON);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->
			entries.addItem(LEMON)
		);
	}
}
