package com.luxoft.jva001p1.oop.cars;

public class Passenger
{
    private String name;

    void whatIsYourName()
    {
        System.out.println("My name is: " + name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (this.name != null)
        {
            System.out.println("I'm already have the name. My name is: " + this.name);
            return;
        }
        this.name = name;
    }
}
