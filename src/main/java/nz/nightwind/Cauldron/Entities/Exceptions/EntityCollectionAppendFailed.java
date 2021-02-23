package nz.nightwind.Cauldron.Entities.Exceptions;

import nz.nightwind.Cauldron.WebApp.BusinessEntityForm;

public class EntityCollectionAppendFailed extends Exception {
    public EntityCollectionAppendFailed(BusinessEntityForm entityForm, int afterSize, int prevSize) {
        super("Failed to Add the Following Entity Form as an Entity in Collection: " + entityForm.getName() +
                "\nPrevious Size: " + prevSize + "\tAfter Size: " + afterSize);
    }

    public EntityCollectionAppendFailed(BusinessEntityForm entityForm, Throwable cause) {
        super("Failed to Add the Following Entity Form as an Entity in Collection: " + entityForm.getName(), cause);
    }

    public EntityCollectionAppendFailed(NullPointerException e) {
        super("Failed to Add the Following Entity Form as an Entity in Collection due to null object", e);
    }
}
