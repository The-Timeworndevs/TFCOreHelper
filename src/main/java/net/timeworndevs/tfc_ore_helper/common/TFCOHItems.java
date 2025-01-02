package net.timeworndevs.tfc_ore_helper.common;

import net.dries007.tfc.util.Helpers;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.timeworndevs.tfc_ore_helper.Main;
import net.timeworndevs.tfc_ore_helper.util.TFCOHMetalUtil;

import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class TFCOHItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    //register base TFC metal items
    public static final Map<TFCOHMetalUtil.DefaultTFCMetals, Map<TFCOHMetalUtil.TFCOHItemTypes, RegistryObject<Item>>> METAL_ITEMS = Helpers.mapOfKeys(TFCOHMetalUtil.DefaultTFCMetals.class, metal ->
            Helpers.mapOfKeys(TFCOHMetalUtil.TFCOHItemTypes.class, type ->
                    register("metal/" + type.name() + "/" + metal.name(), ()-> new Item(metal_properties()))
            )
    );

    public static Item.Properties metal_properties() {
        return new Item.Properties();
    }

    private static RegistryObject<Item> register(String name)
    {
        return register(name, () -> new Item(new Item.Properties()));
    }
    private static <T extends Item> RegistryObject<T> register(String name, Supplier<T> item)
    {
        return ITEMS.register(name.toLowerCase(Locale.ROOT), item);
    }

}
