package com.luxoft.jva001p1.oop.storage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetStorage implements Storage
{
    private Set<Bird> birds = new HashSet<>();

    @Override
    public void storeBird(Bird birdToStore)
    {
        Bird foundBird = findBird(birdToStore.getType());

        if (foundBird == null)
        {
            birds.add(birdToStore);
        }
        else
        {
            foundBird.setCount(foundBird.getCount() + birdToStore.getCount());
        }
    }

    @Override
    public Bird findBird(String type)
    {
        for (Bird b : birds)
        {
            if (b.getType().equals(type))
            {
                return b;
            }
        }

        return null;
    }

    @Override
    public List<Bird> getBirds()
    {
        return new ArrayList<>(birds);
    }
}
