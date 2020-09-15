package nz.nightwind.Cauldron.Financials.Reserves.BankAccount.Number;

public class GenericBankAccountNumber implements BankAccountNumber<GenericBankAccountNumber> {
    @Override
    public boolean isSameNumber(GenericBankAccountNumber other) {
        return true;
    }

    @Override
    public boolean isNumber(int... numbers) {
        return true;
    }
}
