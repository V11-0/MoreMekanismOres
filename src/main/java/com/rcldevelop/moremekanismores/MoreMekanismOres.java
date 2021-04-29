package com.rcldevelop.moremekanismores;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.rcldevelop.moremekanismores.util.RegistryHandler;
import com.rcldevelop.moremekanismores.util.SlurryEventHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Mod("mmko")
public class MoreMekanismOres {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mmko";
    public static final ItemGroup creativeTab = new CreativeTabMMKO();

    public MoreMekanismOres() {
        FMLJavaModLoadingContext.get().getModEventBus().register(new SlurryEventHandler());

        RegistryHandler rh = new RegistryHandler();
        rh.init();    

        MinecraftForge.EVENT_BUS.register(this);
    }
}
