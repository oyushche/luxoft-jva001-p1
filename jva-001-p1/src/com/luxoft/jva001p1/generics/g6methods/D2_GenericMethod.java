package com.luxoft.jva001p1.generics.g6methods;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;
import java.util.List;

public class D2_GenericMethod
{
    public static void main(String[] args)
    {
        Monitor monitor = new Monitor(0, 20);
        Axe axe = new Axe(1, 1.5);

        List<Product> products = new MyArrayList<>("Product");
        List<Monitor> monitors = new MyArrayList<>("Monitor");

        products.add(monitor);
        monitors.add(monitor);

        products.add(axe);

        find(products, monitor);
        find(products, axe);

        find(monitors, monitor);
        find(monitors, axe); // weird isn't it?
    }

    private static Product find(List<? extends Product> products, Product p)
    {
        printMethodName("find(" + getActualType(products) +", " + getActualType(p) + ")");

        return null;
    }

    private static String getActualType(Object o)
    {
        if (o instanceof MyArrayList)
        {
            return ((MyArrayList) o).getActualTypeAsString();
        }

        return o.getClass().getSimpleName();
    }

    private static void printMethodName(String methodName)
    {
        System.out.println();
        System.out.println(methodName + " ============================");
        System.out.println();
    }

}
