package net.mcreator.wakfu.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wakfu.world.inventory.Rubilax3Menu;
import net.mcreator.wakfu.network.Rubilax3ButtonMessage;
import net.mcreator.wakfu.WakfuMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Rubilax3Screen extends AbstractContainerScreen<Rubilax3Menu> {
	private final static HashMap<String, Object> guistate = Rubilax3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_choose;
	Button button_empty;
	Button button_empty1;

	public Rubilax3Screen(Rubilax3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("wakfu:textures/screens/rubilax_3.png");

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

		guiGraphics.blit(new ResourceLocation("wakfu:textures/screens/bras_rubilax.png"), this.leftPos + 113, this.topPos + -27, 0, 0, 87, 209, 87, 209);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_3.label_rubilax_form_3"), 6, 6, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_3.label_damage"), 6, 51, -6750208, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_3.label_27"), 6, 66, -3407872, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_3.label_cooldown"), 6, 111, -16737895, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.rubilax_3.label_2"), 7, 126, -16751002, false);
	}

	@Override
	public void init() {
		super.init();
		button_choose = Button.builder(Component.translatable("gui.wakfu.rubilax_3.button_choose"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new Rubilax3ButtonMessage(0, x, y, z));
				Rubilax3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 54, this.topPos + 142, 56, 20).build();
		guistate.put("button:button_choose", button_choose);
		this.addRenderableWidget(button_choose);
		button_empty = Button.builder(Component.translatable("gui.wakfu.rubilax_3.button_empty"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new Rubilax3ButtonMessage(1, x, y, z));
				Rubilax3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -31, this.topPos + 71, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.wakfu.rubilax_3.button_empty1"), e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new Rubilax3ButtonMessage(2, x, y, z));
				Rubilax3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 198, this.topPos + 72, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
