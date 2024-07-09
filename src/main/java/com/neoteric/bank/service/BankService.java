package com.neoteric.bank.service;

import com.neoteric.bank.model.AccountOpen;
import com.neoteric.bank.model.BankForm;

import java.util.UUID;

public class BankService {
    public AccountOpen getAccount(BankForm bankForm) {

        AccountOpen openAccount = null;

        if (bankForm.balance >= 5000) {
            openAccount = new AccountOpen();
            openAccount.accountNumber = "BankCode" + UUID.randomUUID().toString();
            openAccount.balance = 5000;
            System.out.println("my balance"+ openAccount.balance);

        }
        return openAccount;

    }
}
