package nz.nightwind.Cauldron.Entities;

import nz.nightwind.Cauldron.Entities.Exceptions.EntityCollectionAppendFailed;
import nz.nightwind.Cauldron.Entities.Exceptions.UnsupportedEntity;
import nz.nightwind.Cauldron.Entities.Interior.Business;
import nz.nightwind.Cauldron.WebApp.BusinessEntityForm;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.CompletableFuture;

@Service
public class EntityDatabase {

    //protected static HashMap<Integer, Business> internalBusinesses = new HashMap<>();
    protected static ArrayList<Business> internalBusinesses = new ArrayList<>();

    public Business getLastAddedBusiness(){
        int size = internalBusinesses.size();
        if(size <= 0)
            return null;
        else
            return internalBusinesses.get(size-1);
    }

    public static void addNewBusiness(BusinessEntityForm form) throws EntityCollectionAppendFailed {
        addNewBusinessReturnID(form);
    }

    public static int addNewBusinessReturnID(BusinessEntityForm form) throws EntityCollectionAppendFailed {
        boolean formAdd;

        // Saves the Business Collection size before adding new object
        int preSize = internalBusinesses.size();

        // Null Object Checker
        if(form == null){
            throw new EntityCollectionAppendFailed(new NullPointerException("Form Object is Null"));
        }

        // Attempts to Convert Form to Business Object & Add Business Object to Collection
        // Throws Exception if that failed
        try {
            formAdd = internalBusinesses.add(form.generate());
        } catch (UnsupportedEntity unsupportedEntity) {
            throw new EntityCollectionAppendFailed(form, unsupportedEntity);
        }

        // Saves the Business Collection size after adding new object
        int postSize = internalBusinesses.size();

        // Throws an Exception if Business Object failed to add to Collection
        if(!formAdd || preSize >= postSize){
            throw new EntityCollectionAppendFailed(form, postSize, preSize);
        }

        // Returns the index of the Business Object that was just added
        return postSize-1;
    }

    public static List<Business> getBusinesses(){
        return Collections.unmodifiableList(internalBusinesses);
    }
}
