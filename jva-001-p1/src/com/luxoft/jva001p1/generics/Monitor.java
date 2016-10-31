package com.luxoft.jva001p1.generics;

public class Monitor extends Product
{
    private int diagonal;

    public Monitor(long uid, int diagonal)
    {
        super(uid);
        this.diagonal = diagonal;
    }

    public int getDiagonal()
    {
        return diagonal;
    }

    @Override
    public String toString()
    {
        return getUid() +  ":Monitor [" + diagonal  + Character.toString((char) 698) + ", price: " + getPrice() + "$]";
    }
}
