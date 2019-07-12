package com.luxoft.jva001p1.oop.inheritance.p1animals;

public class SuperCat extends Cat
{
    private String mood;

    public SuperCat()
    {
        System.out.println("SuperCat");
    }

    public SuperCat(String name)
    {
        super(name);
    }

    public String getMood()
    {
        return mood;
    }

    public void setMood(String mood)
    {
        this.mood = mood;
    }
}
