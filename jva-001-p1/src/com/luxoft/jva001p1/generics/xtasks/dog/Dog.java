package com.luxoft.jva001p1.generics.xtasks.dog;

import java.util.ArrayList;
import java.util.List;

public class Dog
{

    int size;

    public Dog getDog(int size)
    {
        if (size > 60)
        {
            return new BigDog();
        }
        else
        {
            return new SmallDog();
        }
    }

    public static List<Pet> pets = new ArrayList<>();

    public static void main(String[] args)
    {
        RoboDog d = new RoboDog("Robik");
        d.turnOn();
        d.beFriendly();

        Pet pet = d;
        pet.beFriendly();

        // create inner class
        class SpecialRoboDog extends RoboDog
        {
            public void beFriendly()
            {
                System.out.println("I'm more friendly than everyone else!");
            }
        }

        List<Pet> pets = new ArrayList<>();
        pets.add(d);

        Pet cat = new Cat("Kitty");
        try
        {
            Dog dd = (Dog) cat;
        }
        catch (ClassCastException ce)
        {
            System.out.println(cat.getName() + " is not a dog!");
        }

        cat = null;
        //        cat.beFriendly();

        pets.add(new Cat(""));
        pets.add(new SpecialRoboDog());

        // add anonymous class
        pets.add(new RoboDog()
        {
            public void beFriendly()
            {
                System.out.println("I'm more friendly than everyone else!");
            }
        });

        // another anonymous class
        pets.add(new Cat("Tiger Tigra")
        {
            public void beFriendly()
            {
                System.out.println("I'm not friendly! I'm a Tiger!");
            }

            public String getName()
            {
                return "";
            }
        });

        for (Pet p : pets)
        {
            // r not accessible
            //r.
            Robot r;
            p.beFriendly();
        }
        // r not accessible
    }

}

interface Pet
{
    public String getName();

    void beFriendly();
}

class Robot
{
    public void turnOn()
    {
        System.out.println("I'm switched on!");
    }
}

class Cat implements Pet
{
    public String name;

    public Cat(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void beFriendly()
    {
        System.out.println("I'm friendly!");
        Math.add(1, 2);
    }
}

class Math
{
    static int a;

    private Math()
    {
    }

    static void add(int a, int b)
    {
        System.out.println("a + b = " + (a + b));
    }
}

class RoboDog extends Robot implements Pet
{
    private String name;

    public RoboDog()
    {
        this("Noname Robot");
    }

    public RoboDog(String name)
    {
        this.name = name;
        Dog.pets.add(this);
    }

    public String getName()
    {
        return name;
    }

    public void beFriendly()
    {
        System.out.println("I'm friendly!");
    }

    public void turnOn()
    {
        super.turnOn();
        System.out.println("Gavvv!");
    }
}

class MyRoboDog extends RoboDog
{
    public MyRoboDog()
    {
        super("Robik");
        turnOn();
    }
}

class SmallDog extends Dog
{

}

class BigDog extends Dog
{

}