package com.luxoft.jva001p1.basics.part3;

import java.util.Arrays;

public class People
{
    private static int NAME = 0;
    private static int AGE = 1;
    private static int CITY = 2;
    private static int NUMBER_OF_FIELDS = 3;

    public static void main(String[] args)
    {
        // name, age, city
        String[][] people = new String[10][];

        people[0] = createPerson("Oleg", 21, "Kiev");
        people[1] = createPerson("Anna", 34, "Moscow");

        System.out.println(Arrays.deepToString(people));

        String[] person = getPerson(people, 0);

        System.out.println(person[NAME]);
    }

    private static String[] getPerson(String[][] people, int index)
    {
        return people[index];
    }


    private static String[] createPerson(String name, int age, String city)
    {
        String[] person = new String[NUMBER_OF_FIELDS];

        person[NAME] = name;
        person[AGE] = String.valueOf(age);
        person[CITY] = city;

        return person;
    }
}
