package com.luxoft.jva001p1.inners.automation;

public class InnerDemo
{
    public static void main(String[] args)
    {
        Box box = new Box();

        box.add("Oleg");
        box.add("Tennis");
        box.add("Yacht");
        box.add("Zoo");

        Box.BoxIterator boxIterator = box.getBackIterator();

        while (true)
        {
            String s = boxIterator.next();

            if (s == null)
            {
                break;
            }
            System.out.println(s);
        }
    }
}
