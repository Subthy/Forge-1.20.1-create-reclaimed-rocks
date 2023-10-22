package net.subthy.reclaimed_rocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ReclaimedRocksMod.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> DOLOMITE_BLOCK = registerBlock("dolomite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> DOLOMITE_LAYERED_BLOCK = registerBlock("dolomite_layered_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> DOLOMITE_POLISHED_BLOCK = registerBlock("dolomite_polished_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> DOLOMITE_BRICKS = registerBlock("dolomite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DOLOMITE_PAVED_BRICKS = registerBlock("dolomite_paved_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DOLOMITE_PILLAR = registerBlock("dolomite_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DOLOMITE_FANCY_BRICKS = registerBlock("dolomite_fancy_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DOLOMITE_COBBLESTONE = registerBlock("dolomite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DOLOMITE_CHISELED_BRICKS = registerBlock("dolomite_chiseled_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    // Slabs
    public static final RegistryObject<Block> DOLOMITE_SLAB = registerBlock("dolomite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_COBBLESTONE_SLAB = registerBlock("dolomite_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_POLISHED_SLAB = registerBlock("dolomite_polished_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_BRICK_SLAB = registerBlock("dolomite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_FANCY_BRICK_SLAB = registerBlock("dolomite_fancy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.STONE)));

    // Stairs
    public static final RegistryObject<Block> DOLOMITE_STAIRS = registerBlock("dolomite_stairs",
            () -> new StairBlock(() -> ModBlocks.DOLOMITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_BRICK_STAIRS = registerBlock("dolomite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DOLOMITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_FANCY_BRICK_STAIRS = registerBlock("dolomite_fancy_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DOLOMITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_PAVED_BRICK_STAIRS = registerBlock("dolomite_paved_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DOLOMITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_COBBLESTONE_STAIRS = registerBlock("dolomite_cobblestone_stairs",
            () -> new StairBlock(() -> ModBlocks.DOLOMITE_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_POLISHED_STAIRS = registerBlock("dolomite_polished_stairs",
            () -> new StairBlock(() -> ModBlocks.DOLOMITE_POLISHED_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.STONE)));

    // Walls
    public static final RegistryObject<Block> DOLOMITE_BRICK_WALL = registerBlock("dolomite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
