package accounts;

public class CreditAccount extends Account {

    protected long balance;
    protected long creditLimit;


    public CreditAccount(long balance, long creditLimit) {
        this.balance = balance;
        this.creditLimit = creditLimit;
    }


    @Override
    public boolean add(long amount) {
        long newBalance = balance + amount;
        if (newBalance != 0 && newBalance < creditLimit) {
            balance = newBalance;
            return true;
        } else return false;
    }

    @Override
    public boolean pay(long amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        } else if(balance < amount){
            long debt = amount - balance;
            if(debt <= 400_000){
                balance = -debt;
                return true;
            } else return false;
        } else return false;

    }

    @Override
    public boolean trasfer(Account account, long amount) {
        long bbalance = balance - amount;

        if (bbalance > amount) {
            balance = bbalance;
            account.add(amount);
            return true;
        } else return false;
    }

    @Override
    public long getBalance() {
        return balance;
    }
}
