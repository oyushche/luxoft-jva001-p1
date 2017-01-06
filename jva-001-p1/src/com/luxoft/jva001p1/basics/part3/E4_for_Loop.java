package com.luxoft.jva001p1.basics.part3;

public class E4_for_Loop
{
    public static void main(String[] args)
    {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < numbers.length; i++)
        {
            int n = numbers[i];
            System.out.println(n);
        }        
    }
}
