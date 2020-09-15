package nz.nightwind.Cauldron.Financials.Transactions.Exceptions;

public class TransactionFailedException extends Exception {

    private static final String MSG_Prefix = "Transaction Failed: ";

    protected TransactionFailedException(String message) {
        super(MSG_Prefix + message);
    }
}
