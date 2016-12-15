package com.luxoft.jva001p1.generics.g1list;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class D1_TypeErasure<T>
{
    public <E> void test(Collection<E> data)
    {
        System.out.println("D1_TypeErasure#test(Collection<E>)");

        for (E e : data)
        {
            System.out.println(e);
        }
    }

    public void test(List<String> data)
    {
        System.out.println("D1_TypeErasure#test(List<String>)");

        for (String s : data)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args)
    {
        D1_TypeErasure o = new D1_TypeErasure();

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        o.test(numbers);
    }
}

