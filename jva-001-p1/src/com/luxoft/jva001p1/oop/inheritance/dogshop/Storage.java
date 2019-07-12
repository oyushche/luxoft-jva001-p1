package com.luxoft.jva001p1.oop.inheritance.dogshop;

public interface Storage
{
    void store(Dog dog);

    Dog find(String name);

    void remove(Dog dog);
}
