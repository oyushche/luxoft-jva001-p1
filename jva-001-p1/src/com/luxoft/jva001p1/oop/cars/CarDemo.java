package com.luxoft.jva001p1.oop.cars;

public class CarDemo
{

    public static void main(String[] args)
    {
        Car bmw = new Car();
        bmw.setModel("BMW");

        bmw.displayAllPassengers();


        Passenger p1 = new Passenger();
        p1.setName("Oleg");
        bmw.addPassenger(p1);

        p1.setName("Ivan");

        Passenger p2 = new Passenger();
        p2.setName("Irina");
        bmw.addPassenger(p2);

        bmw.displayAllPassengers();

        System.out.println("Is Alina in BMW? " + bmw.findPassenger("Alina"));
        System.out.println("Is Irina in BMW? " + bmw.findPassenger("Irina"));

        Passenger p3 = new Passenger();
        p3.setName("Alex");

        bmw.addPassenger(p3);

        bmw.displayAllPassengers();

    }
}
