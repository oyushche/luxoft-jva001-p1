package com.luxoft.jva001p1.basics.part3.xtasks;

import java.util.Arrays;

public class T7_Find
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = {0, 1, 100, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numbers));
        System.out.println();


        int result1 = find1(numbers, 100);
        System.out.println(result1);

        int result2 = find2(numbers, 100);
        System.out.println(result2);
    }

    /**
     *
     * Method should return index of found value or -1 if not found.
     *
     */
    public static int find1(int[] data, int value)
    {
        // TODO YOUR CODE HERE
        return -1;
    }

    /**
     *
     * Method should return count of found values.
     *
     */
    public static int find2(int[] data, int value)
    {
        // TODO YOUR CODE HERE
        return -1;
    }

}
