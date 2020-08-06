package com.luxoft.jva001p1.oop.test;

public class Person
{
    private String name;

    public Person()
    {
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
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
