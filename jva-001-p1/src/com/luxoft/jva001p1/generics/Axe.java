package com.luxoft.jva001p1.generics;

public class Axe extends Product
{
    private double weight;

    public Axe(long uid, double weight)
    {
        super(uid);
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return getUid() +  ":Axe [" + weight  + " kg"  + ", price: " + getPrice() + "$]";
    }
}
