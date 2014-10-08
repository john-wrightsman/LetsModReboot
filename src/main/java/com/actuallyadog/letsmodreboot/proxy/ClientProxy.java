package com.actuallyadog.letsmodreboot.proxy;

import com.actuallyadog.letsmodreboot.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by John on 10/1/2014.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
    }
}
