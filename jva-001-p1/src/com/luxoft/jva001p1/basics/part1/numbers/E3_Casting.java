package com.luxoft.jva001p1.basics.part1.numbers;

public class E3_Casting
{
    public static void main(String[] args)
    {
        int i = 19;
        long l = 455L;

        l = i;
        i = (int) l;

        float f = 32.7f;
        double d = 34.9;

        l = i;
        d = f;

        f = i;
        f = l;

        d = i;
        d = l;

        i = (int) l;
        f = (float) d;

        i = (int) f;
        l = (long) f;

        i = (int) d;
        l = (long) d;

    }
}
