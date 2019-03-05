package com.luxoft.jva001p1.cafe;

public class Drink
{
    private String name;
    private double price;

    private Ingredient[] ingredients;

    public Drink()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public Ingredient[] getIngredients()
    {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients)
    {
        this.ingredients = ingredients;

        this.price = 0.0;

        for (Ingredient ingredient : ingredients)
        {
            if (ingredient == null)
            {
                break;
            }

            this.price += ingredient.getPrice();
        }
    }
}
