package com.neoteric.bank;

import com.neoteric.bank.model.AccountOpen;
import com.neoteric.bank.model.BankForm;
import com.neoteric.bank.service.BankService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BankTest {

    @Test
    public void banktest(){
        BankForm bankFrom=new BankForm();
        bankFrom.firstName="Manideep";
        bankFrom.lastName="Utla";
        bankFrom.age=22;
        bankFrom.gender="Male";
        bankFrom.mobileNo="9985533134";
        bankFrom.balance=5000;
        bankFrom.address="Rajahmundry";
        bankFrom.aadharNo="834923619430";
        bankFrom.panNo="GNYPM6790N";


        BankService service=new BankService();
        service.getAccount(bankFrom);

        AccountOpen accountOpen=service.getAccount(bankFrom);
        Assertions.assertEquals(5000,accountOpen.balance);
        Assertions.assertNotNull(accountOpen.accountNumber);

    }

}
