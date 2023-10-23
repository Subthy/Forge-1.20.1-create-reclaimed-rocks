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
            // Dolomite
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_PILLAR.get(),2)
                .pattern("A")
                .pattern("A")
                .define('A', ModBlocks.DOLOMITE.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_BLOCK.get(),4)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.DOLOMITE.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_COBBLESTONE.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_COBBLESTONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get(),3)
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_COBBLESTONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_COBBLESTONE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_COBBLESTONE.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_COBBLESTONE.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_POLISHED_BLOCK.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_SLAB.get(),3)
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_POLISHED_BLOCK.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_POLISHED_BLOCK.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICK_SLAB.get(),3)
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_FANCY_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_FANCY_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get(),3)
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_FANCY_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_FANCY_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_FANCY_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_FANCY_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_PAVED_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_PAVED_BRICKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DOLOMITE_PAVED_BRICKS.get(),3)
                .pattern("AAA")
                .define('A', ModBlocks.DOLOMITE_FANCY_BRICKS.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE_FANCY_BRICKS.get()).build()))
                .save(pWriter);

        // Smelting
        oreSmelting(pWriter, DOLOMITE_SMELTABLES, RecipeCategory.MISC, ModBlocks.DOLOMITE.get(), 0.25f, 200, "dolomite");
        oreSmelting(pWriter, WEATHERED_LIMESTONE_SMELTABLES, RecipeCategory.MISC, ModBlocks.WEATHERED_LIMESTONE.get(), 0.25f, 200, "weathered_limestone");
        oreSmelting(pWriter, GOBBRO_SMELTABLES, RecipeCategory.MISC, ModBlocks.GABBRO.get(), 0.25f, 200, "gabbro");

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
