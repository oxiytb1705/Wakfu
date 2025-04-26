package net.mcreator.wakfu.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wakfu.world.inventory.ChangerLeTempsMenu;
import net.mcreator.wakfu.network.ChangerLeTempsButtonMessage;
import net.mcreator.wakfu.WakfuMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ChangerLeTempsScreen extends AbstractContainerScreen<ChangerLeTempsMenu> {
	private final static HashMap<String, Object> guistate = ChangerLeTempsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_sun;
	Button button_moon;

	public ChangerLeTempsScreen(ChangerLeTempsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 140;
		this.imageHeight = 117;
	}

	private static final ResourceLocation texture = new ResourceLocation("wakfu:textures/screens/changer_le_temps.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_sun = Button.builder(Component.translatable("gui.wakfu.changer_le_temps.button_sun"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new ChangerLeTempsButtonMessage(0, x, y, z));
				ChangerLeTempsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 45, 40, 20).build();
		guistate.put("button:button_sun", button_sun);
		this.addRenderableWidget(button_sun);
		button_moon = Button.builder(Component.translatable("gui.wakfu.changer_le_temps.button_moon"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new ChangerLeTempsButtonMessage(1, x, y, z));
				ChangerLeTempsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 87, this.topPos + 45, 46, 20).build();
		guistate.put("button:button_moon", button_moon);
		this.addRenderableWidget(button_moon);
	}
}
