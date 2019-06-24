package com.luxoft.jva001p1.oop.inheritance.kafee;

public class Demo
{
    public static void main(String[] args)
    {
        Menu menu = new MapMenu();

        menu.addDrink(createDrink("Latte", 20.0));
        menu.addDrink(createDrink("Latte", 20.0));
        menu.addDrink(new Drink("Espresso", 10.0));

        menu.addDrink(createDrink("Raf", 24.0));

        System.out.println(menu.getDrinks());

        System.out.println(menu.findDrink("Raf"));

    }

    private static Drink createDrink(String name, double price)
    {
        Drink drink = new Drink();
        drink.setName(name);
        drink.setPrice(price);

        return drink;
    }

}
