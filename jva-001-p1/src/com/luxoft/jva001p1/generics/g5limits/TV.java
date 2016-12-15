package com.luxoft.jva001p1.generics.g5limits;

import com.luxoft.jva001p1.generics.Monitor;

public class TV extends Monitor implements Comparable<TV>
{
    public TV(long uid, int diagonal)
    {
        super(uid, diagonal);
    }

    @Override
    public int compareTo(TV o)
    {
        if (this.getDiagonal() == o.getDiagonal())
        {
            return 0;
        }
        else if (this.getDiagonal() > o.getDiagonal())
        {
            return 1;
        }
        return -1;
    }
}
