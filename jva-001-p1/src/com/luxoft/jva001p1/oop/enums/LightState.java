package com.luxoft.jva001p1.oop.enums;

public enum LightState
{
    RED, YELLOW, GREEN;

    public static void main(String[] args)
    {
//        System.out.println(LightState.RED);
//        System.out.println(LightState.YELLOW);
//        System.out.println(LightState.GREEN);

        LightState ls = LightState.RED;

        if (ls == LightState.GREEN)
        {

        }

        LightState.valueOf("GREEN");

        for (LightState value : LightState.values())
        {
            System.out.println(value);
        }
    }


}

