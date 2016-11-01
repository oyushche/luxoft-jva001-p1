package com.luxoft.jva001p1.inners.i2static;

public class Demo
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("You can create instance of StringList.Node directly without the instance of StringList.");

        StringList.Node node = new StringList.Node("static node");
        System.out.println(node + " : " + node.getString());
    }
}
