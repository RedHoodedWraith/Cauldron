package nz.nightwind.Cauldron.Entities.Exceptions;

public class ObjectMissingComparator extends Exception {
    public ObjectMissingComparator(Exception e) {
        super("Object is not a subclass of 'Comparable' or 'Comparator'. " +
                "The collection type, function or method you are trying use with this object requires the object" +
                " to be able to be compared to another object.", e);
    }
}
