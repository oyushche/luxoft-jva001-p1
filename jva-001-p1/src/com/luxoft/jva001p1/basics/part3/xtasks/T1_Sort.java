package com.luxoft.jva001p1.basics.part3.xtasks;

import java.util.Arrays;

public class T1_Sort
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = {0, 3, 2, 1, 6, 8, 4, 7, 5, 9};

        System.out.println(Arrays.toString(numbers));
        System.out.println();

        sortAsc(numbers);

        int[] arrToCheck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Is numbers sorted: " + String.valueOf(Arrays.equals(arrToCheck, numbers)).toUpperCase());
    }

    /**
     *
     * Method should sort data array ascending order.
     *
     */
    public static void sortAsc(int[] data)
    {
        // TODO YOUR CODE HERE
    }


    /**
     *
     * Method should exchange values with idx1 and idx2 in data array.
     *
     */
    public static void swap(int[] data, int idx1, int idx2)
    {
        // TODO SHOULD BE ALREADY IMPLEMENTED
    }
}
