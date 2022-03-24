package com.github.shmoe6.client.gui;

import com.github.shmoe6.Reference;
import com.github.shmoe6.client.gui.buttons.YourSkyblockProfileButton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public class GuiSkyblockMenu extends GuiScreen {

    protected final ResourceLocation texture = new ResourceLocation(Reference.MODID, "textures/gui/demo_background.png");
    int guiWidth = 246;
    int guiHeight = 164;

    YourSkyblockProfileButton your_stats;

    final int YOUR_STATS = 0;
    String title = "Skyblock Menu";

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        int centerX = (width / 2) - guiWidth / 2;
        int centerY = (height / 2) - guiHeight / 2;
        drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeight);
        drawString(fontRendererObj, "Skyblock Menu", centerX + 10, centerY + 10, 0x5e5e5e);
        //drawString(fontRendererObj, "HSE", guiWidth - 5 , centerY + 10, 0x5e5e5e);

        your_stats.drawButton(mc, mouseX, mouseY);
        ItemStack icon = new ItemStack(Blocks.skull);
        GlStateManager.pushMatrix(); {
            GlStateManager.translate(centerX, centerY, 0);
            GlStateManager.scale(2, 2, 2);
            mc.getRenderItem().renderItemAndEffectIntoGUI(icon, 0, 0);
        } GlStateManager.popMatrix();
    }

    public void drawTooltip(List<String> lines, int mouseX, int mouseY, int posX, int posY, int width, int height) {
        if (mouseX >= posX && mouseX <= posX + width && mouseY >= posY && mouseY <= posY + height) {
            drawHoveringText(lines, mouseX, mouseY);
        }
    }

    @Override
    public void initGui() {

        buttonList.clear();
        buttonList.add(your_stats = new YourSkyblockProfileButton(YOUR_STATS, (width / 2) - 16 / 2, 65, 16, 16, ""));
        updateButtons();
        super.initGui();
    }

    public void updateButtons() {
        your_stats.enabled = title.equals("Skyblock Menu");
    }

    @Override
    public boolean doesGuiPauseGame() {
        return true;
    }

}