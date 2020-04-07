package com.rcldevelop.moremekanismores.util;

import com.rcldevelop.moremekanismores.MoreMekanismOres;
import com.rcldevelop.moremekanismores.items.ItemBase;
import mekanism.api.chemical.gas.Slurry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreMekanismOres.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> VULCANITE_CLUMP = ITEMS.register("clump_vulcanite", ItemBase::new);
    public static final RegistryObject<Item> VULCANITE_DIRTY_DUST = ITEMS.register("dirty_dust_vulcanite", ItemBase::new);
    public static final RegistryObject<Item> VULCANITE_DUST = ITEMS.register("dust_vulcanite", ItemBase::new);
    public static final RegistryObject<Item> VULCANITE_SHARD = ITEMS.register("shard_vulcanite", ItemBase::new);
    public static final RegistryObject<Item> VULCANITE_CRYSTAL = ITEMS.register("crystal_vulcanite", ItemBase::new);

    
}
