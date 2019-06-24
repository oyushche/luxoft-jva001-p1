package com.luxoft.jva001p1.oop.inheritance.kafee;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayMenu implements Menu
{
    private Drink[] drinks = new Drink[10];

    private int size = 0;

    public void addDrink(Drink drink)
    {
        drinks[size++] = drink;
    }

    public Drink findDrink(String name)
    {
        for (Drink drink : drinks)
        {
            if (name.equals(drink.getName()))
            {
                return drink;
            }
        }
        return null;
    }

    public Collection<Drink> getDrinks()
    {
        ArrayList arrayList = new ArrayList<>();

        for (Drink drink : drinks)
        {
            arrayList.add(drink);
        }

        return arrayList;
    }


}
