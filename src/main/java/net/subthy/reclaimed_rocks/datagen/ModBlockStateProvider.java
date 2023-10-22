package net.subthy.reclaimed_rocks.datagen;

import net.minecraft.resources.ResourceLocation;
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
        //Normal Block
        blockWithItem(ModBlocks.DOLOMITE_BLOCK);
        blockWithItem(ModBlocks.DOLOMITE_BRICKS);
        blockWithItem(ModBlocks.DOLOMITE_COBBLESTONE);
        blockWithItem(ModBlocks.DOLOMITE_POLISHED_BLOCK);
        blockWithItem(ModBlocks.DOLOMITE_FANCY_BRICKS);
        blockWithItem(ModBlocks.DOLOMITE_LAYERED_BLOCK);
        // Block with side texture,top and bottom
        simpleBlockWithItem(ModBlocks.DOLOMITE_PAVED_BRICKS.get(), models().orientableWithBottom(ModBlocks.DOLOMITE_PAVED_BRICKS.getId().getPath(),
                modLoc("block/dolomite_paved_bricks"),
                modLoc("block/dolomite_paved_bricks"),
                new ResourceLocation("reclaimed_rocks:block/dolomite_paved_bricks_top"),
                modLoc("block/dolomite_paved_bricks_top")));
        simpleBlockWithItem(ModBlocks.DOLOMITE_PILLAR.get(), models().orientableWithBottom(ModBlocks.DOLOMITE_PILLAR.getId().getPath(),
                modLoc("block/dolomite_pillar"),
                modLoc("block/dolomite_pillar"),
                new ResourceLocation("reclaimed_rocks:block/dolomite_pillar_top"),
                modLoc("block/dolomite_pillar_top")));
        simpleBlockWithItem(ModBlocks.DOLOMITE_CHISELED_BRICKS.get(), models().orientableWithBottom(ModBlocks.DOLOMITE_CHISELED_BRICKS.getId().getPath(),
                modLoc("block/dolomite_chiseled_bricks"),
                modLoc("block/dolomite_chiseled_bricks"),
                new ResourceLocation("reclaimed_rocks:block/dolomite_chiseled_bricks_top"),
                modLoc("block/dolomite_chiseled_bricks_top")));
        // Slab
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_BLOCK.get()), blockTexture(ModBlocks.DOLOMITE_BLOCK.get()));
        blockItem(ModBlocks.DOLOMITE_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_POLISHED_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()), blockTexture(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()));
        blockItem(ModBlocks.DOLOMITE_POLISHED_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_COBBLESTONE.get()), blockTexture(ModBlocks.DOLOMITE_COBBLESTONE.get()));
        blockItem(ModBlocks.DOLOMITE_COBBLESTONE_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_BRICK_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_BRICKS.get()), blockTexture(ModBlocks.DOLOMITE_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_BRICK_SLAB);
        slabBlock(((SlabBlock) ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get()), blockTexture(ModBlocks.DOLOMITE_FANCY_BRICKS.get()), blockTexture(ModBlocks.DOLOMITE_FANCY_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_FANCY_BRICK_SLAB);
        // Stairs
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_BLOCK.get()));
        blockItem(ModBlocks.DOLOMITE_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_POLISHED_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_POLISHED_BLOCK.get()));
        blockItem(ModBlocks.DOLOMITE_POLISHED_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_COBBLESTONE.get()));
        blockItem(ModBlocks.DOLOMITE_COBBLESTONE_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_BRICK_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_FANCY_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS);
        stairsBlock((StairBlock) ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get(), blockTexture(ModBlocks.DOLOMITE_PAVED_BRICKS.get()));
        blockItem(ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS);
        // Walls
        wallBlock((WallBlock) ModBlocks.DOLOMITE_BRICK_WALL.get(), blockTexture(ModBlocks.DOLOMITE_BRICKS.get()));

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("reclaimed_rocks:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
