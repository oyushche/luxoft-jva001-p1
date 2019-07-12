package com.luxoft.jva001p1.demos;

public class Client
{
    private String name;

    private Account[] accounts;

    public Client()
    {
        this.accounts = new Account[2];
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Account[] getAccounts()
    {
        return accounts;
    }

    public void setAccounts(Account[] accounts)
    {
        this.accounts = accounts;
    }

    public void addAccount(Account account)
    {

    }

    @Override
    public String toString()
    {
        return name;
    }
}
