package com.luxoft.jva001p1.exceptions.person;

public class PersonNotFoundException extends RuntimeException
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
