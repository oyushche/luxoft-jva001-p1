package com.luxoft.jva001p1.cafe;

public class StepByStepDrinkBuilder
{
    private Drink drink;

    public StepByStepDrinkBuilder(String name)
    {
        drink = new Drink();
        drink.setName(name);
    }

    public void add(Ingredient ingredient)
    {
        Ingredient[] ingredients = drink.getIngredients();

        if (ingredients == null)
        {
            ingredients = new Ingredient[10];
        }

        for (int i = 0; i < ingredients.length; i++)
        {
            if (ingredients[i] == null)
            {
                ingredients[i] = ingredient;
                break;
            }
        }

        drink.setIngredients(ingredients);

    }

    public void remove(Ingredient ingredient)
    {

    }

    public Drink build()
    {
        return drink;
    }
}
