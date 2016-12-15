package com.luxoft.jva001p1.television.buttons;

import com.luxoft.jva001p1.television.Remote;

public class PrevButton extends AbstractActionButton
{
    public PrevButton(Remote remote)
    {
        super(remote, Action.PREV);
    }

    @Override
    public void click()
    {
        int activeChannel = getTv().getChannel();

        if (activeChannel > 2)
        {
            getTv().switchChannel(activeChannel - 1);
        }
        else if (activeChannel == 1)
        {
            getTv().switchChannel(getTv().getCountOfChannels());
        }
    }
}
