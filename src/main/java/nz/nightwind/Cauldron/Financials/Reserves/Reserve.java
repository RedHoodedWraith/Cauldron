package nz.nightwind.Cauldron.Financials.Reserves;

import nz.nightwind.Cauldron.Financials.Currencies.CurrencyType;

public abstract class Reserve {
    private String name;
    private final CurrencyType currency;
    private int balance;

    public String getName() {
        return name;
    }

    public CurrencyType getCurrency() {
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

    public Reserve(String name, CurrencyType currency) {
        this.name = name;
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }
}
