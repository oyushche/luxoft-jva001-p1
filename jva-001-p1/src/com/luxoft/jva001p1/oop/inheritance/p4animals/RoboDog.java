package com.luxoft.jva001p1.oop.inheritance.p4animals;

public class RoboDog implements Pet
{
    private String name;

    public RoboDog()
    {
    }

    @Override
    public void beFriendly()
    {
        System.out.println("I'm always friendly. Because I was created for you.");
    }

    @Override
    public void play()
    {
        System.out.println("Ready to play!");
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
