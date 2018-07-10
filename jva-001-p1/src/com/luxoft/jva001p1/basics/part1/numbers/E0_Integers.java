package com.luxoft.jva001p1.basics.part1.numbers;

public class E0_Integers
{
    public static void main(String[] args)
    {
        // comments in Java start with double slash at the start of the line

        // --------------
        // your code here between { }

        // commands, separated with semicolon ( ; )
        //
        // commands will be executed one-after-another
        // top -> bottom (right -> left if > 1 commands on a line)

        // try to do basic math here with integer numbers

        System.out.println( 10 + 2 * 5 - 9 );

        System.out.println();
        System.out.println( 10 / 3 );
        System.out.println( 10 % 4 );

        System.out.println();
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println();
        System.out.println(Integer.MIN_VALUE - 1);

        System.out.println();
        System.out.println("Max + 1: " + (Integer.MAX_VALUE + 1));
    }
}
