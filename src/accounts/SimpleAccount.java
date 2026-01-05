package accounts;

public class SimpleAccount extends Account {

    protected long balance;




    @Override
    public boolean add(long amount) {
        long newBalance = balance + amount;
        if (newBalance != 0) {
            balance = newBalance;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        long curBalance = balance - amount;
        if (curBalance > amount) {
            balance = curBalance;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean trasfer(Account account, long amount) {
        long balanceAfterTransfer = balance - amount;
        if (balanceAfterTransfer != 0) {
            account.add(amount);
            balance = balanceAfterTransfer;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public long getBalance() {
        return balance;
    }
}
