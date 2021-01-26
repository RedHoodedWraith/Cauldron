package nz.nightwind.Cauldron.Financials.Reserves.BankAccount;

import nz.nightwind.Cauldron.Financials.Reserves.BankAccount.Number.BankAccountNumber;
import nz.nightwind.Cauldron.Financials.Reserves.Reserve;

import java.util.Currency;

public abstract class BankAccount<B extends BankAccountNumber> extends Reserve {

    private B accountNumber;

    public BankAccount(String name, Currency currency, B accountNumber) {
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
