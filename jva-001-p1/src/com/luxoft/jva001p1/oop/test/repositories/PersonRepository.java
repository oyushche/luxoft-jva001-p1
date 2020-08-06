package com.luxoft.jva001p1.oop.test.repositories;

import com.luxoft.jva001p1.oop.test.Person;

import java.util.List;

public interface PersonRepository
{
    Person create(Person person);

    List<Person> getAll();

    Person findByName(String name);
}
