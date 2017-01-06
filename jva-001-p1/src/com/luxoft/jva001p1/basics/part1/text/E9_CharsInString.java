package com.luxoft.jva001p1.basics.part1.text;

public class E9_CharsInString
{
    public static void main(String[] args)
    {
        String galaxy = "Milky Way";

        char ch = galaxy.charAt(0);
        System.out.println("charAt(0): " + ch);

        System.out.println("charAt(4): " + galaxy.charAt(4));

        int idx = galaxy.indexOf('k');
        System.out.println("indexOf('k'): " + idx);

        System.out.println("indexOf('y'): " + galaxy.indexOf('y'));
        System.out.println("indexOf('y', 5): " + galaxy.indexOf('y', 5));

        galaxy.indexOf('y');
        galaxy.indexOf('y', 5);
    }
}
