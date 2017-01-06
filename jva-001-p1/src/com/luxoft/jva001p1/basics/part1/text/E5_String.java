package com.luxoft.jva001p1.basics.part1.text;

public class E5_String
{
    public static void main(String[] args)
    {
        System.out.println("String is an object and you should use operator new to create it.");
        String oleg = new String("Oleg");

        System.out.println("0: " + oleg);

        oleg += "!";

        System.out.println("1: " + oleg);

        System.out.println();
        System.out.println("Also String is a special case of object in Java" +
                " and you can create it with special simplified syntax.");
        String irina = "Irina";

        System.out.println("2: " + irina);
    }
}
