package com.luxoft.jva001p1.generics.xtasks.bankapp.domain;

import com.luxoft.jva001p1.generics.xtasks.bankapp.exceptions.ClientExistsException;
import com.luxoft.jva001p1.generics.xtasks.bankapp.utils.ClientRegistrationListener;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;

public class Bank
{

    private Client[] clients;
    private int countOfClients;

    private final ClientRegistrationListener[] listeners;

    private int printedClients = 0;
    private int emailedClients = 0;
    private int debuggedClients = 0;

    public Bank()
    {
        clients = new Client[1_000];
        countOfClients = 0;

        listeners =  new ClientRegistrationListener[3];
        listeners[0] = new PrintClientListener();
        listeners[1] = new EmailNotificationListener();
        listeners[2] = new DebugListener();

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
        if (!containsClient(client))
        {
            throw new ClientExistsException("Client already exists into the bank");
        }

        clients[countOfClients++] = client;
        notify(client);
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
}




