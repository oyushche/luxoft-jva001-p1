package com.luxoft.jva001p1.generics;

public class Product
{
    private long uid;
    private double price;


    public Product(long uid)
    {
        this.uid = uid;
        setRandomPrice();
    }

    private void setRandomPrice()
    {
        price = uid * 2.0;
    }

    public long getUid()
    {
        return uid;
    }

    public double getPrice()
    {
        return price;
    }
}
