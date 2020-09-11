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

    public abstract boolean updateBalance(int change_amt);

    public Reserve(String name, CurrencyType currency) {
        this.name = name;
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }
}
