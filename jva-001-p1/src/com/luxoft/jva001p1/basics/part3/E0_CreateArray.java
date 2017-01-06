package com.luxoft.jva001p1.basics.part3;

import java.util.Arrays;

public class E0_CreateArray
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        System.out.println("numbers" + Arrays.toString(numbers));

        double[] prices = new double[10];
        System.out.println("prices" + Arrays.toString(prices));

        int[] ints = new int[] {1, 2, 3};
        System.out.println("ints" + Arrays.toString(ints));

        int[] data = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("data" + Arrays.toString(data));
    }
}
