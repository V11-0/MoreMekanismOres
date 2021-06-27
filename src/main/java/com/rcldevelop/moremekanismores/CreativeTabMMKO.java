package com.rcldevelop.moremekanismores;

import com.google.common.collect.Iterables;
import com.rcldevelop.moremekanismores.util.ItemsRegistryHandler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

public class CreativeTabMMKO extends ItemGroup {
    public CreativeTabMMKO(){
        super(MoreMekanismOres.MOD_ID);
    }

    @Override
    public ItemStack makeIcon() {
        RegistryObject<Item> firstItem = Iterables.get(ItemsRegistryHandler.ITEMS.getEntries(), 0);
        return new ItemStack(firstItem.get());
    }
}
