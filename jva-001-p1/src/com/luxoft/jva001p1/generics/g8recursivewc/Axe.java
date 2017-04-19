package com.luxoft.jva001p1.generics.g8recursivewc;

public class Axe<T> extends Product<Axe<T>>
{

    private int weight;

    public int getWeight()
    {
        return weight;
    }

    @Override
    public int subCompare(Axe axe)
    {
        return axe.getWeight() > weight ? 1 : -1;
    }
}
