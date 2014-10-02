package com.actuallyadog.letsmodreboot;

import com.actuallyadog.letsmodreboot.proxy.IProxy;
import com.actuallyadog.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by John on 10/1/2014.
 */
@Mod(modid=Reference.MOD_ID, name=Reference.NAME, version=Reference.VERSION)
public class LetsModReboot {

    @Mod.Instance("LetsModReboot")
    public static LetsModReboot instance;

    @SidedProxy(clientSide = "com.actuallyadog.letsmodreboot.proxy.ClientProxy", serverSide = "com.actuallyadog.letsmodreboot.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
