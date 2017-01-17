package com.luxoft.jva001p1.generics.g8recursivewc;

public class CompareDemo
{
    public static void main(String[] args)
    {
        Monitor m = new Monitor();
        LCDMonitor lcd = new LCDMonitor();

        m.compareTo(lcd);
    }
}
