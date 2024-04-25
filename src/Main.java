import actions.Transaction;
import pojos.AccountData;
import pojos.AccountHolder;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        ArrayList<AccountData> allAccounts = new ArrayList<>();
        AccountData accountData1 =  new AccountData(10000, 200400511, new AccountHolder("TestUser1", "TestUserL1", "XYZ", "9876543210"));
        AccountData accountData2 =  new AccountData(10000, 200400512, new AccountHolder("TestUser2", "TestUserL2", "ABC", "9876543211"));
        AccountData accountData3 =  new AccountData(10000, 200400513, new AccountHolder("TestUser3", "TestUserL3", "DEF", "9876543212"));
        AccountData accountData4 =  new AccountData(10000, 200400514, new AccountHolder("TestUser4", "TestUserL4", "GHI", "9876543213"));
        AccountData accountData5 =  new AccountData(10000, 200400515, new AccountHolder("TestUser5", "TestUserL5", "JKL", "9876543214"));
        AccountData accountData6 =  new AccountData(10000, 200400516, new AccountHolder("TestUser6", "TestUserL6", "MNO", "9876543215"));
        AccountData accountData7 =  new AccountData(10000, 200400517, new AccountHolder("TestUser7", "TestUserL7", "PQR", "9876543216"));
        AccountData accountData8 =  new AccountData(10000, 200400518, new AccountHolder("TestUser8", "TestUserL8", "STU", "9876543217"));

        allAccounts.add(accountData1);
        allAccounts.add(accountData2);
        allAccounts.add(accountData3);
        allAccounts.add(accountData4);
        allAccounts.add(accountData5);
        allAccounts.add(accountData6);
        allAccounts.add(accountData7);
        allAccounts.add(accountData8);


        Transaction transactionThread0 = new Transaction(allAccounts, "SHOW", 0, accountData1);
        Transaction transactionThread1 = new Transaction(allAccounts, "DEPOSIT", 5000, accountData1);
        Transaction transactionThread2 = new Transaction(allAccounts, "WITHDRAW", 5000, accountData1);
        Transaction transactionThread3 = new Transaction(allAccounts, "SHOW", 0, accountData1);


        Transaction transactionThread4 = new Transaction(allAccounts, "SHOW", 0, accountData2);
        Transaction transactionThread5 = new Transaction(allAccounts, "WITHDRAW", 3000, accountData2);
        Transaction transactionThread6 = new Transaction(allAccounts, "DEPOSIT", 5000, accountData3);
        Transaction transactionThread7 = new Transaction(allAccounts, "SHOW", 0, accountData4);

        Transaction transactionThread8 = new Transaction(allAccounts, "SHOW", 0, accountData2);
        Transaction transactionThread9 = new Transaction(allAccounts, "SHOW", 0, accountData3);
        Transaction transactionThread10 = new Transaction(allAccounts, "WITHDRAW", 1000, accountData4);
        Transaction transactionThread11 = new Transaction(allAccounts, "SHOW", 0, accountData4);

        transactionThread0.start();
        transactionThread1.start();
        transactionThread2.start();
        transactionThread3.start();
        transactionThread4.start();
        transactionThread5.start();
        transactionThread6.start();
        transactionThread7.start();
        transactionThread8.start();
        transactionThread9.start();
        transactionThread10.start();
        transactionThread11.start();



    }
}