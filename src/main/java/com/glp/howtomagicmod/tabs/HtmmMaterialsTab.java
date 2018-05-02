package com.glp.howtomagicmod.tabs;

import com.glp.howtomagicmod.init.HtmmBlocks;
import com.glp.howtomagicmod.init.HtmmItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HtmmMaterialsTab extends CreativeTabs
{
	public HtmmMaterialsTab(String label) { 
	  super("htmmmaterialstab");
	    this.setBackgroundImageName("htmm.png"); }
	      public ItemStack getTabIconItem() {
		    return new ItemStack(HtmmItems.POLISHED_TOPAZ);
 }
}

