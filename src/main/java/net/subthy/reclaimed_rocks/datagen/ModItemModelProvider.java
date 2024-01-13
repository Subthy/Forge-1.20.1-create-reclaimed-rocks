package net.subthy.reclaimed_rocks.datagen;

import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.item.ModItems;
import net.subthy.reclaimed_rocks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ReclaimedRocksMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // DOLOMITE
        wallItem(ModBlocks.DOLOMITE_BRICK_WALL, ModBlocks.DOLOMITE_BRICKS);
        wallItem(ModBlocks.DOLOMITE_WALL, ModBlocks.DOLOMITE);
        wallItem(ModBlocks.DOLOMITE_COBBLESTONE_WALL, ModBlocks.DOLOMITE_COBBLESTONE);
        wallItem(ModBlocks.DOLOMITE_PAVED_BRICK_WALL, ModBlocks.DOLOMITE_PAVED_BRICKS);
        wallItem(ModBlocks.DOLOMITE_FANCY_BRICK_WALL, ModBlocks.DOLOMITE_FANCY_BRICKS);
        wallItem(ModBlocks.DOLOMITE_POLISHED_WALL, ModBlocks.DOLOMITE_POLISHED_BLOCK);
        wallItem(ModBlocks.DOLOMITE_LAYERED_WALL, ModBlocks.DOLOMITE_LAYERED_BLOCK);
        // WEATHERED_LIMESTONE
        wallItem(ModBlocks.WEATHERED_LIMESTONE_BRICK_WALL, ModBlocks.WEATHERED_LIMESTONE_BRICKS);
        wallItem(ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE_WALL, ModBlocks.WEATHERED_LIMESTONE_COBBLESTONE);
        wallItem(ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICK_WALL, ModBlocks.WEATHERED_LIMESTONE_PAVED_BRICKS);
        wallItem(ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICK_WALL, ModBlocks.WEATHERED_LIMESTONE_FANCY_BRICKS);
        wallItem(ModBlocks.WEATHERED_LIMESTONE_POLISHED_WALL, ModBlocks.WEATHERED_LIMESTONE_POLISHED_BLOCK);
        wallItem(ModBlocks.WEATHERED_LIMESTONE_WALL, ModBlocks.WEATHERED_LIMESTONE);
        wallItem(ModBlocks.WEATHERED_LIMESTONE_LAYERED_WALL, ModBlocks.WEATHERED_LIMESTONE_LAYERED_BLOCK);
        // GABBRO
        wallItem(ModBlocks.GABBRO_BRICK_WALL, ModBlocks.GABBRO_BRICKS);
        wallItem(ModBlocks.GABBRO_WALL, ModBlocks.GABBRO);
        wallItem(ModBlocks.GABBRO_COBBLESTONE_WALL, ModBlocks.GABBRO_COBBLESTONE);
        wallItem(ModBlocks.GABBRO_PAVED_BRICK_WALL, ModBlocks.GABBRO_PAVED_BRICKS);
        wallItem(ModBlocks.GABBRO_FANCY_BRICK_WALL, ModBlocks.GABBRO_FANCY_BRICKS);
        wallItem(ModBlocks.GABBRO_POLISHED_WALL, ModBlocks.GABBRO_POLISHED_BLOCK);
        wallItem(ModBlocks.GABBRO_LAYERED_WALL, ModBlocks.GABBRO_LAYERED_BLOCK);

    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(ReclaimedRocksMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(ReclaimedRocksMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(ReclaimedRocksMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ReclaimedRocksMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}

