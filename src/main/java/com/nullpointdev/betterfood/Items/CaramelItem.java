package com.nullpointdev.betterfood.Items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CaramelItem extends Item {
	public CaramelItem() {
		super(
			new Settings()
			.group(ItemGroup.FOOD)
			.food(
				new FoodComponent.Builder()
				.hunger(2)
				.saturationModifier(0.4f)
				.build()
			)
		);
	}    
}
