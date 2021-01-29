package nz.nightwind.Cauldron.Financials.Transactions;

import nz.nightwind.Cauldron.Financials.Reserves.Reserve;

import java.util.Currency;

public class Transaction<I extends Reserve,O extends Reserve>{

    private final O sending_party;
    private final I receiving_party;
    private final Currency currency_of_payment;
    private final double amount_transferred;
    private final boolean success;

    public Transaction(O sending_party, I receiving_party, Currency currency_of_payment, double amount_transferred) {
        this.sending_party = sending_party;
        this.receiving_party = receiving_party;
        this.currency_of_payment = currency_of_payment;
        this.amount_transferred = amount_transferred;

        if(!getSendingParty().subtractFunds(getAmountTransferred())){
            success = false;
            return;
        }

        success = getReceivingParty().addFunds(getAmountTransferred());
    }

    public O getSendingParty() {
        return sending_party;
    }

    public I getReceivingParty() {
        return receiving_party;
    }

    public Currency getCurrencyUsed() {
        return currency_of_payment;
    }

    public double getAmountTransferred() {
        return amount_transferred;
    }

    public boolean getSuccessState(){
        return success;
    }
}
