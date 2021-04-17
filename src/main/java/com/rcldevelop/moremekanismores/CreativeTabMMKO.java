package com.rcldevelop.moremekanismores;

import com.rcldevelop.moremekanismores.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTabMMKO extends ItemGroup {
    public CreativeTabMMKO(){
        super(MoreMekanismOres.MOD_ID);
    }

    @Override
    public ItemStack makeIcon(){
        return new ItemStack(RegistryHandler.VULCANITE_DUST.get());
    }
}
