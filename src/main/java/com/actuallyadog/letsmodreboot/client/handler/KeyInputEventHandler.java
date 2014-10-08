package com.actuallyadog.letsmodreboot.client.handler;

import com.actuallyadog.letsmodreboot.client.settings.KeyBindings;
import com.actuallyadog.letsmodreboot.reference.Key;
import com.actuallyadog.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Created by John on 10/7/2014.
 */
public class KeyInputEventHandler {
    private static Key getPressedKeyBinding(){
        if (KeyBindings.charge.isPressed()) {
            return Key.CHARGE;
        }
        else if (KeyBindings.release.isPressed()) {
            return Key.RELEASE;
        }
        else {
            return Key.UNKNOWN;
        }
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        LogHelper.info(getPressedKeyBinding());
    }
}
