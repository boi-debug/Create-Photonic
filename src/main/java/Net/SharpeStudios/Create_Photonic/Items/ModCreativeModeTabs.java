package Net.SharpeStudios.Create_Photonic.Items;

import Net.SharpeStudios.Create_Photonic.Block.ModBlocks;
import Net.SharpeStudios.Create_Photonic.CreatePhotonic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> Creative_Mode_Tab =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatePhotonic.MOD_ID);

    public static void Register(IEventBus eventBus){
        Creative_Mode_Tab.register(eventBus);
    }
    public static final Supplier<CreativeModeTab> Create_Photonic_Tab = Creative_Mode_Tab.register("create_photonic_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Beamer.get()))
                    .title(Component.translatable("Create Photonic"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Sword);
                        output.accept(ModItems.Beamer);
                        output.accept(ModBlocks.Beamer_Block);
                        output.accept(ModBlocks.Fools_Emerald_block);
                    }).build());
}
