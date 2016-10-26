package com.luxoft.jva001p1.television.buttons;

import television.Remote;

public class ChannelButton extends Button
{
    private int channel;

    public ChannelButton(Remote remote, int channel)
    {
        super(remote);
        this.channel = channel;
    }

    public int getChannel()
    {
        return channel;
    }

    public void setChannel(int channel)
    {
        this.channel = channel;
    }
}
