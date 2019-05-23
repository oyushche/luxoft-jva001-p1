package com.luxoft.jva001p1.basics.part3;

import java.util.ArrayList;

public class E7_ArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Igor");
        names.add("Oleg");
        names.add("Alina");
        names.add("Misha");

        String nameByIdx = names.get(1);
        System.out.println("name: " + nameByIdx);

        for (String name : names)
        {
            System.out.println(name);

            if ("Alina".equals(name))
            {
                break;
            }
        }

        System.out.println("Does Misha inside? => " + names.contains("Misha"));
        System.out.println("Does Alex inside? => " + names.contains("Alex"));

        System.out.println("names: " + names);

        names.remove("Oleg");

        System.out.println("names: " + names);
    }
}
