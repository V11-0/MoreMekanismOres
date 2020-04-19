package com.rcldevelop.moremekanismores.util;

import com.rcldevelop.moremekanismores.MoreMekanismOres;
import mekanism.api.MekanismAPI;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.Slurry;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreMekanismOres.MOD_ID);
    public static final DeferredRegister<Gas> GAS_DEFERRED_REGISTER = new DeferredRegister<>(MekanismAPI.GAS_REGISTRY, MoreMekanismOres.MOD_ID);
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        GAS_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Vulcanite Items
    public static final RegistryObject<Item> VULCANITE_CLUMP = ITEMS.register("clump_vulcanite", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> VULCANITE_DIRTY_DUST = ITEMS.register("dirty_dust_vulcanite", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> VULCANITE_DUST = ITEMS.register("dust_vulcanite", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> VULCANITE_SHARD = ITEMS.register("shard_vulcanite", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> VULCANITE_CRYSTAL = ITEMS.register("crystal_vulcanite", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));


    //Vulcanite Gasses
    public static final RegistryObject<Gas> DIRTY_VULCANITE_SLURRY = GAS_DEFERRED_REGISTER.register("dirty_vulcanite_slurry", () -> new Slurry(false, 0x660b14, new ItemTags.Wrapper(new ResourceLocation("forge","ores/vulcanite.json"))));
    public static final RegistryObject<Gas> CLEAN_VULCANITE_SLURRY = GAS_DEFERRED_REGISTER.register("clean_vulcanite_slurry", () -> new Slurry(true, 0xbf1324, new ItemTags.Wrapper(new ResourceLocation("forge","ores/vulcanite.json"))));

    //Simply Platinum Items
    public static final RegistryObject<Item> PLATINUM_CLUMP = ITEMS.register("clump_platinum", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> PLATINUM_DIRTY_DUST = ITEMS.register("dirty_dust_platinum", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("dust_platinum", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> PLATINUM_SHARD = ITEMS.register("shard_platinum", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> PLATINUM_CRYSTAL = ITEMS.register("crystal_platinum", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));

    //Simply Platinum Gasses

    public static final RegistryObject<Gas> DIRTY_PLATINUM_SLURRY = GAS_DEFERRED_REGISTER.register("dirty_platinum_slurry", () -> new Slurry(false, 0x9e9b95, new ItemTags.Wrapper(new ResourceLocation("forge","ores/platinum.json"))));
    public static final RegistryObject<Gas> CLEAN_PLATINUM_SLURRY = GAS_DEFERRED_REGISTER.register("clean_platinum_slurry", () -> new Slurry(true, 0xe5e4e2, new ItemTags.Wrapper(new ResourceLocation("forge","ores/platinum.json"))));


    //Silent Gear Crimson Iron Items
    public static final RegistryObject<Item> CRIMSON_IRON_CLUMP = ITEMS.register("clump_crimson_iron", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> CRIMSON_IRON_DIRTY_DUST = ITEMS.register("dirty_dust_crimson_iron", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> CRIMSON_IRON_SHARD = ITEMS.register("shard_crimson_iron", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> CRIMSON_IRON_CRYSTAL = ITEMS.register("crystal_crimson_iron", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));

    //Silent Gear Crimson Iron Gasses
    public static final  RegistryObject<Gas> DIRTY_CRIMSON_IRON_SLURRY = GAS_DEFERRED_REGISTER.register("dirty_crimson_iron_slurry", () -> new Slurry(false, 0xc9244d, new ItemTags.Wrapper(new ResourceLocation("forge", "ores/crimson_iron.json"))));
    public static final  RegistryObject<Gas> CLEAN_CRIMSON_IRON_SLURRY = GAS_DEFERRED_REGISTER.register("clean_crimson_iron_slurry", () -> new Slurry(true, 0xfc6187, new ItemTags.Wrapper(new ResourceLocation("forge", "ores/crimson_iron.json"))));



    //Zinc Items
    public static final RegistryObject<Item> ZINC_CLUMP = ITEMS.register("clump_zinc", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> ZINC_DIRTY_DUST = ITEMS.register("dirty_dust_zinc", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> ZINC_SHARD = ITEMS.register("shard_zinc", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> ZINC_CRYSTAL = ITEMS.register("crystal_zinc", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("dust_zinc", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("ingot_zinc", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    //Zinc Gasses
    public static final  RegistryObject<Gas> DIRTY_ZINC_SLURRY = GAS_DEFERRED_REGISTER.register("dirty_zinc_slurry", () -> new Slurry(false, 0x82a19c, new ItemTags.Wrapper(new ResourceLocation("forge", "ores/zinc.json"))));
    public static final  RegistryObject<Gas> CLEAN_ZINC_SLURRY = GAS_DEFERRED_REGISTER.register("clean_zinc_slurry", () -> new Slurry(true, 0x9ec3bd, new ItemTags.Wrapper(new ResourceLocation("forge", "ores/zinc.json"))));


    //Silver Items
    public static final RegistryObject<Item> SILVER_CLUMP = ITEMS.register("clump_silver", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> SILVER_DIRTY_DUST = ITEMS.register("dirty_dust_silver", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> SILVER_SHARD = ITEMS.register("shard_silver", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> SILVER_CRYSTAL = ITEMS.register("crystal_silver", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("dust_silver", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("ingot_silver", () -> new Item(new Item.Properties().group(MoreMekanismOres.creativeTab)));
    //Silver Gasses
    public static final  RegistryObject<Gas> DIRTY_SILVER_SLURRY = GAS_DEFERRED_REGISTER.register("dirty_silver_slurry", () -> new Slurry(false, 0x94989c, new ItemTags.Wrapper(new ResourceLocation("forge", "ores/silver.json"))));
    public static final  RegistryObject<Gas> CLEAN_SILVER_SLURRY = GAS_DEFERRED_REGISTER.register("clean_silver_slurry", () -> new Slurry(true, 0xc4cace, new ItemTags.Wrapper(new ResourceLocation("forge", "ores/silver.json"))));

}
