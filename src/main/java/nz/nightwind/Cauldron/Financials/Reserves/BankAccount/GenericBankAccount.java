package nz.nightwind.Cauldron.Financials.Reserves.BankAccount;

import nz.nightwind.Cauldron.Financials.Currencies.CurrencyType;
import nz.nightwind.Cauldron.Financials.Reserves.BankAccount.Number.GenericBankAccountNumber;

public class GenericBankAccount extends BankAccount<GenericBankAccountNumber> {

    public GenericBankAccount(String name, CurrencyType currency, GenericBankAccountNumber accountNumber) {
        super(name, currency, accountNumber);
    }

    @Override
    public GenericBankAccountNumber getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    protected void changeAccountNumber(GenericBankAccountNumber accountNumber) {
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
    protected boolean updateBalance(int new_balance) {
        return super.updateBalance(new_balance);
    }

    @Override
    public boolean addFunds(int funds) {
        return super.addFunds(funds);
    }

    @Override
    public boolean subtractFunds(int funds) {
        return super.subtractFunds(funds);
    }

    @Override
    public boolean checkAllowedBalance(int new_balance) {
        return super.checkAllowedBalance(new_balance);
    }

    @Override
    public int getBalance() {
        return super.getBalance();
    }
}
