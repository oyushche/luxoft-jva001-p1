package com.luxoft.jva001p1.basics.part1.text;

public class E10_StringComparison
{
    public static void main(String[] args)
    {
        String kiev1 = "Kiev";
        String kiev2 = "Kiev";
        String newKiev = new String("Kiev");

        System.out.println("In case of objects you can compare 2 things");
        System.out.println();
        System.out.println("0: variables referencing the same object ( use == )");

        System.out.println("kiev1 == kiev2:   " + (kiev1 == kiev2));
        System.out.println("kiev1 == newKiev: " + (kiev1 == newKiev));

        System.out.println();
        System.out.println("1: variables referencing 2 different objects but equal" +
                " according to our comparison rules ( use .equals )");

        System.out.println("kiev1.equals(kiev2):   " + kiev1.equals(kiev2));
        System.out.println("kiev1.equals(newKiev): " + kiev1.equals(newKiev));
    }
}
