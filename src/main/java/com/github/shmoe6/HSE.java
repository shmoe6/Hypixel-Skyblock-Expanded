package com.github.shmoe6;

import com.github.shmoe6.handlers.DropHandler;
import com.github.shmoe6.init.ItemInit;
import com.github.shmoe6.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class HSE {

    //CTRL + F9 TO RELOAD IN DEBUG MODE

    @SidedProxy(serverSide = Reference.SERVER_PROXY, clientSide = Reference.CLIENT_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance("hse")
    public static HSE instance;

    @Mod.EventHandler()
    public static void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.NAME + ": pre init...");
        new ItemInit();
    }

    @Mod.EventHandler()
    public static void init(FMLInitializationEvent event) {
        System.out.println(Reference.NAME + ": init...");
        proxy.registerRenders();

        MinecraftForge.EVENT_BUS.register(new DropHandler());
    }

    @Mod.EventHandler()
    public static void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.NAME + ": post init...");
    }
}
