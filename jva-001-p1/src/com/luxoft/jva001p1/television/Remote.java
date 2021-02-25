package com.luxoft.jva001p1.television;


import com.luxoft.jva001p1.television.buttons.*;

public class Remote
{
    public static final int COUNT_OF_CHANNEL_BUTTONS = 9;

    private TV tv;

    private AbstractButton on;
    private AbstractButton off;
    private AbstractButton nextChannel;
    private AbstractButton prevChannel;
    private AbstractButton[] channels;

    public Remote()
    {
        on = new OnButton(this);
        off = new OffButton(this);
        nextChannel = new NextButton(this);
        prevChannel = new PrevButton(this);

        channels = new AbstractButton[COUNT_OF_CHANNEL_BUTTONS];
        createChannelButtons();
    }

    private void createChannelButtons()
    {
        for (int i = 0; i < COUNT_OF_CHANNEL_BUTTONS; i++)
        {
            channels[i] = new ChannelButton(this, i + 1);
        }
    }

    public void tvOn()
    {
        if (!getTv().isTurnedOn())
        {
            on.click();
        }
    }

    public void tvOff()
    {
        if (getTv().isTurnedOn())
        {
            off.click();
        }
    }

    public void nextChannel()
    {
        checkAndTurnOnTv();
        nextChannel.click();
    }

    private void checkAndTurnOnTv()
    {
        if (!tv.isTurnedOn()) {
            tvOn();
        }
    }

    public void prevChannel()
    {
        checkAndTurnOnTv();
        prevChannel.click();
    }

    public void switchChannel(int channel)
    {
        checkAndTurnOnTv();

        if (channel > 0 && channel <= getTv().getCountOfChannels())
        {
            channels[channel - 1].click();
        }
    }

    public TV getTv()
    {
        return tv;
    }

    public void setTv(TV tv)
    {
        this.tv = tv;
    }
}
