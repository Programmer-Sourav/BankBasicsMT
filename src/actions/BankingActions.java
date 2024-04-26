package actions;

import pojos.AccountData;

import java.util.ArrayList;

public class BankingActions {

    public void performTransaction(ArrayList< AccountData > allAccounts, String transactionType, double amountTobeTransacted, AccountData accountInfo){
        switch (transactionType){
            case "DEPOSIT":
                Deposit deposit = new Deposit(amountTobeTransacted, accountInfo);
                boolean isSuccessful = deposit.performDepositAction(accountInfo, amountTobeTransacted);
                System.out.println("****** Deposit is "+ isSuccessful);
                break;
            case "WITHDRAW":
                Withdraw withdraw = new Withdraw(amountTobeTransacted, accountInfo);
                boolean isWithdrawSuccessful = withdraw.performWithdrawAction(accountInfo, amountTobeTransacted);
                System.out.println("****** Withdrawal is "+ isWithdrawSuccessful);
                break;
            case "SHOW":
                ShowBalance showBalance = new ShowBalance(accountInfo.getAccountId());
                double currentBalance = showBalance.getCurrentBalance(allAccounts, accountInfo.getAccountId());
                System.out.println("***** Current Balance is "+currentBalance + "for account id "+ accountInfo.getAccountId());
                break;
            default:
                return;
        }
    }
}
