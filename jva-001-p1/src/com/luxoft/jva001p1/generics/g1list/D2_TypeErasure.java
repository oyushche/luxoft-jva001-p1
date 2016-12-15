package com.luxoft.jva001p1.generics.g1list;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class D2_TypeErasure<E>
{
    public <E> void test(Collection<E> data)
    {
        System.out.println("D2_TypeErasure#test(Collection<E>)");

        for (E e : data)
        {
            System.out.println(e);
        }
    }

    public void test(List<String> data)
    {
        System.out.println("D2_TypeErasure#test(List<String>)");

        for (String s : data)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args)
    {
        D2_TypeErasure o = new D2_TypeErasure();

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        o.test(numbers);
    }
}

