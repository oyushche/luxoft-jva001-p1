package com.luxoft.jva001p1.basics.part1.numbers;

public class Tests
{
    public static void main(String[] args)
    {
        appendNiceSuffix("Irina");
        appendNiceSuffix("Vitalik");
        appendNiceSuffix("Elena");

        nicePrint(appendNiceSuffix("I'm"));
    }

    public static String appendNiceSuffix(String name)
    {
        return name + " so, so, so good!!!";
    }

    private static void nicePrint(String str)
    {
        System.out.println("++++++");
        System.out.println(str);
        System.out.println();
    }
}
