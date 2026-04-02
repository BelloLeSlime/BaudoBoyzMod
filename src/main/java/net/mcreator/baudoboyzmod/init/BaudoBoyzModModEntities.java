/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baudoboyzmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.baudoboyzmod.entity.LarryEntity;
import net.mcreator.baudoboyzmod.entity.ClemEntity;
import net.mcreator.baudoboyzmod.entity.BoomboneprojectileEntity;
import net.mcreator.baudoboyzmod.entity.BlobbyEntity;
import net.mcreator.baudoboyzmod.entity.BelloBotEntity;
import net.mcreator.baudoboyzmod.BaudoBoyzModMod;

@EventBusSubscriber
public class BaudoBoyzModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, BaudoBoyzModMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<BlobbyEntity>> BLOBBY = register("blobby",
			EntityType.Builder.<BlobbyEntity>of(BlobbyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LarryEntity>> LARRY = register("larry",
			EntityType.Builder.<LarryEntity>of(LarryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BelloBotEntity>> BELLO_BOT = register("bello_bot",
			EntityType.Builder.<BelloBotEntity>of(BelloBotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoomboneprojectileEntity>> BOOMBONEPROJECTILE = register("boomboneprojectile",
			EntityType.Builder.<BoomboneprojectileEntity>of(BoomboneprojectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ClemEntity>> CLEM = register("clem",
			EntityType.Builder.<ClemEntity>of(ClemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(BaudoBoyzModMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		BlobbyEntity.init(event);
		LarryEntity.init(event);
		BelloBotEntity.init(event);
		ClemEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLOBBY.get(), BlobbyEntity.createAttributes().build());
		event.put(LARRY.get(), LarryEntity.createAttributes().build());
		event.put(BELLO_BOT.get(), BelloBotEntity.createAttributes().build());
		event.put(CLEM.get(), ClemEntity.createAttributes().build());
	}
}