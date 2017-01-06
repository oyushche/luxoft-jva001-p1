package com.luxoft.jva001p1.basics.part2.xtasks;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.*;

public class T1_TanksGetQuadrant extends JPanel
{
    void runTheGame() throws Exception
    {
        callGetTankQuadrant(10, 10);
        callGetTankQuadrant(64 + 10, 64 + 10);
        callGetTankQuadrant(2 * 64 + 10, 2 * 64 + 10);
        callGetTankQuadrant(3 * 64 + 10, 3 * 64 + 10);
        callGetTankQuadrant(4 * 64 + 10, 4 * 64 + 10);
        callGetTankQuadrant(5 * 64 + 10, 5 * 64 + 10);
        callGetTankQuadrant(6 * 64 + 10, 6 * 64 + 10);
        callGetTankQuadrant(7 * 64 + 10, 7 * 64 + 10);
        callGetTankQuadrant(8 * 64 + 10, 8 * 64 + 10);

        // TODO fill free to add more tests here
        // use callGetTankQuadrant(x, y) helper method
    }

    /**
     * Should return name of the quadrant according to given coordinates.
     *
     * Result should be in format: horizontal_vertical. For expl: a_3, d_7
     *
     * Expect that x, y will be in range 0 - 575.
     */
    String getTankQuadrant(int x, int y)
    {
        // TODO YOUR CODE HERE
        return null;
    }

    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.

    final int BF_WIDTH = 576 + 20;
    final int BF_HEIGHT = 576 + 20;

    private List<String> valid = new ArrayList<>();
    private List<String> invalid = new ArrayList<>();

    public static void main(String[] args) throws Exception
    {
        T1_TanksGetQuadrant bf = new T1_TanksGetQuadrant();
        bf.runTheGame();
    }

    public T1_TanksGetQuadrant() throws Exception
    {
        JFrame frame = new JFrame("MOVE TANK FORWARD");
        frame.setLocation(500, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    void callGetTankQuadrant(int x, int y)
    {
        String toAdd = x + "_" + y;
        String res = getTankQuadrant(x, y);
        System.out.println("Your result is: " + res);

        if (isValid(res))
        {
            int resX = " ABCDEFGHI".indexOf(res.split("_")[0].toUpperCase());
            int resY = Integer.parseInt(res.split("_")[1]);

            int actualX = x / 64 + 1;
            int actualY = y / 64 + 1;

            if (resX == actualX && resY == actualY)
            {
                valid.add(toAdd);
            }
            else
            {
                invalid.add(toAdd);
            }
        }
        else
        {
            invalid.add(toAdd);
        }

        repaint();
    }

    private boolean isValid(String res)
    {
        boolean result = true;

        if (res == null || res.length() != 3 || res.charAt(1) != '_')
        {
            result = false;
        }

        if (result)
        {
            if (!"ABCDEFGHI".contains(res.split("_")[0].toUpperCase()))
            {
                result = false;
            }
        }

        if (result)
        {
            try
            {
                int y = Integer.parseInt(res.split("_")[1]);

                if (y < 1 || y > 9)
                {
                    result = false;
                }
            }
            catch (Exception e)
            {
                result = false;
            }
        }

        return result;
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

        g.setColor(Color.GREEN);

        for (String point : valid)
        {
            g.fillOval(Integer.parseInt(point.split("_")[0]) - 4, Integer.parseInt(point.split("_")[1]) - 4, 7, 7);
        }

        g.setColor(Color.RED);

        for (String point : invalid)
        {
            g.fillOval(Integer.parseInt(point.split("_")[0]) - 4, Integer.parseInt(point.split("_")[1]) - 4, 7, 7);
        }
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
                    cc = Color.BLACK;
                }
                else
                {
                    cc = Color.WHITE;
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }

        g.drawString("A", 25, 590);
        g.drawString("B", 64 + 25, 590);
        g.drawString("C", 2 * 64 + 25, 590);
        g.drawString("D", 3 * 64 + 25, 590);
        g.drawString("E", 4 * 64 + 25, 590);
        g.drawString("F", 5 * 64 + 25, 590);
        g.drawString("G", 6 * 64 + 25, 590);
        g.drawString("H", 7 * 64 + 25, 590);
        g.drawString("I", 8 * 64 + 25, 590);

        g.drawString("1", 583, 25);
        g.drawString("2", 583, 64 + 25);
        g.drawString("3", 583, 2 * 64 + 25);
        g.drawString("4", 583, 3 * 64 + 25);
        g.drawString("5", 583, 4 * 64 + 25);
        g.drawString("6", 583, 5 * 64 + 25);
        g.drawString("7", 583, 6 * 64 + 25);
        g.drawString("8", 583, 7 * 64 + 25);
        g.drawString("9", 583, 8 * 64 + 25);
    }

}