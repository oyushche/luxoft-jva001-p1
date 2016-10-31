package com.luxoft.jva001p1.generics.g3methodwc;

import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket
{
    List<Product> products;

    public Basket()
    {
        products = new ArrayList<>();
    }

    public void add(Product p)
    {
        products.add(p);
    }

    public Product remove(Product p)
    {
        if (products.remove(p))
        {
            return p;
        }
        return null;
    }

    public <T extends Product> T getNeededProduct(long uid)
    {
        for (Product product : products)
        {
            if (product.getUid() == uid)
            {
                return (T) product;
            }
        }
        return null;
    }

    public List<Product> getProducts()
    {
        return new ArrayList<>(products);
    }
}
