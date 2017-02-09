package com.luxoft.jva001p1.inners.i5animals;

import java.util.UUID;

public class Robot
{
    private String serialId;

    public Robot()
    {
        this.serialId = UUID.randomUUID().toString();
    }

    public String getSerialId()
    {
        return serialId;
    }
}
