package com.github.shmoe6.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SkyblockMenu extends Item {

    public SkyblockMenu() {
        this.maxStackSize = 1;
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
        return false;
    }
}
