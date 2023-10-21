package net.subthy.reclaimed_rocks.item;

import net.subthy.reclaimed_rocks.ReclaimedRocksMod;
import net.subthy.reclaimed_rocks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReclaimedRocksMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("reclaimed_rocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DOLOMITE_BLOCK.get()))
                    .title(Component.translatable("creativetab.reclaimed_rocks_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModBlocks.DOLOMITE_BLOCK.get());
                        output.accept(ModBlocks.DOLOMITE_BRICKS.get());
                        output.accept(ModBlocks.DOLOMITE_SLAB.get());
                        output.accept(ModBlocks.DOLOMITE_STAIRS.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
