package com.luxoft.jva001p1.mess.objects;

import com.luxoft.jva001p1.mess.Drawable;

import java.awt.Color;
import java.awt.Graphics;

public class Rect implements Drawable
{
    public Rect()
    {
    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(50, 300, 40, 40);
    }
}
