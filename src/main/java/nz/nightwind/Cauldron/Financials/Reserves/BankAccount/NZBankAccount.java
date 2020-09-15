package nz.nightwind.Cauldron.Financials.Reserves.BankAccount;

import nz.nightwind.Cauldron.Financials.Currencies.CurrencyType;
import nz.nightwind.Cauldron.Financials.Reserves.BankAccount.Number.NZBankAccountNumber;

public class NZBankAccount extends BankAccount<NZBankAccountNumber> {
    public NZBankAccount(String name, CurrencyType currency, NZBankAccountNumber accountNumber) {
        super(name, currency, accountNumber);
    }

    @Override
    public NZBankAccountNumber getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    protected void changeAccountNumber(NZBankAccountNumber accountNumber) {
        super.changeAccountNumber(accountNumber);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public CurrencyType getCurrency() {
        return super.getCurrency();
    }

    @Override
    public void changeName(String name) {
        super.changeName(name);
    }

    @Override
    public int getBalance() {
        return super.getBalance();
    }
}