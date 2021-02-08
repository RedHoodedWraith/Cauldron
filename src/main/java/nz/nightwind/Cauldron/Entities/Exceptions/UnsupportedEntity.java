package nz.nightwind.Cauldron.Entities.Exceptions;

import nz.nightwind.Cauldron.Entities.BusinessTypes;

public class UnsupportedEntity extends Exception {
    public UnsupportedEntity(BusinessTypes t) {
        super("The Business Entity '" + t.getLabel() + "' is not yet supported.");
    }
}
