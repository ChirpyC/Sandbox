package com.yahoo.chirpycricket.mythicmounts;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.GeckoLib;

@net.fabricmc.api.Environment(EnvType.CLIENT)
public class MythicMountsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        GeckoLib.initialize();
        GeckoLibMod.DISABLE_IN_DEV = true;
    }
}
