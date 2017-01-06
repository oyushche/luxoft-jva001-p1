package com.luxoft.jva001p1.basics.part3;

import java.util.Arrays;

public class E5_ArrayOfStrings
{
    public static void main(String[] args)
    {
        String[] names = new String[10];
        System.out.println("0: names" + Arrays.toString(names));

        names[3] = "Anna";
        names[9] = "Max";
        System.out.println("\n1: names" + Arrays.toString(names));
    }
}
