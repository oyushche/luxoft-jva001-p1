package com.luxoft.jva001p1.oop.music;

import com.luxoft.jva001p1.oop.music.domain.Customer;
import com.luxoft.jva001p1.oop.music.domain.Song;
import com.luxoft.jva001p1.oop.music.domain.Transaction;

import java.util.*;

public class Shop
{
    private Map<String, Customer> customers;
    private Map<String, Song> songs;
    private List<Transaction> transactions;

    public Shop()
    {
        this.customers = new HashMap<>();
        this.songs = new HashMap<>();
        this.transactions = new ArrayList<>();
    }

    public void addSong(String name, double price)
    {
        songs.put(name, new Song(name, price));
    }


    public void buy(String customerName, String ...songNames)
    {
        if (!customers.containsKey(customerName))
        {
            customers.put(customerName, new Customer(customerName));
        }

        Customer customer = customers.get(customerName);

        List<Song> songsToBuy = new ArrayList<>();

        for (String name : songNames)
        {
            if (!songs.containsKey(name))
            {
                System.out.println("Sorry, choose another song!!!");
            }
            else
            {
                songsToBuy.add(copySong(songs.get(name)));
            }
        }

        Transaction transaction = new Transaction();

        transaction.setCustomer(customer);
        transaction.setSongs(songsToBuy);

        transactions.add(transaction);

        System.out.println(customerName + " bought: " + Arrays.toString(songNames));

    }

    private Song copySong(Song song)
    {
        return new Song(song.getName(), song.getPrice());
    }

    public void printPurchases()
    {
        System.out.println();
        System.out.println("============ Purchases ==============");
        System.out.println();

        for (Transaction transaction : transactions)
        {
            System.out.println(transaction);
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println();

    }

    public void printPrices()
    {
        System.out.println();
        System.out.println("==============================");
        for (Song song : songs.values())
        {
            System.out.println(song.getName() + ":" + song.getPrice());
        }
    }

}
