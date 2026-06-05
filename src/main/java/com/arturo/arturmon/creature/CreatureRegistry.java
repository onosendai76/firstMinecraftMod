package com.arturo.arturmon.creature;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public final class CreatureRegistry {
    public static final String STARTER_GRASS = "leafcub";
    public static final String STARTER_FIRE = "emberkit";
    public static final String STARTER_WATER = "aquapup";

    private static final Map<String, CreatureDefinition> DEFINITIONS = new LinkedHashMap<>();

    private CreatureRegistry() {
    }

    public static void bootstrap() {
        if (!DEFINITIONS.isEmpty()) {
            return;
        }

        register(CreatureDefinition.of("leafcub", "Leafcub", CreatureType.GRASS, CreatureType.POISON, 1, "leafang", 16, 0.80));
        register(CreatureDefinition.of("leafang", "Leafang", CreatureType.GRASS, CreatureType.POISON, 2, "venosauron", 36, 0.55));
        register(CreatureDefinition.of("venosauron", "Venosauron", CreatureType.GRASS, CreatureType.POISON, 3, null, null, 0.35));

        register(CreatureDefinition.of("emberkit", "Emberkit", CreatureType.FIRE, null, 1, "flameclaw", 16, 0.80));
        register(CreatureDefinition.of("flameclaw", "Flameclaw", CreatureType.FIRE, null, 2, "skyblazer", 36, 0.55));
        register(CreatureDefinition.of("skyblazer", "Skyblazer", CreatureType.FIRE, CreatureType.FLYING, 3, null, null, 0.35));

        register(CreatureDefinition.of("aquapup", "Aquapup", CreatureType.WATER, null, 1, "wavefang", 16, 0.80));
        register(CreatureDefinition.of("wavefang", "Wavefang", CreatureType.WATER, null, 2, "tidebeast", 36, 0.55));
        register(CreatureDefinition.of("tidebeast", "Tidebeast", CreatureType.WATER, null, 3, null, null, 0.35));
    }

    private static void register(CreatureDefinition definition) {
        DEFINITIONS.put(definition.id(), definition);
    }

    public static Optional<CreatureDefinition> get(String id) {
        return Optional.ofNullable(DEFINITIONS.get(id));
    }

    public static Collection<CreatureDefinition> all() {
        return DEFINITIONS.values();
    }
}
