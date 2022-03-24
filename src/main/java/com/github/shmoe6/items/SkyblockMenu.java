package com.github.shmoe6.items;

import com.github.shmoe6.client.gui.GuiSkyblockMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SkyblockMenu extends Item {

    public SkyblockMenu() {
        this.maxStackSize = 1;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        Minecraft.getMinecraft().displayGuiScreen(new GuiSkyblockMenu());
        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
        return false;
    }
}
