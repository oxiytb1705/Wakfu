
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wakfu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.wakfu.item.Wakfu_mineraiIngotItem;
import net.mcreator.wakfu.item.SwordOfTimeItem;
import net.mcreator.wakfu.item.StasisItem;
import net.mcreator.wakfu.item.Shushu_oreIngotItem;
import net.mcreator.wakfu.item.RubilaxForm2Item;
import net.mcreator.wakfu.item.RubilaxForm1Item;
import net.mcreator.wakfu.item.PlumedetofuItem;
import net.mcreator.wakfu.item.PelleruelItem;
import net.mcreator.wakfu.item.KamasItem;
import net.mcreator.wakfu.item.ItemEliacubeItem;
import net.mcreator.wakfu.item.HavreileItem;
import net.mcreator.wakfu.item.EpeedewakfuItem;
import net.mcreator.wakfu.item.EpeedeStasisItem;
import net.mcreator.wakfu.item.EpeeGoultardItem;
import net.mcreator.wakfu.item.EliasphereItem;
import net.mcreator.wakfu.item.DofusturquoiseItem;
import net.mcreator.wakfu.item.DofusocreItem;
import net.mcreator.wakfu.item.DofusemeraudeItem;
import net.mcreator.wakfu.item.DofusPourpreItem;
import net.mcreator.wakfu.item.DofusIvoireItem;
import net.mcreator.wakfu.item.DofusEbeneItem;
import net.mcreator.wakfu.item.DimensionhavresacItem;
import net.mcreator.wakfu.item.ChoisireraceItem;
import net.mcreator.wakfu.item.ChangerletempsitemItem;
import net.mcreator.wakfu.item.BrasRubilaxItem;
import net.mcreator.wakfu.item.BransdewakfuItem;
import net.mcreator.wakfu.item.BouclierdeWakfuItem;
import net.mcreator.wakfu.item.BackPackItem;
import net.mcreator.wakfu.item.ArmureShushuItem;
import net.mcreator.wakfu.WakfuMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WakfuModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WakfuMod.MODID);
	public static final RegistryObject<Item> ELIACUBE = block(WakfuModBlocks.ELIACUBE);
	public static final RegistryObject<Item> HAVRESAC = block(WakfuModBlocks.HAVRESAC);
	public static final RegistryObject<Item> DIMENSIONHAVRESAC = REGISTRY.register("dimensionhavresac", () -> new DimensionhavresacItem());
	public static final RegistryObject<Item> BACK_PACK = REGISTRY.register("back_pack", () -> new BackPackItem());
	public static final RegistryObject<Item> CASQUE_NOX = block(WakfuModBlocks.CASQUE_NOX);
	public static final RegistryObject<Item> PLUMEDETOFU = REGISTRY.register("plumedetofu", () -> new PlumedetofuItem());
	public static final RegistryObject<Item> TOFU_SPAWN_EGG = REGISTRY.register("tofu_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.TOFU, -103, -256, new Item.Properties()));
	public static final RegistryObject<Item> PELLERUEL = REGISTRY.register("pelleruel", () -> new PelleruelItem());
	public static final RegistryObject<Item> DOFUSEMERAUDE = REGISTRY.register("dofusemeraude", () -> new DofusemeraudeItem());
	public static final RegistryObject<Item> DOFUSOCRE = REGISTRY.register("dofusocre", () -> new DofusocreItem());
	public static final RegistryObject<Item> DOFUSTURQUOISE = REGISTRY.register("dofusturquoise", () -> new DofusturquoiseItem());
	public static final RegistryObject<Item> DOFUS_POURPRE = REGISTRY.register("dofus_pourpre", () -> new DofusPourpreItem());
	public static final RegistryObject<Item> DOFUS_IVOIRE = REGISTRY.register("dofus_ivoire", () -> new DofusIvoireItem());
	public static final RegistryObject<Item> DOFUS_EBENE = REGISTRY.register("dofus_ebene", () -> new DofusEbeneItem());
	public static final RegistryObject<Item> WAKFU_MINERAI_INGOT = REGISTRY.register("wakfu_minerai_ingot", () -> new Wakfu_mineraiIngotItem());
	public static final RegistryObject<Item> WAKFU_MINERAI_ORE = block(WakfuModBlocks.WAKFU_MINERAI_ORE);
	public static final RegistryObject<Item> WAKFU_MINERAI_BLOCK = block(WakfuModBlocks.WAKFU_MINERAI_BLOCK);
	public static final RegistryObject<Item> NOX_SPAWN_EGG = REGISTRY.register("nox_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.NOX, -10066330, -16764109, new Item.Properties()));
	public static final RegistryObject<Item> BOUCLIERDE_WAKFU = REGISTRY.register("bouclierde_wakfu", () -> new BouclierdeWakfuItem());
	public static final RegistryObject<Item> EPEEDEWAKFU = REGISTRY.register("epeedewakfu", () -> new EpeedewakfuItem());
	public static final RegistryObject<Item> RUBILAX_FORM_1 = REGISTRY.register("rubilax_form_1", () -> new RubilaxForm1Item());
	public static final RegistryObject<Item> RUBILAX_FORM_2 = REGISTRY.register("rubilax_form_2", () -> new RubilaxForm2Item());
	public static final RegistryObject<Item> CHOISIRERACE = REGISTRY.register("choisirerace", () -> new ChoisireraceItem());
	public static final RegistryObject<Item> BRANSDEWAKFU = REGISTRY.register("bransdewakfu", () -> new BransdewakfuItem());
	public static final RegistryObject<Item> TRISTEPIN_DE_PERCEDAL_SPAWN_EGG = REGISTRY.register("tristepin_de_percedal_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.TRISTEPIN_DE_PERCEDAL, -10092544, -39424, new Item.Properties()));
	public static final RegistryObject<Item> QILBY_ELIACUBE_SPAWN_EGG = REGISTRY.register("qilby_eliacube_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.QILBY_ELIACUBE, -16751002, -10027009, new Item.Properties()));
	public static final RegistryObject<Item> ITEM_ELIACUBE = REGISTRY.register("item_eliacube", () -> new ItemEliacubeItem());
	public static final RegistryObject<Item> KAMAS = REGISTRY.register("kamas", () -> new KamasItem());
	public static final RegistryObject<Item> CHANGERLETEMPSITEM = REGISTRY.register("changerletempsitem", () -> new ChangerletempsitemItem());
	public static final RegistryObject<Item> BRAS_RUBILAX = REGISTRY.register("bras_rubilax", () -> new BrasRubilaxItem());
	public static final RegistryObject<Item> RUEL_SPAWN_EGG = REGISTRY.register("ruel_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.RUEL, -103, -205, new Item.Properties()));
	public static final RegistryObject<Item> EVANGELYNE_SPAWN_EGG = REGISTRY.register("evangelyne_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.EVANGELYNE, -3342388, -6684775, new Item.Properties()));
	public static final RegistryObject<Item> SHUSHU_PORTAL_BLOCK = block(WakfuModBlocks.SHUSHU_PORTAL_BLOCK);
	public static final RegistryObject<Item> SHUSHU_1_SPAWN_EGG = REGISTRY.register("shushu_1_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.SHUSHU_1, -16777216, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> RUBILAXLIBRE_SPAWN_EGG = REGISTRY.register("rubilaxlibre_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.RUBILAXLIBRE, -14147809, -11403264, new Item.Properties()));
	public static final RegistryObject<Item> ARMURE_SHUSHU_HELMET = REGISTRY.register("armure_shushu_helmet", () -> new ArmureShushuItem.Helmet());
	public static final RegistryObject<Item> ARMURE_SHUSHU_CHESTPLATE = REGISTRY.register("armure_shushu_chestplate", () -> new ArmureShushuItem.Chestplate());
	public static final RegistryObject<Item> SHUSHU_ORE_INGOT = REGISTRY.register("shushu_ore_ingot", () -> new Shushu_oreIngotItem());
	public static final RegistryObject<Item> SHUSHU_ORE_ORE = block(WakfuModBlocks.SHUSHU_ORE_ORE);
	public static final RegistryObject<Item> SHUSHU_ORE_BLOCK = block(WakfuModBlocks.SHUSHU_ORE_BLOCK);
	public static final RegistryObject<Item> ROISHUSHUR_SPAWN_EGG = REGISTRY.register("roishushur_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.ROISHUSHUR, -16777216, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> SPAWNROISHUSHU = block(WakfuModBlocks.SPAWNROISHUSHU);
	public static final RegistryObject<Item> GOULTARD_SPAWN_EGG = REGISTRY.register("goultard_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.GOULTARD, -26317, -3381760, new Item.Properties()));
	public static final RegistryObject<Item> EPEE_GOULTARD = REGISTRY.register("epee_goultard", () -> new EpeeGoultardItem());
	public static final RegistryObject<Item> SHUSHU_2_SPAWN_EGG = REGISTRY.register("shushu_2_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.SHUSHU_2, -13434829, -13434880, new Item.Properties()));
	public static final RegistryObject<Item> YUGO_SPAWN_EGG = REGISTRY.register("yugo_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.YUGO, -6684673, -16737793, new Item.Properties()));
	public static final RegistryObject<Item> AMALIA_SPAWN_EGG = REGISTRY.register("amalia_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.AMALIA, -13382656, -16751104, new Item.Properties()));
	public static final RegistryObject<Item> JORIS_SPAWN_EGG = REGISTRY.register("joris_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.JORIS, -16777114, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> HAVREILE = REGISTRY.register("havreile", () -> new HavreileItem());
	public static final RegistryObject<Item> HAVREILEBLOCK = block(WakfuModBlocks.HAVREILEBLOCK);
	public static final RegistryObject<Item> STASIS = REGISTRY.register("stasis", () -> new StasisItem());
	public static final RegistryObject<Item> STASIS_ORE = block(WakfuModBlocks.STASIS_ORE);
	public static final RegistryObject<Item> STASIS_BLOCK = block(WakfuModBlocks.STASIS_BLOCK);
	public static final RegistryObject<Item> EPEEDE_STASIS = REGISTRY.register("epeede_stasis", () -> new EpeedeStasisItem());
	public static final RegistryObject<Item> LOKUS_SPAWN_EGG = REGISTRY.register("lokus_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.LOKUS, -15060125, -12148549, new Item.Properties()));
	public static final RegistryObject<Item> ELIASPHERE = REGISTRY.register("eliasphere", () -> new EliasphereItem());
	public static final RegistryObject<Item> BOUFTOU_SPAWN_EGG = REGISTRY.register("bouftou_spawn_egg", () -> new ForgeSpawnEggItem(WakfuModEntities.BOUFTOU, -1, -16751002, new Item.Properties()));
	public static final RegistryObject<Item> SWORD_OF_TIME = REGISTRY.register("sword_of_time", () -> new SwordOfTimeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(BOUCLIERDE_WAKFU.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
