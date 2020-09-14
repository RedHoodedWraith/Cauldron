package nz.nightwind.Cauldron.Financials.Reserves.BankAccount.Number;

public class NZBankAccountNumber implements BankAccountNumber<NZBankAccountNumber> {

    private final int[] ACCOUNT_SIZE_PARTS = {2, 4, 7, 3};
    private final int bank, branch, account, suffix;


    public NZBankAccountNumber(int bank, int branch, int account, int suffix) throws InvalidBankAccountNumber {

        if(isNumber(bank, branch, account, suffix))
            throw new InvalidBankAccountNumber();

        this.bank = bank;
        this.branch = branch;
        this.account = account;
        this.suffix = suffix;
    }

    @Override
    public boolean isNumber(int... numbers) {
        if(numbers.length != ACCOUNT_SIZE_PARTS.length)
            return false;

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] >= Math.pow(10, ACCOUNT_SIZE_PARTS[i]))
                return false;
        }

        return true;
    }

    @Override
    public boolean isSameNumber(NZBankAccountNumber other) {
        return this.getBank() == other.getBank() &&
                this.getBranch() == other.getBranch() &&
                this.getAccount() == other.getAccount() &&
                this.getSuffix() == other.getSuffix();
    }


    public int getBank() {
        return bank;
    }

    public int getBranch() {
        return branch;
    }

    public int getAccount() {
        return account;
    }

    public int getSuffix() {
        return suffix;
    }
}
