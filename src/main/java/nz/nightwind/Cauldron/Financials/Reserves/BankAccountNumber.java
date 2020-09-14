package nz.nightwind.Cauldron.Financials.Reserves;

public interface BankAccountNumber {

    boolean isSameNumber(BankAccountNumber other);

    boolean isSameType(BankAccountNumber other2);
}
