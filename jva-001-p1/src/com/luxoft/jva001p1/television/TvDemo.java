package com.luxoft.jva001p1.television;

public class TvDemo
{
    public static void main(String[] args)
    {
        TV tv = new TV();

        Remote remote = new Remote();
        remote.setTv(tv);

        System.out.println("--> Tv should be turned off by default.");
        System.out.println("Is tv on: " + tv.isTurnedOn());
        System.out.println();

        System.out.println("Let't turn tv on");
        remote.tvOn();
        System.out.println("Is tv on : " + tv.isTurnedOn());

        if (tv.isTurnedOn()) {
            System.out.println("Active channel: " + tv.getChannel());
        }
        System.out.println();

        int channel = 5;
        System.out.println("Switch to channel: " + channel);
        remote.switchChannel(channel);
        System.out.println("Active channel: " + tv.getChannel());
        System.out.println();

        System.out.println("Click next channel");
        remote.nextChannel();
        System.out.println("Active channel: " + tv.getChannel());
        System.out.println();

        channel = 1;
        System.out.println("Switch to channel: " + 1);
        remote.switchChannel(channel);
        System.out.println("Active channel: " + tv.getChannel());
        System.out.println();

        System.out.println("Click prev channel");
        remote.prevChannel();
        System.out.println("--> Active channel should be: " + tv.getCountOfChannels());
        System.out.println("Active channel: " + tv.getChannel());
        System.out.println();

        System.out.println("Now I will, turn tv off and go to sleep.");
        remote.tvOff();
        System.out.println("Is tv on: " + tv.isTurnedOn());
        System.out.println();

        System.out.println("--> One more cool thing.");
        System.out.println("Let's click next button when tv turned off.");
        remote.nextChannel();

        System.out.println("Is tv on : " + tv.isTurnedOn());

        if (tv.isTurnedOn()) {
            System.out.println("Active channel: " + tv.getChannel());
        }
        System.out.println();

        System.out.println("Ohh, parents coming...");
        remote.tvOff();
        System.out.println("Is tv on : " + tv.isTurnedOn());
    }
}
