package com.actuallyadog.letsmodreboot.init;

import com.actuallyadog.letsmodreboot.item.ItemLMRB;
import com.actuallyadog.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by John on 10/6/2014.
 */
public class ModItems {
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
