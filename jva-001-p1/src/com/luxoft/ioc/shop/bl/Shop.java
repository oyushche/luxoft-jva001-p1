package com.luxoft.ioc.shop.bl;

import com.luxoft.ioc.shop.Product;

public class Shop
{
    private StorageService service;

    public Shop()
    {
    }

    public Shop(StorageService service)
    {
        this.service = service;
    }

    public void addToStorage(Product p)
    {
        this.service.store(p);
    }

    public void setService(StorageService service)
    {
        this.service = service;
    }
}
