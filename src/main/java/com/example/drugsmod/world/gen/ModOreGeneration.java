package com.example.drugsmod.world.gen;

import com.example.drugsmod.core.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModOreGeneration {
    public static Holder<PlacedFeature> COCA_LEAF_PATCH;
    public static Holder<PlacedFeature> OPIUM_POPPY_PATCH;
    public static Holder<PlacedFeature> KAVA_ROOT_PATCH;
    public static Holder<PlacedFeature> EPHEDRA_PATCH;
    public static Holder<PlacedFeature> PEYOTE_CACTUS_PATCH;
    public static Holder<PlacedFeature> MUSHROOM_PATCH;
    public static Holder<PlacedFeature> KRATOM_LEAF_PATCH;

    public static void registerOres() {
        // Coca leaves generate in jungle biomes
        COCA_LEAF_PATCH = registerPlacedFeature("coca_leaf_patch",
            FeatureUtils.register("coca_leaf_patch", Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.inlineOre(
                    new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,
                        BlockInit.COCA_PLANT.get().defaultBlockState(), 8)))),
            RarityFilter.onAverageOnceEvery(32));

        // Opium poppies generate in plains biomes
        OPIUM_POPPY_PATCH = registerPlacedFeature("opium_poppy_patch",
            FeatureUtils.register("opium_poppy_patch", Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.inlineOre(
                    new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,
                        BlockInit.OPIUM_POPPY_PLANT.get().defaultBlockState(), 6)))),
            RarityFilter.onAverageOnceEvery(40));

        // Kava roots generate in tropical biomes
        KAVA_ROOT_PATCH = registerPlacedFeature("kava_root_patch",
            FeatureUtils.register("kava_root_patch", Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.inlineOre(
                    new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,
                        BlockInit.KAVA_PLANT.get().defaultBlockState(), 4)))),
            RarityFilter.onAverageOnceEvery(50));

        // Ephedra generates in desert biomes
        EPHEDRA_PATCH = registerPlacedFeature("ephedra_patch",
            FeatureUtils.register("ephedra_patch", Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.inlineOre(
                    new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,
                        BlockInit.EPHEDRA_PLANT.get().defaultBlockState(), 5)))),
            RarityFilter.onAverageOnceEvery(45));

        // Peyote cactus generates in desert biomes
        PEYOTE_CACTUS_PATCH = registerPlacedFeature("peyote_cactus_patch",
            FeatureUtils.register("peyote_cactus_patch", Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.inlineOre(
                    new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,
                        BlockInit.PEYOTE_CACTUS_PLANT.get().defaultBlockState(), 3)))),
            RarityFilter.onAverageOnceEvery(60));

        // Magic mushrooms generate in dark oak forests
        MUSHROOM_PATCH = registerPlacedFeature("mushroom_patch",
            FeatureUtils.register("mushroom_patch", Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.inlineOre(
                    new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,
                        BlockInit.MAGIC_MUSHROOM.get().defaultBlockState(), 8)))),
            RarityFilter.onAverageOnceEvery(35));

        // Kratom leaves generate in jungle biomes
        KRATOM_LEAF_PATCH = registerPlacedFeature("kratom_leaf_patch",
            FeatureUtils.register("kratom_leaf_patch", Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.inlineOre(
                    new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE,
                        BlockInit.KRATOM_PLANT.get().defaultBlockState(), 6)))),
            RarityFilter.onAverageOnceEvery(38));
    }

    private static Holder<PlacedFeature> registerPlacedFeature(String name, Holder<ConfiguredFeature<?, ?>> configuredFeature, PlacementModifier... placementModifiers) {
        return PlacementUtils.register(name, configuredFeature, placementModifiers);
    }
}
