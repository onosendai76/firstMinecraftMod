package com.arturo.arturmon.registry;

import com.arturo.arturmon.ArturoMonMod;
import com.arturo.arturmon.item.CaptureBallItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public final class ModItems {
    public static final Item CAPTURE_BALL = new CaptureBallItem(new Item.Settings().maxCount(64));

    private ModItems() {
    }

    public static void register() {
        Registry.register(Registries.ITEM, ArturoMonMod.id("capture_ball"), CAPTURE_BALL);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(CAPTURE_BALL));
    }
}
