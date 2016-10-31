package com.luxoft.jva001p1.postoffice;

public class Person
{
    private final String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Person)
        {
            return name.equals(((Person) obj).getName());
        }
        return false;
    }
}
