package com.luxoft.jva001p1.inners.xtasks.bankapp.service;

import com.luxoft.jva001p1.inners.xtasks.bankapp.domain.Account;
import com.luxoft.jva001p1.inners.xtasks.bankapp.domain.Bank;
import com.luxoft.jva001p1.inners.xtasks.bankapp.domain.Client;

public class BankService {
	
	public static void addClient(Bank bank, Client client)
    {
        bank.addClient(client);
    }
	
	public static void printMaximumAmountToWithdraw(Bank bank) {
		System.out.format("%nPrint maximum amount to withdraw for all clients%n");
		
        StringBuilder result = new StringBuilder();
        for (Client client: bank.getClients()) {
            result.append("Client: ")
                  .append(client)
                  .append("\n");
            int i = 1;
            for (Account account: client.getAccounts()) {
                result.append("Account nr. ")
                      .append(i++)
                      .append(", maximum amount to withdraw: ")
                      .append(Math.round(account.maximumAmountToWithdraw() * 100) / 100d)
                      .append("\n");
            }
        }

        System.out.println(result.toString());
    }
	
}
