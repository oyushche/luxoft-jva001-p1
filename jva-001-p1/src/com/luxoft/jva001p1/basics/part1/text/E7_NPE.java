package com.luxoft.jva001p1.basics.part1.text;

public class E7_NPE
{
    public static void main(String[] args)
    {
        String str = "abcdefg...";

        System.out.println("0: " + str);

        str = null;
        System.out.println("1: " + str.length());
    }
}
