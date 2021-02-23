package nz.nightwind.Cauldron.WebApp;

import nz.nightwind.Cauldron.Entities.EntityDatabase;
import nz.nightwind.Cauldron.Entities.Exceptions.EntityCollectionAppendFailed;
import nz.nightwind.Cauldron.Entities.Exceptions.ObjectMissingComparator;
import nz.nightwind.Cauldron.Entities.Interior.Business;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EntityController {

    @GetMapping("/add")
    public String addEntityForm(Model model) {
        model.addAttribute("entity", new BusinessEntityForm());

        return "add";
    }

    @PostMapping("/add")
    public String addEntitySubmit(@ModelAttribute BusinessEntityForm entity, Model model) throws ObjectMissingComparator, EntityCollectionAppendFailed {
        model.addAttribute("ent", entity);

        System.out.println("\nAdded Entity Name: " + entity.getName());
        System.out.println("Business Type: " + entity.getBusinessType());

        try{
            EntityDatabase.addNewBusiness(entity);
        } catch (ClassCastException e){
           throw new ObjectMissingComparator(e);
        }

        return "add_success";
    }

    @GetMapping("/view-businesses")
    public String viewBusinesses(Model model){
        List<Business> bl = EntityDatabase.getBusinesses();
        model.addAttribute("businesses", bl);

        for(Business b : bl){
            System.out.println(b.getName());
        }

        return "view-businesses";
    }
}
