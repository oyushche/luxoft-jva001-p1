package com.luxoft.jva001p1.oop.inheritance.kafee;

import java.util.Comparator;

public class DrinkNameComparator implements Comparator<Drink>
{
    @Override
    public int compare(Drink o1, Drink o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}
