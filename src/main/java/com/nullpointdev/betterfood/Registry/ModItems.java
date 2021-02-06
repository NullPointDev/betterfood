package com.nullpointdev.betterfood.Registry;

import com.nullpointdev.betterfood.BetterFood;
import com.nullpointdev.betterfood.Items.*;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;

public class ModItems {

    public static final Item CARAMEL = new CaramelItem();
    public static final Item CHOCOLATE = new ChocolateItem();

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(BetterFood.MOD_ID, "caramel"), CARAMEL);
        Registry.register(Registry.ITEM, new Identifier(BetterFood.MOD_ID, "chocolate"), CHOCOLATE);
        // TODO: Add Textures for the food items.
        System.out.println("Registered Items.");
    }
}
