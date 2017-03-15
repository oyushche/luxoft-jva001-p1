package com.luxoft.jva001p1.oop.xtasks;

public class T1_Enums
{
    public static enum DogSize
    {
        SMALL(15, "Yip"), MIDDLE(30, "Gav"), BIG(60, "Woff");
        public int size;
        public String sound;

        DogSize(int size, String sound)
        {
            this.size = size;
            this.sound = sound;
        }
    }

    public static class Dog
    {
        String name;
        DogSize dogSize = DogSize.MIDDLE;

        String getBarkSound()
        {
            return dogSize.sound;
        }

        public Dog(String name, DogSize dogSize)
        {
            this.name = name;
            this.dogSize = dogSize;
        }
    }

    static void printDogSizes()
    {
        for (DogSize dogSize : DogSize.values())
        {
            System.out.println("dog size name = " + dogSize.name());
            System.out.println("effective size = " + dogSize.size);
        }
    }

    public static void main(String[] args)
    {
        printDogSizes();
    }
}
