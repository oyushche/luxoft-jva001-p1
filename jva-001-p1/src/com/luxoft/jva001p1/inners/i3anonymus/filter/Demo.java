package com.luxoft.jva001p1.inners.i3anonymus.filter;

/**
 * Created by oyushche on 10/12/17.
 */
public class Demo
{

    public static void main(String[] args)
    {
        String[] names = {"Alexey", "Aleg", "Sergey", "Maxim"};

        printFiltered(names, s -> s.startsWith("S"));
    }

    public static void printFiltered(String[] data, Filter filter)
    {
        for (String s : data)
        {
            if (filter.filter(s))
            {
                System.out.println(s);
            }
        }
    }
}
