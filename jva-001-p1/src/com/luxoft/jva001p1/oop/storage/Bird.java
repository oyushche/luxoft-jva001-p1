package com.luxoft.jva001p1.oop.storage;

import java.util.Objects;

public class Bird implements Comparable<Bird>
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
    public int compareTo(Bird b)
    {
        return type.compareTo(b.type);
    }

    @Override
    public String toString()
    {
        return "[" + type + ":" + count + "]";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Bird bird = (Bird) o;
        return count == bird.count &&
                Objects.equals(type, bird.type);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(type, count);
    }
}
