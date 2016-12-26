package com.luxoft.jva001p1.p0numbers;

public class T1_Integers
{
    public static void main(String[] args)
    {
        // Returns the difference, measured in milliseconds, between
        // the current time and midnight, January 1, 1970 UTC.
        long millis = System.currentTimeMillis();

        System.out.println(millis);

        long hours;
        long remMinutes;
        long remSeconds;
        long remMillis = millis % 1000;

        System.out.println();
        System.out.println(remMillis);

        System.out.printf("Number $%,.2f", 2334.2);
    }
}
