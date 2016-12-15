package com.luxoft.jva001p1.generics.g5limits;

import com.luxoft.jva001p1.generics.Product;
import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Product & Comparable<T>>
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

    public T get(long uid)
    {
        for (T product : products)
        {
            if (product.getUid() == uid)
            {
                return product;
            }
        }
        return null;
    }

    public List<T> getProducts()
    {
        return new ArrayList<>(products);
    }
}
