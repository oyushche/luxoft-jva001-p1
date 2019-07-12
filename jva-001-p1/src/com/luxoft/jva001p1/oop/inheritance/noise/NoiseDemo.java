package com.luxoft.jva001p1.oop.inheritance.noise;

import java.util.ArrayList;
import java.util.List;

public class NoiseDemo
{
    public static void main(String[] args)
    {
        Saw saw = new Saw();
        makeNoise(saw);

        Notebook n = new Notebook();
        makeNoise(n);

        Traktor t = new Traktor();
        makeNoise(t);

        List<NoiseProducer> noiseProducers = new ArrayList<>();

        noiseProducers.add(saw);
        noiseProducers.add(t);
        noiseProducers.add(n);
    }

    static void makeNoise(NoiseProducer noiseProducer)
    {
        noiseProducer.noise();
    }

}
