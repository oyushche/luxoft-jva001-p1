package com.luxoft.jva001p1.generics.g8recursivewc;

public class Monitor<T> extends Product<Monitor<T>>
{
    private int diagonal;

    @Override
    public int subCompare(Monitor o)
    {
        return this.diagonal > o.diagonal ? 1 : -1;
    }
}
