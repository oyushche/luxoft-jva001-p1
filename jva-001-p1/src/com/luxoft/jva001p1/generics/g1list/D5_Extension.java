package com.luxoft.jva001p1.generics.g1list;

import java.util.ArrayList;
import java.util.List;

public class D5_Extension
{
    public static void main(String[] args)
    {
        List<Number> numbers = new ArrayList<>();

        numbers.add(new Long(34L));

//        List<com.luxoft.jva001p1.animals.Integer> ints = numbers; // will not compile
//
//        com.luxoft.jva001p1.animals.Integer i = ints.get(0);
    }
}
