package com.luxoft.jva001p1.oop.inheritance.p2animals;

public class Cat extends Animal
{
    private String name;

    public Cat()
    {
    }

    @Override
    public void makeNoise()
    {
        System.out.println("meau");
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
    public String toString()
    {
        return " Car{ " + super.toString()
                + ", name='" + name + '\''
                +  '}';
    }
}
