
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wakfu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.wakfu.WakfuMod;

public class WakfuModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WakfuMod.MODID);
	public static final RegistryObject<CreativeModeTab> WAKFU_EGG = REGISTRY.register("wakfu_egg",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.wakfu.wakfu_egg")).icon(() -> new ItemStack(WakfuModItems.RUEL_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WakfuModItems.TOFU_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.NOX_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.TRISTEPIN_DE_PERCEDAL_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.QILBY_ELIACUBE_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.RUEL_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.EVANGELYNE_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.SHUSHU_1_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.RUBILAXLIBRE_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.ROISHUSHUR_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.GOULTARD_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.SHUSHU_2_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.YUGO_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.AMALIA_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.JORIS_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.LOKUS_SPAWN_EGG.get());
				tabData.accept(WakfuModItems.BOUFTOU_SPAWN_EGG.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> WAKFU = REGISTRY.register("wakfu",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.wakfu.wakfu")).icon(() -> new ItemStack(WakfuModBlocks.ELIACUBE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WakfuModItems.BACK_PACK.get());
				tabData.accept(WakfuModBlocks.CASQUE_NOX.get().asItem());
				tabData.accept(WakfuModItems.PLUMEDETOFU.get());
				tabData.accept(WakfuModItems.PELLERUEL.get());
				tabData.accept(WakfuModItems.DOFUSEMERAUDE.get());
				tabData.accept(WakfuModItems.DOFUSOCRE.get());
				tabData.accept(WakfuModItems.DOFUSTURQUOISE.get());
				tabData.accept(WakfuModItems.DOFUS_POURPRE.get());
				tabData.accept(WakfuModItems.DOFUS_IVOIRE.get());
				tabData.accept(WakfuModItems.DOFUS_EBENE.get());
				tabData.accept(WakfuModItems.WAKFU_MINERAI_INGOT.get());
				tabData.accept(WakfuModBlocks.WAKFU_MINERAI_ORE.get().asItem());
				tabData.accept(WakfuModBlocks.WAKFU_MINERAI_BLOCK.get().asItem());
				tabData.accept(WakfuModItems.BOUCLIERDE_WAKFU.get());
				tabData.accept(WakfuModItems.EPEEDEWAKFU.get());
				tabData.accept(WakfuModItems.RUBILAX_FORM_1.get());
				tabData.accept(WakfuModItems.ITEM_ELIACUBE.get());
				tabData.accept(WakfuModItems.KAMAS.get());
				tabData.accept(WakfuModItems.ARMURE_SHUSHU_HELMET.get());
				tabData.accept(WakfuModItems.ARMURE_SHUSHU_CHESTPLATE.get());
				tabData.accept(WakfuModItems.SHUSHU_ORE_INGOT.get());
				tabData.accept(WakfuModBlocks.SHUSHU_ORE_ORE.get().asItem());
				tabData.accept(WakfuModBlocks.SHUSHU_ORE_BLOCK.get().asItem());
				tabData.accept(WakfuModBlocks.SPAWNROISHUSHU.get().asItem());
				tabData.accept(WakfuModItems.EPEE_GOULTARD.get());
				tabData.accept(WakfuModBlocks.HAVREILEBLOCK.get().asItem());
				tabData.accept(WakfuModItems.STASIS.get());
				tabData.accept(WakfuModBlocks.STASIS_ORE.get().asItem());
				tabData.accept(WakfuModBlocks.STASIS_BLOCK.get().asItem());
				tabData.accept(WakfuModItems.EPEEDE_STASIS.get());
				tabData.accept(WakfuModItems.ELIASPHERE.get());
				tabData.accept(WakfuModItems.SWORD_OF_TIME.get());
			})

					.build());
}
