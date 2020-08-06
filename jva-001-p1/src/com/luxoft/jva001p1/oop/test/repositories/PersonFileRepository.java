package com.luxoft.jva001p1.oop.test.repositories;

import com.luxoft.jva001p1.oop.test.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonFileRepository implements PersonRepository
{
    @Override
    public Person create(Person person)
    {
        System.out.println("FILE REPO: CREATED");
        return null;
    }

    @Override
    public List<Person> getAll()
    {
        System.out.println("FILE REPO: GET ALL");
        return new ArrayList<>();
    }

    @Override
    public Person findByName(String name)
    {
        System.out.println("FILE REPO: FIND BY NAME");
        return null;
    }
}
