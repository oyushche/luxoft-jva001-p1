package com.luxoft.jva001p1.demos;

import java.util.Arrays;

public class Demo
{
    public static void main(String[] args)
    {
        Integer i = 34;


        Client[] clients = new Client[5];

        Client client =  new Client();
        client.setName("Oleg");

        Account a = new Account();
        a.setId(1);

        Account[] accounts = new Account[2];
        accounts[0] = a;

        client.setAccounts(accounts);

        clients[0] = client;


        client = new Client();
        client.setName("Irina");

        clients[1] = client;

//        generateClients(clients);

        System.out.println(Arrays.toString(clients));

    }

    private static void generateClients(Client[] clients)
    {
        clients[0] = createClient("Oleg");
        clients[1] = createClient("Zina");
    }

    private static Client createClient(String name)
    {
        Client client =  new Client();
        client.setName(name);

        return client;
    }
}
