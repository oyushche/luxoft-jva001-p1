package com.luxoft.jva001p1.television.buttons;

import com.luxoft.jva001p1.television.Remote;
import com.luxoft.jva001p1.television.TV;

public abstract class Button
{
    private Remote remote;

    public Button(Remote remote)
    {
        this.remote = remote;
    }

    public abstract void click();

    TV getTv()
    {
        return remote.getTv();
    }
}
