package actions;

import pojos.AccountData;

public class Deposit {
    private double amountToBeDeposited;

    public Deposit(double amountToBeDeposited, AccountData accountInfo) {
        this.amountToBeDeposited = amountToBeDeposited;
        this.accountInfo = accountInfo;
    }

    private AccountData accountInfo;


    public boolean performDepositAction(AccountData accountInfo, double amountTobeDeposited){
        long accountId = accountInfo.getAccountId();
        double currentAmount = accountInfo.getAccountBalance();

        if(currentAmount>=0){
            currentAmount = currentAmount + amountTobeDeposited;
            //
            return true;
        }
        return false;
    }

}
