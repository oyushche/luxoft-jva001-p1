package com.luxoft.jva001p1.generics.xtasks.bankapp.domain;

import com.luxoft.jva001p1.generics.xtasks.bankapp.exceptions.NotEnoughFundsException;

public interface Account
{
    public void deposit(double amount);

    public void withdraw(double amount) throws NotEnoughFundsException;

    public int getId();

    public double getBalance();

    public double maximumAmountToWithdraw();
}
