package com.luxoft.jva001p1.oop.dogs;

public class DogsDemo
{
    public static void main(String[] args)
    {
        Dog[] dogs = createRandomDogs();

        printDogs(dogs);

        System.out.println("END");

    }

    private static Dog[] createRandomDogs()
    {
        Dog[] dogs = new Dog[10];

        Dog dog1 = new Dog();
        dog1.name = "Rex";
        dog1.age = 13;

        Address a1 = new Address();
        a1.country = "Ukraine";
        a1.city = "Kiev";
        a1.house = 23;

        dog1.address = a1;

        dog1.toys = new Toy[3];
        dog1.toys[0] = createToy("Bone");
        dog1.toys[1] = createToy("Blue-Ball");
        dog1.toys[2] = createToy("Red-Ball");


        Dog dog2 = new Dog();
        dog2.name = "Boxy";
        dog2.age = 17;

        Address a2 = new Address();
        a2.country = "Russia";
        a2.city = "Moscow";
        a2.house = 23;

        dog2.address = a2;

        dog2.toys = new Toy[2];
        dog2.toys[0] = createToy("Bone");
        dog2.toys[1] = createToy("Ball");

        dogs[0] = dog1;
        dogs[1] = dog2;

        return dogs;
    }

    private static Toy createToy(String name)
    {
        Toy toy = new Toy();

        toy.name = name;
        toy.picture = name + ".jpg";

        return toy;
    }

    private static void printDogs(Dog[] dogs)
    {
        for (Dog d : dogs)
        {
            if (d == null)
            {
                break;
            }

            System.out.print("My name is: " + d.name
                    + ", I'm " + d.age + " years old!");

            System.out.println(" I'm from: " + d.address.country + ", "
                    + d.address.city + " " + d.address.house);


            printToys(d);
        }
    }

    private static void printToys(Dog d)
    {
        if (d.toys == null)
        {
            return;
        }

        System.out.println();
        System.out.println("---- My toys ----");

        for (Toy toy : d.toys)
        {
            if (toy == null)
            {
                break;
            }
            System.out.println(toy.name);
        }
        System.out.println();
    }
}
