package com.luxoft.jva001p1.oop.inheritance.kafee;

import java.util.Comparator;

public class DrinkComparator implements Comparator<Drink>
{
    @Override
    public int compare(Drink o1, Drink o2)
    {
        // if o1 > o2 => 1
        // if o2 > o1 => -1
        // 0
        if (o1.getPrice() > o2.getPrice())
        {
            return 1;
        }
        if (o2.getPrice() > o1.getPrice())
        {
            return -1;
        }

        return 0;
    }
}
