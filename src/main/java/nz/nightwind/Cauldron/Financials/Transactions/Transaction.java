package nz.nightwind.Cauldron.Financials.Transactions;

import nz.nightwind.Cauldron.Financials.Currencies.CurrencyType;
import nz.nightwind.Cauldron.Financials.Reserves.Reserve;

public class Transaction<I extends Reserve,O extends Reserve>{

    private final O sending_party;
    private final I receiving_party;
    private final CurrencyType currency_of_payment;
    private final int amount_transferred;

    public Transaction(O sending_party, I receiving_party, CurrencyType currency_of_payment, int amount_transferred) {
        this.sending_party = sending_party;
        this.receiving_party = receiving_party;
        this.currency_of_payment = currency_of_payment;
        this.amount_transferred = amount_transferred;
    }

    public O getSendingParty() {
        return sending_party;
    }

    public I getReceivingParty() {
        return receiving_party;
    }

    public CurrencyType getCurrencyUsed() {
        return currency_of_payment;
    }

    public int getAmountTransferred() {
        return amount_transferred;
    }
}
