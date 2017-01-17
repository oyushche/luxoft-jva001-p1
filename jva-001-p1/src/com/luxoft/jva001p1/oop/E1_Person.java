package com.luxoft.jva001p1.oop;

public class E1_Person
{
    String name;
    int age = 20;

    public int getAge()
    {
        return age;
    }

    public static void main(String[] args)
    {
        E1_Person p = new E1_Person();

        int age = p.getAge();
        System.out.println(age);
    }
}
