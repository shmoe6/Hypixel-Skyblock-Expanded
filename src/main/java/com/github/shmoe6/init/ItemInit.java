package com.github.shmoe6.init;

import com.github.shmoe6.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static ItemInit instance;
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public Item test_item;

    public ItemInit() {
        instance = this;
        init();
        register();
    }

    private void init() {
        test_item = new Item().setUnlocalizedName("test_item");
    }

    private void register() {
        registerItem(test_item);
    }

    public void registerRenders() {
        registerRender(test_item);
    }

    public static void registerItem(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
        System.out.println("Registered Item: " + item.getUnlocalizedName().substring(5));
    }

    private void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}