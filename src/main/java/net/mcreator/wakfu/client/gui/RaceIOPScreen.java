package net.mcreator.wakfu.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wakfu.world.inventory.RaceIOPMenu;
import net.mcreator.wakfu.network.RaceIOPButtonMessage;
import net.mcreator.wakfu.WakfuMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RaceIOPScreen extends AbstractContainerScreen<RaceIOPMenu> {
	private final static HashMap<String, Object> guistate = RaceIOPMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_choose;
	Button button_empty;
	Button button_empty1;

	public RaceIOPScreen(RaceIOPMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 129;
		this.imageHeight = 111;
	}

	private static final ResourceLocation texture = new ResourceLocation("wakfu:textures/screens/race_iop.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.race_iop.label_iop"), 55, 6, -10092544, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.race_iop.label_bonus"), 10, 33, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.race_iop.label_strength_3"), 10, 60, -6750208, false);
	}

	@Override
	public void init() {
		super.init();
		button_choose = Button.builder(Component.translatable("gui.wakfu.race_iop.button_choose"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new RaceIOPButtonMessage(0, x, y, z));
				RaceIOPButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_choose", button_choose);
		this.addRenderableWidget(button_choose);
		button_empty = Button.builder(Component.translatable("gui.wakfu.race_iop.button_empty"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new RaceIOPButtonMessage(1, x, y, z));
				RaceIOPButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -35, this.topPos + 42, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.wakfu.race_iop.button_empty1"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new RaceIOPButtonMessage(2, x, y, z));
				RaceIOPButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 136, this.topPos + 42, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
