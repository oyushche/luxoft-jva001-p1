package com.luxoft.jva001p1.oop.inheritance.p2animals;

public class Dog extends Animal
{
    private String name;

    private int age;

    public Dog()
    {
    }

    @Override
    public void makeNoise()
    {
        System.out.println("Bark bark");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
