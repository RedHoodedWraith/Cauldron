package nz.nightwind.Cauldron.Entities;

import nz.nightwind.Cauldron.Entities.Exceptions.UnsupportedEntity;
import nz.nightwind.Cauldron.Entities.Interior.Business;
import nz.nightwind.Cauldron.WebControllers.BusinessEntityForm;

import java.util.ArrayList;
import java.util.HashMap;

public class EntityDatabase {

    //protected static HashMap<Integer, Business> internalBusinesses = new HashMap<>();
    protected static ArrayList<Business> internalBusinesses = new ArrayList<>();

    public int addNewBusiness(BusinessEntityForm form){
        try {
            if(internalBusinesses.add(form.generate())){
                return internalBusinesses.size()-1;
            }
        } catch (UnsupportedEntity unsupportedEntity) {
            unsupportedEntity.printStackTrace();
        }
        return internalBusinesses.size();
    }
}
