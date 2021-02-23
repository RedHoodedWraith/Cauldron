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
        if(form == null){
            throw new NullPointerException("Form Object is Null");
        }

        int preSize = internalBusinesses.size();
        if(addNewBusinessReturnID(form) <= preSize) {
            throw new EntityCollectionAppendFailed(form);
        }
    }

    public static int addNewBusinessReturnID(BusinessEntityForm form){
        try {
            if(form != null && internalBusinesses.add(form.generate())){
                return internalBusinesses.size()-1;
            }
        } catch (UnsupportedEntity unsupportedEntity) {
            unsupportedEntity.printStackTrace();
        }
        return internalBusinesses.size();
    }

    public static List<Business> getBusinesses(){
        return Collections.unmodifiableList(internalBusinesses);
    }
}
