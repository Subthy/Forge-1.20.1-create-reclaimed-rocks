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
        this.dropWhenSilkTouch(ModBlocks.DOLOMITE_BLOCK.get());

        this.dropOther(ModBlocks.DOLOMITE_BLOCK.get(), ModBlocks.DOLOMITE_COBBLESTONE.get());

        this.dropSelf(ModBlocks.DOLOMITE_BRICKS.get());
        this.dropSelf(ModBlocks.DOLOMITE_COBBLESTONE.get());

        this.add(ModBlocks.DOLOMITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DOLOMITE_SLAB.get()));
        this.dropSelf(ModBlocks.DOLOMITE_STAIRS.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
