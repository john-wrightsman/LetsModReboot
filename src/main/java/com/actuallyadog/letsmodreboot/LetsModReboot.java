package com.actuallyadog.letsmodreboot;

import com.actuallyadog.letsmodreboot.client.handler.KeyInputEventHandler;
import com.actuallyadog.letsmodreboot.handler.ConfigurationHandler;
import com.actuallyadog.letsmodreboot.init.ModBlocks;
import com.actuallyadog.letsmodreboot.init.ModItems;
import com.actuallyadog.letsmodreboot.init.Recipes;
import com.actuallyadog.letsmodreboot.proxy.IProxy;
import com.actuallyadog.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by John on 10/1/2014.
 */
@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Mod.Instance("LetsModReboot")
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        proxy.registerKeyBindings();
        ModItems.init();
        ModBlocks.init();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
