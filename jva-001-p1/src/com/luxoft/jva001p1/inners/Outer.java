package com.luxoft.jva001p1.inners;

public class Outer
{
    private int data;

    class Inner
    {
        public int calculate()
        {
            return (data + data) * 2;
        }
    }

    public static void main(String[] args)
    {
        Inner instance = new Outer().new Inner();
    }
}
