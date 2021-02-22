package nz.nightwind.Cauldron.WebApp;

import nz.nightwind.Cauldron.Entities.BusinessTypes;
import nz.nightwind.Cauldron.Entities.Exceptions.UnsupportedEntity;
import nz.nightwind.Cauldron.Entities.Interior.Business;
import nz.nightwind.Cauldron.Entities.Interior.LimitedCompany;

public class BusinessEntityForm implements Comparable<BusinessEntityForm> {

    private String name;
    private BusinessTypes business_type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public BusinessTypes getBusinessType() {
        return business_type;
    }

    public void setBusiness_type(BusinessTypes business_type) {
        this.business_type = business_type;
    }

    public Business generate() throws UnsupportedEntity {
        switch (getBusinessType()){
            case LimitedCompany:
                return new LimitedCompany(getName());
            default:
                throw new UnsupportedEntity(getBusinessType());
        }
    }

    @Override
    public int compareTo(BusinessEntityForm o) {
        return 0;
    }
}
