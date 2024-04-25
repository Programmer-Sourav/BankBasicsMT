package actions;
import pojos.AccountData;

import java.lang.reflect.Array;
import java.util.ArrayList;

import pojos.AccountData;

public class Transaction extends Thread{
    private BankingActions bankingActions = new BankingActions();
    private ArrayList< AccountData > allAccounts;
    private String transactionType;
    private double amountTobeTransacted;
    private AccountData accountInfo;

    public Transaction(ArrayList< AccountData > allAccounts, String transactionType, double amountTobeTransacted, AccountData accountInfo ){
        this.allAccounts = allAccounts;
        this.transactionType = transactionType;
        this.amountTobeTransacted = amountTobeTransacted;
        this.accountInfo = accountInfo;
    }


    public void run(){
       bankingActions.performTransaction(allAccounts, transactionType, amountTobeTransacted, accountInfo);
    }
}
