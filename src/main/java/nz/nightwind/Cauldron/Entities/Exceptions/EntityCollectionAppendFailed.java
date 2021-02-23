package nz.nightwind.Cauldron.Entities.Exceptions;

import nz.nightwind.Cauldron.WebApp.BusinessEntityForm;

public class EntityCollectionAppendFailed extends Exception {
    public EntityCollectionAppendFailed(BusinessEntityForm entityForm) {
        super("Failed to Add the Following Entity Form as an Entity in Collection: " + entityForm.getName());
    }
}
