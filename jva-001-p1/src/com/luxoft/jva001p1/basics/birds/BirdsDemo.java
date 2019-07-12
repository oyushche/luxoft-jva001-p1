package com.luxoft.jva001p1.basics.birds;

import java.util.Arrays;

public class BirdsDemo
{
    static int TYPE = 0;
    static int PRICE = 1;
    static int SOLD = 2;
    static int IN_STOCK = 3;

    static String[][] birds = new String[5][];

    static int countOfBirds = 0;

    public static void main(String[] args)
    {
//        System.out.println("args: " + Arrays.toString(args));

        String[] bird = createBird("Eagle", 80.0, 9);

        addBirdToStorage(bird);
        printShopInfo();

        addBirdToStorage(createBird("Crow ", 10.0, 20));
        printShopInfo();

        addBirdToStorage(createBird("Eagle", 80.0, 7));
        printShopInfo();



    }


    static void printShopInfo()
    {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("TYPE  | PRICE |  SOLD  | IN STOCK");
        System.out.println("----------------------------------------");
        for (int i = 0; i < countOfBirds; i++)
        {
            printBird(birds[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println();
    }

    static String[] findBirdByType(String type)
    {
        for (String[] bird : birds)
        {
            if (bird == null)
            {
                return null;
            }

            if (type.equals(bird[TYPE]))
            {
                return bird;
            }
        }

        return null;
    }

    static void addBirdToStorage(String[] bird)
    {
        String[] found = findBirdByType(bird[TYPE]);

        if (found != null)
        {
            updateStock(found, Integer.parseInt(bird[IN_STOCK]));
        }
        else
        {
            birds[countOfBirds++] = bird;
        }


    }

    static void printBird(String[] bird)
    {
        if (bird != null)
        {
            System.out.println(bird[TYPE] + " | $" + bird[PRICE] + " | " + bird[SOLD] + "      | " + bird[IN_STOCK]);
        }
    }

    static void updateStock(String[] bird, int count)
    {
        int inStock = Integer.parseInt(bird[IN_STOCK]);

        bird[IN_STOCK] = String.valueOf(inStock + count);
    }

    static void updatePrice(String[] bird, double newPrice)
    {
        bird[PRICE] = String.valueOf(newPrice);
    }

    private static int getInStock(String[] bird)
    {
        return Integer.parseInt(bird[IN_STOCK]);
    }


    static String[] createBird(String type, double price, int count)
    {
        String[] bird = new String[4];

        bird[TYPE] = type;
        bird[PRICE] = String.valueOf(price);
        bird[SOLD] = "0";
        bird[IN_STOCK] = String.valueOf(count);

        return bird;
    }



    static void testUpdateStock(String[] bird)
    {
        int oldValue = getInStock(bird);

        int increment = 10;

        updateStock(bird, increment);

        int newValue = getInStock(bird);

        if (newValue == (oldValue + increment))
        {
            System.out.println("Works fine!!!!");
        }
        else
        {
            System.out.println("New value should be: " + (oldValue + increment) + " but you have: " + newValue);
        }

    }

}
