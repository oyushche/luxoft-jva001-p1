package com.luxoft.jva001p1.basics.part2.methods;

public class E0_Methods
{
    public static void main(String[] args)
    {
        printSum(23, 5);

        int sum = sum(10, 8);
        System.out.println(sum);

        sum = sum(10, 8, 1);
        System.out.println(sum);

        sum = sum(sum(1, sum(1, 3)), 3);
        System.out.println(sum);
    }

    public static void printSum(int a, int b)
    {
        System.out.println(a + b);
    }

    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }
}
