package pojos;

public class AccountData {
   private double accountBalance;
   private long accountId;

   public AccountData(double accountBalance, long accountId, AccountHolder accountHolder) {
      this.accountBalance = accountBalance;
      this.accountId = accountId;
      this.accountHolder = accountHolder;
   }

   public double getAccountBalance() {
      return accountBalance;
   }

   public void setAccountBalance(double accountBalance) {
      this.accountBalance = accountBalance;
   }

   public long getAccountId() {
      return accountId;
   }

   public void setAccountId(long accountId) {
      this.accountId = accountId;
   }

   public AccountHolder getAccountHolder() {
      return accountHolder;
   }

   public void setAccountHolder(AccountHolder accountHolder) {
      this.accountHolder = accountHolder;
   }

   private AccountHolder accountHolder;
}
