package nz.nightwind.Cauldron.Financials.Reserves;

import java.util.Currency;

public abstract class Reserve {
    private String name;
    private final Currency currency;
    private double balance = 0;

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void changeName(String name) {
        this.name = name;
    }

    protected boolean updateBalance(double new_balance){
        boolean safety_check = checkAllowedBalance(new_balance);
        this.balance = safety_check ? new_balance : this.balance;
        return safety_check;
    }

    public boolean addFunds(double funds){
        return updateBalance(getBalance() + funds);
    }

    public boolean subtractFunds(double funds){
        return updateBalance(getBalance() - funds);
    }

    public boolean checkAllowedBalance(double new_balance){
        return true;
    }

    public Reserve(String name, Currency currency) {
        this.name = name;
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }
}
