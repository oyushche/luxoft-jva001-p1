package com.luxoft.jva001p1.generics.xtasks.bankapp.domain;

import java.util.Arrays;

public class Client
{
    private String name;
    private Gender gender;

    private Account[] accounts;
    private int countOfAccounts;

    public Client(String name, Gender gender)
    {
        this.name = name;
        this.gender = gender;
        this.accounts = new Account[100];
        countOfAccounts = 0;
    }

    public void addAccount(final Account account)
    {
        accounts[countOfAccounts++] = account;
    }

    public String getName()
    {
        return name;
    }

    public Gender getGender()
    {
        return gender;
    }

    public Account[] getAccounts()
    {
        return Arrays.copyOf(accounts, accounts.length);
    }

    public String getClientGreeting()
    {
        if (gender != null)
        {
            return gender.getGreeting() + " " + name;
        }
        else
        {
            return name;
        }
    }

    @Override
    public String toString()
    {
        return getClientGreeting();
    }

}
