package com.luxoft.jva001p1.oop.inheritance.p4animals;

public class Demo
{
    public static void main(String[] args)
    {
        Pet[] pets = new Pet[2];

        pets[0] = new Dog();
        pets[1] = new RoboDog();

        playWithPets(pets);
    }

    private static void playWithPets(Pet[] pets)
    {
        System.out.println();
        System.out.println("--> playing with pets");
        System.out.println();

        for (Pet pet : pets)
        {
            pet.play();
        }
    }
}
