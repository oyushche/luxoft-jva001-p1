package com.luxoft.jva001p1.basics.part2.loops;

public class E6_Loops_Continue
{
    public static void main(String[] args)
    {
        int counter = 1;
        int totalCycles = 10;

        while (counter < totalCycles)
        {
            counter++;

            if (counter % 3 == 0)
            {
                continue;
            }

            System.out.println(counter);
        }
    }
}
