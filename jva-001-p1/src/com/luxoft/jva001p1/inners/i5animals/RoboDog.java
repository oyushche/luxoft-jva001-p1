package com.luxoft.jva001p1.inners.i5animals;

public class RoboDog extends Robot implements Pet
{
    private String name;

    public RoboDog()
    {
        this("Noname Robodog");
    }

    public RoboDog(String name)
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
        System.out.println(name + ": I'm friendly!");
    }
}
