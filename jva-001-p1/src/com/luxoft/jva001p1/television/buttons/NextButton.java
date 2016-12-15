package com.luxoft.jva001p1.television.buttons;

import com.luxoft.jva001p1.television.Remote;

public class NextButton extends AbstractActionButton
{
    public NextButton(Remote remote)
    {
        super(remote, Action.NEXT);
    }

    @Override
    public void click()
    {
        int countOfChannels = getTv().getCountOfChannels();
        int activeChannel = getTv().getChannel();

        if (activeChannel + 1 < countOfChannels)
        {
            getTv().switchChannel(activeChannel + 1);
        }
        else if (activeChannel + 1 == countOfChannels)
        {
            getTv().switchChannel(1);
        }
    }
}
