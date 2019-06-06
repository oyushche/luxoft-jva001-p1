package com.luxoft.jva001p1.oop.storage;

public class Demo
{
    public static void main(String[] args)
    {
        Shop shop = new Shop();
        shop.setStorage(new ListStorage());

        shop.storeBird(new Bird("Eagle", 20));
        shop.storeBird(new Bird("Eagle", 10));

        shop.storeBird(new Bird("Craw", 43));

        shop.report();
    }


}
