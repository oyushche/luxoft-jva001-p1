package com.luxoft.jva001p1.oop.inheritance.p1animals;

public class Cat extends Animal
{
    private String name;

    public Cat()
    {
        System.out.println("Cat");
    }

    public Cat(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void makeNoise()
    {
        System.out.println("Cat#makeNoise");
    }

}
