package com.luxoft.jva001p1.oop.storage;

public class Bird
{
    private String type;
    private int count;

    public Bird()
    {
    }

    public Bird(String type, int count)
    {
        this.type = type;
        this.count = count;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    @Override
    public String toString()
    {
        return "[" + type + ":" + count + "]";
    }
}
