package com.rcldevelop.moremekanismores.util;

import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import com.rcldevelop.moremekanismores.MoreMekanismOres;

import com.rcldevelop.moremekanismores.models.OreMekanismComponents;
import com.rcldevelop.moremekanismores.models.OreMekanismComponents.Phase;

/**
 * Responsible class for defining and registering items 
 */
public class ItemsRegistryHandler {

    // Array with objects to help register items
    public static final OreMekanismComponents[] ORE_LIST = {
        //new OreMekanismComponents("vulcanite",    new int[] { 0x660b14, 0xbf1324 }),
        //new OreMekanismComponents("platinum",     new int[] { 0x9e9b95, 0xe5e4e2 }),
        //new OreMekanismComponents("crimson_iron", new int[] { 0xc9244d, 0xfc6187 }, Phase.DUST),
        //new OreMekanismComponents("zinc",         new int[] { 0x82a19c, 0x9ec3bd }),
        new OreMekanismComponents("silver",       new int[] { 0x94989c, 0xc4cace }),
        new OreMekanismComponents("rosite",       new int[] { 0x7c0823, 0xff1145 }),
        new OreMekanismComponents("emberstone",   new int[] { 0x560e00, 0xaa1c00 }),
        new OreMekanismComponents("limonite",     new int[] { 0x703f04, 0xab6005 })
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreMekanismOres.MOD_ID);

    public void init() {
        registerAll();

        MoreMekanismOres.LOGGER.info("Things Registered");

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void registerAll() {

        for (OreMekanismComponents ore : ORE_LIST) {            

            // Register clumps, crystals, shards and all of an ore
            for (String itemName : ore.getOreProcessPhases()) {
                
                if (itemName != null) {
                    Item.Properties itemProperties = new Item.Properties().tab(MoreMekanismOres.creativeTab);
                    ITEMS.register(itemName, () -> new Item(itemProperties));
                } else break;
            }
        }
    };
}
