package com.luxoft.jva001p1.generics.g3methodwc;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;

public class BasketMethodWildCard
{
    public static void main(String[] args)
    {
        int counter = 1;

        Basket basket = new Basket();

        basket.add(new Monitor(counter++, 17));
        basket.add(new Monitor(counter++, 21));
        basket.add(new Axe(counter++, 2.5));

        basket.add(new Grill(counter++));

        System.out.println("Now you can get any product without casting... :)");
        Monitor monitor = basket.getNeededProduct(2);
        Axe axe = basket.getNeededProduct(3);

        System.out.println();
        System.out.println(monitor);
        System.out.println(axe);

        System.out.println();
        System.out.println("You can even use super class it you want.");
        Product product = basket.getNeededProduct(1);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Even products, that have not exist when you added basket class.");
        Grill grill = basket.getNeededProduct(4);

        System.out.println();
        System.out.println(grill);

    }
}
