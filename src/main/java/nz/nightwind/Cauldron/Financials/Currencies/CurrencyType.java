package nz.nightwind.Cauldron.Financials.Currencies;

public abstract class CurrencyType {
    public CurrencyType(String name) {
        this.name = name;
    }

    private final String name;
}
