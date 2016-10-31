package com.luxoft.jva001p1.generics.g2nowildcard;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;

public class BasketNoWildCard
{
    public static void main(String[] args)
    {
        int counter = 1;

        Basket basket = new Basket();

        basket.add(new Monitor(counter++, 17));
        basket.add(new Monitor(counter++, 21));
        basket.add(new Axe(counter++, 2.5));

        System.out.println("Should cast every single time when getting product from the basket... :(");

        Monitor monitor = (Monitor) basket.get(2);
        Axe axe = (Axe) basket.get(3);

        System.out.println();
        System.out.println(monitor);
        System.out.println(axe);

        System.out.println();
        System.out.println("Should not cast only when getting products.");
        Product product = basket.get(1);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Should add specific method for every product in this case... :(");

        axe = basket.getAxe(3);

        System.out.println();
        System.out.println(axe);

    }
}
