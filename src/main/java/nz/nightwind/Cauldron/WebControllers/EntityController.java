package nz.nightwind.Cauldron.WebControllers;

import nz.nightwind.Cauldron.Entities.EntityDatabase;
import nz.nightwind.Cauldron.Entities.Exceptions.ObjectMissingComparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.PriorityQueue;
import java.util.Queue;

@Controller
public class EntityController {

    public static PriorityQueue<BusinessEntityForm> formsQueue = new PriorityQueue<>();

    @GetMapping("/add")
    public String addEntityForm(Model model) {
        model.addAttribute("entity", new BusinessEntityForm());

        return "add";
    }

    @PostMapping("/add")
    public String addEntitySubmit(@ModelAttribute BusinessEntityForm entity, Model model) throws ObjectMissingComparator {
        model.addAttribute("ent", entity);

        System.out.println("\nAdded Entity Name: " + entity.getName());

        try{
            formsQueue.add(entity);
        } catch (ClassCastException e){
           throw new ObjectMissingComparator(e);
        }



        return "add_success";
    }
}
