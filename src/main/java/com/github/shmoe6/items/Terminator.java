package com.github.shmoe6.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Terminator extends Item {

    public Terminator() {
        this.maxStackSize = 1;
        this.setMaxDamage(384);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        EntityArrow entityarrow = new EntityArrow(worldIn, playerIn, 1 * 2.0F);
        worldIn.playSoundAtEntity(playerIn, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + 1 * 0.5F);
        worldIn.spawnEntityInWorld(entityarrow);
        return itemStackIn;
    }

}
