package com.actuallyadog.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by John on 10/7/2014.
 */
public class Recipes {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
    }
}
