package nz.nightwind.Cauldron.Entities.Interior;

import nz.nightwind.Cauldron.Entities.BusinessTypes;

public abstract class AbstractCompany extends Business {

    public AbstractCompany(BusinessTypes businessType) {
        super(businessType);
    }

    public AbstractCompany(String name, BusinessTypes businessType) {
        super(name, businessType);
    }

}
