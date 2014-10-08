package com.actuallyadog.letsmodreboot.init;

import com.actuallyadog.letsmodreboot.block.BlockFlag;
import com.actuallyadog.letsmodreboot.block.BlockLMRB;
import com.actuallyadog.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMRB flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock(flag, "flag");
    }
}
