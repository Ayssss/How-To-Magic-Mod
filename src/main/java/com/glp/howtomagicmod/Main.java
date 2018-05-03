package com.glp.howtomagicmod;

import com.glp.howtomagicmod.proxy.CommonProxy;
import com.glp.howtomagicmod.tabs.HtmmBlocksTab;
import com.glp.howtomagicmod.tabs.HtmmCombatTab;
import com.glp.howtomagicmod.tabs.HtmmMaterialsTab;
import com.glp.howtomagicmod.tabs.HtmmToolsTab;
import com.glp.howtomagicmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)//basically shows what everything means using the Refrence class
public class Main 
{
	public static final CreativeTabs htmmmaterialstab = new HtmmMaterialsTab("htmmmaterialstab"); 
	
	public static final CreativeTabs htmmblockstab = new HtmmBlocksTab("htmmblockstab"); 
	
	public static final CreativeTabs htmmcombattab = new HtmmCombatTab("htmmcombattab"); 

	public static final CreativeTabs htmmtoolstab = new HtmmToolsTab("htmmtoolstab"); 

  @Instance
    public static Main instance;
  
  @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
  
  @EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
      {
	  
      }
  
  @EventHandler
    public static void init(FMLInitializationEvent event)
      {
	  
      }
  
  @EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
      {
	  
      }
}
