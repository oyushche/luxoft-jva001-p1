package com.luxoft.jva001p1.oop.enums;

public enum Suit
{
    DIAMOND(true), HEART(true), CLUB(false), SPADE(false);

    private boolean red;

    Suit(boolean red)
    {
        this.red = red;
    }

    public boolean isRed()
    {
        return red;
    }

    @Override
    public String toString()
    {
        return name() + (red ? ":red" : ":black");
    }
}
