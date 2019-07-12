package com.luxoft.jva001p1.oop.inheritance.p1animals;

public class Demo
{
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[2];

        Dog dog = new Dog();
        animals[0] = dog;

        Cat cat = new SuperCat();
        animals[1] = cat;

//        Wolf wolf = new Wolf();
//        animals[2] = wolf;
//
//        SuperCat superCat = new SuperCat();
//        animals[3] = superCat;
//
        listenAnimals(animals);
//
//        lookAtAnimals(animals);
    }

    private static void listenAnimals(Animal[] animals)
    {
        System.out.println();
        System.out.println("--> listening to animals");
        System.out.println();

        for (Animal animal : animals)
        {
            animal.makeNoise();
        }
    }

    private static void lookAtAnimals(Animal[] animals)
    {
        System.out.println();
        System.out.println("--> looking at animals");
        System.out.println();

        for (Animal animal : animals)
        {
            animal.sleep();
        }
    }

}
