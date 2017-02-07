package com.luxoft.jva001p1.oop.inheritance.p4animals;

public class Dog extends Animal implements Pet
{
    private String name;

    public Dog()
    {
    }

    @Override
    public void beFriendly()
    {
        System.out.println("brrr...");
    }

    @Override
    public void play()
    {
        System.out.println("Running with the ball...");
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
