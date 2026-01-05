package test;

import accounts.CreditAccount;
import accounts.SimpleAccount;
import interfaces.Logger;
import realizationInterfaces.SimpleLogger;
import realizationInterfaces.SmartLogger;

public class Main{
    public static void main(String[] args) {


        SimpleAccount simple = new  SimpleAccount();
        CreditAccount credit = new  CreditAccount(0, 400_000);

        credit.pay(390_000);
        System.out.println(credit.getBalance());


        SimpleLogger logger = new  SimpleLogger();
        SmartLogger smartLogger = new  SmartLogger();

        logger.log("обычный logger");
        smartLogger.log("smartLogger номер 1");
        smartLogger.log("smartLogger номер 2");









    }
}