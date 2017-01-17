package com.luxoft.jva001p1.oop.xtasks;

public class T0_CommandLineParams
{
    public static void main(String[] args)
    {
        String name = "I";

        if (args.length > 0)
        {
            name = args[0];
        }

        System.out.println(name + " Rule!");
        System.out.println("The World");
    }
}
