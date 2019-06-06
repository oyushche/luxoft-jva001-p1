package com.luxoft.jva001p1.oop.storage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListStorage implements Storage
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
        List<Bird> result = new ArrayList<>(birdList);

//        Collections.sort(result, new Comparator<Bird>()
//        {
//            @Override
//            public int compare(Bird o1, Bird o2)
//            {
//                return o1.getType().compareTo(o2.getType());
//            }
//        });

        return result;
    }
}
