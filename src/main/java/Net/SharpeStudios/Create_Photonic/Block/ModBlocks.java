package Net.SharpeStudios.Create_Photonic.Block;

import Net.SharpeStudios.Create_Photonic.CreatePhotonic;
import Net.SharpeStudios.Create_Photonic.Items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.conditions.TrueCondition;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.commons.lang3.ObjectUtils;

import javax.naming.Name;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.Blocks.createBlocks(CreatePhotonic.MOD_ID);
    public static final DeferredBlock<Block> Beamer_Block = registerBlock("beamer_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2).sound(SoundType.STONE)));

    private static <T extends Block> void RegisterBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String Name, Supplier<T> block)
    {
        DeferredBlock<T> toReturn = BLOCKS.register(Name,block);
        RegisterBlockItem(Name, toReturn);
        return toReturn;
    }

    public static void Register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
