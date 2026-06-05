package com.arturo.arturmon.creature;

import java.util.Optional;

public record CreatureDefinition(
        String id,
        String displayName,
        CreatureType primaryType,
        Optional<CreatureType> secondaryType,
        int evolutionStage,
        Optional<String> evolvesTo,
        Optional<Integer> evolutionLevel,
        double baseCaptureRate
) {
    public CreatureDefinition {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Creature id cannot be blank");
        }
        if (displayName == null || displayName.isBlank()) {
            throw new IllegalArgumentException("Display name cannot be blank");
        }
        if (evolutionStage < 1) {
            throw new IllegalArgumentException("Evolution stage must be positive");
        }
        if (baseCaptureRate < 0.0 || baseCaptureRate > 1.0) {
            throw new IllegalArgumentException("Base capture rate must be between 0 and 1");
        }
    }

    public static CreatureDefinition of(
            String id,
            String displayName,
            CreatureType primaryType,
            CreatureType secondaryType,
            int evolutionStage,
            String evolvesTo,
            Integer evolutionLevel,
            double baseCaptureRate
    ) {
        return new CreatureDefinition(
                id,
                displayName,
                primaryType,
                Optional.ofNullable(secondaryType),
                evolutionStage,
                Optional.ofNullable(evolvesTo),
                Optional.ofNullable(evolutionLevel),
                baseCaptureRate
        );
    }
}
