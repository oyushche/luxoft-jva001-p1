package com.luxoft.jva001p1.basics.birds;

public class BirdShop
{
    static Bird[] birds = new Bird[10];

    public static void main(String[] args)
    {

        Bird bird = new Bird();

        bird.type = "Eagle";
        bird.price = 90.0;
        bird.inStock = 10;
        bird.sold = 0;

        print(bird);

        birds[0] = bird;
    }

    static void print(Bird bird)
    {
        System.out.println(bird.type);
        System.out.println(bird.price);
        System.out.println(bird.inStock);
        System.out.println(bird.sold);

    }
}
