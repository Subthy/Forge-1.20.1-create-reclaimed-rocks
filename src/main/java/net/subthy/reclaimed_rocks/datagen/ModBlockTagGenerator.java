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
                .add(ModBlocks.DOLOMITE_BLOCK.get(),
                        ModBlocks.DOLOMITE_BRICKS.get(),
                        ModBlocks.DOLOMITE_SLAB.get(),
                        ModBlocks.DOLOMITE_STAIRS.get()
                );

    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}