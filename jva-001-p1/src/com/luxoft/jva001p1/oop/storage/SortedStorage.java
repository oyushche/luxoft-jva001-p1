package com.luxoft.jva001p1.oop.storage;

import java.util.*;

public class SortedStorage implements Storage
{
    private Set<Bird> birds;

    public SortedStorage()
    {
        Comparator<Bird> comparator = new Comparator<Bird>()
        {
            @Override
            public int compare(Bird o1, Bird o2)
            {
                return o2.getType().compareTo(o1.getType());
            }
        };

        birds = new TreeSet<>(comparator);
    }

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
