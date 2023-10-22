package net.subthy.reclaimed_rocks.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.reclaimed_rocks.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        add(ModBlocks.DOLOMITE_BLOCK.get(), (arg) -> createSingleItemTableWithSilkTouch(arg, ModBlocks.DOLOMITE_COBBLESTONE.get()));
        //Normal block
        this.dropSelf(ModBlocks.DOLOMITE_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.DOLOMITE_POLISHED_BLOCK.get());
        this.dropSelf(ModBlocks.DOLOMITE_PAVED_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_FANCY_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_PILLAR.get());
        this.dropSelf(ModBlocks.DOLOMITE_CHISELED_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_LAYERED_BLOCK.get());
        // Slab
        this.add(ModBlocks.DOLOMITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_POLISHED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_POLISHED_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_BRICK_SLAB.get()));
        this.add(ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_FANCY_BRICK_SLAB.get()));
        //Stair
        this.dropSelf(ModBlocks.DOLOMITE_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_POLISHED_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_FANCY_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.DOLOMITE_PAVED_BRICK_STAIRS.get());
        // Wall
        this.dropSelf(ModBlocks.DOLOMITE_BRICK_WALL.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
