package com.luxoft.jva001p1.inners.i3anonymus.superman;

public class Demo
{
    public static void main(String[] args)
    {
        Flier[] fliers = new Flier[3];

        fliers[0] = new Superman();

        fliers[1] = new Flier()
        {
            public void fly()
            {
                System.out.println("Aaaaaaaaa...");
            }
        };

        fliers[2] = new Superman()
        {
            public void fly()
            {
                System.out.println("Ups....");
                kickAss();
            }

            private void kickAss()
            {
                System.out.println("Aaaaaaa...");
            }
        };

        for (Flier flier : fliers)
        {
            if (flier != null)
            {
                System.out.println(flier.getClass().getName());
                flier.fly();
            }
        }
    }
}
