package com.luxoft.jva001p1.collections;

import java.util.*;

public class MapDemo
{
    static String[] namesArray = {"Oleg", "Alex", "Nina", "Irina", "Marianna", "Alex"};

    public static void main(String[] args)
    {
        Map<String, Integer> nameToLength = new HashMap<>();

        for (String n : namesArray)
        {
            nameToLength.put(n, n.length());
        }

        System.out.println(nameToLength);

        if (nameToLength.containsKey("Oleg"))
        {
            System.out.println("Value for Oleg: " + nameToLength.get("Oleg"));
        }

        for (Map.Entry<String, Integer> entry : nameToLength.entrySet())
        {
            System.out.print(entry.getKey());
            System.out.print(":");
            System.out.print(entry.getValue());
            System.out.println();
        }

    }

}
