package com.luxoft.jva001p1.oop.inheritance.p1animals;

import java.util.ArrayList;


public class D
{
    public static void main(String[] args)
    {
        ArrayList<Animal> catList = new ArrayList<>();

        catList.add(new Cat("Car"));

        catList.add(new SuperCat("SuperCat_1"));

        catList.add(new SuperCat("SuperCat_2"));

        catList.add(new SuperPuperCat("SuperPuperCat"));

        describe(catList);

    }

    static void describe(ArrayList<Animal> animals)
    {
        for (Animal a : animals)
        {
            System.out.println(a.getPicture());

        }
    }
}
