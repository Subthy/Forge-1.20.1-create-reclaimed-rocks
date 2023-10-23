package net.subthy.reclaimed_rocks.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> Dolomite_Key = registerKey("dolomite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Weathered_Limestone_Key = registerKey("weathered_limestone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Gabbro_Key = registerKey("gabbro");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceabeles = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldDolomite = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.DOLOMITE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldWeathered_Limestone = List.of(OreConfiguration.target(stoneReplaceabeles,
                ModBlocks.WEATHERED_LIMESTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldGabbro = List.of(OreConfiguration.target(stoneReplaceabeles,
                ModBlocks.GABBRO.get().defaultBlockState()));

        register(context, Dolomite_Key, Feature.ORE, new OreConfiguration(overworldDolomite, 30));
        register(context, Weathered_Limestone_Key, Feature.ORE, new OreConfiguration(overworldWeathered_Limestone, 30));
        register(context, Gabbro_Key, Feature.ORE, new OreConfiguration(overworldGabbro, 30));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ReclaimedRocksMod.MOD_ID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
