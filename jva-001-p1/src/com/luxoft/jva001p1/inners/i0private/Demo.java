package com.luxoft.jva001p1.inners.i0private;

public class Demo
{
    public static void main(String[] args)
    {
        StringList first = new StringList();

        first.addString("a");
        first.addString("b");
        first.addString("c");

        first.print();

        System.out.println("Inner class is not accessible here: " + first.getRoot());
    }
}
