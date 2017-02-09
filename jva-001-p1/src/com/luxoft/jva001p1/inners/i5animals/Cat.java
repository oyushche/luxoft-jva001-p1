package com.luxoft.jva001p1.inners.i5animals;

public class Cat implements Pet
{
    private String name;

    public Cat(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void beFriendly()
    {
        System.out.println(name
            + ": I'm friendly!");
    }
}
