package com.luxoft.jva001p1.generics.xtasks.bankapp.domain;


public class SavingAccount extends AbstractAccount {
	public SavingAccount(int id, double balance) {
		super(id, balance);
	}
	
	public double maximumAmountToWithdraw(){
        return getBalance();
    }
	
}
