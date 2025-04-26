
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wakfu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.wakfu.world.inventory.RubilaxlibreGUIMenu;
import net.mcreator.wakfu.world.inventory.RubilaxMenu;
import net.mcreator.wakfu.world.inventory.Rubilax3Menu;
import net.mcreator.wakfu.world.inventory.Rubilax2Menu;
import net.mcreator.wakfu.world.inventory.RacedragonMenu;
import net.mcreator.wakfu.world.inventory.RaceXelorMenu;
import net.mcreator.wakfu.world.inventory.RaceIOPMenu;
import net.mcreator.wakfu.world.inventory.HavresacGUIMenu;
import net.mcreator.wakfu.world.inventory.GuiEliacubeMenu;
import net.mcreator.wakfu.world.inventory.ChoisireeliotropeMenu;
import net.mcreator.wakfu.world.inventory.ChangerLeTempsMenu;
import net.mcreator.wakfu.WakfuMod;

public class WakfuModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WakfuMod.MODID);
	public static final RegistryObject<MenuType<HavresacGUIMenu>> HAVRESAC_GUI = REGISTRY.register("havresac_gui", () -> IForgeMenuType.create(HavresacGUIMenu::new));
	public static final RegistryObject<MenuType<RubilaxMenu>> RUBILAX = REGISTRY.register("rubilax", () -> IForgeMenuType.create(RubilaxMenu::new));
	public static final RegistryObject<MenuType<Rubilax2Menu>> RUBILAX_2 = REGISTRY.register("rubilax_2", () -> IForgeMenuType.create(Rubilax2Menu::new));
	public static final RegistryObject<MenuType<ChoisireeliotropeMenu>> CHOISIREELIOTROPE = REGISTRY.register("choisireeliotrope", () -> IForgeMenuType.create(ChoisireeliotropeMenu::new));
	public static final RegistryObject<MenuType<RacedragonMenu>> RACEDRAGON = REGISTRY.register("racedragon", () -> IForgeMenuType.create(RacedragonMenu::new));
	public static final RegistryObject<MenuType<RaceIOPMenu>> RACE_IOP = REGISTRY.register("race_iop", () -> IForgeMenuType.create(RaceIOPMenu::new));
	public static final RegistryObject<MenuType<GuiEliacubeMenu>> GUI_ELIACUBE = REGISTRY.register("gui_eliacube", () -> IForgeMenuType.create(GuiEliacubeMenu::new));
	public static final RegistryObject<MenuType<ChangerLeTempsMenu>> CHANGER_LE_TEMPS = REGISTRY.register("changer_le_temps", () -> IForgeMenuType.create(ChangerLeTempsMenu::new));
	public static final RegistryObject<MenuType<RaceXelorMenu>> RACE_XELOR = REGISTRY.register("race_xelor", () -> IForgeMenuType.create(RaceXelorMenu::new));
	public static final RegistryObject<MenuType<Rubilax3Menu>> RUBILAX_3 = REGISTRY.register("rubilax_3", () -> IForgeMenuType.create(Rubilax3Menu::new));
	public static final RegistryObject<MenuType<RubilaxlibreGUIMenu>> RUBILAXLIBRE_GUI = REGISTRY.register("rubilaxlibre_gui", () -> IForgeMenuType.create(RubilaxlibreGUIMenu::new));
}
