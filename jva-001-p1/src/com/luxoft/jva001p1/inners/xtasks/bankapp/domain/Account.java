package com.luxoft.jva001p1.inners.xtasks.bankapp.domain;

public interface Account
{
    public void deposit(double amount);

    public void withdraw(double amount);

    public int getId();

    public double getBalance();

    public double maximumAmountToWithdraw();
}
