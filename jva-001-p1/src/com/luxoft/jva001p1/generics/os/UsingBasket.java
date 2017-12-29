package com.luxoft.jva001p1.generics.os;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;

public class UsingBasket // after erasing with the restriction
{
    public static void main(String[] args)
    {
        Basket<Product> basket = new Basket<>();

        basket.add(new Axe(1L, 2.5));
        basket.add(new Monitor(2L, 17));

        double totalPrice = 0;
        for (Product p : basket.getProducts())
        {
            totalPrice += p.getPrice();
        }

        System.out.println(totalPrice);

        Basket<Integer> basketss = new Basket<>();
    }
}
