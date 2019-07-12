package com.luxoft.jva001p1.oop.cars;

import java.util.ArrayList;

public class Car
{
    private String model;

    private ArrayList<Passenger> passengers;

    public Car()
    {
        passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger)
    {
        if (passengers.size() == 2)
        {
            System.out.println("No place for you my friend.");
            return;
        }
        passengers.add(passenger);
        System.out.println(passenger.getName() + " inside");
    }

    public boolean findPassenger(String name)
    {
        for (Passenger passenger : passengers)
        {
            if (passenger.getName().equalsIgnoreCase(name))
            {
                return true;
            }
        }

        return false;
    }

    public void displayAllPassengers()
    {
        if (passengers.size() < 1)
        {
            System.out.println("Car is empty.");
            return;
        }

        for (Passenger passenger : passengers)
        {
            passenger.whatIsYourName();
        }
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
}
