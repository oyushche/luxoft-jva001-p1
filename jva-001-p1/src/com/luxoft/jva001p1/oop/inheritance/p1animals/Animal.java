package com.luxoft.jva001p1.oop.inheritance.p1animals;

public class Animal
{
    private String picture;

    public Animal()
    {
        System.out.println("Animal");
    }

    public Animal(String picture)
    {
        System.out.println("Animal " + picture);
        this.picture = picture;
    }

    public void makeNoise()
    {
        System.out.println("Animal#makeNoise");
    }

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
