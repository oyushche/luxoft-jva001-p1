package com.luxoft.jva001p1.generics.g0nothing;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Product;
import com.luxoft.jva001p1.generics.Monitor;

import java.util.ArrayList;
import java.util.List;

public class Demo
{
    public static void main(String[] args)
    {
        long counter = 1;

        List products = new ArrayList();

        products.add(new Monitor(counter++, 20));
        products.add(new Monitor(counter++, 20));

        products.add(new Axe(counter++, 1.5));

        for (Object o : products)
        {
            System.out.println(o);
        }

        System.out.println("What if you know that it is a list of products and want to print a price of each one?");
        System.out.println("Yes you should cast every object... :(");

        for (Object o : products)
        {
            Product p = (Product) o;
            System.out.println(p.getPrice());
        }
    }
}
