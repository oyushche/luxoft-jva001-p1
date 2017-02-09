package com.luxoft.jva001p1.inners.i3anonymus;

public class Printer
{
    public static void main(String[] args)
    {
        print("Hello", 3);
    }

    public static void print(String data, int times)
    {
        final String fData = data;

        for (int i = 0; i < times; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    System.out.println(fData);
                }
            }).start();
        }
    }
}
