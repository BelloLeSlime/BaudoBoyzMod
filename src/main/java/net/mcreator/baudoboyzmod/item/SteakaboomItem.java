package net.mcreator.baudoboyzmod.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.core.component.DataComponents;

import net.mcreator.baudoboyzmod.init.BaudoBoyzModModItems;

@EventBusSubscriber
public class SteakaboomItem extends Item {
	public SteakaboomItem(Item.Properties properties) {
		super(properties.stacksTo(16).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.4f).build()));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(BaudoBoyzModModItems.STEAKABOOM.get(), builder -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStack(BaudoBoyzModModItems.BOOMBONE.get()))));
	}
}