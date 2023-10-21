package net.subthy.reclaimed_rocks.datagen;

import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ReclaimedRocksMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.DOLOMITE_BLOCK);
        blockWithItem(ModBlocks.DOLOMITE_BRICKS);

        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_BLOCK.get()), blockTexture(ModBlocks.DOLOMITE_BLOCK.get()));
        blockItem(ModBlocks.DOLOMITE_SLAB);

        stairsBlock((StairBlock) ModBlocks.DOLOMITE_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_BLOCK.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("reclaimed_rocks:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
