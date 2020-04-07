package com.rcldevelop.moremekanismores.util;

import com.rcldevelop.moremekanismores.MoreMekanismOres;
import com.rcldevelop.moremekanismores.items.ItemBase;
import mekanism.api.MekanismAPI;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.GasAttributes;
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
    public static final RegistryObject<Item> VULCANITE_CLUMP = ITEMS.register("clump_vulcanite", ItemBase::new);
    public static final RegistryObject<Item> VULCANITE_DIRTY_DUST = ITEMS.register("dirty_dust_vulcanite", ItemBase::new);
    public static final RegistryObject<Item> VULCANITE_DUST = ITEMS.register("dust_vulcanite", ItemBase::new);
    public static final RegistryObject<Item> VULCANITE_SHARD = ITEMS.register("shard_vulcanite", ItemBase::new);
    public static final RegistryObject<Item> VULCANITE_CRYSTAL = ITEMS.register("crystal_vulcanite", ItemBase::new);


    //Vulcanite Gasses
    public static final RegistryObject<Gas> DIRTY_VULCANITE_SLURRY = GAS_DEFERRED_REGISTER.register("dirty_vulcanite_slurry", () -> new Slurry(false, 0x660b14, new ItemTags.Wrapper(new ResourceLocation("forge","ores/vulcanite.json"))));
    public static final RegistryObject<Gas> CLEAN_VULCANITE_SLURRY = GAS_DEFERRED_REGISTER.register("clean_vulcanite_slurry", () -> new Slurry(true, 0xbf1324, new ItemTags.Wrapper(new ResourceLocation("forge","ores/vulcanite.json"))));
}
