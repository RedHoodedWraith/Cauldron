package nz.nightwind.Cauldron.Financials.Reserves.BankAccount;

import nz.nightwind.Cauldron.Financials.Reserves.BankAccount.Number.GenericBankAccountNumber;

import java.util.Currency;

public class GenericBankAccount extends BankAccount<GenericBankAccountNumber> {

    public GenericBankAccount(String name, Currency currency, GenericBankAccountNumber accountNumber) {
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
    public Currency getCurrency() {
        return super.getCurrency();
    }

    @Override
    public void changeName(String name) {
        super.changeName(name);
    }

    @Override
    protected boolean updateBalance(double new_balance) {
        return super.updateBalance(new_balance);
    }

    @Override
    public boolean addFunds(double funds) {
        return super.addFunds(funds);
    }

    @Override
    public boolean subtractFunds(double funds) {
        return super.subtractFunds(funds);
    }

    @Override
    public boolean checkAllowedBalance(double new_balance) {
        return super.checkAllowedBalance(new_balance);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
