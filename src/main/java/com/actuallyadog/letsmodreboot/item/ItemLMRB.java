package com.actuallyadog.letsmodreboot.item;

import com.actuallyadog.letsmodreboot.creativetab.CreativeTabLMRB;
import com.actuallyadog.letsmodreboot.reference.Reference;
import com.actuallyadog.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by John on 10/6/2014.
 */
public class ItemLMRB extends Item {
    public ItemLMRB() {
        super();
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }

    @Override
    public String getUnlocalizedName() {
        LogHelper.info(">>>>>>> 1 GETUNLOCALIZEDNAME:" + String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedLocalizedName(super.getUnlocalizedName())));
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedLocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        LogHelper.info(">>>>>>> 2 GETUNLOCALIZEDNAME:" + String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedLocalizedName(super.getUnlocalizedName())));
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedLocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        LogHelper.info(">>>>>>> 3 REGISTERICONS:" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    public String getUnwrappedLocalizedName(String unLocalizedName) {
        LogHelper.info(">>>>>>> 4 GETUNWRAPPEDLOCALIZEDNAME:" + unLocalizedName.substring(unLocalizedName.indexOf(".") + 1));
        return unLocalizedName.substring(unLocalizedName.indexOf(".") + 1);
    }
}
