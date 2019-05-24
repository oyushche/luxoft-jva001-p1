package com.luxoft.jva001p1.oop.demo;

import java.util.ArrayList;

public class Demo
{
    public static void main(String[] args)
    {
        ArrayList<Cat> data = new ArrayList<>();

        Cat cat1 = new Cat();
        cat1.name = "Murzik";
        cat1.age = 20;

        Cat cat2 = new Cat();
        cat2.name = "Rocky";
        cat2.age = 18;

        Cat cat3 = new Cat();
        cat3.name = "Murka";
        cat3.age = 16;

        data.add(cat1);
        data.add(cat2);
        data.add(cat3);

        for (Cat cat : data)
        {
            displayCat(cat);
        }

        // ----------------

        Cat c = new Cat();
        c.name = "Martin";
        c.age = 65;

        displayCat(c);

        getOlder(c);

        displayCat(c);

    }

    static void getOlder(Cat cat)
    {
        cat.age = cat.age + 1;
    }

    static void displayCat(Cat cat)
    {
        System.out.println("Cat: [name: " + cat.name + ", age: " + cat.age + "]");
    }


}
