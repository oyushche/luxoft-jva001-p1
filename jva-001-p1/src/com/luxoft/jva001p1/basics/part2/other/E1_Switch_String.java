package com.luxoft.jva001p1.basics.part2.other;

public class E1_Switch_String
{
    public static void main(String[] args)
    {
        String dayOfWeek = "Thu";

        switch (dayOfWeek)
        {
            case "Mon":
                System.out.println("Monday"); break;
            case "Tue":
                System.out.println("Tuesday"); break;
            case "Wed":
                System.out.println("Wednesday"); break;
            case "Thu":
                System.out.println("Thursday"); break;
            case "Fri":
                System.out.println("Friday"); break;
            case "Sat":
                System.out.println("Saturday"); break;
            case "Sun":
                System.out.println("Sunday"); break;
            default:
                System.out.println("Invalid day.");
        }
    }
}
