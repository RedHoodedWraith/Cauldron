package nz.nightwind.Cauldron.Entities;

import static nz.nightwind.Cauldron.Entities.Entity.*;

public enum BusinessTypes {
    LimitedCompany(LIMITED_COMPANY),
    UnlimitedCompany(UNLIMITED_COMPANY),
    Partnership(PARTNERSHIP),
    SoleTrader(SOLE_TRADER);

    private final String label;

    BusinessTypes(String label){
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }
}
