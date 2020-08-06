package com.luxoft.jva001p1.oop.test.repositories;

import com.luxoft.jva001p1.oop.test.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonInMemoryRepository implements PersonRepository
{
    private List<Person> storage;

    public PersonInMemoryRepository()
    {
        this.storage = new ArrayList<>(10);
    }

    public Person create(Person person)
    {
        storage.add(person);
        return person;
    }

    public List<Person> getAll()
    {
        return new ArrayList<>(storage);
    }

    public Person findByName(String name)
    {
        for (Person person : storage)
        {
            if (name.equalsIgnoreCase(person.getName()))
            {
                return person;
            }
        }
        return null;
    }

}
