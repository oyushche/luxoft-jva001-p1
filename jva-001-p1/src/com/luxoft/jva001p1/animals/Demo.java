package com.luxoft.jva001p1.animals;

public class Demo
{
    public static void main(String[] args)
    {
        AbstractAnimal[] animals = new AbstractAnimal[3];

        Dog dog = new Dog();
        dog.setName("Jack");
        animals[0] = dog;

        Cat cat = new Cat();
        cat.setName("Tom");
        animals[1] = cat;

        Wolf wolf = new Wolf();
        animals[2] = wolf;

        listenAnimals(animals);

        printAnimalInfo(animals);
    }

    private static void listenAnimals(AbstractAnimal[] animals)
    {
        System.out.println();
        System.out.println("--> listening to animals");
        System.out.println();

        for (AbstractAnimal animal : animals)
        {
            animal.voice();
        }
    }

    private static void printAnimalInfo(AbstractAnimal[] animals)
    {
        System.out.println();
        System.out.println("--> print animal info");
        System.out.println();

        for (AbstractAnimal animal : animals)
        {
            if (animal instanceof Pet)
            {
                Pet pet = (Pet) animal;
                System.out.println(pet.getName() + " " + pet.getClass().getSimpleName()
                        + " from " + pet.getAddress() + ".");
            }
            else
            {
                System.out.println();
                animal.voice();
                System.out.println("Aaaaaa, this "
                        + animal.getClass().getSimpleName() + " bitten my right leg.");
            }
        }
    }

}
