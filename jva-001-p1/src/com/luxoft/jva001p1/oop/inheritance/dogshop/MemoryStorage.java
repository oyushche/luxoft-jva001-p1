package com.luxoft.jva001p1.oop.inheritance.dogshop;

public class MemoryStorage implements Storage
{
    private Dog[] dogs = new Dog[20];

    public void store(Dog dog)
    {
        dogs[0] = dog;
    }

    public Dog find(String name)
    {
        return null;
    }

    public void remove(Dog dog)
    {
    }
}
