package nz.nightwind.Cauldron.Financials.Reserves;


import java.util.Currency;

public class GenericReserve extends Reserve {

    public GenericReserve(String name, Currency currency)
    {
        super(name, currency);
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
