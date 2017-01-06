package com.luxoft.jva001p1.basics.part3;

import java.util.Arrays;

public class E1_ArrayReadWrite
{
    public static void main(String[] args)
    {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(numbers));

        System.out.println();
        System.out.println("Let's get some elements.");
        System.out.println();

        int num = numbers[3];
        System.out.println("elem at 3 --> " + num);

        num = numbers[7];
        System.out.println("elem at 7 --> " + num);

//        Thread.sleep(100); // just for clear output, ignore this for now
//        num = numbers[23]; // will throw runtime exception
//        System.out.println("elem at 23 --> " + num);

        System.out.println();
        System.out.println("Now let's replace some elements.");
        System.out.println();

        numbers[0] = 100;
        numbers[6] = 600;

        System.out.println(Arrays.toString(numbers));
    }
}
