package com.luxoft.jva001p1.inners.i2static;

public class Demo
{
    public static void main(String[] args)
    {
        StringList list = new StringList();

        list.addString("a");
        list.addString("b");
        list.addString("c");

        System.out.println();
        System.out.println("You can get instance of StringList.Node and iterate list yourself");

        StringList.Node listNode = list.getRoot();

        do
        {
            System.out.println(listNode.getNext().getString());
            listNode = listNode.getNext();
        }
        while (listNode.getNext() != null);


        System.out.println();
        System.out.println("Also you can create instance of StringList.Node without the instance of StringList.");
        System.out.println("But it is not a good idea... in this case you better create separate class.");

        StringList.Node node = new StringList.Node("static node");
        System.out.println(node + " : " + node.getString());
    }
}
