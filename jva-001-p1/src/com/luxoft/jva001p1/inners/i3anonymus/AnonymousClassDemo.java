package com.luxoft.jva001p1.inners.i3anonymus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassDemo
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        list.add("Oleg");
        list.add("Alex");
        list.add("Irina");

        Collections.sort(list, new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2)
            {
                return s1.compareTo(s2);
            }
        });

        System.out.println(Arrays.toString(list.toArray()));
    }
}
