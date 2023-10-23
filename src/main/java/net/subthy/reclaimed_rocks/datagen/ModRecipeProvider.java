package net.subthy.reclaimed_rocks.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.reclaimed_rocks.block.ModBlocks;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        SingleItemRecipeBuilder builder = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DOLOMITE.get()), RecipeCategory.MISC, ModBlocks.DOLOMITE_POLISHED_BLOCK.get())
                .unlockedBy("has_dolomite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DOLOMITE.get()).build()))
                .save(pWriter);

    }
}
