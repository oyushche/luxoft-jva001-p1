package com.luxoft.jva001p1.television.buttons;

import com.luxoft.jva001p1.television.Remote;

public class OnButton extends AbstractActionButton
{
    public OnButton(Remote remote)
    {
        super(remote, Action.ON);
    }

    @Override
    public void click()
    {
        getTv().turnOn();
    }
}
