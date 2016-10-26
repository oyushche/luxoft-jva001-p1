package com.luxoft.jva001p1.animals;

public class Cat extends AbstractAnimal implements Pet
{
    private String name;

    @Override
    public void voice()
    {
        System.out.println("meow");
    }

    @Override
    public String getAddress()
    {
        return "Kiev";
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
