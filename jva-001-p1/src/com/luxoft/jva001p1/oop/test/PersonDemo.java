package com.luxoft.jva001p1.oop.test;

import com.luxoft.jva001p1.oop.test.repositories.PersonFileRepository;
import com.luxoft.jva001p1.oop.test.repositories.PersonInMemoryRepository;
import com.luxoft.jva001p1.oop.test.repositories.PersonRepository;

import java.util.List;

public class PersonDemo
{
    public static void main(String[] args)
    {
        PersonRepository personRepository = new PersonInMemoryRepository();

        if (args.length > 0 && "FILE".equalsIgnoreCase(args[0]))
        {
            personRepository = new PersonFileRepository();
        }

        PersonManagementService personManagement = new PersonManagementService();
        personManagement.setRepository(personRepository);

        personManagement.create("Oleg");
        personManagement.create("Alina");

        List<Person> personList = personManagement.getAll();
        for (Person person : personList)
        {
            System.out.println(person);
        }

        System.out.println(personManagement.findByName("Inna"));
        System.out.println(personManagement.findByName("Alina"));
    }
}
