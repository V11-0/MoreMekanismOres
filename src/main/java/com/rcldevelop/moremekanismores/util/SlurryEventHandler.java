package com.rcldevelop.moremekanismores.util;

import com.rcldevelop.moremekanismores.models.OreMekanismComponents;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags.IOptionalNamedTag;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import mekanism.api.chemical.slurry.Slurry;
import mekanism.api.chemical.slurry.SlurryBuilder;

public class SlurryEventHandler {
 
    @SubscribeEvent
    public void registerSlurries(RegistryEvent.Register<Slurry> event) {
        
        for (OreMekanismComponents ore : RegistryHandler.ORE_LIST) {
            
            // Create the slurries of the ore
            ResourceLocation resource = new ResourceLocation("forge", "ores/" + ore.getOreName() + ".json");
            IOptionalNamedTag<Item> oreTag = ItemTags.createOptional(resource);

            Slurry dirty = new Slurry(SlurryBuilder.dirty().ore(oreTag).color(ore.getSlurriesColors()[0]));
            Slurry clean = new Slurry(SlurryBuilder.clean().ore(oreTag).color(ore.getSlurriesColors()[1]));

            dirty.setRegistryName(ore.getSlurries()[0]);
            clean.setRegistryName(ore.getSlurries()[1]);

            event.getRegistry().registerAll(dirty, clean);
        }
    }
}
