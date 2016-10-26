package com.luxoft.jva001p1.television.buttons;

import television.Remote;

public class Button
{
    private Remote remote;

    public Button(Remote remote)
    {
        this.remote = remote;
    }

    public void click()
    {
        throw new UnsupportedOperationException();
    }

    public Remote getRemote()
    {
        return remote;
    }
}
