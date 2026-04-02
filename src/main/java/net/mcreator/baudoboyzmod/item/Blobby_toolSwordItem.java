package net.mcreator.baudoboyzmod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class Blobby_toolSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 441, 8f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("baudo_boyz_mod:blobby_tool_sword_repair_items")));

	public Blobby_toolSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 8f, -2f));
	}
}