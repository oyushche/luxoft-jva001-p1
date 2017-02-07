package com.luxoft.jva001p1.oop.inheritance.p3animals;

public class Cat extends Animal
{
    private String name;

    public Cat()
    {
    }

    @Override
    public void makeNoise()
    {
        System.out.println("meow");
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
