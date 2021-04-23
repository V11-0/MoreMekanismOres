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
        new OreMekanismComponents("vulcanite",    new int[] {4, 4}),
        new OreMekanismComponents("platinum",     new int[] {4, 4}),
        new OreMekanismComponents("crimson_iron", new int[] {4, 4}),
        new OreMekanismComponents("zinc",         new int[] {4, 4}),
        new OreMekanismComponents("sivler",       new int[] {4, 4}),
        new OreMekanismComponents("rosite",       new int[] {11141120, 16056320}),
        new OreMekanismComponents("emberstone",   new int[] {4, 4}),
        new OreMekanismComponents("limestone",    new int[] {4, 4}),
        // TODO: Parse Colors
        //Color.parseColor(hex)
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
