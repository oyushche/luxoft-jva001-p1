package com.luxoft.jva001p1.exceptions.person;

public class Launcher
{
    private static PersonsHolder personsHolder = new PersonsHolder();

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
        finally
        {
            System.out.println("Finally");
        }

        System.out.println("EOP");


    }

    public static Person findPerson(String name)
    {
        Person person = personsHolder.find(name);

        if (person == null)
        {
            PersonNotFoundException pnfe = new PersonNotFoundException();
            pnfe.setName(name);

            throw pnfe;
        }

        return person;
    }

    static class PersonsHolder
    {
        public Person find(String name)
        {
            return null;
        }
    }

}
