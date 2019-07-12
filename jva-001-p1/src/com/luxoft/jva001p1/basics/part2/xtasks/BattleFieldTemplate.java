package com.luxoft.jva001p1.basics.part2.xtasks;

import javax.swing.*;
import java.awt.*;

public class BattleFieldTemplate extends JPanel
{
    int tankX = 0;
    int tankY = 0;

    /**
     * Write your code here.
     */
    void runTheGame()
    {
        System.out.println("Started");
        sleep(2000);

        moveForward();
        moveForward();
        moveForward();
        moveForward();
        moveForward();
        moveForward();

        // TODO fill free to add more tests here
    }

    /**
     * Should move the tank one quadrant right.
     *
     * Every quadrant has width of 64px;
     *
     * Use:
     *
     * repaint() to repaint the screen
     * sleep(millis) to sleep millis amount of milliseconds
     */
    void moveForward()
    {
    }

    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.

    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;

    public static void main(String[] args) throws Exception
    {
        BattleFieldTemplate bf = new BattleFieldTemplate();
        bf.runTheGame();
    }

    public BattleFieldTemplate() throws Exception
    {
        JFrame frame = new JFrame("MOVE TANK FORWARD");
        frame.setLocation(500, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH + 22, BF_HEIGHT + 22));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    void sleep(int millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {

        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        paintBF(g);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(tankX, tankY, 64, 64);
    }

    private void paintBF(Graphics g)
    {
        super.paintComponent(g);

        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++)
        {
            for (int h = 0; h < 9; h++)
            {
                if (i % 2 == 0)
                {
                    cc = new Color(252, 241, 177);
                }
                else
                {
                    cc = new Color(233, 243, 255);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }
    }

}
