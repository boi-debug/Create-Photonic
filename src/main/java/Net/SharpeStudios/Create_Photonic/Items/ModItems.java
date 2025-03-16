package Net.SharpeStudios.Create_Photonic.Items;

import Net.SharpeStudios.Create_Photonic.CreatePhotonic;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Stack;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreatePhotonic.MOD_ID);
    public static final DeferredItem<Item> Sword = ITEMS.register("sword",
            () -> new Item(new Item.Properties().durability(100).stacksTo(1)));
    public static final DeferredItem<Item> Beamer = ITEMS.register("beamer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Fools_Emerald = ITEMS.register("fools_emerald",
            () -> new Item(new Item.Properties()));
    public static void Register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
