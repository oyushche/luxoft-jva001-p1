package com.luxoft.jva001p1.television.buttons;

import com.luxoft.jva001p1.television.Remote;

public class ChannelButton extends AbstractButton
{
    private int channel;

    public ChannelButton(Remote remote, int channel)
    {
        super(remote);
        this.channel = channel;
    }

    @Override
    public void click()
    {
        getTv().switchChannel(channel);
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
