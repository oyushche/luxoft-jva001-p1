package com.luxoft.jva001p1.inners.java8;

public class LambdaDemo
{
    interface Flyer
    {
        void fly();
    }

    public void throwOutFromThePlane(Flyer flyer)
    {
        flyer.fly();
    }

    public static void main(String[] args)
    {
        LambdaDemo demo = new LambdaDemo();

        demo.throwOutFromThePlane(
                () -> System.out.println("I'm a Superman, uaaau!!!"));

        demo.throwOutFromThePlane(
                () -> System.out.println("Please don't, aaaaaaaaa"));
    }

}
