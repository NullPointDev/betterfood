package com.nullpointdev.betterfood.Items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ChocolateItem extends Item {
	public ChocolateItem() {
		super(
            new Settings()
            .group(ItemGroup.FOOD)
            .food(
                new FoodComponent.Builder()
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED), 0.75f)
                .hunger(4)
                .saturationModifier(1f)
                .snack()
                .build()
            )
        );
	}
}
