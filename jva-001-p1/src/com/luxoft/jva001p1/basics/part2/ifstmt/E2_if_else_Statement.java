package com.luxoft.jva001p1.basics.part2.ifstmt;

public class E2_if_else_Statement
{
    public static void main(String[] args)
    {
        int a = 9;

        if (a % 2 == 0)
        {
            a *= 2;
        }
        else
        {
            a /= 3;
        }

        System.out.println(a);
    }
}
