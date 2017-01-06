package com.luxoft.jva001p1.basics.part2.ifstmt;

public class E3_else_if_Statement
{
    public static void main(String[] args)
    {
        int a = 9;
        System.out.println("set a to: " + a);

        if (a > 8)
        {
            System.out.println("--> if a > 8");
            a += 3;
        }
        else if (a > 3)
        {
            System.out.println("--> if a > 3");
            a += 2;
        }
        else
        {
            System.out.println("--> else");
            a += 1;
        }

        System.out.println(a);

        a = 9;
        System.out.println();
        System.out.println("set a to: " + a);

        if (a > 8)
        {
            System.out.println("--> if a > 8");
            a += 3;
        }

        if (a > 3)
        {
            System.out.println("--> if a > 3");
            a += 2;
        }

        System.out.println(a);
    }
}
