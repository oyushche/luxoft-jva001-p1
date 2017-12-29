package com.luxoft.ioc.shop.storage;

import com.luxoft.ioc.shop.Product;
import com.luxoft.ioc.shop.bl.StorageService;

public class StorageServiceImpl implements StorageService
{

    public void store(Product p)
    {
        System.out.println("stored: " + p.getName());
    }
}
