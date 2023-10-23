package net.subthy.reclaimed_rocks.worldgen;

import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> Add_Dolomite = registerKey("add_dolomite");
    public static final ResourceKey<BiomeModifier> Add_Weathered_Limestone = registerKey("add_weathered_limestone");
    public static final ResourceKey<BiomeModifier> Add_Gabbro = registerKey("add_gabbro");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(Add_Dolomite, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.Dolomite_Placed_Key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(Add_Weathered_Limestone, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.Weathered_Limestone_Placed_Key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(Add_Gabbro, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.Gabbro_Placed_Key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


    }
    private static ResourceKey<BiomeModifier> registerKey (String name){
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(ReclaimedRocksMod.MOD_ID, name));
    }
}
