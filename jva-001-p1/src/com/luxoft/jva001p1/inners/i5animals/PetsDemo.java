package com.luxoft.jva001p1.inners.i5animals;

import java.util.ArrayList;
import java.util.List;

public class PetsDemo
{

    public static void main(String[] args)
    {

        List<Pet> pets = new ArrayList<>();

        pets.add(new RoboDog("Robik"));

        // create inner class
        pets.add(new SpecialRoboDog());

        // create anonymous class inherited from RoboDog
        pets.add(new RoboDog()
        {
            @Override
            public void beFriendly()
            {
                System.out.println(getName()
                    + ": I'm more friendly then everyone else!");
            }
        });

        // create anonymous class inherited from Car
        pets.add(new Cat("Tiger")
        {
            @Override
            public String getName()
            {
                return "";
            }

            @Override
            public void beFriendly()
            {
                System.out.println("I'm not friendly! I'm a Tiger!");
            }
        });

        // adding Pet interface implementation
        pets.add(new Pet()
        {
            @Override
            public String getName()
            {
                return "I'm a Pet";
            }

            @Override
            public void beFriendly() { }
        });

        // ask all pets to be friendly
        for (Pet pet : pets)
        {
            pet.beFriendly();
        }
    }

    static class SpecialRoboDog extends RoboDog
    {
        @Override
        public void beFriendly()
        {
            System.out.println(getName()
                + ": I'm very special for you!");
        }
    }
}
