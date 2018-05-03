package com.glp.howtomagicmod.blocks;

import com.glp.howtomagicmod.Main;
import com.glp.howtomagicmod.init.HtmmBlocks;
import com.glp.howtomagicmod.init.HtmmItems;
import com.glp.howtomagicmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class HtmmBlockBase extends Block implements IHasModel
{
	public HtmmBlockBase(String name, Material material)
	{
		super(material);
		  setUnlocalizedName(name);
		    setRegistryName(name);
		      setCreativeTab(Main.htmmblockstab);
		    
        HtmmBlocks.BLOCKS.add(this);
        HtmmItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
