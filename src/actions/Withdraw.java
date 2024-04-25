package actions;

import pojos.AccountData;

public class Withdraw {
    private double amountToBeWithdrawn;

    public Withdraw(double amountToBeWithdrawn, AccountData accountInfo) {
        this.amountToBeWithdrawn = amountToBeWithdrawn;
        this.accountInfo = accountInfo;
    }

    private AccountData accountInfo;


    public boolean performWithdrawAction(AccountData accountInfo, double amountToBeWithdrawn){
        long accountId = accountInfo.getAccountId();
        double currentAmount = accountInfo.getAccountBalance();

        if(currentAmount>=0){
            currentAmount = currentAmount - amountToBeWithdrawn;
            System.out.println("Current Amount After withdraw"+ currentAmount + "Amount withdrawn in this transaction is "+amountToBeWithdrawn);
            //
            return true;
        }
        return false;
    }

}

