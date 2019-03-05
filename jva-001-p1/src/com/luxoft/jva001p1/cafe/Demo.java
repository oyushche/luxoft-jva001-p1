package com.luxoft.jva001p1.cafe;

public class Demo
{
    public static void main(String[] args)
    {
        Cafe cafe = new Cafe();

//        Drink[] drinks = cafe.getAllDrinks();

//        cafe.buyDrink(drinks[0].getName());

        // ----

        StepByStepDrinkBuilder builder = new StepByStepDrinkBuilder("2x Latte");

        builder.add(new Ingredient("Coffee", 2.0));
        builder.add(new Ingredient("Coffee", 2.0));
        builder.add(new Ingredient("Milk", 1.0));

        Drink drink = builder.build();

        System.out.println(drink.getName() + " " + drink.getPrice());


    }

    public void test()
    {

    }
}
