# ArturoMon

ArturoMon es el esqueleto inicial de un mod para Minecraft Java Edition con Fabric, pensado como base para un futuro sistema de criaturas originales capturables y evolutivas.

## Objetivo de esta rama

La meta de `feature/arturomon-fabric-skeleton` es dejar un proyecto Fabric mínimo, ordenado y compilable para Minecraft `1.20.1`.

Incluye:

- Configuración Gradle/Fabric Loom.
- `fabric.mod.json` con el entrypoint principal.
- Clase principal del mod (`ArturoMonMod`).
- Registro inicial de items (`Capture Ball`).
- Definiciones de criaturas originales centralizadas para las tres líneas iniciales.
- Recursos JSON básicos bajo `src/main/resources/assets/arturmon`.
- `.gitignore` para evitar binarios y carpetas generadas.

## Requisitos

- Java 17.
- Gradle 8.x o wrapper local equivalente.
- Acceso a los repositorios Maven de Fabric y Maven Central para descargar dependencias.

## Compilar

```bash
gradle build
```

El JAR generado aparecerá en `build/libs/` y no debe versionarse.

## Estructura principal

```text
src/main/java/com/arturo/arturmon/
├── ArturoMonMod.java
├── creature/
│   ├── CreatureDefinition.java
│   ├── CreatureRegistry.java
│   └── CreatureType.java
├── item/
│   └── CaptureBallItem.java
└── registry/
    └── ModItems.java
```

## Próximos pasos sugeridos

1. Añadir entidades de criaturas y renderizado placeholder.
2. Implementar proyectiles de Capture Ball.
3. Añadir datos persistentes por jugador.
4. Agregar comandos de desarrollo para elegir iniciales, spawnear criaturas y probar evolución.
