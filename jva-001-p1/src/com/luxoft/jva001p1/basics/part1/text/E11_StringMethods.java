package com.luxoft.jva001p1.basics.part1.text;

public class E11_StringMethods
{
    public static void main(String[] args)
    {
        String str = "Programming is cool.";

        String substring = str.substring(3);

        System.out.println(substring);

        substring = str.substring(11, 14);

        System.out.println(substring);

        String replaced = str.replace("is", "-");
        System.out.println(replaced);
    }
}
