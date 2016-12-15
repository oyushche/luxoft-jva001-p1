package com.luxoft.jva001p1.television.buttons;


import com.luxoft.jva001p1.television.Remote;

public abstract class AbstractActionButton extends AbstractButton
{
    private Action action;

    public AbstractActionButton(Remote remote, Action action)
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
