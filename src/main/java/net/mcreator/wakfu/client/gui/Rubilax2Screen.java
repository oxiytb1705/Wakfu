package net.mcreator.wakfu.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wakfu.world.inventory.Rubilax2Menu;
import net.mcreator.wakfu.network.Rubilax2ButtonMessage;
import net.mcreator.wakfu.WakfuMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Rubilax2Screen extends AbstractContainerScreen<Rubilax2Menu> {
	private final static HashMap<String, Object> guistate = Rubilax2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_choose;
	Button button_empty1;

	public Rubilax2Screen(Rubilax2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("wakfu:textures/screens/rubilax_2.png");

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

		guiGraphics.blit(new ResourceLocation("wakfu:textures/screens/rubilaxform2.png"), this.leftPos + -43, this.topPos + -66, 0, 0, 142, 288, 142, 288);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_2.label_rubilax_form_2"), 94, 3, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_2.label_damage"), 93, 40, -6750208, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_2.label_30"), 92, 58, -65485, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_2.label_cooldown"), 92, 88, -16751002, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_2.label_1"), 93, 108, -16724788, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.wakfu.rubilax_2.button_empty"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new Rubilax2ButtonMessage(0, x, y, z));
				Rubilax2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -28, this.topPos + 74, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_choose = Button.builder(Component.translatable("gui.wakfu.rubilax_2.button_choose"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new Rubilax2ButtonMessage(1, x, y, z));
				Rubilax2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 142, 56, 20).build();
		guistate.put("button:button_choose", button_choose);
		this.addRenderableWidget(button_choose);
		button_empty1 = Button.builder(Component.translatable("gui.wakfu.rubilax_2.button_empty1"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new Rubilax2ButtonMessage(2, x, y, z));
				Rubilax2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 176, this.topPos + 74, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
