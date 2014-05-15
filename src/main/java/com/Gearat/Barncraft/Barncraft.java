package com.Gearat.Barncraft;

import com.Gearat.Barncraft.CreativeTab.CreativeTabsBarncraft;
import com.Gearat.Barncraft.Item.ItemTamingStick;
import com.Gearat.Barncraft.TileEntity.CoopTileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;




@Mod(modid = Barncraft.MODID, version = Barncraft.VERSION)
public class Barncraft {
	public static final String MODID = "Barncraft";
    public static final String VERSION = "0.0.1";
    public static CreativeTabs tabBarncraft = new CreativeTabsBarncraft("Barncraft");
    public static CoopTileEntity Coop;
    public static Item TamingStick;
    
    @Instance(value = "BarncraftID")
    public static Barncraft instance;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	System.out.println("Barncraft lives!");
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
  //  BlockCoop = new BlockCoop(Material.wood);
    TamingStick = new ItemTamingStick().setUnlocalizedName("TamingStick").setTextureName("TamingStick");
    	
    GameRegistry.registerItem(TamingStick, "TamingStick");
    GameRegistry.registerTileEntity(CoopTileEntity.class, "ChickenCoopTileEntity");
    }
}
