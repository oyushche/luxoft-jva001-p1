package com.luxoft.jva001p1.exceptions;

public class ExceptionsDemo
{
    public static void main(String[] args)
    {
        try
        {
            throwOurException(true);
        }
        finally
        {
            System.out.println("Finally");
        }

        System.out.println("EOP");
    }

    static void throwOurException(boolean throwException)
    {
        System.out.println("#throwOurException");

        MyPersonalException exception = new MyPersonalException("8889");

        if (throwException)
        {
            throw exception;
        }
    }

    static class MyPersonalException extends RuntimeException
    {
        private String data;

        public MyPersonalException(String data)
        {
            this.data = data;
        }

        public String getData()
        {
            return data;
        }
    }
}
