package com.luxoft.jva001p1.oop.inheritance.p5flyer;

public class Airplane implements Flyer
{
    @Override
    public void takeOff()
    {
        System.out.println("Airplane#takeOff");
    }

    @Override
    public void land()
    {
        System.out.println("Airplane#land");
    }

    @Override
    public void fly()
    {
        System.out.println("Airplane#fly");
    }
}
