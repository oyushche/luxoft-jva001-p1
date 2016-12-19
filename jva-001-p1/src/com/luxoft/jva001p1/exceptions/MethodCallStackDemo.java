package com.luxoft.jva001p1.exceptions;

public class MethodCallStackDemo
{
    public static void main(String[] args)
    {
        methodA();
    }

    public static void methodA()
    {
        methodB();
    }

    public static void methodB()
    {
        methodC();
    }

    public static void methodC()
    {
        System.out.println(1 / 0); // this line triggers an ArithmeticException
    }
}
