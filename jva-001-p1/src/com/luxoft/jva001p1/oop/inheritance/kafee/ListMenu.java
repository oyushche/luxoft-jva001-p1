package com.luxoft.jva001p1.oop.inheritance.kafee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ListMenu implements Menu
{
    private Collection<Drink> drinks = new ArrayList<>();

    public void addDrink(Drink drink)
    {
        drinks.add(drink);
    }

    public Drink findDrink(String name)
    {
//        Iterator<Drink> iterator = drinks.iterator();

//        while (iterator.hasNext())
//        {
//            Drink drink = iterator.next();
//            if (name.equals(drink.getName()))
//            {
//                return drink;
//            }
//        }

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
        return new ArrayList(drinks);
    }


}
