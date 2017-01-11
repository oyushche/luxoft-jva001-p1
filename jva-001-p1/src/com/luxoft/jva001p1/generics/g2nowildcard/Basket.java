package com.luxoft.jva001p1.generics.g2nowildcard;

import com.luxoft.jva001p1.generics.Axe;
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

    public Product get(int uid)
    {

        for (Product product : products)
        {
            if (product.getUid() == uid)
            {
                return product;
            }
        }
        return null;
    }

    public Axe getAxe(int uid)
    {

        Product p = get(uid);
        if (p instanceof Axe)
        {
            return (Axe) p;
        }

        return null;
    }


    public List<Product> getProducts()
    {
        return new ArrayList<>(products);
    }
}
