package nz.nightwind.Cauldron.Financials.Reserves;

import nz.nightwind.Cauldron.Financials.Currencies.CurrencyType;

public class GenericReserve extends Reserve {
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

    public GenericReserve(String name, CurrencyType currency) {
        super(name, currency);
    }

    @Override
    public int getBalance() {
        return super.getBalance();
    }
}
