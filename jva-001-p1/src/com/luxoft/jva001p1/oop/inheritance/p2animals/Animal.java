package com.luxoft.jva001p1.oop.inheritance.p2animals;

public class Animal
{
    private String picture;

    public Animal()
    {
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
