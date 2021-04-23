package com.rcldevelop.moremekanismores;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import com.rcldevelop.moremekanismores.util.RegistryHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mmko")
public class MoreMekanismOres {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mmko";
    public static final ItemGroup creativeTab = new CreativeTabMMKO();

    public MoreMekanismOres() {
        // FIXME find a way to register mekanism slurries after slurry registry become avaliable
        RegistryHandler rh = new RegistryHandler();
        rh.init();
        
        MinecraftForge.EVENT_BUS.register(this);
    }
}
