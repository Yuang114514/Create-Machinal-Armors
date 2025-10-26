package com.github.Yuang114514.CreateMachinalArmors.ModItem;

import com.github.Yuang114514.CreateMachinalArmors.create_machinal_armors;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

//nerve material
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "create_machinal_armors");
    public static final RegistryObject<Item> NERVE_MATERIAL =
            ITEMS.register("nerve_material", () -> new Item(new Item.Properties().stacksTo(64)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
