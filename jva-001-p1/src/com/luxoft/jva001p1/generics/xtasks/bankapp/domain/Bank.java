package com.luxoft.jva001p1.generics.xtasks.bankapp.domain;

import com.luxoft.jva001p1.generics.xtasks.bankapp.exceptions.ClientExistsException;
import com.luxoft.jva001p1.generics.xtasks.bankapp.service.ClientStorageService;
import com.luxoft.jva001p1.generics.xtasks.bankapp.service.StorageService;
import com.luxoft.jva001p1.generics.xtasks.bankapp.utils.ClientRegistrationListener;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Bank
{

    private StorageService<Client> clientStorageService;
    private final List<ClientRegistrationListener> listeners;

    private int printedClients = 0;
    private int emailedClients = 0;
    private int debuggedClients = 0;

    public Bank()
    {
        listeners =  new ArrayList<>(3);
        listeners.add(new PrintClientListener());
        listeners.add(new EmailNotificationListener());
        listeners.add(new DebugListener());
    }

    public int getPrintedClients()
    {
        return printedClients;
    }

    public int getEmailedClients()
    {
        return emailedClients;
    }

    public int getDebuggedClients()
    {
        return debuggedClients;
    }

    public void addClient(final Client client) throws ClientExistsException
    {
        if (clientStorageService.store(client) == null)
        {
            throw new ClientExistsException("Client already exists into the bank");
        }

        notify(client);
    }

    public List<Client> getClients()
    {
        return Collections.unmodifiableList(clientStorageService.getAll());
    }

    private void notify(Client client) {
        for (ClientRegistrationListener listener: listeners) {
            listener.onClientAdded(client);
        }
    }

    class PrintClientListener implements ClientRegistrationListener
    {
        @Override
        public void onClientAdded(Client client)
        {
            System.out.println("Client added: " + client.getName());
            printedClients++;
        }

    }

    class EmailNotificationListener implements ClientRegistrationListener
    {
        @Override
        public void onClientAdded(Client client)
        {
            System.out.println("Notification email for client " + client.getName() + " to be sent");
            emailedClients++;
        }
    }

    class DebugListener implements ClientRegistrationListener
    {
        @Override
        public void onClientAdded(Client client)
        {
            System.out.println("Client " + client.getName() + " added on: "
                    + DateFormat.getDateInstance(DateFormat.FULL).format(new Date()));
            debuggedClients++;
        }
    }

    public void setClientStorageService(StorageService<Client> clientStorageService)
    {
        this.clientStorageService = clientStorageService;
    }
}




