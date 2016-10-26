package com.luxoft.jva001p1.mess.objects;

import com.luxoft.jva001p1.mess.Drawable;

import java.awt.*;

public class Bricks implements Drawable
{

    @Override
    public void draw(Graphics graphics)
    {
        graphics.setColor(Color.RED);
        graphics.fillRect(200, 200, 50, 20);

        graphics.setColor(Color.RED);
        graphics.fillRect(250, 200, 50, 20);

        graphics.setColor(Color.RED);
        graphics.fillRect(300, 200, 50, 20);

        Graphics2D g = (Graphics2D) graphics;
        g.setStroke(new BasicStroke(2));

        graphics.setColor(Color.BLACK);
        graphics.drawRect(200, 200, 50, 20);

        graphics.setColor(Color.BLACK);
        graphics.drawRect(250, 200, 50, 20);

        graphics.setColor(Color.BLACK);
        graphics.drawRect(300, 200, 50, 20);
    }
}
