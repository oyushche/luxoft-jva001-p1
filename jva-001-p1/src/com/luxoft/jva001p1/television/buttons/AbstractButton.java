package com.luxoft.jva001p1.television.buttons;

import com.luxoft.jva001p1.television.Clickable;
import com.luxoft.jva001p1.television.Remote;
import com.luxoft.jva001p1.television.TV;

public abstract class AbstractButton implements Clickable
{
    private Remote remote;

    public AbstractButton(Remote remote)
    {
        this.remote = remote;
    }

    TV getTv()
    {
        return remote.getTv();
    }
}
