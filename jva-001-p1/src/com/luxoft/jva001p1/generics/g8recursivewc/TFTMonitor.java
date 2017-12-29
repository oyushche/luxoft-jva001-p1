package com.luxoft.jva001p1.generics.g8recursivewc;

public class TFTMonitor<T> extends Monitor<T>
{
    private Integer number = 23;

    @Override
    public int subCompare(Monitor o)
    {
        System.out.println("TFTMonitor#subCompare called");
        System.out.println("DO TFT SPECIFIC");
        return this.number.compareTo(((TFTMonitor) o).getNumber());
    }

    public Integer getNumber()
    {
        return number;
    }


}
