package com.luxoft.jva001p1.television.buttons;


import com.luxoft.jva001p1.television.Remote;
import com.luxoft.jva001p1.television.TV;

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

    TV getTv()
    {
        return remote.getTv();
    }
}
