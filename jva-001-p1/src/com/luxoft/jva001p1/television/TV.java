package com.luxoft.jva001p1.television;

public class TV
{
    private final int countOfChannels;

    private boolean isTurnedOn;
    private int channel;


    public TV()
    {
        this.countOfChannels = 9;
    }

    public boolean isTurnedOn()
    {
        return isTurnedOn;
    }

    public void turnOn()
    {
        this.channel = 1;
        isTurnedOn = true;
    }

    public void turnOff()
    {
        isTurnedOn = false;
    }

    public int getChannel()
    {
        return channel;
    }

    public void switchChannel(int channel)
    {
        this.channel = channel;
    }

    public int getCountOfChannels()
    {
        return countOfChannels;
    }
}
