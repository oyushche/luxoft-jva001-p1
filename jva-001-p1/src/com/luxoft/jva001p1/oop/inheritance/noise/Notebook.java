package com.luxoft.jva001p1.oop.inheritance.noise;

public class Notebook implements NoiseProducer
{
    @Override
    public void noise()
    {
        System.out.println("SHhhhhhhh");
    }
}
