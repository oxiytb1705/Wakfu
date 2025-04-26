
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wakfu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.wakfu.entity.YugoEntity;
import net.mcreator.wakfu.entity.TristepinDePercedalEntity;
import net.mcreator.wakfu.entity.TofuEntity;
import net.mcreator.wakfu.entity.Shushu2Entity;
import net.mcreator.wakfu.entity.Shushu1Entity;
import net.mcreator.wakfu.entity.RuelEntity;
import net.mcreator.wakfu.entity.RubilaxlibreEntity;
import net.mcreator.wakfu.entity.RoishushurEntity;
import net.mcreator.wakfu.entity.QilbyEliacubeEntity;
import net.mcreator.wakfu.entity.NoxEntity;
import net.mcreator.wakfu.entity.LokusEntity;
import net.mcreator.wakfu.entity.JorisEntity;
import net.mcreator.wakfu.entity.GoultardEntity;
import net.mcreator.wakfu.entity.EvangelyneEntityProjectile;
import net.mcreator.wakfu.entity.EvangelyneEntity;
import net.mcreator.wakfu.entity.AmaliaEntity;
import net.mcreator.wakfu.WakfuMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WakfuModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WakfuMod.MODID);
	public static final RegistryObject<EntityType<TofuEntity>> TOFU = register("tofu",
			EntityType.Builder.<TofuEntity>of(TofuEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TofuEntity::new)

					.sized(0.6f, 0.35f));
	public static final RegistryObject<EntityType<NoxEntity>> NOX = register("nox",
			EntityType.Builder.<NoxEntity>of(NoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NoxEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TristepinDePercedalEntity>> TRISTEPIN_DE_PERCEDAL = register("tristepin_de_percedal",
			EntityType.Builder.<TristepinDePercedalEntity>of(TristepinDePercedalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TristepinDePercedalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<QilbyEliacubeEntity>> QILBY_ELIACUBE = register("qilby_eliacube", EntityType.Builder.<QilbyEliacubeEntity>of(QilbyEliacubeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QilbyEliacubeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RuelEntity>> RUEL = register("ruel",
			EntityType.Builder.<RuelEntity>of(RuelEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RuelEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EvangelyneEntity>> EVANGELYNE = register("evangelyne",
			EntityType.Builder.<EvangelyneEntity>of(EvangelyneEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvangelyneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EvangelyneEntityProjectile>> EVANGELYNE_PROJECTILE = register("projectile_evangelyne", EntityType.Builder.<EvangelyneEntityProjectile>of(EvangelyneEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(EvangelyneEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Shushu1Entity>> SHUSHU_1 = register("shushu_1",
			EntityType.Builder.<Shushu1Entity>of(Shushu1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Shushu1Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<RubilaxlibreEntity>> RUBILAXLIBRE = register("rubilaxlibre",
			EntityType.Builder.<RubilaxlibreEntity>of(RubilaxlibreEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RubilaxlibreEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoishushurEntity>> ROISHUSHUR = register("roishushur",
			EntityType.Builder.<RoishushurEntity>of(RoishushurEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoishushurEntity::new).fireImmune().sized(3f, 3f));
	public static final RegistryObject<EntityType<GoultardEntity>> GOULTARD = register("goultard",
			EntityType.Builder.<GoultardEntity>of(GoultardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoultardEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Shushu2Entity>> SHUSHU_2 = register("shushu_2",
			EntityType.Builder.<Shushu2Entity>of(Shushu2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Shushu2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YugoEntity>> YUGO = register("yugo",
			EntityType.Builder.<YugoEntity>of(YugoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YugoEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AmaliaEntity>> AMALIA = register("amalia",
			EntityType.Builder.<AmaliaEntity>of(AmaliaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AmaliaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JorisEntity>> JORIS = register("joris",
			EntityType.Builder.<JorisEntity>of(JorisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JorisEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LokusEntity>> LOKUS = register("lokus",
			EntityType.Builder.<LokusEntity>of(LokusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LokusEntity::new).fireImmune().sized(1f, 2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TofuEntity.init();
			NoxEntity.init();
			TristepinDePercedalEntity.init();
			QilbyEliacubeEntity.init();
			RuelEntity.init();
			EvangelyneEntity.init();
			Shushu1Entity.init();
			RubilaxlibreEntity.init();
			RoishushurEntity.init();
			GoultardEntity.init();
			Shushu2Entity.init();
			YugoEntity.init();
			AmaliaEntity.init();
			JorisEntity.init();
			LokusEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TOFU.get(), TofuEntity.createAttributes().build());
		event.put(NOX.get(), NoxEntity.createAttributes().build());
		event.put(TRISTEPIN_DE_PERCEDAL.get(), TristepinDePercedalEntity.createAttributes().build());
		event.put(QILBY_ELIACUBE.get(), QilbyEliacubeEntity.createAttributes().build());
		event.put(RUEL.get(), RuelEntity.createAttributes().build());
		event.put(EVANGELYNE.get(), EvangelyneEntity.createAttributes().build());
		event.put(SHUSHU_1.get(), Shushu1Entity.createAttributes().build());
		event.put(RUBILAXLIBRE.get(), RubilaxlibreEntity.createAttributes().build());
		event.put(ROISHUSHUR.get(), RoishushurEntity.createAttributes().build());
		event.put(GOULTARD.get(), GoultardEntity.createAttributes().build());
		event.put(SHUSHU_2.get(), Shushu2Entity.createAttributes().build());
		event.put(YUGO.get(), YugoEntity.createAttributes().build());
		event.put(AMALIA.get(), AmaliaEntity.createAttributes().build());
		event.put(JORIS.get(), JorisEntity.createAttributes().build());
		event.put(LOKUS.get(), LokusEntity.createAttributes().build());
	}
}
