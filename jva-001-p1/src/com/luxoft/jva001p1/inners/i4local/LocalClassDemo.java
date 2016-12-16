package com.luxoft.jva001p1.inners.i4local;

public class LocalClassDemo
{
    public static void main(String[] args)
    {
        LocalClassDemo demo = new LocalClassDemo();

        for (int i = 0; i < 10; i++)
        {
            demo.randomMethod(i);
        }
    }

    public void randomMethod(int i)
    {
        class Printer
        {
            String prefix = "Printer: ";

            public void print()
            {
                System.out.println(prefix + i);
            }
        }

        new Printer().print();
    }
}
