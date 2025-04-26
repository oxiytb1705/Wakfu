package net.mcreator.wakfu.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wakfu.world.inventory.RubilaxMenu;
import net.mcreator.wakfu.network.RubilaxButtonMessage;
import net.mcreator.wakfu.WakfuMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RubilaxScreen extends AbstractContainerScreen<RubilaxMenu> {
	private final static HashMap<String, Object> guistate = RubilaxMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_choose;

	public RubilaxScreen(RubilaxMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("wakfu:textures/screens/rubilax.png");

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

		guiGraphics.blit(new ResourceLocation("wakfu:textures/screens/rubilaxform1.png"), this.leftPos + 3, this.topPos + 1, 0, 0, 66, 155, 66, 155);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax.label_rubilax_form_1"), 87, 10, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax.label_damage"), 80, 51, -10092544, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax.label_20"), 79, 65, -65485, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax.label_cooldown"), 80, 105, -16751002, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax.label_05"), 79, 122, -16737895, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.wakfu.rubilax.button_empty"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new RubilaxButtonMessage(0, x, y, z));
				RubilaxButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 175, this.topPos + 67, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_choose = Button.builder(Component.translatable("gui.wakfu.rubilax.button_choose"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new RubilaxButtonMessage(1, x, y, z));
				RubilaxButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 142, 56, 20).build();
		guistate.put("button:button_choose", button_choose);
		this.addRenderableWidget(button_choose);
	}
}
