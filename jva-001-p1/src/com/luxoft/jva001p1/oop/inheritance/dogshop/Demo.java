package com.luxoft.jva001p1.oop.inheritance.dogshop;

public class Demo
{

    public static void main(String[] args)
    {
        Shop shop = new Shop();
        shop.setStorage(new ExelStorage());

        shop.store(new Dog("Rex"));
        shop.store(new Dog("Pinky"));
        shop.store(new Dog("Amanda"));

        shop.buy("Rex");
    }
}
