package com.luxoft.jva001p1.oop.inheritance.p4animals;

public abstract class Animal
{
    private String picture;

    public Animal()
    {
    }

    public abstract void makeNoise();

    public void sleep()
    {
        System.out.println("Animal#sleep");
    }

    public String getPicture()
    {
        return picture;
    }

    public void setPicture(String picture)
    {
        this.picture = picture;
    }
}
