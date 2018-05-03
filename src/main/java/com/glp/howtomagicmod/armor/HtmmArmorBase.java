package com.glp.howtomagicmod.armor;

import com.glp.howtomagicmod.init.HtmmItems;
import com.glp.howtomagicmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class HtmmArmorBase extends ItemArmor implements IHasModel
	{

	public HtmmArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		  setUnlocalizedName(name);
		    setRegistryName(name);
		      setCreativeTab(CreativeTabs.COMBAT);
		    
		    
		 HtmmItems.ITEMS.add(this); 
  }

	@Override
	public void registerModels() {
		
	}		
}	
