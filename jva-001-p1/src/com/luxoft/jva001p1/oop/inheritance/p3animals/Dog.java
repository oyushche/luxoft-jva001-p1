package com.luxoft.jva001p1.oop.inheritance.p3animals;

public class Dog extends Animal
{
    private String name;

    public Dog()
    {
    }

    @Override
    public void makeNoise()
    {
        System.out.println("bark");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
