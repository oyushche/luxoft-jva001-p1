package com.luxoft.jva001p1.cafe;

public class DrinkBuilder
{
    public DrinkBuilder()
    {
    }

    public Drink createDrink(String name, Ingredient[] ingredients)
    {
        Drink drink = new Drink();
        drink.setName(name);
        drink.setIngredients(ingredients);

        return drink;
    }

    public Drink enrichDrink(Drink drink, Ingredient[] ingredients)
    {
        Ingredient[] existing = drink.getIngredients();

        // add new ingredients

        // drink.setIngredients(new ingredients);

        return drink;
    }

    public Drink removeIngredientFromDrink(Drink drink, Ingredient[] ingredients)
    {
        Ingredient[] existing = drink.getIngredients();

        // remove ingredients

        // drink.setIngredients(new ingredients);

        return drink;
    }
}
