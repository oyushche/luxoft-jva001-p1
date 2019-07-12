package com.luxoft.jva001p1.generics.os;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;

public class UsingBasket // after erasing with the restriction
{
    public static void main(String[] args)
    {
        Basket<Product> products = new Basket<>();

        products.add(new Axe(1L, 2.5));
        products.add(new Monitor(2L, 17));

        double totalPrice = 0;
        for (Product p : products.getProducts())
        {
            totalPrice += p.getPrice();
        }

        System.out.println(totalPrice);

        Basket<Axe> axes = new Basket<>();
        Basket<Monitor> monitors = new Basket<>();

//        Basket<Integer> number = new Basket<>();

        print(monitors);
    }

    public static void print(Basket<? extends Product> basket)
    {
        for (Product p : basket.getProducts())
        {
            System.out.println(p);
        }
    }
}
