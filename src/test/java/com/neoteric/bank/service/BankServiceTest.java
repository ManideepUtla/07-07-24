package com.neoteric.bank.service;

import com.neoteric.bank.model.AccountOpen;
import com.neoteric.bank.model.BankForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    @Test
    public void banktest(){
        BankForm bankFrom=new BankForm();
        bankFrom.firstName="Manideep";
        bankFrom.lastName="Utla";
        bankFrom.age=22;
        bankFrom.gender="Male";
        bankFrom.mobileNo="9985533134";
        bankFrom.openFees=1000;
        bankFrom.address="Rajahmundry";


        BankService service=new BankService();
        service.getAccount(bankFrom);

        AccountOpen accountOpen=service.getAccount(bankFrom);
        Assertions.assertEquals(1000,accountOpen.openFees);
        Assertions.assertNotNull(accountOpen.accountNumber);

    }

}

