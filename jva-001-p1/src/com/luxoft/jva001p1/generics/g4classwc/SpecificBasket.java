package com.luxoft.jva001p1.generics.g4classwc;

import com.luxoft.jva001p1.generics.Axe;

public class SpecificBasket
{
    public static void main(String[] args)
    {
        int counter = 1;

        Basket<Axe> basket = new Basket();

//        basket.add(new Monitor(counter++, 17)); // will not compile
        basket.add(new Axe(counter++, 2.5));

        Axe axe = basket.get(1);
        System.out.println(axe);
    }
}
