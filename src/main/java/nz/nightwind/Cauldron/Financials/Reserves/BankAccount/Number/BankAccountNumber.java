package nz.nightwind.Cauldron.Financials.Reserves.BankAccount.Number;

public interface BankAccountNumber<T extends BankAccountNumber> {

    boolean isSameNumber(T other);

    boolean isNumber(int... numbers);
}
