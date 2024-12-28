package net.timeworndevs.tfc_ore_helper.common;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.timeworndevs.tfc_ore_helper.Main;

public class TFCOHItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    /*
    bismuth
    bismuth bronze
    black bronze
    bronze
    brass
    copper
    gold
    nickel
    rose gold
    silver
    tin
    zinc
    sterling silver
    wrought iron
    cast iron
    steel
    black steel
    blue steel
    red steel
    weak
    weak
    weak
    high carbon steel
    high carbon black steel
    high carbon blue steel
    high carbon red steel
    unknown alloy
     */

    public static final RegistryObject<Item> BISMUTH_BULLION = ITEMS.register("metal/bullion/_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_BRONZE_BULLION = ITEMS.register("metal/bullion/_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> _BULLION = ITEMS.register("metal/bullion/_bullion", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> _BULLION = ITEMS.register("metal/bullion/_bullion", () -> new Item(new Item.Properties()));

}
