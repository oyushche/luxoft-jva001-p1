package com.luxoft.jva001p1.inners.java8;

public class AnonymousPrinter
{
    public static void main(String[] args)
    {
        print("Hello", 3);
    }

    public static void print(String data, int times)
    {
        for (int i = 0; i < times; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    System.out.println(data);
                }
            }).start();
        }
    }
}
