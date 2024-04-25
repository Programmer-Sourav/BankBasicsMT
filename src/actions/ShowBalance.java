package actions;

import pojos.AccountData;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ShowBalance {
    public ShowBalance(long accountId) {
        this.accountId = accountId;
    }

    private long accountId;

    public double getCurrentBalance(ArrayList<AccountData> accountDataList, long accountId) {
        //find by account id
        //find balance
        Stream<AccountData> streamList = null;
        try {
            streamList = accountDataList.stream().filter(accountItem -> accountItem.getAccountId()== accountId);
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        //as each account id will have only one account, we can use find instead of filter.
        System.out.println("Stream "+ streamList);
        ArrayList<AccountData> foundAccount = (ArrayList<AccountData>) streamList;
        return foundAccount.getFirst().getAccountBalance();
    }

}
