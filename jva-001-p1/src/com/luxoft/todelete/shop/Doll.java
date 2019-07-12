package com.luxoft.todelete.shop;

public class Doll extends Product
{
    private boolean canSing;
    private String color;

    void voice()
    {
        if (canSing)
        {
            System.out.println("la la la");
        }
    }

    public boolean isCanSing()
    {
        return canSing;
    }

    public void setCanSing(boolean canSing)
    {
        this.canSing = canSing;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
