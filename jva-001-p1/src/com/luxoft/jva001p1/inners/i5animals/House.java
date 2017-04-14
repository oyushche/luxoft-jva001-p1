package com.luxoft.jva001p1.inners.i5animals;

public class House
{
    public void feedPet(final String food)
    {
        Pet pet = new Pet()
        {
            @Override
            public String getName()
            {
                return "Baron";
            }

            @Override
            public void beFriendly()
            {
                eat();
            }

            public void eat()
            {
                System.out.println("Thanks, I love " + food);
            }
        };

        pet.beFriendly();
    }
}
