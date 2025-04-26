package net.mcreator.wakfu.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wakfu.world.inventory.GuiEliacubeMenu;
import net.mcreator.wakfu.network.GuiEliacubeButtonMessage;
import net.mcreator.wakfu.WakfuMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuiEliacubeScreen extends AbstractContainerScreen<GuiEliacubeMenu> {
	private final static HashMap<String, Object> guistate = GuiEliacubeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_bras_en_wakfu;
	ImageButton imagebutton_eliacube;

	public GuiEliacubeScreen(GuiEliacubeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("wakfu:textures/screens/gui_eliacube.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.wakfu.gui_eliacube.label_wakfu_arm"), 59, 11, -13369396, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_bras_en_wakfu = new ImageButton(this.leftPos + -45, this.topPos + -48, 94, 266, 0, 0, 266, new ResourceLocation("wakfu:textures/screens/atlas/imagebutton_bras_en_wakfu.png"), 94, 532, e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new GuiEliacubeButtonMessage(0, x, y, z));
				GuiEliacubeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_bras_en_wakfu", imagebutton_bras_en_wakfu);
		this.addRenderableWidget(imagebutton_bras_en_wakfu);
		imagebutton_eliacube = new ImageButton(this.leftPos + 77, this.topPos + 14, 155, 157, 0, 0, 157, new ResourceLocation("wakfu:textures/screens/atlas/imagebutton_eliacube.png"), 155, 314, e -> {
			if (true) {
				WakfuMod.PACKET_HANDLER.sendToServer(new GuiEliacubeButtonMessage(1, x, y, z));
				GuiEliacubeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_eliacube", imagebutton_eliacube);
		this.addRenderableWidget(imagebutton_eliacube);
	}
}
