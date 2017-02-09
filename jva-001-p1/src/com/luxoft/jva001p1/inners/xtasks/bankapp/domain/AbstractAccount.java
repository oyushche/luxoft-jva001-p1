package com.luxoft.jva001p1.inners.xtasks.bankapp.domain;

public abstract class AbstractAccount implements Account
{

    private int id;
    protected double balance;

    public AbstractAccount(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public void deposit(final double amount)
    {
        balance += amount;
    }

    @Override
    public void withdraw(final double amount)
    {
        balance -= amount;
    }

    @Override
    public int getId()
    {
        return id;
    }

    @Override
    public double getBalance()
    {
        return balance;
    }

}
