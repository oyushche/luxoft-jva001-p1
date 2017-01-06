package com.luxoft.jva001p1.basics.part3;

import java.util.Arrays;

public class E6_MultidArray
{
    public static void main(String[] args)
    {
        int[][] data = new int[10][];
        System.out.println("0:data" + Arrays.toString(data));

        data[0] = new int[] {1, 2, 3};
        System.out.println("\n1:data" + Arrays.deepToString(data));

        data[1] = new int[] {1, 2};
        System.out.println("\n2:data" + Arrays.deepToString(data));

        int[] numbers = data[0];
        System.out.println("\ndata[0] --> " + Arrays.toString(numbers));

        int number = data[0][1];
        System.out.println("\ndata[0][1] --> " + number);

        System.out.println("\ndata[3] --> " + data[3]);

        data[1][0] = 1000;
        System.out.println("\ndata[1][0] --> " + data[1][0]);
    }
}
