package com.luxoft.jva001p1.inners.i1public;

public class Demo
{
    public static void main(String[] args)
    {
        StringList list = new StringList();

        list.addString("a");
        list.addString("b");
        list.addString("c");

        System.out.println("StringList.Node class accessible here and we can use it to iterate list.");
        StringList.Node currentNode = list.getRoot().getNext();

        while (currentNode != null)
        {
            System.out.println(currentNode.getString());
            currentNode = currentNode.getNext();
        }

        System.out.println();
        System.out.println("Also you can create instance of StringList.Node");
        System.out.println("But you should create new instance of StringList first...");
        StringList.Node node = new StringList().new Node("test");
        System.out.println(node);
    }
}
