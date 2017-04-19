package com.luxoft.jva001p1.generics.g7inout;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;
import com.luxoft.jva001p1.generics.g6methods.MyArrayList;

import java.util.List;

public class D0_InOut
{
    public static void main(String[] args)
    {
        Monitor monitor = new Monitor(0, 20);
        Axe axe = new Axe(1, 1.5);

        List<Product> products = new MyArrayList<>("Product");
        List<Monitor> monitors = new MyArrayList<>("Monitor");
        List<Axe> axes = new MyArrayList<>("Axes");

        monitors.add(monitor);
        axes.add(axe);

        copy(axes, products);
        copy(monitors, products);

        copy(products, products);

        copy(axes, monitors);  // weird isn't it?
        copy(products, axes);  // weird isn't it?
    }

    private static void copy(List<?> src, List<?> dest)
    {
        printMethodName("copy(" + getActualType(src) +", " + getActualType(dest) + ")");
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
