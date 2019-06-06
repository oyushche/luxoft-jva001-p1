package com.luxoft.jva001p1.oop.storage;

import java.util.ArrayList;
import java.util.List;

public class StorageService implements Storage
{
    private List<Bird> birdList = new ArrayList<>();

    public void storeBird(Bird birdToStore)
    {
        Bird foundBird = findBird(birdToStore.getType());

        if (foundBird == null)
        {
            birdList.add(birdToStore);
        }
        else
        {
            foundBird.setCount(foundBird.getCount() + birdToStore.getCount());
        }
    }

    public Bird findBird(String type)
    {
        for (Bird b : birdList)
        {
            if (b.getType().equals(type))
            {
                return b;
            }
        }

        return null;
    }

    public List<Bird> getBirds()
    {
        return new ArrayList<>(birdList);
    }
}
