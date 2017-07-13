package com.luxoft.jva001p1.basics.part3;

import java.util.Arrays;

public class E2_ArrayParameter
{
    public static void main(String[] args)
    {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        setValue(numbers, 3, 300);
        setValue(numbers, 7, 777);

        System.out.println(Arrays.toString(numbers));
    }

    public static void setValue(int[] data, int idx, int value)
    {
        data[idx] = value;
    }
}
