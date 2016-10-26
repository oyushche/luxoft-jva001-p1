package com.luxoft.jva001p1.mess;

import com.luxoft.jva001p1.mess.objects.Bricks;
import com.luxoft.jva001p1.mess.objects.Rect;
import com.luxoft.jva001p1.mess.objects.Swatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public class MessDisplay extends JPanel
{
    private Drawable[] objects = new Drawable[3];

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setLocation(200, 200);

        frame.getContentPane().add(new MessDisplay());
        frame.setVisible(true);
    }

    public MessDisplay() {

        objects = new Drawable[3];

        objects[0] = new Rect();
        objects[1] = new Bricks();
        objects[2] = new Swatter();
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        for (Drawable object : objects)
        {
            if (object != null)
            {
                object.draw(g);
            }
        }
    }
}
