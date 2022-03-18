package com.yahoo.chirpycricket.mythicmounts;

import net.fabricmc.api.ModInitializer;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.GeckoLib;
import vazkii.patchouli.common.book.Book;
import vazkii.patchouli.common.book.BookRegistry;

public class MythicMounts implements ModInitializer {

    public static final String ModID = "mythicmounts";

    @Override
    public void onInitialize()
    {
        GeckoLib.initialize();
        GeckoLibMod.DISABLE_IN_DEV = true;

        System.out.println("Any books loaded? " + !BookRegistry.INSTANCE.books.isEmpty());
        for(Book b : BookRegistry.INSTANCE.books.values()){
            System.out.println("Found book id: " + b.id);
        }
    }
}
