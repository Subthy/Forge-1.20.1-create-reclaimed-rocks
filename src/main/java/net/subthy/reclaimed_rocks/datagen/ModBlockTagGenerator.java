package net.subthy.reclaimed_rocks.datagen;

import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.block.ModBlocks;
import net.subthy.reclaimed_rocks.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ReclaimedRocksMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DOLOMITE.get(),
                        ModBlocks.DOLOMITE_BRICKS.get(),
                        ModBlocks.DOLOMITE_SLAB.get(),
                        ModBlocks.DOLOMITE_STAIRS.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE.get(),
                        ModBlocks.DOLOMITE_POLISHED_BLOCK.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICKS.get(),
                        ModBlocks.DOLOMITE_POLISHED_SLAB.get(),
                        ModBlocks.DOLOMITE_PILLAR.get(),
                        ModBlocks.DOLOMITE_POLISHED_STAIRS.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get(),
                        ModBlocks.DOLOMITE_BRICK_STAIRS.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get(),
                        ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get(),
                        ModBlocks.DOLOMITE_BRICK_SLAB.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get(),
                        ModBlocks.DOLOMITE_CHISELED_BRICKS.get(),
                        ModBlocks.DOLOMITE_LAYERED_BLOCK.get(),
                        ModBlocks.DOLOMITE_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE_WALL.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_POLISHED_WALL.get(),
                        ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get(),
                        ModBlocks.LIMESTONE.get(),
                        ModBlocks.LIMESTONE_COBBLESTONE.get(),
                        ModBlocks.LIMESTONE_BRICKS.get(),
                        ModBlocks.LIMESTONE_PILLAR.get(),
                        ModBlocks.LIMESTONE_CHISELED_BRICKS.get(),
                        ModBlocks.LIMESTONE_LAYERED_BLOCK.get(),
                        ModBlocks.LIMESTONE_POLISHED_BLOCK.get(),
                        ModBlocks.LIMESTONE_PAVED_BRICKS.get()

                        );
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.DOLOMITE_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_COBBLESTONE_WALL.get(),
                        ModBlocks.DOLOMITE_FANCY_BRICK_WALL.get(),
                        ModBlocks.DOLOMITE_POLISHED_WALL.get(),
                        ModBlocks.DOLOMITE_PAVED_BRICK_WALL.get()
                );

    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}