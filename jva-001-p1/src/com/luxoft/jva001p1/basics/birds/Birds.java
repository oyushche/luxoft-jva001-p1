package com.luxoft.jva001p1.basics.birds;

import java.util.Arrays;

public class Birds
{
    static boolean SOUT_ENABLED = true;

    private static final int TYPE = 0;
    private static final int PRICE = 1;
    private static final int COUNT = 2;
    private static final int SOLD = 3;

    static String[][] birds = new String[50][];
    static int countOfBirds = 0;

    static void addBirdToStorage(String type, int price, int count)
    {
        String[] bird = createBird(type, price, count);

        addToActualStorage(bird);
    }

    static void sell(String type, int count)
    {
        String[] bird = findBirdByType(type);

        if (bird == null || getCount(bird) == 0)
        {
            System.out.println("We have no " + type + "s now. Please choose something different." );
            return;
        }

        actualSell(bird, count);

        sout(count + " " + type + "s sold for " + getPrice(bird));
    }

    static void printShopStatus()
    {
        System.out.println();
        sout("--------------------------------------------------");
        System.out.println();

        for (int i = 0; i < countOfBirds; i++)
        {
            sout(asString(birds[i]));
        }

        System.out.println();
    }

    static String asString(String[] bird)
    {
        return getType(bird).toUpperCase() + " price: " + getPrice(bird) + " available: " + getCount(bird);
    }

    static void actualSell(String[] bird, int count)
    {
        addToCount(bird, -count);
        addToSold(bird, count);
    }

    static void addToActualStorage(String[] bird)
    {
        expandStorageIfNeeded();

        String[] existing = findBirdByType(getType(bird));

        if (existing == null)
        {
            birds[countOfBirds++] = bird;
        }
        else
        {
            addToCount(existing, getCount(bird));
        }

        sout(getCount(bird) + " " + getType(bird) + "s added to the storage.");
    }

    static void expandStorageIfNeeded()
    {
        if (birds.length * 0.7 > countOfBirds)
        {
            birds = Arrays.copyOf(birds, birds.length * 2);
        }
    }

    static String[] createBird(String type, int price, int count)
    {
        String[] bird = new String[4];

        bird[TYPE] = type;
        bird[PRICE] = String.valueOf(price);
        bird[COUNT] = String.valueOf(count);
        bird[SOLD] = "0";

        return bird;
    }

    static String[] findBirdByType(String type)
    {
        for (int i = 0; i < countOfBirds; i++)
        {
            String[] bird = birds[i];

            if (getType(bird).equals(type))
            {
                return bird;
            }
        }
        return null;
    }

    static void updatePrice(String[] bird, int newPrice)
    {
        bird[PRICE] = String.valueOf(newPrice);
    }

    static void addToSold(String[] bird, int count)
    {
        bird[SOLD] = String.valueOf(getSold(bird) + count);
    }

    static void addToCount(String[] bird, int count)
    {
        bird[COUNT] = String.valueOf(getCount(bird) + count);
    }

    static String getType(String[] bird)
    {
        return bird[TYPE];
    }

    static int getPrice(String[] bird)
    {
        return Integer.parseInt(bird[PRICE]);
    }

    static int getCount(String[] bird)
    {
        return Integer.parseInt(bird[COUNT]);
    }

    static int getSold(String[] bird)
    {
        return Integer.parseInt(bird[SOLD]);
    }

    static void sout(String message)
    {
        if (SOUT_ENABLED)
        {
            System.out.println(message);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Birds shop storage.");
        sout("--------------------------------------------------");

        fillShopWithRandomBirds();

        printShopStatus();

        addBirdToStorage("Parrot", 15, 10);

        printShopStatus();

        sell("Eagle", 1);
        sell("Crow", 1);

        sell("Horse", 1);

        printShopStatus();
    }











    static void fillShopWithRandomBirds()
    {
        addBirdToStorage("Eagle", 80, 10);
        addBirdToStorage("Duck", 20, 40);
        addBirdToStorage("Crow", 30, 10);
    }

}
