package actions;

import pojos.AccountData;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Withdraw {
    private double amountToBeWithdrawn;

    public Withdraw(){}
    public Withdraw(double amountToBeWithdrawn, AccountData accountInfo) {
        this.amountToBeWithdrawn = amountToBeWithdrawn;
        this.accountInfo = accountInfo;
    }

    private AccountData accountInfo;


    public synchronized boolean performWithdrawAction(ArrayList<AccountData> accountDataList, AccountData accountInfo, double amountToBeWithdrawn){
        long accountId = accountInfo.getAccountId();
        Stream<AccountData> streamList = null;
        try {
            streamList = accountDataList.stream().filter(accountItem -> accountItem.getAccountId()== accountId);
        } catch (NullPointerException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        //as each account id will have only one account, we can use find instead of filter.
        ArrayList<AccountData> foundAccount = (ArrayList<AccountData>) streamList.collect(Collectors.toList());
        System.out.println("Current Balance in found Account "+ foundAccount.getFirst().getAccountBalance());
        System.out.println("Get Account Balance "+ foundAccount.getFirst().getAccountId() +", "+ foundAccount.getFirst().getAccountBalance());
        double currentAmount = foundAccount.getFirst().getAccountBalance();;
        if(currentAmount>=0){
            currentAmount = currentAmount - amountToBeWithdrawn;
            System.out.println("Current Amount After withdraw"+ currentAmount + "Amount withdrawn in this transaction is "+amountToBeWithdrawn + "for account id"+ accountId);
            //
            return true;
        }
        return false;
    }



}

