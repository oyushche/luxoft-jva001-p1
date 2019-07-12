package com.luxoft.jva001p1.oop.inheritance.p2animals;

public class Wolf extends Animal
{

    @Override
    public void makeNoise()
    {
        System.out.println("wooooo");
    }

    @Override
    public void sleep()
    {
        System.out.println("Aaaaa, Wolfs never sleep....");
    }
}
