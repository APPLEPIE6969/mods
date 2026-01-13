package com.example.drugsmod.world.gen;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModWorldGen {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

        // Add coca leaves to jungle biomes
        if (event.getName().toString().contains("jungle")) {
            base.add(ModOreGeneration.COCA_LEAF_PATCH);
            base.add(ModOreGeneration.KRATOM_LEAF_PATCH);
        }

        // Add opium poppies to plains biomes
        if (event.getName().toString().contains("plains")) {
            base.add(ModOreGeneration.OPIUM_POPPY_PATCH);
        }

        // Add kava roots to tropical biomes
        if (event.getName().toString().contains("jungle") || event.getName().toString().contains("savanna")) {
            base.add(ModOreGeneration.KAVA_ROOT_PATCH);
        }

        // Add ephedra to desert biomes
        if (event.getName().toString().contains("desert")) {
            base.add(ModOreGeneration.EPHEDRA_PATCH);
            base.add(ModOreGeneration.PEYOTE_CACTUS_PATCH);
        }

        // Add magic mushrooms to dark forests
        if (event.getName().toString().contains("dark_forest")) {
            base.add(ModOreGeneration.MUSHROOM_PATCH);
        }

        // Add salvia to mountain biomes
        if (event.getName().toString().contains("mountain")) {
            base.add(ModOreGeneration.SALVIA_PATCH);
        }

        // Add morning glory to flower forests
        if (event.getName().toString().contains("flower_forest")) {
            base.add(ModOreGeneration.MORNING_GLORY_PATCH);
        }

        // Add betel nut to jungle biomes
        if (event.getName().toString().contains("jungle")) {
            base.add(ModOreGeneration.BETEL_NUT_PATCH);
        }

        // Add kola nut to savanna biomes
        if (event.getName().toString().contains("savanna")) {
            base.add(ModOreGeneration.KOLA_NUT_PATCH);
        }

        // Add guarana to jungle biomes
        if (event.getName().toString().contains("jungle")) {
            base.add(ModOreGeneration.GUARANA_PATCH);
        }

        // Add yerba mate to forest biomes
        if (event.getName().toString().contains("forest")) {
            base.add(ModOreGeneration.YERBA_MATE_PATCH);
        }
    }
}
