package nz.nightwind.Cauldron.WebApp;

import nz.nightwind.Cauldron.Entities.BusinessTypes;
import nz.nightwind.Cauldron.Entities.Exceptions.UnsupportedEntity;
import nz.nightwind.Cauldron.Entities.Interior.*;

import static nz.nightwind.Cauldron.Entities.Entity.*;

public class BusinessEntityForm implements Comparable<BusinessEntityForm> {

    private String name;
    private String businessType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Business generate() throws UnsupportedEntity {
        if(getBusinessType() == null){
            throw new NullPointerException("Business Type is Null");
        }

        switch (getBusinessType()){
            case LIMITED_COMPANY:
                return new LimitedCompany(getName());
            case UNLIMITED_COMPANY:
                return new UnlimitedCompany(getName());
            case PARTNERSHIP:
                return new Partnership(getName());
            case SOLE_TRADER:
                return new SoleTrader(getName());
            default:
                throw new UnsupportedEntity(getBusinessType());
        }
    }

    @Override
    public int compareTo(BusinessEntityForm o) {
        return 0;
    }
}
