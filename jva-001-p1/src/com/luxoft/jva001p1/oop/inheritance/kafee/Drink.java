package com.luxoft.jva001p1.oop.inheritance.kafee;

import java.util.Objects;

public class Drink implements Comparable<Drink>
{
    private String name;

    private double price;

    public Drink() {}

    public Drink(String name, double price)
    {
        this.name = name;
        this.price = price;
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

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public int compareTo(Drink d)
    {
        if (this.price > d.getPrice())
        {
            return 1;
        }

        if (this.price < d.getPrice())
        {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString()
    {
        return name + ":" + price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Drink drink = (Drink) o;
        return Double.compare(drink.price, price) == 0 &&
                Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, price);
    }
}
