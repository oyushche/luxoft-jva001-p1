package com.luxoft.jva001p1.collections;

import com.luxoft.jva001p1.oop.inheritance.kafee.Drink;

import java.util.*;

public class ListDemo
{
    static String[] namesArray = {"Oleg", "Alex", "Nina", "Irina", "Marianna"};

    public static void main(String[] args)
    {
        Set<String> names = new TreeSet<>(new NamesReverseOrder());

        names.addAll(Arrays.asList(namesArray));

        System.out.println(names);

    }

    static class NamesReverseOrder implements Comparator<String>
    {
        @Override
        public int compare(String s1, String s2)
        {
            return s2.compareTo(s1);
        }
    }
}
