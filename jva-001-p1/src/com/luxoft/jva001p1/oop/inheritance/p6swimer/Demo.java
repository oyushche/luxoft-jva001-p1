package com.luxoft.jva001p1.oop.inheritance.p6swimer;

public class Demo
{
    public static void main(String[] args)
    {
        forceToFly(new Duck());

        forceToSwim(new Duck());
        forceToSwim(new Penguin());
    }

    static void forceToFly(Flyer flyer)
    {
        flyer.fly();
    }

    static void forceToSwim(Swimmer swimmer)
    {
        swimmer.swim();
    }
}
