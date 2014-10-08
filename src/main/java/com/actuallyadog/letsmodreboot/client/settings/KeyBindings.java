package com.actuallyadog.letsmodreboot.client.settings;

import com.actuallyadog.letsmodreboot.reference.Key;
import com.actuallyadog.letsmodreboot.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;


/**
 * Created by John on 10/7/2014.
 */
public class KeyBindings {
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY);
}
