package com.luxoft.jva001p1.exceptions.person;

import java.io.*;
import java.sql.SQLException;

public class Launcher
{
    private static PersonsHolder personsHolder;

    public static void main(String[] args)
    {

        try
        {
            Person person = findPerson("John Smith");
            person.sendMessage("Hello John");
        }
        catch (PersonNotFoundException e)
        {
            System.out.println("Person " + e.getName() + " not found.");
        }




    }

    public static Person findPerson(String name)
    {
        Person person = personsHolder.find(name);

        if (person == null)
        {
            throw new PersonNotFoundException();
        }

        return person;
    }

    class PersonsHolder
    {
        public Person find(String name)
        {
            return null;
        }
    }

}
