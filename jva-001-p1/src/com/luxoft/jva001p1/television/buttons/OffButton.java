package com.luxoft.jva001p1.television.buttons;

import com.luxoft.jva001p1.television.Remote;

public class OffButton extends AbstractActionButton
{

    public OffButton(Remote remote)
    {
        super(remote, Action.OFF);
    }

    @Override
    public void click()
    {
        getTv().turnOff();
    }
}
