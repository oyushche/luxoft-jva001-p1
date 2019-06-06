package com.luxoft.jva001p1.oop.storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStorage implements Storage
{
    private Map<String, Bird> birds = new HashMap<>();

    @Override
    public void storeBird(Bird birdToStore)
    {
        Bird found = findBird(birdToStore.getType());

        if (found == null)
        {
            birds.put(birdToStore.getType(), birdToStore);
        }
        else
        {
            found.setCount(found.getCount() + birdToStore.getCount());
        }
    }

    @Override
    public Bird findBird(String type)
    {
        if (birds.containsKey(type))
        {
            return birds.get(type);
        }

        return null;
    }

    @Override
    public List<Bird> getBirds()
    {
        return new ArrayList<>(birds.values());
    }
}
