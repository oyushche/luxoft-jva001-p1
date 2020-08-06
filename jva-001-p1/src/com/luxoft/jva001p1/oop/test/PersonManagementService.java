package com.luxoft.jva001p1.oop.test;

import com.luxoft.jva001p1.oop.test.repositories.PersonRepository;
import java.util.List;

public class PersonManagementService
{
    private PersonRepository repository;

    public PersonManagementService() {}

    public Person create(String name)
    {
        Person p = new Person();
        p.setName(name);

        return repository.create(p);
    }

    public List<Person> getAll()
    {
        return repository.getAll();
    }

    public Person findByName(String name)
    {
        return repository.findByName(name);
    }

    public void setRepository(PersonRepository repository)
    {
        this.repository = repository;
    }
}
