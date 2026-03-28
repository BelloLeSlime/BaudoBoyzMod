package net.mcreator.baudoboyzmod.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BlobbyniteItem extends Item {
	public BlobbyniteItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}