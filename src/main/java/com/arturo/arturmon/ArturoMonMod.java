package com.arturo.arturmon;

import com.arturo.arturmon.creature.CreatureRegistry;
import com.arturo.arturmon.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class ArturoMonMod implements ModInitializer {
    public static final String MOD_ID = "arturmon";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        CreatureRegistry.bootstrap();
        ModItems.register();
        LOGGER.info("ArturoMon skeleton loaded with {} creature definitions.", CreatureRegistry.all().size());
    }
}
