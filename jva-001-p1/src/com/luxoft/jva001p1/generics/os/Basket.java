package com.luxoft.jva001p1.generics.os;

import com.luxoft.jva001p1.generics.Product;
import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Product>
{
    List<T> products;

    public Basket()
    {
        products = new ArrayList<>();
    }

    public void add(T p)
    {
        products.add(p);
    }

    public T remove(T p)
    {
        if (products.remove(p))
        {
            return p;
        }
        return null;
    }

    public List<T> getProducts()
    {
        return new ArrayList<>(products);
    }
}
