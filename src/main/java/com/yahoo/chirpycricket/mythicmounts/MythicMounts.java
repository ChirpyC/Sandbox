package com.yahoo.chirpycricket.mythicmounts;

import net.fabricmc.api.ModInitializer;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.GeckoLib;

public class MythicMounts implements ModInitializer {

    public static final String ModID = "mythicmounts";

    @Override
    public void onInitialize()
    {
        GeckoLib.initialize();
        GeckoLibMod.DISABLE_IN_DEV = true;
    }
}
