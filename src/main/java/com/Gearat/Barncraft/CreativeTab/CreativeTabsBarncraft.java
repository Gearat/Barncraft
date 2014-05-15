package com.Gearat.Barncraft.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabsBarncraft extends CreativeTabs{

	public CreativeTabsBarncraft(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(Blocks.brick_block);
	}

}
