package com.luxoft.jva001p1.generics.g0nothing;

public class Demo
{
    public static void main(String[] args)
    {
        Basket<String> basket = new Basket<>();

        basket.set("Oleg");

        System.out.println(basket.get());

        Basket<Integer> numbers = new Basket<>();

        numbers.set(12);

        System.out.println(numbers.get());
    }
}

class Basket<T>
{
    private T o;

    public T get()
    {
        return o;
    }

    public void set(T o)
    {
        this.o = o;
    }

    public static <Z> Z oo(Z z)
    {
        return z;
    }
}

