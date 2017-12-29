package com.luxoft.jva001p1.generics.g8recursivewc;

public class CompareDemo
{
    public static void main(String[] args)
    {
        Monitor<Monitor> m = new Monitor<>();
        LCDMonitor<Monitor> lcd1 = new LCDMonitor<>();
        TFTMonitor<Monitor> tft1 = new TFTMonitor<>();
        TFTMonitor<TFTMonitor> tft2 = new TFTMonitor<>();

//        tft1.compareTo(tft2);

        lcd1.compareTo(m);

//        LCDMonitor lcd2 = new LCDMonitor();
//
//        lcd1.compareTo(lcd2);

        m.compareTo(lcd1);


//        Axe a = new Axe();
//        lcd1.compareTo(a);
    }
}
