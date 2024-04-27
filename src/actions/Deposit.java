package actions;

import pojos.AccountData;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Deposit {
    private double amountToBeDeposited;

    public Deposit(){}

    public Deposit(ArrayList<AccountData> copyOfAllAccounts, double amountToBeDeposited, AccountData accountInfo) {
        this.copyOfAllAccounts = copyOfAllAccounts;
        this.amountToBeDeposited = amountToBeDeposited;
        this.accountInfo = accountInfo;
    }

    private AccountData accountInfo;
    private ArrayList<AccountData> copyOfAllAccounts;

    public synchronized boolean performDepositAction(ArrayList<AccountData> copyOfAllAccounts, AccountData accountInfo, double amountTobeDeposited) {
        long accountId = accountInfo.getAccountId();
        //we can directly get the accountId and amount for that accountId
        //or can also search from a list
        Stream<AccountData> streamList = null;
        try {
            streamList = copyOfAllAccounts.stream().filter(accountItem -> accountItem.getAccountId() == accountId);
        } catch (NullPointerException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        //as each account id will have only one account, we can use find instead of filter.
        ArrayList<AccountData> foundAccount = (ArrayList<AccountData>) streamList.collect(Collectors.toList());
        System.out.println("Get Account Balance "+ foundAccount.getFirst().getAccountId() +", "+ foundAccount.getFirst().getAccountBalance() + "for account id"+ accountId);
        double currentAmount = foundAccount.getFirst().getAccountBalance();

        if(currentAmount>=0){
            currentAmount = currentAmount + amountTobeDeposited;
            System.out.println("Current Amount After Deposit"+ currentAmount + "Amount Deposited in this transaction is "+amountTobeDeposited);
            //Data will be updated in the server
            return true;
        }
        return false;
    }
}
