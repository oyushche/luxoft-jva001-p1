package com.luxoft.jva001p1.generics.g8recursivewc;

public class LCDMonitor<T> extends Monitor<T>
{

    @Override
    public int subCompare(Monitor o)
    {
        System.out.println("LCDMonitor#subCompare called");
        return super.subCompare(o);
    }
}
