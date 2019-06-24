package com.luxoft.jva001p1.oop.inheritance.kafee;

import java.util.Collection;

public interface Menu
{

    void addDrink(Drink drink);

    Drink findDrink(String name);

    Collection<Drink> getDrinks();
}
