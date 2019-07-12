package com.luxoft.test;


import java.util.*;
import java.util.stream.Collectors;

public class Trap
{
    public static void main(String[] args)
    {
        try
        {
            throwException();
            System.out.println("Done");
        }
        catch (AnimalException e)
        {
            System.out.println("Catch");
        }
        System.out.println("End");
    }

    public static void throwException() throws DogException
    {
        throw new DogException();
    }

}

class AnimalException extends Exception {}
class DogException extends AnimalException {}
