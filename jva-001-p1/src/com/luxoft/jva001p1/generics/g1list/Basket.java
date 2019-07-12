package com.luxoft.jva001p1.generics.g1list;

public class Basket<T>
{
    private T object;

    public T getObject()
    {
        return object;
    }

    public void setObject(T object)
    {
        this.object = object;
    }
}
