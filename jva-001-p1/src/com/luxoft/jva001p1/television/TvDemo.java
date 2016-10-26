package com.luxoft.jva001p1.television;

public class TvDemo
{
    public static void main(String[] args)
    {
        TV tv = new TV();

        Remote remote = new Remote();


        remote.getNextChannel().click();

        remote.getChannels()[3].click();

        remote.getRedBtn().click();
        remote.getRedBtn().click();
    }
}
