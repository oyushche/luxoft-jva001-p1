package com.luxoft.jva001p1.oop.inheritance.kafee;

import java.util.*;

public class MapMenu implements Menu
{
    private Map<String, Drink> drinks;

    public MapMenu()
    {
//            drinks = new HashMap<>();
            drinks = new TreeMap<>();

    }

    public void addDrink(Drink drink)
    {
        drinks.put(drink.getName(), drink);
    }

    public Drink findDrink(String name)
    {
        if (drinks.containsKey(name))
        {
            return drinks.get(name);
        }
        return null;
    }

    public Collection<Drink> getDrinks()
    {
        return drinks.values();
    }


}
