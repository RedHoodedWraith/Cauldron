package nz.nightwind.Cauldron.Entities;

public enum BusinessTypes {
    LimitedCompany("Limited Company"),
    UnlimitedCompany("Unlimited Company"),
    Partnership("Partnership"),
    SoleTrader("Sole Trader");

    private final String label;

    BusinessTypes(String label){
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }
}
