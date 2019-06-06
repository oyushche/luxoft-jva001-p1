package com.luxoft.jva001p1.oop.storage;

import java.util.List;

public interface Storage
{
    void storeBird(Bird birdToStore);

    Bird findBird(String type);

    List<Bird> getBirds();
}
