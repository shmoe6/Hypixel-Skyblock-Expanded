package com.github.shmoe6.handlers;

import com.github.shmoe6.init.ItemInit;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {

    //this doesnt work!

    @SubscribeEvent
    public void guiMouse(GuiScreenEvent.MouseInputEvent.Pre event)
    {
        if(event.gui instanceof GuiInventory)
        {
            GuiInventory inventory = (GuiInventory)event.gui;
            Slot slot = inventory.getSlotUnderMouse();
            if(slot != null)
            {
                ItemStack stack = slot.getStack();
                if(stack != null && stack.getItem().equals(ItemInit.instance.skyblock_menu)) {
                    event.setCanceled(true);
                }
            }
        }
    }

    @SubscribeEvent
    public void guiKey(GuiScreenEvent.KeyboardInputEvent.Pre event)
    {
        if(event.gui instanceof GuiInventory)
        {
            GuiInventory inventory = (GuiInventory)event.gui;
            Slot slot = inventory.getSlotUnderMouse();

            if(slot != null) {
                ItemStack stack = slot.getStack();
                if(stack != null && stack.getItem().equals(ItemInit.instance.skyblock_menu)) {
                    event.setCanceled(true);
                }
            }
        }
    }

}
