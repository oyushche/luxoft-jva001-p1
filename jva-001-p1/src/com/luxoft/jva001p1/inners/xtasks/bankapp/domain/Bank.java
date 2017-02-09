package com.luxoft.jva001p1.inners.xtasks.bankapp.domain;

import java.util.Arrays;

public class Bank
{

    private Client[] clients;
    private int countOfClients;

    public Bank()
    {
        clients = new Client[1_000];
        countOfClients = 0;
    }

    public void addClient(final Client client)
    {
        if (!containsClient(client))
        {
            clients[countOfClients++] = client;
        }
    }

    private boolean containsClient(Client clientToCheck)
    {
        for (Client c : clients)
        {
            if (c.getName().equals(clientToCheck.getName()))
            {
                return true;
            }
        }

        return false;
    }

    public Client[] getClients()
    {
        return Arrays.copyOf(clients, clients.length);
    }
}




