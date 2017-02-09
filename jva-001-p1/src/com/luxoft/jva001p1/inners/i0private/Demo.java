package com.luxoft.jva001p1.inners.i0private;

public class Demo
{
    public static void main(String[] args)
    {
        StringList list = new StringList();

        list.addString("a");
        list.addString("b");
        list.addString("c");

        list.print();

        System.out.println("Inner class is not accessible here: " + list.getRoot());
    }
}
