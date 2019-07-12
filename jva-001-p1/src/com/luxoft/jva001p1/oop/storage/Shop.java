package com.luxoft.jva001p1.oop.storage;

public class Shop
{
    public static final String SHOP_NAME = "NBS";

    private Storage storage;

    void storeBird(Bird birdToStore)
    {
        storage.storeBird(birdToStore);
    }

    private Bird findBird(String type)
    {
        return storage.findBird(type);
    }

    void report()
    {
        System.out.println();
        System.out.println("=====================");
        for (Bird bird : storage.getBirds())
        {
            System.out.println(bird);
        }
        System.out.println("=====================");
        System.out.println();

    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }
}
