package com.luxoft.jva001p1.generics.g6methods;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E>
{
    private final String className;

    public MyArrayList(String className)
    {
        super();
        this.className = className;
    }

    public String getActualTypeAsString()
    {
        return "ArrayList<" + className + ">";
    }

}
