package com.luxoft.jva001p1.oop.inheritance.dogshop;

public class Shop
{
    private Storage storage;

    void store(Dog dog)
    {
        storage.store(dog);
    }

    Dog buy(String name)
    {
        Dog dog = storage.find(name);

        if (dog != null)
        {
            storage.remove(dog);
        }

        return dog;
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }
}
