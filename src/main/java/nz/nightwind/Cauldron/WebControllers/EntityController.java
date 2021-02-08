package nz.nightwind.Cauldron.WebControllers;

import nz.nightwind.Cauldron.Entities.Interior.LimitedCompany;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EntityController {

    @GetMapping("/add")
    public String addEntityForm(Model model) {
        model.addAttribute("entity", new EntityForm());
        EntityForm c = (EntityForm) model.getAttribute("entity");

        assert c != null;
        System.out.println("Added: " + c.getName());

        return "add";
    }

    @PostMapping("/add")
    public String addEntitySubmit(@ModelAttribute EntityForm entity, Model model) {
        model.addAttribute("ent", entity);

        System.out.println("\nEntity Name: " + entity.getName());

        for(String k : model.asMap().keySet()){
            System.out.println(k);
        }

        return "add_success";
    }
}
