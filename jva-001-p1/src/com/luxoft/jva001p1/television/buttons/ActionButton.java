package com.luxoft.jva001p1.television.buttons;

import television.Remote;

public class ActionButton extends Button
{
    private Action action;

    public ActionButton(Remote remote, Action action)
    {
        super(remote);
        this.action = action;
    }

    public Action getAction()
    {
        return action;
    }

    public void setAction(Action action)
    {
        this.action = action;
    }
}
