package com.luxoft.jva001p1.inners.i1public;

public class Demo
{
    public static void main(String[] args)
    {
        StringList list = new StringList();

        list.addString("a");
        list.addString("b");
        list.addString("c");

        System.out.println("StringList.Iterator class accessible here and we can use it to iterate list.");
        StringList.Iterator iterator = list.getIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.getNextString());
        }

        System.out.println();
        System.out.println("==========================");
        System.out.println();


        System.out.println("Also you can create instance of StringList.Iterator");
        System.out.println("But you should create new instance of StringList first...");
//        iterator = new StringList().new Iterator();
    }
}
