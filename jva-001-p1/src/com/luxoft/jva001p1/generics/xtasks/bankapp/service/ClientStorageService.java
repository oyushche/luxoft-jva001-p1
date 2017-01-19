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
        for (Client client : clients)
        {
            if (client.getId() == id)
            {
                return client;
            }
        }
        return null;
    }

    @Override
    public Client update(Client toUpdate)
    {
        Client c = getById(toUpdate.getId());

        if (c != null)
        {
            clients.remove(c);
            clients.add(toUpdate);
        }

        return c;
    }

    @Override
    public void delete(Client object)
    {
        clients.remove(object);
    }

    @Override
    public List<Client> getAll()
    {
        return new ArrayList<>(clients);
    }
}
