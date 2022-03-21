package com.github.shmoe6.proxy;

import com.github.shmoe6.init.ItemInit;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        ItemInit.instance.registerRenders();
    }
}
