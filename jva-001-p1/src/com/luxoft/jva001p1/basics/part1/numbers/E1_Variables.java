package com.luxoft.jva001p1.basics.part1.numbers;

public class E1_Variables
{

    public static void main(String[] args)
    {
        // Java TYPEs you already knew:
        // 1. int
        //
        // [ TYPE ] < nameCamelCase > [ = ] < expression that returns TYPE at the end of calculation > [ ; ]

        int    countOfSeconds = 90;

        int countOfHoursInOneWeek = 24 * 7;

        int randomExpressionExample = 9 * 34 - 14 * (43 + 90) / 80 % 3;

        System.out.println("--> " + countOfHoursInOneWeek + " " + randomExpressionExample);

        // -----

        int secondsInMinute = 60;

        int tenMinutes = 10 * secondsInMinute;

        int minutesInHour = 60;
        int hourInDay = 24;
        int daysInWeek = 7;

        int secondsIn9Weeks = secondsInMinute * minutesInHour * hourInDay * daysInWeek * 9;

        System.out.println( secondsIn9Weeks );

        System.out.println( secondsInMinute * minutesInHour * hourInDay * daysInWeek * 9 );
    }
}
