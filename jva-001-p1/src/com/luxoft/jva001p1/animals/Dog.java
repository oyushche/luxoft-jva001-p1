package com.luxoft.jva001p1.animals;

public class Dog extends AbstractAnimal implements Pet
{
    private String name;

    @Override
    public void voice()
    {
        System.out.println("bark, bark, bark...");
    }

    @Override
    public String getAddress()
    {
        return "Odessa";
    }

    @Override
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
