package com.luxoft.jva001p1.oop.inheritance.p2animals;

public class Demo
{
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[3];

        Dog dog = new Dog();
        dog.setName("Jack");
        animals[0] = dog;

        printObject(dog);

        Cat cat = new Cat();
        cat.setName("Tom");
        animals[1] = cat;

        printObject(cat);

        Wolf wolf = new Wolf();
        animals[2] = wolf;

        listenAnimals(animals);

        lookAtAnimals(animals);

    }

    static void printObject(Object o)
    {
        System.out.println(o.toString());
    }

    static void listenAnimals(Animal[] animals)
    {
        System.out.println();
        System.out.println("--> listening to animals");
        System.out.println();

        for (Animal animal : animals)
        {
            animal.makeNoise();
        }
    }

    static void lookAtAnimals(Animal[] animals)
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
