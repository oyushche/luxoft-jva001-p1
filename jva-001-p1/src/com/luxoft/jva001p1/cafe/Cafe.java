package com.luxoft.jva001p1.cafe;

import java.util.Arrays;

public class Cafe
{
    private Drink[] drinks;
    private Ingredient[] ingredients;

    private DrinkBuilder drinkBuilder = new DrinkBuilder();

    public Drink[] getAllDrinks()
    {
        return Arrays.copyOf(drinks, drinks.length);
    }

    public Drink buyDrink(String name)
    {
        return null;
    }

    public Drink createDrink(String name, String ...ingreditnts)
    {
        // code
        // drinkBuilder.createDrink()
        return null;
    }

    public void createIngredient(String name, double price)
    {

    }

}
