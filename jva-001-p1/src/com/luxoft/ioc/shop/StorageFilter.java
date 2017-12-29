package com.luxoft.ioc.shop;

import com.luxoft.ioc.shop.bl.StorageService;

public class StorageFilter implements StorageService
{
    private StorageService service;

    public StorageFilter(StorageService service)
    {
        this.service = service;
    }

    @Override
    public void store(Product p)
    {
        System.out.println("trying to store: " + p.getName());

        if ("AXE".equals(p.getName()))
        {
            System.out.println("You cannot store axes here!!!");
            return;
        }

        service.store(p);
    }
}
