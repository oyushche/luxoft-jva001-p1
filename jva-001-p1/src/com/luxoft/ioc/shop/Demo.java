package com.luxoft.ioc.shop;

import com.luxoft.ioc.shop.bl.Shop;
import com.luxoft.ioc.shop.bl.StorageService;
import com.luxoft.ioc.shop.storage.SuperStorage;

public class Demo
{

    public static void main(String[] args)
    {
        Product tv = new Product("TV");
        Product axe = new Product("AXE");

        StorageService storageService = new SuperStorage();

        StorageService storageFilter = new StorageFilter(storageService);

        Shop shop = new Shop();
        shop.setService(storageFilter);

        shop.addToStorage(tv);
        shop.addToStorage(axe);
    }
}
