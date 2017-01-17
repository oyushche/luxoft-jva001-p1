package com.luxoft.jva001p1.inners.i3anonymus;

public abstract class AbstractObject
{
    private String name;

    public AbstractObject(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public abstract void sayHello();


    public static void main(String[] args)
    {
        new AbstractObject("Oleg")
        {
            @Override
            public void sayHello()
            {
                System.out.println("Hello from: " +  getName());
            }
        }.sayHello();
    }
}
