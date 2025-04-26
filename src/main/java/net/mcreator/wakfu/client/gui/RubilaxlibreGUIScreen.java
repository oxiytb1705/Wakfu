package net.mcreator.wakfu.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wakfu.world.inventory.RubilaxlibreGUIMenu;
import net.mcreator.wakfu.network.RubilaxlibreGUIButtonMessage;
import net.mcreator.wakfu.WakfuMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RubilaxlibreGUIScreen extends AbstractContainerScreen<RubilaxlibreGUIMenu> {
	private final static HashMap<String, Object> guistate = RubilaxlibreGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_released;
	Button button_empty;

	public RubilaxlibreGUIScreen(RubilaxlibreGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("wakfu:textures/screens/rubilaxlibre_gui.png");

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

		guiGraphics.blit(new ResourceLocation("wakfu:textures/screens/rubila_libre.png"), this.leftPos + 97, this.topPos + -6, 0, 0, 159, 205, 159, 205);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilaxlibre_gui.label_released_rubilax"), 37, 4, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		button_released = Button.builder(Component.translatable("gui.wakfu.rubilaxlibre_gui.button_released"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new RubilaxlibreGUIButtonMessage(0, x, y, z));
				RubilaxlibreGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 20, this.topPos + 77, 67, 20).build();
		guistate.put("button:button_released", button_released);
		this.addRenderableWidget(button_released);
		button_empty = Button.builder(Component.translatable("gui.wakfu.rubilaxlibre_gui.button_empty"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new RubilaxlibreGUIButtonMessage(1, x, y, z));
				RubilaxlibreGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -29, this.topPos + 70, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
