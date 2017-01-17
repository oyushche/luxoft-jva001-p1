package com.luxoft.jva001p1.generics.xtasks.bankapp.service;

import com.luxoft.jva001p1.generics.xtasks.bankapp.domain.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientStorageService implements StorageService<Client>
{
    private final List<Client> clients;

    public ClientStorageService()
    {
        clients = new ArrayList<>();
    }

    @Override
    public Client store(Client client)
    {
        if (!containsClient(client))
        {
            clients.add(client);
            return client;
        }

        return null;
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

    @Override
    public Client getById(int id)
    {
        return null;
    }

    @Override
    public Client update(Client toUpdate)
    {
        return null;
    }

    @Override
    public void delete(Client object)
    {

    }

    @Override
    public List<Client> getAll()
    {
        return null;
    }
}
