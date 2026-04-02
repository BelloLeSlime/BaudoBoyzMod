package net.mcreator.baudoboyzmod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.baudoboyzmod.procedures.ClemswordLivingEntityIsHitWithToolProcedure;

public class ClemswordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 300, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("baudo_boyz_mod:clemsword_repair_items")));

	public ClemswordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 5f, -2f));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		ClemswordLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}
}