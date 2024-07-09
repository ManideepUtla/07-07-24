package com.neoteric.bank.service;

import com.neoteric.bank.model.AccountOpen;
import com.neoteric.bank.model.BankForm;

import java.util.UUID;

public class BankService {
    public AccountOpen getAccount(BankForm bankForm) {

        AccountOpen openAccount = null;

        if (bankForm.age > 18) {
            openAccount = new AccountOpen();
            openAccount.accountNumber = "BankCode" + UUID.randomUUID().toString();
            openAccount.openFees = 1000;


        }
        return openAccount;

    }
}
