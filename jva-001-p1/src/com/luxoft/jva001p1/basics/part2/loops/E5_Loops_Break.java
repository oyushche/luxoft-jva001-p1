package com.luxoft.jva001p1.basics.part2.loops;

public class E5_Loops_Break
{
    public static void main(String[] args)
    {
        int counter = 0;
        int totalCycles = 10;

        while (counter < totalCycles)
        {
            if (counter == 7)
            {
                break;
            }
            System.out.println(counter++);
        }
    }
}
