package com.luxoft.jva001p1.collections;

import com.luxoft.jva001p1.oop.inheritance.kafee.Drink;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapGrouping
{
    public static void main(String[] args)
    {
        List<Drink> drinks = new ArrayList<>();

        drinks.add(new Drink("Coffee", 10.0));
        drinks.add(new Drink("Double Coffee", 12.0));
        drinks.add(new Drink("Cappuccino", 10.0));
        drinks.add(new Drink("Flat White", 12.0));
        drinks.add(new Drink("Raf", 12.0));

        Map<Double, List<Drink>> map = new HashMap<>();

        for (Drink drink : drinks)
        {
            if (!map.containsKey(drink.getPrice()))
            {
                map.put(drink.getPrice(), new ArrayList<>());
            }

            map.get(drink.getPrice()).add(drink);
        }

        System.out.println(map);
    }

}
