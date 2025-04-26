
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wakfu.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.wakfu.client.gui.RubilaxlibreGUIScreen;
import net.mcreator.wakfu.client.gui.RubilaxScreen;
import net.mcreator.wakfu.client.gui.Rubilax3Screen;
import net.mcreator.wakfu.client.gui.Rubilax2Screen;
import net.mcreator.wakfu.client.gui.RacedragonScreen;
import net.mcreator.wakfu.client.gui.RaceXelorScreen;
import net.mcreator.wakfu.client.gui.RaceIOPScreen;
import net.mcreator.wakfu.client.gui.HavresacGUIScreen;
import net.mcreator.wakfu.client.gui.GuiEliacubeScreen;
import net.mcreator.wakfu.client.gui.ChoisireeliotropeScreen;
import net.mcreator.wakfu.client.gui.ChangerLeTempsScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WakfuModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(WakfuModMenus.HAVRESAC_GUI.get(), HavresacGUIScreen::new);
			MenuScreens.register(WakfuModMenus.RUBILAX.get(), RubilaxScreen::new);
			MenuScreens.register(WakfuModMenus.RUBILAX_2.get(), Rubilax2Screen::new);
			MenuScreens.register(WakfuModMenus.CHOISIREELIOTROPE.get(), ChoisireeliotropeScreen::new);
			MenuScreens.register(WakfuModMenus.RACEDRAGON.get(), RacedragonScreen::new);
			MenuScreens.register(WakfuModMenus.RACE_IOP.get(), RaceIOPScreen::new);
			MenuScreens.register(WakfuModMenus.GUI_ELIACUBE.get(), GuiEliacubeScreen::new);
			MenuScreens.register(WakfuModMenus.CHANGER_LE_TEMPS.get(), ChangerLeTempsScreen::new);
			MenuScreens.register(WakfuModMenus.RACE_XELOR.get(), RaceXelorScreen::new);
			MenuScreens.register(WakfuModMenus.RUBILAX_3.get(), Rubilax3Screen::new);
			MenuScreens.register(WakfuModMenus.RUBILAXLIBRE_GUI.get(), RubilaxlibreGUIScreen::new);
		});
	}
}
