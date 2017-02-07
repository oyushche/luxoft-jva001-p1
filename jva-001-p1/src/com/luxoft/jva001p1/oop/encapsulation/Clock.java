package com.luxoft.jva001p1.oop.encapsulation;

public class Clock
{
    private String time;

    public Clock()
    {
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public static void main(String[] args)
    {
        Clock clock = new Clock();

        clock.setTime("12:30");

        String time = clock.getTime();
        System.out.println(time);
    }
}
