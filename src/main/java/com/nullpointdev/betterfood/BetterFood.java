package com.nullpointdev.betterfood;

import com.nullpointdev.betterfood.Registry.*;

import net.fabricmc.api.ModInitializer;

public class BetterFood implements ModInitializer {

    public static final String MOD_ID = "betterfood";

	@Override
	public void onInitialize() {
		ModItems.RegisterItems();
	}
}
