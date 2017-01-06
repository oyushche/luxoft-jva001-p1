package com.luxoft.jva001p1.basics.part3.xtasks;

import java.util.Arrays;

public class T0_Swap
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        swap(numbers, 1, 4);
        swap(numbers, 2, 7);
        System.out.println(Arrays.toString(numbers));
    }

    /**
     *
     * Method should exchange values with idx1 and idx2 in data array.
     *
     */
    public static void swap(int[] data, int idx1, int idx2)
    {
        // TODO YOUR CODE HERE
    }
}
