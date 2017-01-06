package com.luxoft.jva001p1.basics.part1.xtasks;

public class T0_Split
{
    public static void main(String[] args)
    {
        double randomNumber = 343.36;

        String str = "" + randomNumber;

        int dotIndex = str.indexOf(".");

        System.out.println("whole: " + str.substring(0, dotIndex));
        System.out.println("fract: " + str.substring(dotIndex + 1));
    }
}
