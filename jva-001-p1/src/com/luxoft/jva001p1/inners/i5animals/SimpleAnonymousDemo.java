package com.luxoft.jva001p1.inners.i5animals;

public class SimpleAnonymousDemo
{
    public static void main(String[] args)
    {
        Pet pet = new Pet()
        {
            @Override
            public String getName()
            {
                return "Star";
            }

            @Override
            public void beFriendly()
            {
                System.out.println("Star loves you.");
            }
        };

        Cat cat = new Cat("Murzik")
        {
            @Override
            public void beFriendly()
            {
                jump();
                jump();
                jump();
            }

            private void jump()
            {
                System.out.println(getName() + " can jump now!");
            }
        };
    }
}
