package nz.nightwind.Cauldron.Financials.Reserves;

import nz.nightwind.Cauldron.Financials.Currencies.CurrencyType;

public abstract class BankAccount<B extends BankAccountNumber> extends Reserve {

    private B accountNumber;

    public BankAccount(String name, CurrencyType currency, B accountNumber) {
        super(name, currency);
        this.accountNumber = accountNumber;
    }

    public B getAccountNumber() {
        return accountNumber;
    }

    protected void changeAccountNumber(B accountNumber) {
        this.accountNumber = accountNumber;
    }
}
