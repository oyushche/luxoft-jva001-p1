package com.luxoft.jva001p1.generics.g8recursivewc;

public abstract class Product<T extends Product> implements Comparable<T>
{
    private long uid;
    private double price;

    @Override
    public int compareTo(T o)
    {
        System.out.println("compareTo#called");
        return subCompare(o);
    }

    public abstract int subCompare(T o);
}
