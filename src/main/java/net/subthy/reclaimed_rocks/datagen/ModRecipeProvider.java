package net.subthy.reclaimed_rocks.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.block.ModBlocks;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    // Lists
    private static final List<ItemLike> DOLOMITE_SMELTABLES = List.of(ModBlocks.DOLOMITE_COBBLESTONE.get());
    private static final List<ItemLike> WEATHERED_LIMESTONE_SMELTABLES = List.of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get());
    private static final List<ItemLike> GOBBRO_SMELTABLES = List.of(ModBlocks.GABBRO_COBBLESTONE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Shapped Recipes

        // Smelting Recipes
        oreSmelting(pWriter, DOLOMITE_SMELTABLES, RecipeCategory.MISC, ModBlocks.DOLOMITE.get(), 0.25f, 200, "dolomite");
        oreSmelting(pWriter, WEATHERED_LIMESTONE_SMELTABLES, RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE.get(), 0.25f, 200, "weathered_limestone");
        oreSmelting(pWriter, GOBBRO_SMELTABLES, RecipeCategory.MISC, ModBlocks.GABBRO.get(), 0.25f, 200, "gabbro");

        // Stonecutting
            // Dolomite
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_LAYERED_BLOCK.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_BLOCK.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_PAVED_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_PILLAR.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_CHISELED_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICK_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_LAYERED_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICK_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICK_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_COBBLESTONE_WALL.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        // LIMESTONE

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_BRICKS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_PILLAR.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_CHISELED_BRICKS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_POLISHED_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_BRICK_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_LAYERED_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_SLAB.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_BRICK_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_POLISHED_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_STAIRS.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_BRICK_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_POLISHED_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_WALL.get())
                .unlockedBy("has_WEATHERED_LIMESTONE", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEATHERED_LIMESTONE.get()).build()))
                .save(pWriter);

        // GABBRO

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_LAYERED_BLOCK.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_POLISHED_BLOCK.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_BRICKS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_PAVED_BRICKS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_PILLAR.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_FANCY_BRICKS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_CHISELED_BRICKS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_POLISHED_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_BRICK_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_FANCY_BRICK_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_LAYERED_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.GABBRO_COBBLESTONE_SLAB.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_BRICK_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_FANCY_BRICK_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_PAVED_BRICK_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_POLISHED_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.GABBRO_COBBLESTONE_STAIRS.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_BRICK_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_POLISHED_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_FANCY_BRICK_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO.get()), RecipeCategory.MISC, ModBlocks.GABBRO_PAVED_BRICK_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GABBRO_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.GABBRO_COBBLESTONE_WALL.get())
                .unlockedBy("has_GABBRO", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GABBRO.get()).build()))
                .save(pWriter);
    }






    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, ReclaimedRocksMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
