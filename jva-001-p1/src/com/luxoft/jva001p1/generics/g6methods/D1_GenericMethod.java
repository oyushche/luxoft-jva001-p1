package com.luxoft.jva001p1.generics.g6methods;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;
import com.luxoft.jva001p1.inners.Dog;

import java.util.ArrayList;
import java.util.List;

public class D1_GenericMethod
{
    public static void main(String[] args)
    {
        long counter = 1;

        Monitor monitor1 = new Monitor(counter++, 20);
        Monitor monitor2 = new Monitor(counter++, 28);

        Axe axe = new Axe(counter++, 1.5);

        List<Product> products = new ArrayList<>();

        List<Monitor> monitors = new ArrayList<>();
        List<Axe> axes = new ArrayList<>();

        products.add(monitor1);
        monitors.add(monitor1);

        products.add(monitor2);
        monitors.add(monitor2);

        products.add(axe);
        axes.add(axe);

        printProductsOnly(products);
//        printProductsOnly(axes); // will not compile
//        printProductsOnly(monitors); // will not compile

        printAxesNotMonitorsOrProducts(axes);

//        printAxesNotMonitorsOrProducts(monitors); // will not compile
//        printAxesNotMonitorsOrProducts(products); // will not compile

//        printProductPrices(products);
//        printProductPrices(monitors);
//        printProductPrices(axes);

    }

    private static void printProductsOnly(List<Product> products)
    {
        printSeparator("printProductsOnly");

        for (Product product : products)
        {
            System.out.println(product);
        }
    }

    private static void printAxesNotMonitorsOrProducts(List<Axe> axes)
    {
        printSeparator("printAxesNotMonitorsOrProducts");

        for (Axe ax : axes)
        {
            System.out.println(ax);
        }
    }

    private static void printProductPrices(List<? extends Product> products)
    {
        printSeparator("printProductPrices");

        for (Product product : products)
        {
            System.out.println(product.getPrice());
        }
    }

    private static void printSeparator(String methodName)
    {
        System.out.println();
        System.out.println(methodName + " ============================");
        System.out.println();
    }

}
