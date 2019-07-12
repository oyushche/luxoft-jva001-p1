package com.luxoft.jva001p1.oop.inheritance.p2animals;

public abstract class Animal implements NiceProducer
{
    private String picture;

    public Animal()
    {
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

    @Override
    public String toString()
    {
        return "Animal{" +
                "picture='" + picture + '\'' +
                '}';
    }
}
