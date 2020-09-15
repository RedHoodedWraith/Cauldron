package nz.nightwind.Cauldron.Financials.Transactions;

import nz.nightwind.Cauldron.Financials.Currencies.CurrencyType;

public abstract class Transaction<I,O>{

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

    public O getSending_party() {
        return sending_party;
    }

    public I getReceiving_party() {
        return receiving_party;
    }

    public CurrencyType getCurrency_of_payment() {
        return currency_of_payment;
    }

    public int getAmount_transferred() {
        return amount_transferred;
    }
}
