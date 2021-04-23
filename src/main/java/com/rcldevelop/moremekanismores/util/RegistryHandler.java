package com.rcldevelop.moremekanismores.util;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.Color;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import mekanism.api.MekanismAPI;

import mekanism.api.chemical.slurry.Slurry;
import mekanism.api.chemical.slurry.SlurryBuilder;

import com.rcldevelop.moremekanismores.MoreMekanismOres;
import com.rcldevelop.moremekanismores.models.OreMekanismComponents;

public class RegistryHandler {

    // Array with objects to help register items and slurries
    private final OreMekanismComponents[] NAMES = {
        new OreMekanismComponents("vulcanite",    new int[] {0x660b14, 0xbf1324}),
        new OreMekanismComponents("platinum",     new int[] {0x9e9b95, 0xe5e4e2}),
        new OreMekanismComponents("crimson_iron", new int[] {0xc9244d, 0xfc6187}),
        new OreMekanismComponents("zinc",         new int[] {0x82a19c, 0x9ec3bd}),
        new OreMekanismComponents("silver",       new int[] {0x94989c, 0xc4cace}),
        new OreMekanismComponents("rosite",       new int[] {0x7c0823, 0xff1145}),
        new OreMekanismComponents("emberstone",   new int[] {0x560e00, 0xaa1c00}),
        new OreMekanismComponents("limonite",     new int[] {0x703f04, 0xab6005}),
    };

    public static final DeferredRegister<Item> ITEMS
        = DeferredRegister.create(ForgeRegistries.ITEMS, MoreMekanismOres.MOD_ID);

    public static final DeferredRegister<Slurry> SLURRIES 
        = DeferredRegister.create(MekanismAPI.slurryRegistry(), MoreMekanismOres.MOD_ID);

    public void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SLURRIES.register(FMLJavaModLoadingContext.get().getModEventBus());

        registerAll();
    }

    private void registerAll() {

        for (OreMekanismComponents ore : NAMES) {

                // Register clumps, crystals, shards and all of an ore
                for (String itemName : ore.getOreProcessPhases()) {
                        Item.Properties itemProperties = new Item.Properties().tab(MoreMekanismOres.creativeTab);
                        ITEMS.register(itemName, () -> new Item(itemProperties));
                }

                ResourceLocation resource = new ResourceLocation("forge", "ores/" + ore.getOreName() + ".json");

                // Register slurries of that ore
                SLURRIES.register(ore.getSlurries()[0], () -> new Slurry(SlurryBuilder.dirty().ore(resource).color(ore.getSlurriesColors()[0])));
                SLURRIES.register(ore.getSlurries()[1], () -> new Slurry(SlurryBuilder.clean().ore(resource).color(ore.getSlurriesColors()[1])));
        }
    };
}
