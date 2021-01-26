package nz.nightwind.Cauldron.Financials.Reserves;

import java.util.Currency;

public abstract class Reserve {
    private String name;
    private final Currency currency;
    private int balance = 0;

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void changeName(String name) {
        this.name = name;
    }

    protected boolean updateBalance(int new_balance){
        boolean safety_check = checkAllowedBalance(new_balance);
        this.balance = safety_check ? new_balance : this.balance;
        return safety_check;
    }

    public boolean addFunds(int funds){
        return updateBalance(getBalance() + funds);
    }

    public boolean subtractFunds(int funds){
        return updateBalance(getBalance() - funds);
    }

    public boolean checkAllowedBalance(int new_balance){
        return true;
    }

    public Reserve(String name, Currency currency) {
        this.name = name;
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }
}
