package net.timeworndevs.tfc_ore_helper.common;

import net.dries007.tfc.common.items.MoldItem;
import net.dries007.tfc.common.items.TFCItems;
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
    pig iron
    steel
    black steel
    blue steel
    red steel
    weak steel
    weak blue steel
    weak red steel
    high carbon steel
    high carbon black steel
    high carbon blue steel
    high carbon red steel
    unknown alloy
     */


    //todo: Convert everything to a registry map like how TFC does it
    public static final RegistryObject<Item> BISMUTH_BULLION = ITEMS.register("metal/bullion/bismuth_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_BRONZE_BULLION = ITEMS.register("metal/bullion/bismuth_bronze_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_BRONZE_BULLION = ITEMS.register("metal/bullion/black_bronze_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BULLION = ITEMS.register("metal/bullion/bronze_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_BULLION = ITEMS.register("metal/bullion/brass_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BULLION = ITEMS.register("metal/bullion/copper_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_BULLION = ITEMS.register("metal/bullion/gold_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_BULLION = ITEMS.register("metal/bullion/nickel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_BULLION = ITEMS.register("metal/bullion/rose_gold_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BULLION = ITEMS.register("metal/bullion/silver_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_BULLION = ITEMS.register("metal/bullion/tin_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_BULLION = ITEMS.register("metal/bullion/zinc_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STERLING_SILVER_BULLION = ITEMS.register("metal/bullion/starling_silver_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BULLION = ITEMS.register("metal/bullion/wrought_iron_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAST_IRON_BULLION = ITEMS.register("metal/bullion/cast_iron_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIG_IRON_BULLION = ITEMS.register("metal/bullion/pig_iron_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BULLION = ITEMS.register("metal/bullion/steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_STEEL_BULLION = ITEMS.register("metal/bullion/black_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_STEEL_BULLION = ITEMS.register("metal/bullion/blue_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_STEEL_BULLION = ITEMS.register("metal/bullion/red_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEAK_STEEL_BULLION = ITEMS.register("metal/bullion/weak_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEAK_BLUE_STEEL_BULLION = ITEMS.register("metal/bullion/weak_blue_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEAK_RED_STEEL_BULLION = ITEMS.register("metal/bullion/weak_red_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HIGH_CARBON_STEEL_BULLION = ITEMS.register("metal/bullion/high_carbon_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HIGH_CARBON_BLACK_STEEL_BULLION = ITEMS.register("metal/bullion/high_carbon_black_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HIGH_CARBON_BLUE_STEEL_BULLION = ITEMS.register("metal/bullion/high_carbon_blue_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HIGH_CARBON_RED_STEEL_BULLION = ITEMS.register("metal/bullion/high_carbon_red_steel_bullion", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNKNOWN_BULLION = ITEMS.register("metal/bullion/unknown_bullion", () -> new Item(new Item.Properties()));

    //public static final RegistryObject<Item> _BULLION = ITEMS.register("metal/bullion/_bullion", () -> new Item(new Item.Properties()));
}
