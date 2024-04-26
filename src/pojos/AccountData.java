package pojos;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class AccountData {
   private final AtomicReference<Double> accountBalance;
   private final AtomicLong accountId;
   private final AtomicReference<AccountHolder> accountHolder;

   public AccountData(double accountBalance, long accountId, AccountHolder accountHolder) {
      this.accountBalance = new AtomicReference<>(accountBalance);
      this.accountId = new AtomicLong(accountId);
      this.accountHolder = new AtomicReference<>(accountHolder);
   }

   public double getAccountBalance() {
      return accountBalance.get();
   }

   public void setAccountBalance(double accountBalance) {
      this.accountBalance.set(accountBalance);
   }

   public long getAccountId() {
      return accountId.get();
   }

   public void setAccountId(long accountId) {
      this.accountId.set(accountId);
   }

   public AccountHolder getAccountHolder() {
      return accountHolder.get();
   }

   public void setAccountHolder(AccountHolder accountHolder) {
      this.accountHolder.set(accountHolder);
   }
}

