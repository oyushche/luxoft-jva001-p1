package com.luxoft.jva001p1.inners.i3anonymus.filter;

public class AFilter implements Filter
{
    @Override
    public boolean filter(String s)
    {
        return s.startsWith("A");
    }
}
