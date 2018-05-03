package com.glp.howtomagicmod.blocks;

import com.glp.howtomagicmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SarlagaStone extends HtmmBlockBase
	{

	public SarlagaStone(String name, Material material) 
	{
		super(name, material);
		  setSoundType(SoundType.STONE);
		    setHardness(1.3F);
	          setResistance(30.0F);
	            setHarvestLevel("pickaxe", 2);
	              setLightLevel(3.0F);
	                //setLightOpacity()   Indicates how much light can pass through blocks. ONLY USE FOR WINDOWS
	                  setCreativeTab(Main.htmmblockstab);
	}
		
}
