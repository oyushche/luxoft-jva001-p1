package com.luxoft.jva001p1.mess.objects;

import com.luxoft.jva001p1.mess.Drawable;

import java.awt.*;

/**
 * Created by oyushche on 10/26/16.
 */
public class Circle implements Drawable
{
    @Override
    public void draw(Graphics graphics)
    {
        graphics.setColor(Color.BLUE);
        graphics.drawOval(300, 300, 50, 50);
    }
}
