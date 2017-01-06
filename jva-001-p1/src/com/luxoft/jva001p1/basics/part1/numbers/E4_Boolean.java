package com.luxoft.jva001p1.basics.part1.numbers;

public class E4_Boolean
{
    public static void main(String[] args)
    {
        System.out.println("10 >  3: " + (10 > 3));
        System.out.println("10 >= 3: " + (10 >= 3));
        System.out.println("10 == 3: " + (10 == 3));

        System.out.println("10 <  3: " + (10 < 3));
        System.out.println("10 <= 3: " + (10 <= 3));
        System.out.println("10 != 3: " + (10 != 3));

        boolean isOdd = (9 % 2 == 0);
        System.out.println();
        System.out.println("9 is odd: " + isOdd);
    }
}
