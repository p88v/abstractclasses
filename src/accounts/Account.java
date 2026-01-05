package accounts;

public abstract class Account {

    public abstract boolean add(long amount);
    public abstract boolean pay(long amount);
    public abstract boolean trasfer(Account account, long amount);
    public abstract long getBalance();

}
