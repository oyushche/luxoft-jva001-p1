package com.luxoft.jva001p1.generics.g1list;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;
import java.util.ArrayList;
import java.util.List;

public class D0_PrintProducts
{
    public static void main(String[] args)
    {
        long counter = 1;

        List<Product> products = new ArrayList<>();

        products.add(new Monitor(counter++, 20));
        products.add(new Monitor(counter++, 20));

        products.add(new Axe(counter++, 1.5));

        printPrices(products);
    }

    private static void printPrices(List<Product> products)
    {
        for (Product product : products)
        {
            System.out.print("Product: [uid: " + product.getUid() + ", price: " + product.getPrice());

            if (product instanceof Monitor)
            {
                System.out.print(", diagonal: " + ((Monitor) product).getDiagonal());
            }
            System.out.println("]");
        }
    }
}
