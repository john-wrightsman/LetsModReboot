package com.actuallyadog.letsmodreboot.creativetab;

import com.actuallyadog.letsmodreboot.init.ModItems;
import com.actuallyadog.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by John on 10/6/2014.
 */
public class CreativeTabLMRB {
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }


    };
}
