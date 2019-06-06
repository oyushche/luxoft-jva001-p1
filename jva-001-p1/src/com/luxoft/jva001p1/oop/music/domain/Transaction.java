package com.luxoft.jva001p1.oop.music.domain;

import java.util.List;

public class Transaction
{
    private Customer customer;
    private List<Song> songs;
    private double totalPrice;

    public Transaction()
    {
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public List<Song> getSongs()
    {
        return songs;
    }

    public void setSongs(List<Song> songs)
    {
        this.songs = songs;
        for (Song song : songs)
        {
            totalPrice += song.getPrice();
        }
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    @Override
    public String toString()
    {
        String s = customer.getName() + "[";
        for (Song song : songs)
        {
            s += song.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        s += "] : " + totalPrice;

        return s;
    }
}
